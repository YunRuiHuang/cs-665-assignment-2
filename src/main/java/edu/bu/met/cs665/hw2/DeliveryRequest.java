/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: DeliveryRequest.java
 * Description: This class defines a Singleton class responsible for managing delivery requests and notifying drivers.
 */
package edu.bu.met.cs665.hw2;

import java.util.ArrayList;

/**
 * This is the DeliveryRequest class.
 * This class defines a Singleton class responsible for managing delivery requests and notifying drivers.
 */
public class DeliveryRequest {
    private ArrayList<Driver> drivers;
    private static DeliveryRequest deliveryRequest = null;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private DeliveryRequest() {
        this.drivers = new ArrayList<>();
    }

    /**
     * Provides access to the singleton instance of DeliveryRequest.
     * @return The singleton instance of DeliveryRequest.
     */
    static public DeliveryRequest getInstance(){
        if (deliveryRequest == null){
            deliveryRequest = new DeliveryRequest();
        }
        return deliveryRequest;
    }

    /**
     * Gets the list of registered drivers.
     * @return An ArrayList of Driver objects.
     */
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    /**
     * Adds a driver to the list of registered drivers.
     * @param driver The Driver object to be added.
     * @return True if the driver was added successfully, false otherwise.
     */
    public boolean addDriver(Driver driver) {
        return this.drivers.add(driver);
    }

    /**
     * Deletes a driver from the list of registered drivers.
     * @param driver The Driver object to be removed.
     * @return True if the driver was removed successfully, false otherwise.
     */
    public boolean deleteDriver(Driver driver){
        return this.drivers.remove(driver);
    }

    /**
     * Sends a delivery request to all registered drivers.
     * @param request The Request object containing details about the delivery.
     */
    public void sendRequest(Request request){
        for(Driver driver : this.drivers){
            driver.notification(request);
        }
    }

}
