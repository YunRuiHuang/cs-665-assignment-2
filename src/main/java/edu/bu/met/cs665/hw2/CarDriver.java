/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: CarDriver.java
 * Description: This class defines a car driver implements the Driver interface and can receive delivery requests.
 */
package edu.bu.met.cs665.hw2;

/**
 * This is the CarDriver class.
 * This class defines a car driver implements the Driver interface and can receive delivery requests.
 */
public class CarDriver implements Driver{
    private String car;
    private String name;
    private String driverLicense;
    private Request request;

    /**
     * Constructs a CarDriver object with the specified car, name, and driver license.
     * @param car The car driven by the driver.
     * @param name The name of the driver.
     * @param driverLicense The driver's license number.
     */
    public CarDriver(String car, String name, String driverLicense) {
        this.car = car;
        this.name = name;
        this.driverLicense = driverLicense;
        this.request = null;
    }

    /**
     * Method to handle notifications based on the provided request
     * @param request The Request object containing details about the delivery.
     */
    @Override
    public void notification(Request request) {
        this.request = request;
    }

    /**
     * Gets the current delivery request notify to this driver.
     * @return The Request object notify to this driver, or null when init.
     */
    public Request getRequest(){
        return this.request;
    }

    /**
     * Gets the car driven by this driver.
     * @return The car as a String.
     */
    public String getCar() {
        return car;
    }

    /**
     * Gets the name of this driver.
     * @return The driver's name as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the driver's license number.
     * @return The driver's license as a String.
     */
    public String getDriverLicense() {
        return driverLicense;
    }

    /**
     * Returns a string representation of the CarDriver object, including car, name, driver license, and current request.
     * @return A string representation of the CarDriver object.
     */
    @Override
    public String toString() {
        return "CarDriver{" +
                "car='" + car + '\'' +
                ", name='" + name + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", request=" + request.toString() +
                '}';
    }
}
