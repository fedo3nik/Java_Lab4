package it.belstu.fedorov.employes;

abstract public class AbstractEmployee {
    public String _name;
    public int _age;
    public int _experience;

    public void set_name(String name)
    {
        this._name = name;
    }

    public void set_age(int age)
    {
        this._age = age;
    }

    public void set_experience(int experience)
    {
        this._experience = experience;
    }
}
