package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.hw2.*;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }


    @Test
    public void testNotification(){
//        init the Shop and five Driver
        Shop shop = new Shop("TestShop","Test Rd, Boston, 02111");
        CarDriver carDriver1 = new CarDriver("Sedan", "Lewis Hamilton","S12345678");
        CarDriver carDriver2 = new CarDriver("SUV", "Michael Schumacher","S12345678");
        CarDriver carDriver3 = new CarDriver("Coupe", "Ayrton Senna","S12345678");
        OtherDriver otherDriver1 = new OtherDriver("scooter", "Max Verstappen");
        OtherDriver otherDriver2 = new OtherDriver("bicycle", "Guanyu Zhou");

//        get the DeliveryRequest and add the Drivers
        DeliveryRequest deliveryRequest = DeliveryRequest.getInstance();
        deliveryRequest.addDriver(carDriver1);
        deliveryRequest.addDriver(carDriver2);
        deliveryRequest.addDriver(carDriver3);
        deliveryRequest.addDriver(otherDriver1);
        deliveryRequest.addDriver(otherDriver2);

//        Drivers init without any request
        assertEquals(null, carDriver1.getRequest());
        assertEquals(null, carDriver2.getRequest());
        assertEquals(null, carDriver3.getRequest());
        assertEquals(null, otherDriver1.getRequest());
        assertEquals(null, otherDriver2.getRequest());

//        Send the request from shop
        shop.sendRequest("customer Rd, Boston, 02100", "15min");

//        All five drivers get the request
        assertEquals("customer Rd, Boston, 02100", carDriver1.getRequest().getCustomerAddress());
        assertEquals("customer Rd, Boston, 02100", carDriver2.getRequest().getCustomerAddress());
        assertEquals("customer Rd, Boston, 02100", carDriver3.getRequest().getCustomerAddress());
        assertEquals("customer Rd, Boston, 02100", otherDriver1.getRequest().getCustomerAddress());
        assertEquals("customer Rd, Boston, 02100", otherDriver2.getRequest().getCustomerAddress());

    }

    @Test
    public void testDeleteDriver(){
//        init the shop and three Driver
        Shop shop = new Shop("TestShop","Test Rd, Boston, 02111");
        CarDriver carDriver1 = new CarDriver("Sedan", "Lewis Hamilton","S12345678");
        CarDriver carDriver2 = new CarDriver("SUV", "Michael Schumacher","S12345678");
        CarDriver carDriver3 = new CarDriver("Coupe", "Ayrton Senna","S12345678");

//        get the DeliveryRequest and add the Drivers
        DeliveryRequest deliveryRequest = DeliveryRequest.getInstance();
        deliveryRequest.addDriver(carDriver1);
        deliveryRequest.addDriver(carDriver2);
        deliveryRequest.addDriver(carDriver3);

//        send the request from shop
        shop.sendRequest("customer Rd, Boston, 02100", "15min");

//        All three drivers should get the request
        assertEquals("15min", carDriver1.getRequest().getPickupTime());
        assertEquals("15min", carDriver2.getRequest().getPickupTime());
        assertEquals("15min", carDriver3.getRequest().getPickupTime());

//        remove driver2 from notification
        deliveryRequest.deleteDriver(carDriver2);

//        send another request from shop
        shop.sendRequest("customer Rd, Boston, 02100", "0min");

//        driver2 should not get the new request
        assertEquals("0min", carDriver1.getRequest().getPickupTime());
        assertEquals("15min", carDriver2.getRequest().getPickupTime());
        assertEquals("0min", carDriver3.getRequest().getPickupTime());


    }

    @Test
    public void testGetMethod(){
//        init a carDriver and check all get request
        CarDriver carDriver = new CarDriver("Coupe", "Ayrton Senna","S12345678");
        assertEquals("Coupe", carDriver.getCar());
        assertEquals("Ayrton Senna", carDriver.getName());
        assertEquals("S12345678", carDriver.getDriverLicense());

//        init a otherDriver and check all get request
        OtherDriver otherDriver = new OtherDriver("scooter", "Max Verstappen");
        assertEquals("scooter", otherDriver.getTransportation());
        assertEquals("Max Verstappen", otherDriver.getName());


    }


}
