package it.belstu.fedorov.director;

import it.belstu.fedorov.employes.AbstractEmployee;

public interface IOpportunities {
    int  CountEmployee();
    void AddEmployee(AbstractEmployee employee);
    void FireEmployee(AbstractEmployee employee) throws Exception;
}
