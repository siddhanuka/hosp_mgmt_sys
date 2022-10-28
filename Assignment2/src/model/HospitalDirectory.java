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
public class HospitalDirectory {
    private ArrayList<Hospital> hospDir;
    
    public HospitalDirectory() {
        this.hospDir = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDir() {
        return hospDir;
    }

    public void setHospitalDir(ArrayList<Hospital> hospDir) {
        this.hospDir = hospDir;
    }
    
    public void addNewHospital(Hospital e){
        hospDir.add(e);
    }
    
    public void deleteNewHospital(Hospital i){
        hospDir.remove(i);
    }

}
