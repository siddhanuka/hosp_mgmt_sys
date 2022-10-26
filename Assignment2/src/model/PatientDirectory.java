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
    private ArrayList<Patient1> patDir;

    public PatientDirectory() {
        this.patDir = new ArrayList<>();
    }
    
    public void addPatient(Patient1 pat){
        this.patDir.add(pat);
    }

    public ArrayList<Patient1> getPatDir() {
        return patDir;
    }

    public void setPatDir(ArrayList<Patient1> patDir) {
        this.patDir = patDir;
    }
    
    public void deletePatient(Patient1 pat){
        this.patDir.remove(pat);
    }
    
    
}
