/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/*
 *
 * @author Administrator
 */
public class Encounter extends VitalSigns{
    private Date encounterDate;
    private int encId;
//    private int docId;
    private String diagnosis;
    private String ecounterWith;        

    public String getEcounterWith() {
        return ecounterWith;
    }

    public void setEcounterWith(String ecounterWith) {
        this.ecounterWith = ecounterWith;
    }

    public String getPatName(){
        return super.getName();
    }
    
    public int getEncId() {
        return encId;
    }

    public void setEncId(int encId) {
        this.encId = encId;
    }

//    public int getDocId() {
//        return docId;
//    }
//
//    public void setDocId(int docId) {
//        this.docId = docId;
//    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public Date getEncounter() {
        return encounterDate;
    }

    public void setEncounter(Date encounter) {
        this.encounterDate = encounter;
    }

    @Override
    public String toString() {
        return String.valueOf(encId);
    }
}
