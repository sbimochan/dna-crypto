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
public class RDnaHybrid {
    String dnaval="";


    public String otp_BIN(String otp) {
        System.out.println("OTP key input : "+otp);
        String key = otp;
        String keybin = "";
        char[] kb;
        kb = key.toCharArray();
        for (int i = 0; i < kb.length; i++) {
            int tk = (int) kb[i];
            if (tk == 32) {
                keybin = keybin + ("00" + Integer.toBinaryString(tk));
            } else {
                keybin = keybin + (0 + Integer.toBinaryString(tk));
            }

        }
        System.out.println("OTPKEY bin    " + keybin);
        return keybin;
    }
public String rev_dnahybrid(String ptbin){
   try {
            String ctext="";
            String ct="";
              
            
           char cipher[]=ptbin.toCharArray();
//            System.out.println(cipher);
           
//            System.out.println(ct);
//            String ct=ciphertext.getText();
            int ln=cipher.length; //length of ciphertext
//            int ln1=ln/2; // divide length to take dna index 00 -> A 01 ->T
            
            for(int i=0;i<ln;i++){
               
                //convert A ->00 T->01 C->10 G->11 with switch case (binary format)
                switch(cipher[i]){
                        case 'A':
                        dnaval=dnaval+"00";
                       
                        break;
                        case 'T':
                        dnaval=dnaval+"01";
                        break;
                        case 'C':
                        dnaval=dnaval+"10";
                        break;
                        case 'G':
                        dnaval=dnaval+"11";
                        break;
                        default:
                        continue;
                                  
                        
                        
                }  
}
}
   catch(Exception ex){
   System.out.println("Error"+ex);
   }
   System.out.println("Reverse text for dna : " + dnaval);
   return dnaval;
}
public String revXOR(String ptbin,String otpbin){
  StringBuilder sb = new StringBuilder();

        for (int i = 0; i < otpbin.length(); i++) {
            sb.append((ptbin.charAt(i) ^ otpbin.charAt(i)));

        }
        String ss=String.valueOf(sb);
        System.out.println("Value of appended form: "+ss);
        return ss;
}
}
