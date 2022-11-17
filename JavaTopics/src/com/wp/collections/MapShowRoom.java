package com.wp.collections;

import java.util.Map;

public class MapShowRoom {

	String name;
	Map<String, MapCar> cars;
	public String getName() {
		return name;
	}
	
	
	MapCar searchCar(String name){
	
		return cars.get(name);
	}
	
	void addCar(String carName,MapCar car)
	{
		
		cars.put(carName, car);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, MapCar> getCars() {
		return cars;
	}
	public void setCars(Map<String, MapCar> cars) {
		this.cars = cars;
	}
	
	public MapShowRoom() {
		// TODO Auto-generated constructor stub
	}
	public MapShowRoom(String name, Map<String, MapCar> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", cars=" + cars + "]";
	}
	
	
} 