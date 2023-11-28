package com.Geekster.Employee.Address.Service;

import com.Geekster.Employee.Address.Model.Address;
import com.Geekster.Employee.Address.Rapo.IAddressRapo;
import com.Geekster.Employee.Address.Rapo.IEmployeeRapo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressSerive {

    @Autowired
    IAddressRapo addressRapo;

    @Autowired
    IEmployeeRapo employeeRapo;

    public String AddAddress(Address address){
        addressRapo.save(address);
        return "Address added";
    }

    public List<Address> GetAllAddress(){
    return (List<Address>) addressRapo.findAll();
    }
        public Address GetAllAddress()
}
