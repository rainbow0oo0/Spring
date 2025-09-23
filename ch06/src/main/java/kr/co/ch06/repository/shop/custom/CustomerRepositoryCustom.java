package kr.co.ch06.repository.shop.custom;

import kr.co.ch06.entity.shop.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    public Customer selectCustomer(String custId);
    public List<Customer> selectAllCustomer();
    public List<Customer> selectProjectionCustomer();


}
