package it.belstu.fedorov.companies;

public class OutsourceCompany extends AbstractCompany {
    private String _country_customer;
    private int _count_of_customers;

    public String get_country_customer() {
        return _country_customer;
    }

    public void set_country_customer(String _country_customer) {
        this._country_customer = _country_customer;
    }

    public int get_count_of_customers() {
        return _count_of_customers;
    }

    public void set_count_of_customers(int _count_of_customers) {
        this._count_of_customers = _count_of_customers;
    }

    public OutsourceCompany(String country_customer, int count_of_customers, String name) {
        this._country_customer = country_customer;
        this._count_of_customers = count_of_customers;
        this._name = name;
        this._type = CompanyType.Outsource;
        System.out.println("Company name - " + this._name + ", country customer - " + this._country_customer + ", count of customers - " + _count_of_customers);
    }
}
