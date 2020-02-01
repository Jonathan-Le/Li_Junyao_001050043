/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author junyaoli
 */
public class VitalSigns {
        private double temperature;
        private double bloodPreasure;
        private int pulse;
        private String date;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPreasure() {
        return bloodPreasure;
    }

    public void setBloodPreasure(double bloodPreasure) {
        this.bloodPreasure = bloodPreasure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return this.date;
    }
        
    
}
