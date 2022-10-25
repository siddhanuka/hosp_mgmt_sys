/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Doctor extends Person{
    private String specialty;

    public Doctor(String specialty, String name, int age, String gender, String email, long phone, int id) {
        super(name, age, gender, email, phone, id);
        this.specialty = specialty;
    }

    public Doctor(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
}
