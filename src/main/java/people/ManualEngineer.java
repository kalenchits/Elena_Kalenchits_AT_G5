package main.java.people;

public class ManualEngineer extends Engineer{

    int skill;

    public ManualEngineer(int age, int experience) {
        super(age);
        this.skill = experience * 2;
    }
}
