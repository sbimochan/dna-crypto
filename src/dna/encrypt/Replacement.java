/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dna.encrypt;
/**
 *
 * @author dell
 */
public class Replacement {

    String fop;
    
    public String replace(String sp) {
        try {

            char[] ptextarray;
            ptextarray = sp.toCharArray();
            int l = ptextarray.length;
            int k;



         for(int i=0;i<l;i++){

          k=(int) ptextarray[i]; 
          System.out.println(k);
          if(k>0 && k <=127){
          if(k>97 && k <=122){
           k=k-25;
           if(k<98){
               int m=98-k;
               k=97+m;
           }
           ptextarray[i]=(char) k;
//          System.out.println(pt[i]);
        }
          else if(k>65 && k <=90){
           k=k-25;
           if(k<66){
               int m=66-k;
               k=65+m;
           }
           ptextarray[i]=(char) k;
//          System.out.println(pt[i]);
        }
          else if(k==32){
              k=32;
              ptextarray[i]=(char) k;
          }
           else if(k==65){
              k=65;
              ptextarray[i]=(char) k;
          }
           else if(k==97){
              k=97;
              ptextarray[i]=(char) k;
          }
           else{
               k=k;
              ptextarray[i]=(char) k;
          }
//               k=k;
//              ptextarray[i]=(char) k;
          }
          
       }
            fop = new String(ptextarray);
            System.out.println(fop);
            
}
         catch (Exception e) {
            System.out.println(e);

        }
       return fop;
        
    }

 

}
