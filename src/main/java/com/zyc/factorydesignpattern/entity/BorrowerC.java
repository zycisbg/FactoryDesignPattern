package com.zyc.factorydesignpattern.entity;

/**
 * 子类C
 */
public class BorrowerC extends Borrower{
    private String id;

    private String CompanyName;

    private String CompanyPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyPhone() {
        return CompanyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        CompanyPhone = companyPhone;
    }

    @Override
    public String toString() {
        return "BorrowerC{" +
                "id='" + id + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", CompanyPhone='" + CompanyPhone + '\'' +
                '}';
    }
}
