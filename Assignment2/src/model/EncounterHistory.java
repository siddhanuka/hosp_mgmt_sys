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
public class EncounterHistory {
    private ArrayList<Encounter> encHist;

    public EncounterHistory() {
        this.encHist = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncHist() {
        return encHist;
    }

    public void setEncHist(ArrayList<Encounter> encHist) {
        this.encHist = encHist;
    }
    
    public void addEncounter(Encounter enc){
        encHist.add(enc);
    }
    
    public void deleteEncounter(Encounter enc){
        encHist.remove(enc);
    }
    
    public void UpdateEncounter(Encounter ecc, int index){
        encHist.set(index, ecc);
    }
    
    public ArrayList<Encounter> viewEncHist(){
        return encHist;
    }
    
    
}
