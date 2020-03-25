package com.example.tableperclasshierarchy;

import com.example.tableperclasshierarchy.entities.Check;
import com.example.tableperclasshierarchy.entities.CreditCard;
import com.example.tableperclasshierarchy.repos.PaymentRepository;
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
		check.setId(1);
		check.setAmount(111.1);
		check.setChecknumber("11wwwe");
		repository.save(check);


	}


}
