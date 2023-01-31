package com.practiceDatabaseApp1.DatabaseApp1.Customer;


import com.practiceDatabaseApp1.DatabaseApp1.Dao.CustomerDao;
import com.practiceDatabaseApp1.DatabaseApp1.Dao.Impl.CustomerDaoImpl;
import com.practiceDatabaseApp1.DatabaseApp1.Model.Customer;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("{id}")
    public String queryEmployeeById(@PathVariable Integer id) {
        Customer customer = customerDao.getOneCustomerFromDatabase(id);
        JSONObject root = new JSONObject();
        root.put("selectingCustomer", customer.toString());
        return root.toString();
    }
}
