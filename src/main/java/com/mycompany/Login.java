/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author USER
 */
public class Login {
   String username;
 String password;
 String cellphone;
    
  public Login(String username,String password,String cellphone){
  this.username=username;
  this.cellphone=cellphone;
  this.password=password;
  
  }
  public Boolean checkUsername(){

         return username.contains("_") && username.length() <5;
}
 Boolean checkCellphone(){
 
     return cellphone.length()<=12&&cellphone.startsWith("+27");
 
 }
    public static void ValidatePassword(String[] args) {
      
        
        
        
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
}

/*

*/