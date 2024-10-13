/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Driver.java
 * Description: This class defines a method for handling notifications.
 */
package edu.bu.met.cs665.hw2;

/**
 * This is the Driver class.
 * This class defines a method for handling notifications.
 */
public interface Driver {
    /**
     * Method to handle notifications based on the provided request
     * @param request The Request object containing the details about the delivery.
     */
    public void notification(Request request);
}
