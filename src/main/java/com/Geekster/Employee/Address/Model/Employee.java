package com.Geekster.Employee.Address.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    private long Id;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "fk-address")
    private Address address;
}
