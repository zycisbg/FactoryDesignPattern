package com.zyc.factorydesignpattern.service.factory;

import com.zyc.factorydesignpattern.service.BorrowerService;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BorrowerFactory {
    @Autowired
    private BorrowerService borrowerAService;

    @Autowired
    private BorrowerService borrowerBService;

    @Autowired
    private BorrowerService borrowerCService;

    public BorrowerService init(BorrowerTypeEnum borrowerTypeEnum){
        if(borrowerTypeEnum.getCode()==1){
            return borrowerAService;
        }else if(borrowerTypeEnum.getCode()==2){
            return borrowerBService;
        }else{
            return borrowerCService;
        }

    }
}
