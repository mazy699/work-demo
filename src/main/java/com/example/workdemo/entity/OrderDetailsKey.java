package com.example.workdemo.entity;

public class OrderDetailsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.orderNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    private Integer ordernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.productCode
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    private String productcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.orderNumber
     *
     * @return the value of orderdetails.orderNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public Integer getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.orderNumber
     *
     * @param ordernumber the value for orderdetails.orderNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.productCode
     *
     * @return the value of orderdetails.productCode
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.productCode
     *
     * @param productcode the value for orderdetails.productCode
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }
}