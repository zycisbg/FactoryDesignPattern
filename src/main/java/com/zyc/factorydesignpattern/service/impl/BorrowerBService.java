package com.zyc.factorydesignpattern.service.impl;

import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.entity.BorrowerB;
import com.zyc.factorydesignpattern.service.BorrowerService;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class BorrowerBService implements BorrowerService{
    @Override
    public Borrower getBorrowerById(String id,BorrowerTypeEnum borrowerTypeEnum) {
        //这个C类型的借款人假装从数据库中查询出来的
        BorrowerB borrowerB = new BorrowerB();
        borrowerB.setAddress("b地址");
        borrowerB.setPhone("b电话");
        borrowerB.setId("bid");

        return borrowerB;
    }
}
