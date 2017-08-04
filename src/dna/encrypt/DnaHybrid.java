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
public class DnaHybrid extends javax.swing.JFrame {

    public String pt_BIN(String pt) {
//print ascii value of char
        String rep_text = pt;
        char[] pb;
        String plainbin = "";
        pb = rep_text.toCharArray();
        for (int i = 0; i < pb.length; i++) {
//System.out.println(pb[i]);
            int tt = (int) pb[i];

           if(tt<2){
            plainbin=plainbin+("000000"+Integer.toBinaryString((int) pb[i]));  
         }
         else if(tt>=2 && tt<8){
            plainbin=plainbin+("00000"+Integer.toBinaryString((int) pb[i]));  
         }
         else if(tt>=8 && tt<16){
            plainbin=plainbin+("0000"+Integer.toBinaryString((int) pb[i]));  
         }
         else if(tt>=16 && tt<32){
            plainbin=plainbin+("000"+Integer.toBinaryString((int) pb[i]));  
         }
         else if(tt>=32 && tt<64){
            plainbin=plainbin+("00"+Integer.toBinaryString((int) pb[i]));  
         }
         else if(tt>=64 && tt<128){
            plainbin=plainbin+("0"+Integer.toBinaryString((int) pb[i]));  
         }
        }
        System.out.println("plaintext bin " + plainbin);
        return plainbin;
    }

    public String otp_BIN(String otp) {
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

    //xor key and plaintext
    public String ptXORotp(String ptbin, String otpbin) {

        String dna;
        String dnaop = "";
        String txthelix = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < otpbin.length(); i++) {
            sb.append((ptbin.charAt(i) ^ otpbin.charAt(i)));

        }
        System.out.println("xor value " + sb);
        String result = String.valueOf(sb);
        System.out.println("result dna " + result);
        int ln = result.length();//legnth of replacedtext array
        int ln1 = ln / 2;
//     for(int j=0;j<ln;j++){
//         String bb=0+Integer.toBinaryString((int) rt[j]);//binary value 0 is added to make 8 bit 
        int kk = 0, kl = 2;

        for (int ll = 0; ll < ln1; ll++) {
            dna = result.substring(kk, kl);//dividing into 2/2 bit binary value
            kk = kk + 2;
            kl = kl + 2;
            System.out.println("divided " + dna);
            switch (dna) {
                case "00":
                    txthelix = txthelix + "A";
//                 System.out.println("A");
                    break;
                case "01":
                    txthelix = txthelix + "T";
//                 System.out.println("T");
                    break;
                case "10":
                    txthelix = txthelix + "C";
//                 System.out.println("C");
                    break;
                case "11":
                    txthelix = txthelix + "G";
//                 System.out.println("G");
                    break;
                default:
                    continue;

            }

        }
//       System.out.println(bb);  
        //ascii end
        System.out.println("cipher in form of ATCG is: " + txthelix);
        String txtresult = (String) String.valueOf(txthelix);
        System.out.println("result in form of ATCG is:" + txtresult);
        return txtresult;

    }

    
}
