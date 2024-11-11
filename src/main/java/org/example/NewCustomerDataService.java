package org.example;

public class NewCustomerDataService implements CustomerDataViaHttps {
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Printing customer from HTTPS: ID=" + customerId);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return new Customer(customerId, "New Customer " + customerId);
    }
}
