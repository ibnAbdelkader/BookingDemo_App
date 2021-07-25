/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookingdemo;

/**
 *
 * @author ahmed
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class BookingDemo {
   
     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        File input1 = new File("inputDB.txt");
        File input2 = new File("printLog.txt");
        File input3=new File("inputBoking.txt");
        File input4=new File("printBoking.txt"); 
        if (!input1.exists()&&input3.exists()) {
            System.out.println("File does not exist!");
            System.exit(0);
            
        }

        PrintWriter fwrite = new PrintWriter(input2);
        Scanner input = new Scanner(input1);
        Scanner inputB = new Scanner(input3);
        PrintWriter write = new PrintWriter(input4);
        Airline[] Airlins = new Airline[input.nextInt()];
        Airport[] Airports = new Airport[input.nextInt()];
        Flight[] flights = new Flight[input.nextInt()];
        
        fwrite.println(" --------------- Air Ticket Reservation System Log ---------------");
        fwrite.println("");
        fwrite.println("");
           
        write.println("--------------- Welcome to Air Ticket Reservation System ---------------");
        write.println("");
           // for(int i=0;i<Airlins.length;i++){
           //     int index = 0;
           // Airlins[index] = new Airline(input.next(),input.next(),input.next(),input.next()); 
           // fwrite.println("(New Airline Added)   Airline No.: "+Airlins[index].getTwodigitecode()+"  Airline: "+Airlins[index].getName()+"\t"+"Hub: "+Airlins[index].getOrigincountry()+"\t"+"URL: "+Airlins[index].getWebsite());
           //  fwrite.println("-------------------");
           //  fwrite.println("");   
           // }
           
        
        for(int i=0;i<Airlins.length;i++){
            //Airlins[i] = new Airline(input.next(),input.next(),input.next(),input.next());
        write.println(Airlins[i].getTwodigitecode()+"  "+Airlins[i].getWebsite());
        }
        
        
        String command =null;
        
        do {
         command = input.next();
         int index=0;
         int index1=0;
         int index2=0;
         
         if(command.equalsIgnoreCase("ADD_Airline")){
         getAirline(input, fwrite, Airlins,index);
          index++;
         }
         
         if(command.equalsIgnoreCase("ADD_Flight")){
         getFlight(input, fwrite, flights,index2);
          index2++;
         }

         if(command.equalsIgnoreCase("ADD_Airport")){
         getAirport(input, fwrite, Airports,index1);
          index1++;
         }
        
               
        } while(!command.equalsIgnoreCase("Quit"));
       
        write.flush();
        write.close();
        fwrite.flush(); 
        fwrite.close();
        input.close();
    }   //end of main function
    
    /*private static Booking getNewBooking(Scanner input, PrintWriter output, Booking[] Bookings, int index){

        if(index<Bookings.length){
        Bookings[index] = new Booking(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
        output.println("Booking No. "+Bookings[index].getBookingNo());
        output.println("Passenger Details   Passenger Name: "+Bookings[index].getName()+"   Date of Birth: "+Bookings[index].getDob());
        output.println("");
        output.println("Flight Details "+ "Flight Code: "+Bookings[index].getFlight().);
        }
     return null;
     }*/
     
     
     
    private static Airline getAirline(Scanner input,PrintWriter output, Airline[] Airlins ,int index){
       
        
           if(index<Airlins.length){
             Airlins[index] = new Airline(input.next(),input.next(),input.next(),input.next()); 
             output.println("(New Airline Added)   Airline No.: "+Airlins[index].getTwodigitecode()+"  Airline: "+Airlins[index].getName()+"\t"+"Hub: "+Airlins[index].getOrigincountry()+"\t"+"URL: "+Airlins[index].getWebsite());
             output.println("-------------------");
             output.println("");
           }
      return null;        
    }
     
    private static Flight getFlight(Scanner input,PrintWriter output,Flight[] flights ,int index){
         
           if(index<flights.length){
           flights[index] = new Flight(input.next(),input.next(),input.next(),input.nextDouble()); 
            output.println("(New Flight Added)  Flight No "+flights[index].getFlightNo()+"  Departure: "+flights[index].getDeparture()+""+"    Destination: "+flights[index].getDestination()+"  Fare: "+flights[index].getFare());
             output.println("-------------------");
             output.println("");
           }
           
     return null;
            
    }
    
    private static Airport getAirport(Scanner input,PrintWriter output, Airport[] Airports ,int index){
         
           if(index<Airports.length){
           Airports[index] = new Airport(input.next(),input.next(),input.next()); 
             output.println("(New Airport Added)   Airport Code:   "+Airports[index].getThreedigitecode()+"    City: "+Airports[index].getCity()+"\t"+"Name:"+Airports[index].getName());
             output.println("-------------------");
             output.println("");
           }
           
     return null;      
    }
    
    public static int srarchreg(Airline[] Airlins,String name){
     
       for(int i=0;i<Airlins.length;i++) {
        if(!Airlins[i].equals(name)){
        
            return i; 
           } 
        
       }
       return 0;
    }
        
}
