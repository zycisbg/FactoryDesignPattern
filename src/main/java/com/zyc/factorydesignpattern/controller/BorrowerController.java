package com.zyc.factorydesignpattern.controller;

import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.service.BorrowerService;
import com.zyc.factorydesignpattern.service.factory.BorrowerFactory;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BorrowerController {

    @Autowired
    private BorrowerFactory borrowerFactory;

    public Borrower getBorrowerById(String id, BorrowerTypeEnum borrowerTypeEnum){
        //工厂进行初始化，返回该类型的borrowerService
        BorrowerService init = borrowerFactory.init(borrowerTypeEnum);
        //该service直接调用返回父类对象
        Borrower borrower = init.getBorrowerById(id, borrowerTypeEnum);
        return borrower;
    }
}
