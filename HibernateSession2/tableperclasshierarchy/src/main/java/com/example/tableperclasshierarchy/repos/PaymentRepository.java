package com.example.tableperclasshierarchy.repos;

import com.example.tableperclasshierarchy.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {


}
