package th.ac.ku.atm;

import th.ac.ku.atm.Customer;

import java.util.Map;

public interface DataSource {
    Map<Integer, Customer> readCustomers();
}