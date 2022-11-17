package com.wp.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapShowRoomService {

	public static void main(String[] args) {

			//RNS
		MapCar car1=new MapCar("swift", "black", "maruti");
		MapCar car2=new MapCar("baleno", "black", "maruti");
		MapCar car3=new MapCar("etios", "black", "toyota");
		
		//--------------------------------------------
		//Nandi
		MapCar car4=new MapCar("glanza", "black", "toyota");
		MapCar car5=new MapCar("safari", "black", "tata");
		MapCar car6=new MapCar("tigor", "black", "tata");
		MapCar car7=new MapCar("nexon", "black", "tata");
	
		
		
		Map<String, MapCar> cars=new HashMap<String, MapCar>();
		
		cars.put(car1.getName(), car1);
		cars.put(car2.getName(), car2);
		cars.put(car3.getName(), car3);
		
		MapShowRoom showRoom1=new MapShowRoom("RNS Motors",cars);
			
		

		Map<String, MapCar> cars2=new HashMap<String, MapCar>();
		
		cars2.put(car4.getName(), car4);
		cars2.put(car5.getName(), car5);
		cars2.put(car6.getName(), car6);
		cars2.put(car7.getName(), car7);

		
		MapShowRoom showRoom2=new MapShowRoom("Nandi Motors",cars2);
				
		
		MapCar car= showRoom2.searchCar("baleno");
		
			if(car==null)
				{
				System.out.println("the car u searched is not found");
				
				System.out.println("available cars are");
				
					Map<String, MapCar> carsInS2= showRoom2.getCars();
					
					for(Entry<String, MapCar> s2car :carsInS2.entrySet())
					{
						
						System.out.println(s2car.getValue());
					}
				
				
				}
		
			else
		System.out.println(car);

		
		
	}

}