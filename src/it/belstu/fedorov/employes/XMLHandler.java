package it.belstu.fedorov.employes;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import java.io.File;
import java.io.IOException;

public class XMLHandler extends  DefaultHandler{

    private boolean isValid = false;

    public void valid (String path, String XSDPath) throws SAXException, IOException{
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        File file = new File(XSDPath);
        Schema schema = factory.newSchema(file);
        Validator validator = schema.newValidator();
        Source source = new StreamSource(path);
        validator.validate(source);
        isValid = true;
        System.out.println("is Valid");
    }

    Programmer employee = new Programmer();
    String thisElement = "";

    public Programmer getEmployee()
    {
        return  employee;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("name")) {
            employee.set_name(new String(ch, start, length));
        }

        if (thisElement.equals("age")) {
            Integer age = Integer.valueOf(new String(ch, start, length));
            employee.set_age(age);
        }
        if (thisElement.equals("experience")) {
            Integer experience = Integer.valueOf(new String(ch, start, length));
            employee.set_experience(experience);
        }
    }

    @Override
    public void endDocument() {
        System.out.println("Stop parse XML...");
    }

}
