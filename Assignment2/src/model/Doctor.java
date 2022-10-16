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

    public Doctor(String specialty, String name, int age, String gender, String email, long phone) {
        super(name, age, gender, email, phone);
        this.specialty = specialty;
    }

    public Doctor(String specialty) {
        this.specialty = specialty;
    }
    
}
