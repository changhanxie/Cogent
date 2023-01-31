package com.practiceDatabaseApp1.DatabaseApp1.Model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Customer")
public class Customer {
    @Id
    private Integer id;
    private String username;
    private String password;
    private Date created_time;

    public void setId(Integer id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setCreated_time(Date created_time){
        this.created_time = created_time;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreated_time() {
        return created_time;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", created_time=" + created_time +
                '}';
    }
}
