package main.java.people;

public class AutomatedEngineer extends Engineer{

    int skill;

    public AutomatedEngineer(int age, int experience) {
        super(age);
        this.skill = experience * 3;

    }
}
