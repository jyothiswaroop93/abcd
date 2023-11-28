package com.Geekster.Employee.Address.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private long Id;
    private String StreetName;
    private String CityName;
    private String StateName;
    private String ZipCode;
}
