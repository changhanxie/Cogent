package com.practiceDatabaseApp1.DatabaseApp1.Dao.Impl;

import com.practiceDatabaseApp1.DatabaseApp1.Dao.CustomerDao;
import com.practiceDatabaseApp1.DatabaseApp1.Mapper.CustomerMapper;
import com.practiceDatabaseApp1.DatabaseApp1.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemp;

    @Override
    public Customer getOneCustomerFromDatabase(Integer id) {
        String sql = String.format("select * from customer where id='%s'", id);
        RowMapper mapper = new CustomerMapper();
        try {
            Customer customer = (Customer) jdbcTemp.queryForObject(sql, mapper);
            System.out.println(customer);
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
            return new Customer();
        }

    }
}
