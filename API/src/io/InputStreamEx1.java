package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      InputStream in = System.in;
      int input = 0;
      try {
         
         while((input = in.read())!= -1) {
            System.out.println((char)input);
         }

      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
