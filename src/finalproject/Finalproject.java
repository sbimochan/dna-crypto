/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.util.*;

/**
 *
 * @author bipin
 */
public class Finalproject {
    static String[] fp;
    public static String[] plaintext(){
       Scanner sn=new Scanner(System.in);
       String sp;
       char pt[];
       
       System.out.println("enter plaintext");
       sp=sn.nextLine();
       pt=sp.toCharArray();
       for(int i=0;i<pt.length;i++){
           fp[i]=Integer.toString((int) pt[i]);
           System.out.println("plaintext"+fp[i]);
       }
       
       return fp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] r=plaintext();
        System.out.println(r);
    }
   
}
