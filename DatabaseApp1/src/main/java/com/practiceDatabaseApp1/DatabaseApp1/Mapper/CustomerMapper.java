package com.practiceDatabaseApp1.DatabaseApp1.Mapper;

import com.practiceDatabaseApp1.DatabaseApp1.Model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper{
        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Customer customer = new Customer();
            customer.setId(resultSet.getInt("id"));
            customer.setUsername(resultSet.getString("username"));
            customer.setPassword(resultSet.getString("password"));
            customer.setCreated_time(resultSet.getDate("created_time"));
            return customer;
        }

}
