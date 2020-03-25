package com.example.joinedstrategyinheritance;

import com.example.joinedstrategyinheritance.entities.Check;
import com.example.joinedstrategyinheritance.entities.CreditCard;
import com.example.joinedstrategyinheritance.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	PaymentRepository repository;
	@Test
	void contextLoads() {
	}

	@Test
	void testCreateCreditCard()
	{
		CreditCard creditCard = new CreditCard();
		creditCard.setId(1);
		creditCard.setAmount(122.22);
		creditCard.setCreditcard("qqqss");
		repository.save(creditCard);

	}
	@Test
	void testCreateCheck()
	{
		Check check = new Check();
		check.setId(2);
		check.setAmount(111.1);
		check.setChecknumber("11wwwe");
		repository.save(check);


	}



}
