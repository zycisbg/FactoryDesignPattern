package com.zyc.factorydesignpattern.service.impl;

import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.entity.BorrowerA;
import com.zyc.factorydesignpattern.service.BorrowerService;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class BorrowerAService implements BorrowerService {
    @Override
    public Borrower getBorrowerById(String id,BorrowerTypeEnum borrowerTypeEnum) {
        //这个C类型的借款人假装从数据库中查询出来的
        BorrowerA borrowerA = new BorrowerA();
        borrowerA.setAge(18);
        borrowerA.setName("a姓名");
        borrowerA.setId("id");

        return borrowerA;
    }
}
