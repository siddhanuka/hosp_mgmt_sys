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
public class Hospital {
    private String name;
    private City city;
    private Community community;
    private ArrayList<Doctor1> docList;

    public ArrayList<Doctor1> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor1> docList) {
        this.docList = docList;
    }
    
    public void addDoctor(Doctor1 d){
        this.docList.add(d);
    }
    
    public void removeDoctor(Doctor1 doc){
        this.docList.remove(doc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    @Override
    public String toString() {
        return name ;
    }

    
}
