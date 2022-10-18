/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PatientDirectory {
    private ArrayList<Patient> patDir;

    public PatientDirectory() {
        this.patDir = new ArrayList<>();
    }
    
    public void addPatient(String blood_group, String problem, String name, int age, String gender, String email, long phone){
        Patient pat = new Patient(blood_group, problem, name, age, gender, email, phone);
        this.patDir.add(pat);
    }

    public ArrayList<Patient> getPatDir() {
        return patDir;
    }

    public void setPatDir(ArrayList<Patient> patDir) {
        this.patDir = patDir;
    }
    
    public void deletePatient(Patient pat){
        this.patDir.remove(pat);
    }
    
    
}
