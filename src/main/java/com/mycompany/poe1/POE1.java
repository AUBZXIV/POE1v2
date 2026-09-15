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
   // 
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
        
        
 
       
            
  String password=scanner.nextLine();
  int whilecount=0;
        System.out.println("PLEASE CREATE YOUR PASSWORD BELOW");

        while(password.isBlank()){
            System.out.println("Password field is empty");
            System.out.println("Please kindly fill in your password😂");
            password=scanner.nextLine();
            whilecount++;
        }
          //ss
   int plen=password.length();
        System.out.println(plen);
   while(plen<8){
       System.out.println("Password format is invalid");
       System.out.println("Password should atleast be 8 characters long...:");
       password=scanner.nextLine();
      
        plen = password.length(); 
       
   }     
        System.out.println("Password is valid"); ////
       /* Character ch;
     
        for (int i = 0; i <plen; i++) {
        ch=password.charAt(i);
        
           
        
        
        }
        
   
        */
        
        
        
        
        /* 
           while(plen<8 ||!Character.isUpperCase(ch) ||!Character.isDigit(ch)&&!Character.isAlphabetic(ch)  &&!Character.isWhitespace(ch) &&!Character.isDigit(ch)){
               System.out.println("Password format is incorrect");  
               System.out.println("Please enter a correct password format");
               password=scanner.nextLine();
               
           }
           
            
        }
        System.out.println("Password format is VALID");
         */   
        }
   
      /*
         
  int Plen=Password.length();
  System.out.println("Please create your password below");
        Password=scanner.next();
        for (int i = 0; i <Plen; i++) {
        ch=Password.charAt(i);
       if(Plen>=8){
       Length=true;
        }
            if (Character.isUpperCase(ch)) {
            containsUP=true;    
            }
            if (Character.isDigit(ch)) {
              containsNumber=true;  
            }
            if (!Character.isDigit(ch)&&!Character.isWhitespace(ch)&&!Character.isLetter(ch)) {
               containsSpecial=true;  
            }
        */
      
      
      
      
      
      
      
      
      
       
   /*
       System.out.println("PLEASE CREATE YOUR USERNAME:");
username = scanner.nextLine();

ulen = username.length();

while (ulen < 5 || !username.contains(under)) {

    System.out.println("Username is INVALID.");
    System.out.println("Username must be at least 5 characters and contain '_'.");
    
    System.out.println("PLEASE CREATE YOUR USERNAME:");
    username = scanner.nextLine();
    
    ulen = username.length();
}

System.out.println("Username is valid!");
       */
             
   
        
        
        
        
        
        
        
    }



