package it.belstu.fedorov.employes;

public class Programmer extends AbstractEmployee {
    public enum Skill {Junior, Middle, Senjor}
    private Skill _skill;

    public Skill get_skill() {
        return _skill;
    }

    public void set_skill(Skill _skill) {
        this._skill = _skill;
    }

    public Programmer(Skill skill, String name, int age, int experience) {
        this._skill = skill;
        this._name = name;
        this._age = age;
        this._experience = experience;
    }

    @Override
    public String toString()
    {
        return  "Programmer{" +
                "name='" + _name + '\'' +
                ", age='" + _age + '\'' +
                ", experience='" + _experience +
                '}';
    }

    public Programmer(){}
}
