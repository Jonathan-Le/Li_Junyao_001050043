/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical;

import java.util.ArrayList;

/**
 *
 * @author junyaoli
 */
public class vitalsign {
    
    double age;
    String agegroup;
    double respiratoryRate;
    double heartRate;
    double systolicBloodPressure;
    double weightKg;
    double weightPound;
    String show;
    private ArrayList<vitalsign> history;
    String fullname;
    
    
    public vitalsign addvitalsign(){
        vitalsign vs = new vitalsign();
        history.add(vs);
        return vs;
    }
    public ArrayList<vitalsign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<vitalsign> history) {
        this.history = history;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
    
    public vitalsign() {
        
        this.history = new ArrayList<vitalsign>() ;
        
        
    }
    public void showvitalsign(vitalsign v){
 
        System.out.println(
                    "\nAge:"+v.getAgegroup(v.getAge())+"\n"+"HeatRate:"+v.getHeartRate()+"\n"
                    +"WeightPound:"+v.getWeightPound()+"\n"+"WeightKg:"+v.getWeightKg()+"\n"
                    +"SystolicBloodPressure:"+v.getSystolicBloodPressure()
                    +"\n"+"getRespiratoryRate:"+v.getRespiratoryRate());
        
        
    }
    public void showhistory(ArrayList<vitalsign> v ){
       
            for( vitalsign vs : v){
                
                vs.showvitalsign(vs);
            }
     
    }
    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
    
    
    
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAgegroup(double age) {
        
        
        if (age==0){
            agegroup="Newborn";
        }else if(age<=1){
            agegroup="Infant";
        }else if(age<=3){
            agegroup="Toldder";
        }else if(age<=5){
            agegroup="Preschooler";
        }else if(age<=12){
            agegroup="School Age";
        }else{
            agegroup="Adolescent";
            
        }
        return agegroup;
    }

    public void setAgegroup(String agegroup) {
        this.agegroup = agegroup;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightPound() {
        return weightPound;
    }

    public void setWeightPound(double weightPound) {
        this.weightPound = weightPound;
    }
    
    
}
