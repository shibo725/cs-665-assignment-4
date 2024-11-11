package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CustomerDataAdapterTest {

    @Test
    public void testAdapterPrintCustomer() {
        CustomerDataViaHttps newService = new NewCustomerDataService();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newService);

        adapter.printCustomer(1);
    }

    @Test
    public void testAdapterGetCustomer() {
        CustomerDataViaHttps newService = new NewCustomerDataService();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newService);

        Customer customer = adapter.getCustomerViaUsb(1);
        assertEquals(1, customer.getId());
        assertEquals("New Customer 1", customer.getName());
    }
}
