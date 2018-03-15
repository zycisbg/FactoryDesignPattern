package com.zyc.factorydesignpattern.service.impl;

import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.entity.BorrowerC;
import com.zyc.factorydesignpattern.service.BorrowerService;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class BorrowerCService implements BorrowerService{
    @Override
    public Borrower getBorrowerById(String id,BorrowerTypeEnum borrowerTypeEnum) {
        //这个C类型的借款人假装从数据库中查询出来的
        BorrowerC borrowerC = new BorrowerC();
        borrowerC.setCompanyName("c公司名");
        borrowerC.setCompanyPhone("c公司电话");
        borrowerC.setId("cid");

        return borrowerC;
    }
}
