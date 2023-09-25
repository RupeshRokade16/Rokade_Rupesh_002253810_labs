/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rupes
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory(){
        this.history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
        
    }

    public void deleteVitals(VitalSigns selectedVital) {
        history.remove(selectedVital);
        
    }
}
