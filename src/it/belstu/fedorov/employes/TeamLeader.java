package it.belstu.fedorov.employes;

enum EnglishLevel {C2, C1, B2, B1, A2, A1}

public class TeamLeader extends AbstractEmployee{
    public enum EnglishLevel {C2, C1, B2, B1, A2, A1}
    private EnglishLevel _level;

    public EnglishLevel get_level() {
        return _level;
    }

    public void set_level(EnglishLevel _level) {
        this._level = _level;
    }

    public TeamLeader(EnglishLevel level, String name, int age, int experience) {
        this._level = level;
        this._name = name;
        this._age = age;
        this._experience = experience;

    }
}
