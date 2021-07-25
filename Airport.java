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
public class Airport {
      private String threedigitecode;
  private String city;
  private String name; 
  
  
   public Airport(String threedigitecode, String city , String name) {
        this.threedigitecode = threedigitecode;
         this.city = city;
          this.name = name;
        
   }      

    public String getThreedigitecode() {
        return threedigitecode;
    }

    public void setThreedigitecode(String threedigitecode) {
        this.threedigitecode = threedigitecode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String toString() {
      return(("Airport Code:"+getThreedigitecode()+"City:"+getCity()+"Name"+getName())) ;
       
      }
}
