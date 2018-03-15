package com.zyc.factorydesignpattern.util;

public enum BorrowerTypeEnum {

    BORROWER_A(1, "A类借款人"), BORROWER_B(2, "B类借款人"),BORROWER_C(3, "C类借款人");

    private int code;
    private String info;

    BorrowerTypeEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
