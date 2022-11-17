package com.wp.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCarService {

	Map<String, MapCar> MapCars=new HashMap<>();

		
	void addMapCar(String MapCarName, MapCar car)
	{
		
		MapCars.put(MapCarName, car);
	}
		
	MapCar searchMapCar(String name)
	{
		
		return MapCars.get(name);
	}
	
	
	
	
	
	public static void main(String[] args) {

		MapCarService MapCarService=new MapCarService();
		MapCar MapCar1=new MapCar("swift", "black", "maruti");
		MapCar MapCar2=new MapCar("baleno", "black", "maruti");
		MapCar MapCar3=new MapCar("etios", "black", "toyota");
		MapCar MapCar4=new MapCar("glanza", "black", "toyota");
		MapCar MapCar5=new MapCar("safari", "black", "tata");
		MapCar MapCar6=new MapCar("tigor", "black", "tata");
		MapCar MapCar7=new MapCar("nexon", "black", "tata");
		
		
		
		MapCarService.addMapCar(MapCar1.getName(), MapCar1);
		MapCarService.addMapCar(MapCar2.getName(), MapCar2);
		MapCarService.addMapCar(MapCar3.getName(), MapCar3);
		MapCarService.addMapCar(MapCar4.getName(), MapCar4);
		MapCarService.addMapCar(MapCar5.getName(), MapCar5);
		MapCarService.addMapCar(MapCar6.getName(), MapCar6);
		MapCarService.addMapCar(MapCar7.getName(), MapCar7);
		
		
		
		
		MapCar MapCar= MapCarService.searchMapCar("etios");
		
		System.out.println(MapCar);
	}

}
