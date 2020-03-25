package com.example.singletableinheritance;

import com.example.singletableinheritance.entities.Check;
import com.example.singletableinheritance.entities.CreditCard;
import com.example.singletableinheritance.entities.Payment;
import com.example.singletableinheritance.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	PaymentRepository repository;
	@Test
	void contextLoads(){}
	@Test
	void testCreateCreditCardPayment()
	{
		CreditCard creditCard = new CreditCard();
		creditCard.setId(1);
		creditCard.setAmount(1000.0);
		creditCard.setCreditcard("qwertyu");
		repository.save(creditCard);
	}
	@Test
	void testCreateCheckPayment()
	{
		//Check check = new Check(2,23322.3,"qqwweeer");
		Check check =new Check();
		check.setId(2);
		check.setAmount(111.11);
		check.setChecknumber("qqaas");
		repository.save(check);

	}


}
