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
public class Airline {
    
    private String twodigitecode;
  private String name;
  private String origincountry;
  private String website;  




 public Airline(String twodigitecode, String name , String origincountry,String website ) {
        this.twodigitecode = twodigitecode;
        this.name = name;
        this.origincountry = origincountry;
        this.website = website;
        
    }

  

            

    public String getTwodigitecode() {
        return twodigitecode;
    }

    public void setTwodigitecode(String twodigitecode) {
        this.twodigitecode = twodigitecode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
        public String toString() {
      return(("Airline no.:"+getTwodigitecode()+"Airline:"+getName()+"Hub:"+getOrigincountry()+"URL:"+ getWebsite())) ;
       
      }
 
 
    
}
