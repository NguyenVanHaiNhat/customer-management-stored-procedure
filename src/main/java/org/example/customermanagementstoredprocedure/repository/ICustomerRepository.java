package org.example.customermanagementstoredprocedure.repository;

import org.example.customermanagementstoredprocedure.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
