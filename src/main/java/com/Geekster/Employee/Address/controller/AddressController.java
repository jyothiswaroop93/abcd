package com.Geekster.Employee.Address.controller;

import com.Geekster.Employee.Address.Model.Address;
import com.Geekster.Employee.Address.Service.AddressSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressSerive addressSerive;

    @PostMapping("address")
    public String Addadress(@RequestBody Address address){
        return addressSerive.(Address);
    }

}
