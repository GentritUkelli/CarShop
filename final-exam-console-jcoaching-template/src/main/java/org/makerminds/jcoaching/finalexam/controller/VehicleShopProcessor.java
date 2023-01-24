package org.makerminds.jcoaching.finalexam.controller;

import java.util.Iterator;
import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for processing business processes.
 * 
 * @author Gentrit Ukelli
 *
 */
public class VehicleShopProcessor {

	/**
	 * responsible to sell a specified vehicle by id
	 * 
	 * @param vehiclesList
	 * @param vehicleChosenId
	 */
	public void sellVehicle(List<Vehicle> vehiclesList, int vehicleChosenId) {
		// TODO selling a vehicle means to remove it from the available vehicle list
		// Hint: use while loop to safely remove an object from a list
	     Iterator<Vehicle> iterator = vehiclesList.iterator();
		while (iterator.hasNext()) {
			Vehicle vehicle = iterator.next();
			int id = vehicle.getId();
			if (id == vehicleChosenId) {
				iterator.remove();
			}
		}
	}
}