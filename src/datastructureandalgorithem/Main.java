package datastructureandalgorithem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

class Obj
{
	int id;
	String name;
	int salary;
	Obj(int id,String name,int salary)
	{
		this.id  = id;
		this.name = name;
		this.salary = salary;
	}
}
/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        //System.out.println(array);
    	
    	Map<String ,LinkedList<Obj>>   m = new HashMap<String ,LinkedList<Obj>>();
    	for(String s : array )
    	{
    		//System.out.println(s);
    		String a[] = s.split(",");
    		//System.out.println(a[0]);
    		
    		if(m.containsKey(a[2].trim()))
    		{
    			m.get(a[2].trim()).add(new Obj(Integer.parseInt(a[0].trim()),a[1].trim(),Integer.parseInt(a[3].trim())));
    		}
    		else
    		{   Obj  temp = new Obj(Integer.parseInt(a[0].trim()),a[1].trim(),Integer.parseInt(a[3].trim())) ;
    			
    			m.put(a[2].trim(), new LinkedList<Obj>());
    			m.get(a[2].trim()).add(temp);
    		}
    		
    		
    	}
    	//System.out.println(m);
    	
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        for(Map.Entry<String, LinkedList<Obj>> e : m.entrySet())
        {
        	//System.out.println("                Department is " + e.getKey());
        	int maxId=Integer.MIN_VALUE;
        	int id=-1;
        	int salary =-1;
        	for(Obj o : e.getValue())
        	{
        		//System.out.println(" id " + o.id +" name " + o.name +" salary  " +o.salary);
        		if(o.id > maxId)
        		{
        			maxId = o.id;
        			id = o.id;
        			salary = o.salary;
        		}
        		
        	}
        	retVal.put(e.getKey(), salary);
        }
      // System.out.println(retVal);
        
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
      
    }
}