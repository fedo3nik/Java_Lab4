package it.belstu.fedorov.employes;

public class Architect extends AbstractEmployee{
    private boolean _has_education;
    private String _last_project;

    public boolean is_has_education() {
        return _has_education;
    }

    public String get_last_project() {
        return _last_project;
    }

    public void set_has_education(boolean _has_education) {
        this._has_education = _has_education;
    }

    public void set_last_project(String _last_project) {
        this._last_project = _last_project;
    }

    public Architect(boolean has_education, String last_project, String name, int age, int experience) {
        this._has_education = has_education;
        this._last_project = last_project;
        this._age = age;
        this._experience = experience;
        this._name = name;
    }
}
