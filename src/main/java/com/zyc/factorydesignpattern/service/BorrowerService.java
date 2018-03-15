package com.zyc.factorydesignpattern.service;

import com.zyc.factorydesignpattern.entity.Borrower;
import com.zyc.factorydesignpattern.util.BorrowerTypeEnum;

/**
 * 父类service
 */
public interface BorrowerService {

    Borrower getBorrowerById(String id,BorrowerTypeEnum borrowerTypeEnum);

}
