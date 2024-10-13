/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Shop.java
 * Description: This class defines a shop that can send delivery requests.
 */
package edu.bu.met.cs665.hw2;

/**
 * This is the Shop class.
 * This class defines a shop that can send delivery requests.
 */
public class Shop {
    private DeliveryRequest deliveryRequest;
    private String shopName;
    private String shopAddress;

    /**
     * Constructs a Shop object with the specified name and address.
     * @param shopName The name of the shop.
     * @param shopAddress The address of the shop.
     */
    public Shop(String shopName, String shopAddress) {
        this.deliveryRequest = DeliveryRequest.getInstance();
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    /**
     * Sends a delivery request with the specified customer address and pickup time.
     * @param customerAddress The address of the customer for the delivery.
     * @param pickupTime The time when the pickup is scheduled.
     */
    public void sendRequest(String customerAddress, String pickupTime){
        this.deliveryRequest.sendRequest(new Request(this,customerAddress,pickupTime));
    }

    /**
     * Returns a string representation of the Shop object, including its name and address.
     * @return A string representation of the Shop object.
     */
    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}
