package com.crudmongo.crudmongo.repository;

import com.crudmongo.crudmongo.model.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {


}
