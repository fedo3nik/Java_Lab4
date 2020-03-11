package it.belstu.fedorov.main;

import it.belstu.fedorov.companies.OutsourceCompany;
import it.belstu.fedorov.director.Director;
import it.belstu.fedorov.employes.*;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args)
    {
     try
     {
         LOG.info("Start program");
         String company1_name = "ITechArt";
         String company1_country_customer = "USA";
         int company1_count_of_customers = 4;
         OutsourceCompany ITechArt = new OutsourceCompany(company1_country_customer, company1_count_of_customers, company1_name);
         LOG.info("Create a new Outsource company");
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
         ITechArtDirector.FireEmployee(ITechArtProg2);
         LOG.info("End program");
     }
     catch (Exception ex)
     {
         System.out.println(ex.getMessage());
         LOG.info("Throw exception");
     }

     finally {
         LOG.info("End program");
     }
    }
}
