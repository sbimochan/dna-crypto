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
public class RevHelix {
       String dna="",dnaop="";
    
   public RevHelix(){}
    public  String dnahelix(String cipher){
//      this.helix=helix;   
   System.out.println("check"+cipher);
         int l2=0,k2=1;
         for(int i2=0;i2<cipher.length();i2++){
             dna=cipher.substring(l2,k2);
             l2++;
             k2++;
              switch(dna){
             case "A":
                  dnaop=dnaop+"T";
//                 System.out.println("A");
                 break;
               case "T":
                   dnaop=dnaop+"A";
//                 System.out.println("T");
                 break;
                   case "G":
                       dnaop=dnaop+"C";
//                 System.out.println("C");
                 break;
                       case "C":
                           dnaop=dnaop+"G";
//                 System.out.println("G");
                 break;
                       default:
                           continue;
         
         }
         }
         
         System.out.println("dnaop "+dnaop);  
         return dnaop;
}
    public String cipherRep(String dnahelix){
    
        System.out.println("text replacement" + dnahelix);
        String reverse = new StringBuffer(dnahelix).reverse().toString();

        System.out.println("ATCG result in reverse" + reverse);
        return reverse; 
    }
 
}
