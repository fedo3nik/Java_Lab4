package it.belstu.fedorov.companies;

import it.belstu.fedorov.employes.AbstractEmployee;

import java.util.ArrayList;

abstract public class AbstractCompany {
    enum CompanyType {Outsource, Product}
    public String _name;
    public CompanyType _type;
    public ArrayList<AbstractEmployee> _employees = new ArrayList<AbstractEmployee>();
}
