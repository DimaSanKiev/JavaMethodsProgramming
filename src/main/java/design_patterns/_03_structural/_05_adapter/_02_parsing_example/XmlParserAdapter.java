package design_patterns._03_structural._05_adapter._02_parsing_example;

public class XmlParserAdapter implements Parser {
    private XmlParser xmlParser;
    private double xmlVersion;    // parameters coordination for adaptation
    private String encoding;      // parameters coordination for adaptation

    public XmlParserAdapter(XmlParser xmlParser, double xmlVersion, String encoding) {
        this.xmlParser = xmlParser;
        this.xmlVersion = xmlVersion;
        this.encoding = encoding;
    }

    @Override
    public Order parse(String order) {
        return xmlParser.parseXml(order, xmlVersion, encoding);
    }
}
