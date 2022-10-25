/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Patient extends Person{
    private String blood_group;
    private String problem;
    
//    private Encounter enc;

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Patient(String blood_group, String problem, String name, int age, String gender, String email, long phone, int id/*, Encounter enc*/) {
        super(name, age, gender, email, phone, id);         //pending to add separate contructor person super get methods 
        this.blood_group = blood_group;
        this.problem = problem;
//        this.enc = enc;
    }

    public Patient(String blood_group, String problem) {
        this.blood_group = blood_group;
        this.problem = problem;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
