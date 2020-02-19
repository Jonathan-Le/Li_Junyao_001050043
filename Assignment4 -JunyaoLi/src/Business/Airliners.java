/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhanghaojie
 */
public class Airliners {
    private int airlinerID;
    private Date updatetime;
    private static int idCounter = 1;
    
    
    private String AirlinerNumber;
    private String DeparturalCity;
    private String ArrivalCity;
    private String DeparturalTime;
    private String ArrivalTime;
    
    public Airliners(int ID, String Number, String DeparturalCity,
                     String ArrivalCity,String DeparturalTime,String ArrivalTime){
        
        this.AirlinerNumber = Number;
        
        this.ArrivalCity=ArrivalCity;
        this.ArrivalTime=ArrivalTime;
        this.DeparturalCity=DeparturalCity;
        this.DeparturalTime=DeparturalTime;
        ///
        this.airlinerID = ID;
        this.updatetime = new Date();
    }

    public String getDeparturalCity() {
        return DeparturalCity;
    }

    public void setDeparturalCity(String DeparturalCity) {
        this.DeparturalCity = DeparturalCity;
    }

    public String getArrivalCity() {
        return ArrivalCity;
    }

    public void setArrivalCity(String ArrivalCity) {
        this.ArrivalCity = ArrivalCity;
    }

    public String getDeparturalTime() {
        return DeparturalTime;
    }

    public void setDeparturalTime(String DeparturalTime) {
        this.DeparturalTime = DeparturalTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
    
    public int getAirlinerID() {
        return airlinerID;
    }

    public void setAirlinerID(int airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getAirlinerNumber() {
        return AirlinerNumber;
    }

    public void setAirlinerNumber(String AirlinerNumber) {
        this.AirlinerNumber = AirlinerNumber;
    }
    

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
    

    @Override
    public String toString(){
        return "Airliner " + this.airlinerID;
    } 
}
