/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medical;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author junyaoli
 */
public class patient1 {
    
    
    private ArrayList<vitalsign> patient;
//    private ArrayList<vitalsign> history;
    
    public patient1() 
    {
        this.patient = new ArrayList<vitalsign>();
//        this.history = new ArrayList<vitalsign>();
    }
    

    
    public vitalsign addvitalsign(){
        vitalsign vs= new vitalsign();
        patient.add(vs);
        return vs;
    }
    
//    public ArrayList<vitalsign> getHistory() {
//        return history;
//    }
//
//    public void setHistory(ArrayList<vitalsign> history) {
//        this.history = history;
//    }
    


    public ArrayList<vitalsign> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<vitalsign> patient) {
        this.patient = patient;
    }
    
    
    
    public boolean isPatientNormal(vitalsign vs){  
        
       

       boolean result;        
       if (vs.getAgegroup(vs.getAge()).equals("Newborn")) {
            
             result= (vs.getHeartRate()<120 || vs.getHeartRate()>160) || 
                   (vs.getRespiratoryRate()<30 || vs.getRespiratoryRate()>50) ||
                   (vs.getSystolicBloodPressure()<50 || vs.getSystolicBloodPressure()>70) ||
                   (vs.getWeightKg()<2 || vs.getWeightKg()>3) ||
                   (vs.getWeightPound()<4.5 || vs.getWeightPound()>7);

       
       } else if (vs.getAgegroup(vs.getAge()).equals("Infant"))  {
           
            result= (vs.getHeartRate()<80 || vs.getHeartRate()>140) || 
                   (vs.getRespiratoryRate()<20 || vs.getRespiratoryRate()>30) ||
                   (vs.getSystolicBloodPressure()<70 || vs.getSystolicBloodPressure()>100) ||
                   (vs.getWeightKg()<4 || vs.getWeightKg()>10) ||
                   (vs.getWeightPound()<9 || vs.getWeightPound()>22);

           
       }else if (vs.getAgegroup(vs.getAge()).equals("Toddler"))  {
       
            result= (vs.getHeartRate()<80 || vs.getHeartRate()>130) || 
                   (vs.getRespiratoryRate()<20 || vs.getRespiratoryRate()>30) ||
                   (vs.getSystolicBloodPressure()<80 || vs.getSystolicBloodPressure()>110) ||
                   (vs.getWeightKg()<10 || vs.getWeightKg()>14) ||
                   (vs.getWeightPound()<22 || vs.getWeightPound()>31);

           
       }else if (vs.getAgegroup(vs.getAge()).equals("Preschooler"))  {
       
            result= (vs.getHeartRate()<80 || vs.getHeartRate()>120) || 
                   (vs.getRespiratoryRate()<20 || vs.getRespiratoryRate()>30) ||
                   (vs.getSystolicBloodPressure()<80 & vs.getSystolicBloodPressure()>110) ||
                   (vs.getWeightKg()<14 || vs.getWeightKg()>18) ||
                   (vs.getWeightPound()<31 || vs.getWeightPound()>40);

          
       }else if (vs.getAgegroup(vs.getAge()).equals("School Age"))  {
       
            result= (vs.getHeartRate()<70 || vs.getHeartRate()>110) || 
                   (vs.getRespiratoryRate()<20 || vs.getRespiratoryRate()>30) ||
                   (vs.getSystolicBloodPressure()<80 & vs.getSystolicBloodPressure()>120) ||
                   (vs.getWeightKg()<20 || vs.getWeightKg()>42) ||
                   (vs.getWeightPound()<41 || vs.getWeightPound()>92);

           
       }else{
            
           result= (vs.getHeartRate()<55 || vs.getHeartRate()>105) || 
                   (vs.getRespiratoryRate()<12 || vs.getRespiratoryRate()>20) ||
                   (vs.getSystolicBloodPressure()<110 || vs.getSystolicBloodPressure()>120) ||
                   (vs.getWeightKg()<50) ||
                   (vs.getWeightPound()<110);

       }
        
        return result;

    }
    
         
         
        

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        patient1  patient = new patient1();
        vitalsign history = new vitalsign();
        
        String nameString = null;
        double age;
        double Hrate;
        double Rrate;
        double pressure;
        double kg;
        double pound;
        
        for(int i=0; i<1;i++){
            
           vitalsign vs = patient.addvitalsign();
           vitalsign s = history.addvitalsign();
         
         
         Scanner parameter = new Scanner(System.in);
         System.out.println("Full name");
         nameString=parameter.nextLine();
         System.out.println("age");
         age=parameter.nextDouble();
         System.out.println("Hrate");
         Hrate=parameter.nextDouble();
         System.out.println("Rrate");
         Rrate=parameter.nextDouble();
         System.out.println("pressure");
         pressure=parameter.nextDouble();
         System.out.println("kg");
         kg=parameter.nextDouble();
         System.out.println("pound");
         pound=parameter.nextDouble();
         
         
        vs.setFullname(nameString);
        vs.setAge(age);
        vs.setHeartRate(Hrate);
        vs.setRespiratoryRate(Rrate);
        vs.setSystolicBloodPressure(pressure);
        vs.setWeightKg(kg);
        vs.setWeightPound(pound);
        
        s.setFullname(nameString);
        s.setAge(age);
        s.setHeartRate(Hrate);
        s.setRespiratoryRate(Rrate);
        s.setSystolicBloodPressure(pressure);
        s.setWeightKg(kg);
        s.setWeightPound(pound);
        /////////////////////////

        }

        for(vitalsign v : patient.getPatient()){
              
                v.showvitalsign(v);
         if(patient.isPatientNormal(v)) 
        {
            System.out.println("you are ill.");
        }
        else 
            System.out.println("you are healthy");
        }
        
        
        
        System.out.println("Do yuo want to add a  vital sign? True or False");  
        Scanner answer = new Scanner(System.in);
        boolean a= answer.nextBoolean();
        
        
        
        if (a) {
            System.out.println("Who do you want to add a new one?");
            
            Scanner name = new Scanner(System.in);
            String Sname= name.nextLine();
            
            for(vitalsign vs : patient.getPatient()){
            
                if (vs.getFullname().equals(Sname)) {
                 
                 
                 
                 vs.addvitalsign();

                 Scanner parameter = new Scanner(System.in);
                 System.out.println("age");
                 age=parameter.nextDouble();
                 System.out.println("Hrate");
                 Hrate=parameter.nextDouble();
                 System.out.println("Rrate");
                 Rrate=parameter.nextDouble();
                 System.out.println("pressure");
                 pressure=parameter.nextDouble();
                 System.out.println("kg");
                 kg=parameter.nextDouble();
                 System.out.println("pound");
                 pound=parameter.nextDouble();


                vs.setAge(age);
                vs.setHeartRate(Hrate);
                vs.setRespiratoryRate(Rrate);
                vs.setSystolicBloodPressure(pressure);
                vs.setWeightKg(kg);
                vs.setWeightPound(pound);
                
//              vs.showvitalsign(vs);
                vs.showhistory(vs.getHistory());
                
                }
                
            }
            
        
        
        
        }
        
       

        }

    
}
