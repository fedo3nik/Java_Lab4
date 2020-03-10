package it.belstu.fedorov.companies;

public class ProductCompany extends AbstractCompany {
    private int _count_of_projects;
    private boolean _have_dress_code;

    public int get_count_of_projects() {
        return _count_of_projects;
    }

    public void set_count_of_projects(int _count_of_projects) {
        this._count_of_projects = _count_of_projects;
    }

    public boolean is_have_dress_code() {
        return _have_dress_code;
    }

    public void set_have_dress_code(boolean _has_dress_code) {
        this._have_dress_code = _has_dress_code;
    }

    public ProductCompany(int count_of_projects, boolean has_dress_code, String name) {
        this._count_of_projects = count_of_projects;
        this._have_dress_code = has_dress_code;
        this._name = name;
        this._type = CompanyType.Product;
        System.out.println("Company name - " + this._name + ", count of projects - " + this._count_of_projects + ", this company have dress code - " + this._have_dress_code);

    }
}
