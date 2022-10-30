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
public class CommunityDirectory {
    private ArrayList<Community> commDir;

    public CommunityDirectory() {
        this.commDir = new ArrayList<>();
    }

    public ArrayList<Community> getCommDir() {
        return commDir;
    }

    public void setCommDir(ArrayList<Community> commDir) {
        this.commDir = commDir;
    }
    
    public void addComm(Community com){
        this.commDir.add(com);
    }
    
    public void deleteComm(Community com){
        this.commDir.remove(com);
    }
    
    public void updateComm(Community com, int i){
        this.commDir.set(i, com);
    }
}
