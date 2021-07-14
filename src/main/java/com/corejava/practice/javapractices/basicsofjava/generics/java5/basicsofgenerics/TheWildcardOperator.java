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
public class TheWildcardOperator {

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
	 * @param vehicles
	 */
	public void serviceVehiclesForWildcardOperatorAndExtendskeyword(
			List<? extends Vehicle> vehicles) {

		for(Vehicle vehicle: vehicles){
			vehicle.service();
		}

	}

	/**
	 * 
	 * @param vehicles
	 */
	public void serviceVehiclesForWildcardOperatorAndSuperkeyword(
			List<? super Bike> vehicles) {

		for(Object vehicle: vehicles){
			((Vehicle) vehicle).service();
		}

	}

	/**
	 * 
	 */
	public void theWildcardOperatorExampelsImpl() {

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle());
		vehicles.add(new Vehicle());

		List<Bike> bikes = new ArrayList<Bike>();
		bikes.add(new Bike());
		bikes.add(new Bike());

		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Car());

		TheWildcardOperator theWildcardOperator = new TheWildcardOperator();
		
		/**
		 * 
		 */
		theWildcardOperator.serviceVehicles(vehicles); // This works fine.
		// theWildcardOperator.serviceVehicles(bikes); //  Compiler error.
		// theWildcardOperator.serviceVehicles(cars);  //  Compiler error.

		/**
		 * The wildcard operator and extends keyword.
		 */
		theWildcardOperator.serviceVehiclesForWildcardOperatorAndExtendskeyword(vehicles); // This works fine.
		theWildcardOperator.serviceVehiclesForWildcardOperatorAndExtendskeyword(bikes); //  This works fine.
		theWildcardOperator.serviceVehiclesForWildcardOperatorAndExtendskeyword(cars);  //  This works fine.

		/**
		 * The wildcard operator and super keyword.
		 */
		theWildcardOperator.serviceVehiclesForWildcardOperatorAndSuperkeyword(vehicles); // This works fine.
		theWildcardOperator.serviceVehiclesForWildcardOperatorAndSuperkeyword(bikes); //  This works fine.
		// theWildcardOperator.serviceVehiclesForWildcardOperatorAndSuperkeyword(cars);  //  Compiler error.

	}

}
