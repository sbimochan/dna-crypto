/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dna.decrypt;
/**
 *
 * @author dell
 */
public class Rreplacement {
    public String binaryToText(String totext){
       int lt=(totext.length())/8; 
                // to convert binary to ascii and char divide into each of length 8 bits
//                System.out.println(lt);
                String chh,ptt="";
                int x=0,y=8;
                for(int i1=0;i1<lt;i1++){
                    chh=totext.substring(x,y); //8 bit binary taken to convert to ascii                    
                    int a=Integer.parseInt(chh,2); //ascii value
                    ptt=ptt+ (char) a; //store as char in string
//                     System.out.println(ptt);
                    x=x+8;y=y+8;
                    
                }
                System.out.println("Coverted to Text: "+ptt);
    return ptt;
    }
    public String rreplace(String replace){
     char[] pt1;       
      pt1=replace.toCharArray(); //convert to plaintext
       int ll=pt1.length; // length of characters
//       System.out.println((int) ptt);
       int k2; //random integer variable
       String pltext=""; //expected output
     
       for(int im=0;im<ll;im++){

          k2= pt1[im]; 
//         System.out.println(k2);
          //replacement
         
        if(k2>97 && k2 <=122){
           k2=k2-25;
           if(k2<98){
               int m=98-k2;
               k2=97+m;
           }
           pt1[im]=(char) k2;
//          System.out.println(pt[i]);
        }
          else if(k2>65 && k2 <=90){
           k2=k2-25;
           if(k2<66){
               int m=66-k2;
               k2=65+m;
           }
           pt1[im]=(char) k2;
        
        }
          else if(k2==32 ){
              k2=32;
              pt1[im]=(char) k2;
          }
           else if(k2==54 ){
              k2=54;
              pt1[im]=(char) k2;
          }
           else if(k2==65 ){
              k2=65;
              pt1[im]=(char) k2;
          }
           else if(k2==97 ){
              k2=97;
              pt1[im]=(char) k2;
          }
//            System.out.println(pt1[im]);
          pltext=pltext+pt1[im];
       }
            System.out.println("Final output : "+pltext);
          return pltext;
    
    }
    
}
