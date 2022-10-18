/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Encounter {
    private Date encounter;
    private int temp;
    private int bloodPressure;
    private int pulse;

    Encounter() {
        
    }

    public Date getEncounter() {
        return encounter;
    }

    public void setEncounter(Date encounter) {
        this.encounter = encounter;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public Encounter(Date encounter, int temp, int bloodPressure, int pulse) {
        this.encounter = encounter;
        this.temp = temp;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
    }
}
