/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: OtherDriver.java
 * Description: This class defines a driver with a different mode of transportation implements the Driver interface and can receive delivery requests.
 */
package edu.bu.met.cs665.hw2;

/**
 * This is the OtherDriver class.
 * This class defines a driver with a different mode of transportation implements the Driver interface and can receive delivery requests.
 */
public class OtherDriver implements Driver{
    private String transportation;
    private String name;
    private Request request;

    /**
     * Constructs an OtherDriver object with the specified transportation type and name.
     * @param transportation The type of transportation used by the driver.
     * @param name The name of the driver.
     */
    public OtherDriver(String transportation, String name) {
        this.transportation = transportation;
        this.name = name;
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
     * Gets the type of transportation used by this driver.
     * @return The transportation type as a String.
     */
    public String getTransportation() {
        return transportation;
    }

    /**
     * Gets the name of this driver.
     * @return The driver's name as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the current delivery request notify to this driver.
     * @return The Request object notify to this driver, or null when init.
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Returns a string representation of the OtherDriver object, including transportation type, name, and current request.
     * @return A string representation of the OtherDriver object.
     */
    @Override
    public String toString() {
        return "OtherDriver{" +
                "transportation='" + transportation + '\'' +
                ", name='" + name + '\'' +
                ", request=" + request.toString() +
                '}';
    }
}
