/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Doctor1 extends Person1{
    private int docId;

    /*public Doctor1(int docId, String name, int age, String gender, String email, long phone, String username, String password, String userRole) {
        super(name, age, gender, email, phone, username, password, userRole);
        this.docId = docId;
//    }*/

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }
    

    @Override
    public String toString() {
        return getName();
    }
    
}
