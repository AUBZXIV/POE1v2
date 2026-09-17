/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POE1 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner( System.in);
        
   String username="";
   String under="_";
   int ulen=username.length();
        System.out.println("WELCOME TO WAVE!");
        System.out.println("Please create your account below(Press OK to continue)");
        String answer=scanner.nextLine();
        
        
        System.out.println("Please create your username");
        username=scanner.nextLine();
        while(username.isBlank()){
            System.out.println("Please fill in your username*");
            username=scanner.nextLine();
        }
        while (ulen>5||!username.contains(under)) {            
            System.out.println("Username is invalid");
            System.out.println("Username should contain an underscore and must be 5 characters long");
            System.out.println("Please re enter user name");
            username=scanner.nextLine();
        }
         System.out.println("Username is valid!");
          System.out.println("(Press OK to continue)");
         answer=scanner.nextLine();
         
         String codesa="+27";
         String cellphone=scanner.nextLine();
         int lcell=cellphone.length();
         
        System.out.println("Please enter your cellphone number");
        cellphone=scanner.nextLine();
        
        while (cellphone.isBlank()) {            
            System.out.println("Please fill in your cellphone number*");  
            cellphone=scanner.nextLine();
        }
        
        
        while (lcell>12||!cellphone.startsWith(codesa)) {            
            System.out.println("Cellphone is INVALID!");
            System.out.println("Cellphone should not be longer than 10 characters and should start with your country code");
             System.out.println("Please re enter your cellphone number");    
            cellphone=scanner.nextLine();
        }
         System.out.println("Cellphone number is valid!"); 
          System.out.println("(Press OK to continue)");
        answer=scanner.nextLine();
//----------------------------------------------------
        String password="";
        int lpen=password.length();
        Boolean hasUP=false;
        Boolean hasLow=false;
        Boolean hasSpecial=false;
        Boolean hasNum=false;
        Character ch;

        
        
         System.out.println("PLEASE CREATE YOUR PASSWORD BELOW");
         password=scanner.nextLine();
         while (password.isBlank()) {            
           System.out.println("Please fill in your password*");
             password=scanner.nextLine();
         }
         
         while (lpen<8) {            
             System.out.println("Password should atleast be 8 chracters in length*"); 
             password=scanner.nextLine();
             lpen = password.length();
             
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

    System.out.println("Password must contain:");
    System.out.println("- At least one uppercase letter");
    System.out.println("- At least one number");
    System.out.println("- At least one special character");
    System.out.println("TRY AGAIN:");

    password = scanner.nextLine();

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
     
     
     
        System.out.println("Account has been succesfully created welcome on board!");      
    
        
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
        
    }



