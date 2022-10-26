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
public class PersonDirectory {
    ArrayList<Person1> personDir;

    public PersonDirectory() {
        this.personDir = new ArrayList<>();
    }
    
    public void addPerson(Person1 person){
        personDir.add(person);
    }
    
    public void DeletePerson(Person1 person){
        personDir.remove(person);
    }
    
    public ArrayList<Person1> getPersonList(){
        return personDir;
    }
    
//    public Person1 getPersonData(int personId){
//        int index = 0;
//        
//        for(int i=0; i < this.personDir.size(); i++)
//        {
//            if(personDir.get(i).getId() == personId)
//            {
//                index = i;
//                break;
//            }
//        }
//        return personDir.get(index);
//    }
//    
//    public void AddEncounterForPerson(int personId, Encounter ecc){
//        int index = 0;
//        
//        for(int i = 0; i < this.personDir.size(); i++)
//        {
//            if(personDir.get(i).getId() == personId)
//            {
//                index = i;
//                break;
//            }
//        }
//        personDir.get(index).addEncounter(ecc);
//    }    
}