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

import java.util.Date;
public class Booking {
   
 private long bookingNo;
 private Flight flight;
 private Airline airline;
 private Airport airport;
 Date flightDate;
 private String name;
 Date dob;
 Boolean isBusinessClass;
 private int baggageweight;
 
 public Booking(long bookingNo,Flight flight,Airline airline,Airport airport,Date flightDate,String name,Date dob,Boolean isBusinessClass,int baggageweight){
     this.bookingNo=bookingNo;
     this.flight=flight;
     this.airline=airline;
     this.airport=airport;
     this.name=name;
     this.dob=dob;
     this.flightDate=flightDate;
     this.isBusinessClass=isBusinessClass;
     this.baggageweight=baggageweight;
     
 }

    public long getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(long bookingNo) {
        this.bookingNo = bookingNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Boolean getIsBusinessClass() {
        return isBusinessClass;
    }

    public void setIsBusinessClass(Boolean isBusinessClass) {
        this.isBusinessClass = isBusinessClass;
    }

    public int getBaggageweight() {
        return baggageweight;
    }

    public void setBaggageweight(int baggageweight) {
        this.baggageweight = baggageweight;
    }
    
 
    
}
