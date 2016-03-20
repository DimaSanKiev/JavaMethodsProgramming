package design_patterns._03_structural._03_facade._02_xml_example;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorSAXwithXSD {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "data/students.xml";
        String schemaName = "data/students.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);

        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            StudentErrorHandler sh = new StudentErrorHandler("log.txt");
            validator.setErrorHandler(sh);
            validator.validate(source);
            System.out.println(fileName + " validating is ended correctly.");
        } catch (SAXException | IOException e) {
            // logging
        }
    }
}
