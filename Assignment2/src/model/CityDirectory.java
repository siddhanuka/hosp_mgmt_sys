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
public class CityDirectory {
    private ArrayList<City> cityDir;
    
    public CityDirectory() {
        this.cityDir = new ArrayList<>();
    }

    public ArrayList<City> getCityDir() {
        return cityDir;
    }

    public void setCityDir(ArrayList<City> cityDir) {
        this.cityDir = cityDir;
    }
    
    public void addNewCity(City e){
        cityDir.add(e);
    }
    
    public void deleteNewCity(City i){
        cityDir.remove(i);
    }
    
    public void updateCity(City c, int i){
        cityDir.set(i, c);
    }

}
