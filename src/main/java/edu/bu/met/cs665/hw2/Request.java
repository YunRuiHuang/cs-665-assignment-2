/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Request.java
 * Description: This class represents a request for a pickup, containing information about the shop, customer's address, and pickup time.
 */
package edu.bu.met.cs665.hw2;

/**
 * This is the Request class.
 * This class represents a request for a pickup, containing information about the shop, customer's address, and pickup time.
 */
public class Request {
    private Shop shop;
    private String customerAddress;
    private String pickupTime;

    /**
     * Constructs a Request object with the specified shop, customer address, and pickup time.
     * @param shop The Shop object related to the request.
     * @param customerAddress The address of the customer.
     * @param pickupTime The time the pickup is scheduled.
     */
    public Request(Shop shop, String customerAddress, String pickupTime) {
        this.shop = shop;
        this.customerAddress = customerAddress;
        this.pickupTime = pickupTime;
    }

    /**
     * Gets the shop associated with this request.
     * @return The Shop object.
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * Gets the customer's address for this request.
     * @return The customer's address as a String.
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Gets the scheduled pickup time for this request.
     * @return The pickup time as a String.
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * Returns a string representation of the Request object, including the shop, customer address, and pickup time.
     * @return A string representation of the Request object.
     */
    @Override
    public String toString() {
        return "Request{" +
                "shop=" + shop.toString() +
                ", customerAddress='" + customerAddress + '\'' +
                ", pickupTime='" + pickupTime + '\'' +
                '}';
    }
}
