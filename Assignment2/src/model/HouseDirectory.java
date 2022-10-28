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
public class HouseDirectory {
    private ArrayList<House> houseDir;
    
    public HouseDirectory() {
        this.houseDir = new ArrayList<>();
    }

    public ArrayList<House> getHouseDir() {
        return houseDir;
    }

    public void setHouseDir(ArrayList<House> houseDir) {
        this.houseDir = houseDir;
    }
    
    public void addNewHouse(House e){
        houseDir.add(e);
    }
    
    public void deleteNewHouse(House i){
        houseDir.remove(i);
    }
    
    public void updateHouseDetails(int i, House updateAddress){
        houseDir.set(i, updateAddress);
    }    
}
