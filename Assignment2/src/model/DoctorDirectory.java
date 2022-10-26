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
public class DoctorDirectory {
    private ArrayList<Doctor1> docDir;

    public ArrayList<Doctor1> getDocDir() {
        return docDir;
    }

    public void setDocDir(ArrayList<Doctor1> docDir) {
        this.docDir = docDir;
    }

    public DoctorDirectory() {
        this.docDir = new ArrayList<>();
    }
    
    public void addDoctor(Doctor1 doc) {
        this.docDir.add(doc);
    }
    
    public void deleteDoctor(Doctor1 doc){
        this.docDir.remove(doc);
    }
    
}
