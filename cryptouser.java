import java.io.*;
import java.util.Scanner;

public class cryptouser{
   public function askuser(){
//taking user input
    Scanner input = new Scanner(System.in);
    System.out.println("Enter plain text");
    String pt = input.nextLine();
//asking for key
    System.out.println("Enter your key");
    String key=input.nextLine();

    }

  //creating array
  public static void main(String[] args){
    char[] alphabets = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
    for (char element: alphabets){
      System.out.println(element);
    }
  }


}
