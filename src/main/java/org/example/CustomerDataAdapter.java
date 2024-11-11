package org.example;

public class CustomerDataAdapter implements CustomerDataViaUsb {
    private CustomerDataViaHttps httpsService;

    public CustomerDataAdapter(CustomerDataViaHttps httpsService) {
        this.httpsService = httpsService;
    }

    @Override
    public void printCustomer(int customerId) {
        httpsService.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return httpsService.getCustomerViaHttps(customerId);
    }
}
