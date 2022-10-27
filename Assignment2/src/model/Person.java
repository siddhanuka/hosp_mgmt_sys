/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.City;
import model.House;
import model.Community;

/**
 *
 * @author Administrator
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String email;
    private long phone;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private EncounterHistory encHist;
    
    public Person(String name, int age, String gender, String email, long phone, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.id = id;
        this.encHist = new EncounterHistory();
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    //-------------------------------
    public void addEncounter(Encounter enc){
        this.encHist.addEncounter(enc);
    }
    
    public void deleteEncounter(Encounter enc){
        this.encHist.deleteEncounter(enc);
    }
    
//    public ArrayList<Encounter> getEncounterHistory(){
//        return this.encHist.viewEncHist();
//    }
    //---------------------------------

    @Override
    public String toString() {
        return name;
    }
}
