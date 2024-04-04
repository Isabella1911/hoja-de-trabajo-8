//Isabella Obando 23074
//Universidad del Valle de Guatemala
//Hoja de trabajo 8

import java.lang.Comparable;
public class Patient implements Comparable<Patient> {
    private String name;
    private String syntom;
    private char emergencyCode;

    public Patient(String name, String syntom, char emergencyCode) {
        this.name = name;
        this.syntom = syntom;
        this.emergencyCode = emergencyCode;
    }

    @Override
    public int compareTo(Patient otro) {
        return Character.compare(this.emergencyCode, otro.emergencyCode);
    }

    @Override
    public String toString() {
        return name + ", " + syntom + ", " + emergencyCode;
    }
}
