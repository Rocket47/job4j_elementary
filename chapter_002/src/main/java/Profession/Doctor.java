package Profession;

public class Doctor extends Profession {
    public Doctor(String name, String profession) {
        super(name, profession);
    }

    public Diagnose heal(Patient patient) {
        return patient;
    }
}
