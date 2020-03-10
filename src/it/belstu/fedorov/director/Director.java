package it.belstu.fedorov.director;

import it.belstu.fedorov.companies.AbstractCompany;
import it.belstu.fedorov.employes.AbstractEmployee;

public class Director implements IOpportunities{
    private String _name;
    private AbstractCompany _company;
    private boolean _programming_experience;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public boolean is_programming_experience() {
        return _programming_experience;
    }

    public void set_programming_experience(boolean _programming_experience) {
        this._programming_experience = _programming_experience;
    }

    public Director(String name, boolean programmingExperience, AbstractCompany company) {
        this._name = name;
        this._programming_experience = programmingExperience;
        this._company = company;
    }

    public AbstractCompany get_company() {
        return _company;
    }

    public void set_company(AbstractCompany _company) {
        this._company = _company;
    }

    @Override
    public int CountEmployee() {
        int count = this._company._employees.size();
        return count;
    }

    @Override
    public void AddEmployee(AbstractEmployee employee) {
        this._company._employees.add(employee);
        System.out.println(employee._name + " was successfully added to the company " + this._company._name);
    }

    @Override
    public void FireEmployee (AbstractEmployee employee) throws Exception {
        boolean flag = false;
        for(int i = 0; i < this._company._employees.size(); i++)
        {
            if(this._company._employees.get(i) == employee)
            {
                flag = true;
                break;
            }
        }
        if(flag) {
            this._company._employees.remove(employee);
            System.out.println(employee._name + " was successfully fired from the company " + this._company._name);
        }
        else
        {
            throw new Exception("Employee who you want to fire doesn't work in your company!");
        }
    }
}
