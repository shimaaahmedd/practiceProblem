/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.problem;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(String filename) throws FileNotFoundException {
        FileReader fr=new FileReader(filename);
        reader = new BufferedReader(
                     fr);
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
//    void readFile(String filename) throws FileNotFoundException, IOException{
//      ArrayList<Integer> types= new ArrayList<>();
//      FileReader fr=new FileReader(filename);    
//      BufferedReader read =new BufferedReader(fr);
//      String firstLine=read.readLine();
//      String secondLine=read.readLine();
//      String[] line1=firstLine.split(" ");
//      String[] line2=secondLine.split(" ");
//      int M=Integer.parseInt(line1[0]);
//      int N = Integer.parseInt(line1[1]);
//      for (String s: line2)
//      types.add(Integer.parseInt(s));
//  }
}