/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.Scanner;

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
  public  Boolean checkPasswordcomplexity(){
         Boolean hasUP=false;
        Boolean hasLow=false;
        Boolean hasSpecial=false;
        Boolean hasNum=false;
        Character ch;
     
        if (password.length()<8) {
            return false;
            }
        
        if (password.isBlank()) {
            return false;
        }
   
         for (int i = 0; i < password.length(); i++){
               ch = password.charAt(i);
               
        if (Character.isUpperCase(ch)) {
             hasUP=true;
             }
        if(Character.isDigit(ch)){
            hasNum=true;
        
        
        }
        if(!Character.isDigit(ch)&&!Character.isLetter(ch)&&!Character.isWhitespace(ch)){
        hasSpecial=true;
            
             } 
         
         }
          while (!hasUP || !hasNum || !hasSpecial) {
    hasUP = false;
    hasNum = false;
    hasSpecial = false;

    for (int i = 0; i < password.length(); i++) {
        ch = password.charAt(i);

        if (Character.isUpperCase(ch)) {
            hasUP = true;
        }

        if (Character.isDigit(ch)) {
            hasNum = true;
        }

        if (!Character.isDigit(ch) && 
            !Character.isLetter(ch) && 
            !Character.isWhitespace(ch)) {
            hasSpecial = true;
        }
    }
}
        
return (hasUP&&hasNum&&hasSpecial);
       
   }
 
 
 
 
 
 
 
 
 
 
 
 
 
}

/*

*/