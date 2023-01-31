package com.practiceDatabaseApp1.DatabaseApp1.Dao;

import com.practiceDatabaseApp1.DatabaseApp1.Model.Customer;

public interface CustomerDao {
    Customer getOneCustomerFromDatabase(Integer id);
}
