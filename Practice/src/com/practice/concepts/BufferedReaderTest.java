package com.practice.concepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderTest {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Maniraj Sivasubbu\\Desktop\\MyText.txt");    
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();   
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));  
        
        
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();
        System.out.println(name);

	}
}
