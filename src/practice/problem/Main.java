
package practice.problem;

import java.io.*; 
import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) throws IOException{
    Reader.init("solve.txt"); // connect Reader to an input stream
     ArrayList<Integer> types=new ArrayList<>();
     int M = Reader.nextInt();
     int N = Reader.nextInt();
      for (int i=0;i<N;i++)
          types.add(Reader.nextInt());
  }
}