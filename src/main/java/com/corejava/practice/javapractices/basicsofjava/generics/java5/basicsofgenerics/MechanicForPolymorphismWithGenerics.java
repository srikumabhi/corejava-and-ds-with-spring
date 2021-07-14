package com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class MechanicForPolymorphismWithGenerics {

	/**
	 * 
	 * @param vehicles
	 */
	public void serviceVehicles(List<Vehicle> vehicles) {

		for(Vehicle vehicle: vehicles){
			vehicle.service();
		}

	}

	/**
	 * 
	 */
	public void mechanicForPolymorphismWithGenericsImpl() {

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle());
		vehicles.add(new Vehicle());

		List<Bike> bikes = new ArrayList<Bike>();
		bikes.add(new Bike());
		bikes.add(new Bike());

		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Car());

		MechanicForPolymorphismWithGenerics mechanicForPolymorphismWithGenerics = 
				new MechanicForPolymorphismWithGenerics();

       mechanicForPolymorphismWithGenerics.serviceVehicles(vehicles); // This works fine.
		/**
		 * 
		 */
		//mechanicForPolymorphismWithGenerics.serviceVehicles(bikes); // Compiler error.
		//mechanicForPolymorphismWithGenerics.serviceVehicles(cars);  // Compiler error.        
	}

}