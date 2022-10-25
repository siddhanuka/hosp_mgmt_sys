/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Hospital {
    String name;
    City city;
    Community community;
    DoctorDirectory docDir;

    public Hospital(String name, City city, Community community) {
        this.name = name;
        this.city = city;
        this.community = community;
    }
    
}
