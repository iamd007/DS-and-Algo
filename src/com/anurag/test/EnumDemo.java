package com.anurag.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class TempPerson
{
    	String name;
    	int age;
    	Address ad;
		public Address getAd() {
			return ad;
		}
		public void setAd(Address ad) {
			this.ad = ad;
		}
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "TempPerson [name=" + name + ", age=" + age + ", ad=" + ad + "]";
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
    	

}


class Address
{
	String areaName;
	City city;
	@Override
	public String toString() {
		return "Address [areaName=" + areaName + ", city=" + city + "]";
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
}
class City
{
   String cityName;
   String cityCode;
@Override
public String toString() {
	return "City [cityName=" + cityName + ", cityCode=" + cityCode + "]";
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getCityCode() {
	return cityCode;
}
public void setCityCode(String cityCode) {
	this.cityCode = cityCode;
}
   
}

public class EnumDemo {

	
	
	public static void main(String[] args) {
		ThreadState threadState = ThreadState.Instance;
		System.out.println(threadState);
		ThreadState threaddState1 = ThreadState.Instance;
		System.out.println(threaddState1);
		
		System.out.println(threadState.getI());
		System.out.println(threaddState1.getI());
		threaddState1.setI(10);
		System.out.println(threadState.getI());
        
		
		HashMap<String,Integer> hm = new HashMap();
		hm.put("one",1);
		hm.put("seven", 7);
		hm.put("nine", 9);
		hm.put("three",3);
		System.out.println(hm);
		
		List<Map.Entry<String,Integer>> entries = new ArrayList<>(hm.entrySet());
		System.out.println(entries);
		Collections.sort(entries,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				
				return arg0.getValue()-arg1.getValue();
			}
			
		});
		
		for(Entry<String ,Integer> e: entries )
		{
			System.out.println(e.getKey() +" " + e.getValue());
		}
		
        System.out.println("---------------------------------");
        
        City c1 = new City();
        City c2 = new City();
        City c3 = new City();
        City c4 = new City();
        c1.setCityName("mumbai");
        c1.setCityCode("mum");
        c2.setCityName("hyderabad");
        c2.setCityCode("hyd");
        c3.setCityName("banglore");
        c3.setCityCode("bang");
        /*c4.setCityName("mumbai");
        c4.setCityCode("mum");*/
        Address ad1 = new Address();
        Address ad2 = new Address();
        Address ad3 = new Address();
        Address ad4 = new Address();
        ad1.setAreaName("banglore");
        ad1.setCity(c3);
        ad2.setAreaName("mumbai");
        ad2.setCity(c1);
        ad3.setAreaName("mumbai");
        ad3.setCity(c1);
        ad4.setAreaName("hyderabad");
        ad4.setCity(c2);
        
        TempPerson p1 = new TempPerson();
        TempPerson p2 = new TempPerson();
        TempPerson p3 = new TempPerson();
        TempPerson p4 = new TempPerson();
        p1.setAge(29);
        p1.setName("abhishek");
        p1.setAd(ad4);
        
        p2.setAge(20);
        p2.setName("durgesh");
        p2.setAd(ad3);
        
        p3.setAge(26);
        p3.setName("kishan");
        p3.setAd(ad1);
        
        p4.setAge(28);
        p4.setName("nattu");
        p4.setAd(ad2);
        
        HashMap<String,TempPerson> personDetails = new HashMap();
        personDetails.put("abhishek", p1);
        personDetails.put("nattu", p4);
        personDetails.put("kishan", p3);
        personDetails.put("durgesh", p2);
        System.out.println(personDetails);
        
        List<Map.Entry<String,TempPerson>> entOfPersonDetails = new ArrayList(personDetails.entrySet());
       
        Collections.sort(entOfPersonDetails,new Comparator<Entry<String,TempPerson>>(){

			@Override
			public int compare(Entry<String, TempPerson> o1, Entry<String, TempPerson> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getAd().getCity().getCityCode().compareTo(o2.getValue().getAd().getCity().getCityCode());
			}
        }
        );
        
        
        
        
        List<Map.Entry<String, TempPerson>> sortByAddressName = new ArrayList(personDetails.entrySet());
        Collections.sort(sortByAddressName,new Comparator<Entry<String,TempPerson>>()
        		{

					@Override
					public int compare(Entry<String, TempPerson> o1, Entry<String, TempPerson> o2) {
						
						return o1.getValue().getAd().getAreaName().compareTo(o2.getValue().getAd().getAreaName());
					}
        	         
        		});
        System.out.println("---------------Sort By aDDRESS Name --------------------- ");
        for(Entry<String,TempPerson> e : sortByAddressName)
        {
        	System.out.println(e.getKey() + " " + e.getValue());
        }
        
        HashMap<String,TempPerson> nn = new HashMap<>();
        for(Entry<String,TempPerson> e : entOfPersonDetails)
        {
        	System.out.println( e.getKey()+" " +e.getValue() );
            nn.put(e.getKey(), e.getValue());
        }
        System.out.println(nn);
        
        System.out.println("\n");
        Map<String,TempPerson> mmm = personDetails.entrySet().stream().sorted((e1,e2)->
          e1.getValue().getAd().getCity().getCityCode().compareTo(
        		  e2.getValue().getAd().getCity().getCityCode())).collect(
        				  Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        						  (e1,e2)->e1,LinkedHashMap::new));
        
        
        List<TempPerson> loo = personDetails.values().stream().collect(Collectors.toList());
        System.out.println("List " + loo);
        
        for(Map.Entry<String,TempPerson> e : mmm.entrySet())
        {
        	System.out.println(e.getKey() +" " +e.getValue());
        }
        		
        
	}

}
