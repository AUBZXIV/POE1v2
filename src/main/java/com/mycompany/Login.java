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
    Scanner scanner=new Scanner(System.in);
   String username=scanner.nextLine();
 String password=scanner.nextLine();
 String cellphone=scanner.nextLine();
 String regUser=scanner.nextLine();
 String regCell=scanner.nextLine();
 String regPassword=scanner.nextLine();
    
    
  
public Login(String username,String password,String cellphone){
  this.username=username;
  this.cellphone=cellphone;
  this.password=password;
  
  }
  public Boolean checkUsername(){

         return username.contains("_") && username.length() <=5;
         
}
 public Boolean checkCellphone(){
 
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
public String registerUser(){
    
    if (!checkUsername()) {
        return"Username should contain an underscore and must be no longer than 5 characters";
    }
    if (!checkPasswordcomplexity()) {
        return "Password should have atleast have an Uppercase letter+/n+"
                + "Password should atleast have on digit+/n+"
                + "Password should be 8 characters long+/n+"
                + "Password should contain atleast one Character";
        
    }
    return"The conditions have been met,Account has been registered successfully";
} 
public String checkCell(){

    if (!checkCellphone()) {
      return"Cellphone number should not be more than 10 digits and should begin with country code  ";
    }
    return "Cellphone number is invalid";
}
public Boolean loginUser(){
    if (username.equals(regUser)&&cellphone.equals(regCell)&&password.equals(regPassword)) {
        
     return true;
        
    }else{
    
    return false;
    }
    
    
}
 public String returnLoginStatus(){
     if (loginUser()) {
         return "Login has been successful";
     }else{
     
     return"Login is unsuccessful";
     }
     
     
 
 }

    public Object checkUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
}

/*

*/