/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dna.encrypt;


import java.util.Random;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class Otp {
   
    

   public  int calculateLength(String word) {
      int count = word.length();
       return count;
   }

   public String getOTP(String chara) {
       String word=chara;
       System.out.println("word is"+word);
       String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
       StringBuilder salt = new StringBuilder();
       Random rnd = new Random();
       
       int i = calculateLength(word);
       while (salt.length() < i) { // length of the random string.
           int index = (int) (rnd.nextFloat() * SALTCHARS.length());
           salt.append(SALTCHARS.charAt(index));
       }
       String otpkey=String.valueOf(salt);
       JOptionPane.showInputDialog("Your key is: " , otpkey);
       System.out.println("key= "+otpkey);
           
       return otpkey;
  
   }
 }

