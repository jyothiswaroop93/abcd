package com.Geekster.Employee.Address.Rapo;

import com.Geekster.Employee.Address.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRapo extends CrudRepository<Employee,Long> {
}
