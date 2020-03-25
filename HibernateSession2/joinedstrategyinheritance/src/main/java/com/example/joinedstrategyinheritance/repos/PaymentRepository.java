package com.example.joinedstrategyinheritance.repos;

import com.example.joinedstrategyinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
