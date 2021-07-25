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
public class Flight {
    
     private String flightNo;
  private String departure;
  private String destination;  
   private double fare;
   
   
   public Flight(String flightNo, String departure , String destination,double fare ) {
        this.flightNo = flightNo;
        this. departure= departure;
        this.destination = destination;
        this.fare = fare;
        //currBookIndex++;
}

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
      public String toString() {
      return(("Flight No:"+getFlightNo()+"Departure:"+getDeparture()+"Destination:"+getDestination()+"Fare:"+getFare())) ;
       
      }
   
}
