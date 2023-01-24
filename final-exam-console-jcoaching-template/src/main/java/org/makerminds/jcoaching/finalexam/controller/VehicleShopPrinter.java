package org.makerminds.jcoaching.finalexam.controller;

import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for printing vehicle shop data.
 * 
 * @author <your-name>
 *
 */
public class VehicleShopPrinter {

	public void printAvailableVehicles(List<Vehicle> vehicleList) {
		// TODO Implement print available vehicles
		StringBuffer header = prepareVehiclesHeaderForDisplay();
		System.out.println(header);
		for(Vehicle vehicle : vehicleList) {
			StringBuffer vehicleBuffer =  prepareVehicleStringForDisplay(vehicle);
			System.out.println(vehicleBuffer);
		}
	}

	private StringBuffer prepareVehicleStringForDisplay(Vehicle vehicle) {
		
		StringBuffer vehicleBuffer = new StringBuffer();
		vehicleBuffer.append(vehicle.getId()).append(".");
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getManufacturer());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getModel());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getHorsePower());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getPrice());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getColor());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getMileage());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getProductionYear());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getFuelType());
		vehicleBuffer.append("\t\t");
		vehicleBuffer.append(vehicle.getTransmission());
		return vehicleBuffer;
	}

	private StringBuffer prepareVehiclesHeaderForDisplay() {
		// TODO Auto-generated method stub
		StringBuffer header = new StringBuffer();
		header.append("\n");
		header.append("VehicleShop App");
		header.append("\n\n");
		header.append("ID:");
		header.append("\t");
		header.append("Manufacturer:");
		header.append("\t\t");
		header.append("Model: ");
		header.append("\t\t");
		header.append("Horse-Power:");
		header.append("\t\t");
		header.append("Price:");
		header.append("\t");
		header.append("Color:");
		header.append("\t\t");
		header.append("Mileage:");
		header.append("\t");
		header.append("Production Year:");
		header.append("\t");
		header.append("Fuel Type:");
		header.append("\t");
		header.append("Transmission:");
		header.append("\n");
		return header;
	}

	public void printVehicleSoldMessage(int vehicleChosenId) {
		// \n in a String will cause a line break
		System.out.println("\n" + "Vehicle with ID " + vehicleChosenId + " was sold.");
	}

	public void printVehicleIdToSellRequest() {
		// \n in a String will cause a line break
		System.out.println("\n\n Please enter the number (ID) of the vehicle you want to sell: ");
	}
}
