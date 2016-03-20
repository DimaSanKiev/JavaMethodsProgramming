package design_patterns._03_structural._03_facade._02_xml_example;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class FacadeValidator {
    public boolean validateSAXwithXSD(String xmlFileName, String schemaFileName, DefaultHandler handler) {
        boolean result = false;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaFileName);

        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(xmlFileName);
            validator.setErrorHandler(handler);
            validator.validate(source);
            result = true;
        } catch (SAXException | IOException e) {
            // logging
        }
        return result;
    }
}
