package org.example;

public class LegacyCustomerDataService implements CustomerDataViaUsb {
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Printing customer from USB: ID=" + customerId);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return new Customer(customerId, "Legacy Customer " + customerId);
    }
}

