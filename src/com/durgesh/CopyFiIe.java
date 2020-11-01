package com.durgesh;

import java.io.*;
 class CopyFile {

   public static void main(String args[]) throws IOException {  
    
	   File file = new File("input-file.txt");
      
    	  try{    
              FileWriter fw=new FileWriter("input-file.txt");    
              fw.write("Welcome to javaTpoint.");    
              fw.close();    
             }catch(Exception e){System.out.println(e);}    
             System.out.println("Success...");   
         }
     
   }
