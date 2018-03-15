package com.zyc.factorydesignpattern;

import com.zyc.factorydesignpattern.controller.BorrowerController;
import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.entity.BorrowerA;
import com.zyc.factorydesignpattern.entity.BorrowerB;
import com.zyc.factorydesignpattern.entity.BorrowerC;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryDesignPatternApplicationTests {

	@Autowired
	private BorrowerController borrowerController;

	@Test
	public void contextLoads() {
		Borrower borrowerById = borrowerController.getBorrowerById("1", BorrowerTypeEnum.BORROWER_B);
		System.out.println(borrowerById);

	}

}
