package it.belstu.fedorov.main;

import it.belstu.fedorov.companies.OutsourceCompany;
import it.belstu.fedorov.director.Director;
import it.belstu.fedorov.employes.*;
import com.google.gson.Gson;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
     try
     {
         String company1_name = "ITechArt";
         String company1_country_customer = "USA";
         int company1_count_of_customers = 4;
         OutsourceCompany ITechArt = new OutsourceCompany(company1_country_customer, company1_count_of_customers, company1_name);
         Director ITechArtDirector = new Director("Vyacheslav Romanenko", true, ITechArt);
         Architect ITechArtArchitect = new Architect(true, "Web-site", "Oleg Rozhkov", 32, 14);
         TeamLeader ITechArtTeamLead = new TeamLeader(TeamLeader.EnglishLevel.C2, "Aleksey Rovniy", 26, 6);
         Programmer ITechArtProg1 = new Programmer(Programmer.Skill.Junior, "Dima Chisty", 19, 1);
         Programmer ITechArtProg2 = new Programmer(Programmer.Skill.Middle, "Vlad Scherba", 22, 3);
         Programmer ITechArtProg3 = new Programmer(Programmer.Skill.Senjor, "Oleg Askutov", 30, 11);

         ITechArtDirector.AddEmployee(ITechArtArchitect);
         ITechArtDirector.AddEmployee(ITechArtTeamLead);
         ITechArtDirector.AddEmployee(ITechArtProg1);
         ITechArtDirector.AddEmployee(ITechArtProg2);
         ITechArtDirector.AddEmployee(ITechArtProg3);
         System.out.println(ITechArtDirector.CountEmployee());
         ITechArtDirector.FireEmployee(ITechArtProg2);
         System.out.println(ITechArtDirector.CountEmployee());
         //ITechArtDirector.FireEmployee(ITechArtProg2);

         //Lab 5[[[[[[[[[[[]]]]]]]]]]]]

         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser parser = factory.newSAXParser();

         XMLHandler saxParser = new XMLHandler();

         saxParser.valid("files/info.xsd.xml", "files/info.xsd");
         parser.parse(new File("files/info.xsd.xml"), saxParser);

         System.out.println(saxParser.getEmployee().toString() + '\n');
         Gson gson = new Gson();
         try (FileWriter writer = new FileWriter("files/info.json")) {
             gson.toJson(ITechArtProg1, writer);
         }

         Programmer someProg = gson.fromJson(new FileReader("files/info.json"), ITechArtProg1.getClass());
         System.out.println(someProg.toString());

         ITechArtDirector.AddEmployee(someProg);
         System.out.println(ITechArtDirector.CountEmployee());

     }
     catch (Exception ex)
     {
         System.out.println(ex.getMessage());
     }

     finally {
         System.out.println("The End!");
     }
    }
}
