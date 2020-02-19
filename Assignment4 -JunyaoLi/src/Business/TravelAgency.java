/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhanghaojie
 */
public class TravelAgency {
 
   private static TravelAgency instance = new TravelAgency();
    private Map<Integer, Customer> customerMap;
    private Map<Integer, Airliners> airlinerMap;
    private Date updateTime;
    
    public TravelAgency(){
        this.airlinerMap = new HashMap<Integer, Airliners> ();
        this.customerMap = new HashMap<Integer, Customer> ();
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
//        try {
//            Flight flight1 = new Flight("Boston", "Ningbo", dateFormat.parse("2020-02-15 11:30:00"), dateFormat.parse("2020-02-18 19:00:00"));
//            Flight flight2 = new Flight("Shanghai", "Boston", dateFormat.parse("2020-02-17 08:20:00"), dateFormat.parse("2020-02-19 04:00:00"));
//        
//            Airliners airliner1 = new Airliners(" Delta Air lines");
//            Airliners airliner2 = new Airliners("Delta Air lines");
//            Airplane airplane1 = new Airplane("Super1", "C90", 50);   
//            Airplane airplane2 = new Airplane("Super2", "D25", 55);   
//           
//            airplane1.getFlightMap().put(flight1.getFlightID(), flight1);
//            flight1.setSeatTotal(airplane1.getSeatCapacity());
//            flight1.generateSeat();
//            airplane1.getFlightMap().put(flight2.getFlightID(), flight2);
//            flight2.setSeatTotal(airplane1.getSeatCapacity());
//            flight2.generateSeat();
//            
//           
//            
//            airliner1.getAirlinerMap().put(airplane1.getPlaneID(), airplane1);
//            airliner1.getAirlinerMap().put(airplane2.getPlaneID(), airplane2);
//            
//            
//            this.airlinerMap.put(airliner1.getAirlinerID(), airliner1);
//            this.airlinerMap.put(airliner2.getAirlinerID(), airliner2);
//        } catch (ParseException ex) {
//            System.out.println("init airliner failed");    
//        }
        
        Customer customer1 = new Customer("123", "Jeffery");
        Customer customer2 = new Customer("456", "Josh");
       
        this.customerMap.put(customer2.getUserID(), customer2);
        
    }
    
    public static TravelAgency getTravelInstance(){
        return instance;
    }
    
    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<Integer, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public Map<Integer, Airliners> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airliners> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    
}
    

