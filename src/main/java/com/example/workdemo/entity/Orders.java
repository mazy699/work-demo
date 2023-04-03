package com.example.workdemo.entity;

import java.util.Date;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orderNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Integer ordernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orderDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Date orderdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.requiredDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Date requireddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.shippedDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Date shippeddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.customerNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Integer customernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.comments
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private String comments;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orderNumber
     *
     * @return the value of orders.orderNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Integer getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orderNumber
     *
     * @param ordernumber the value for orders.orderNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orderDate
     *
     * @return the value of orders.orderDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orderDate
     *
     * @param orderdate the value for orders.orderDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.requiredDate
     *
     * @return the value of orders.requiredDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Date getRequireddate() {
        return requireddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.requiredDate
     *
     * @param requireddate the value for orders.requiredDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setRequireddate(Date requireddate) {
        this.requireddate = requireddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.shippedDate
     *
     * @return the value of orders.shippedDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Date getShippeddate() {
        return shippeddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.shippedDate
     *
     * @param shippeddate the value for orders.shippedDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setShippeddate(Date shippeddate) {
        this.shippeddate = shippeddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.customerNumber
     *
     * @return the value of orders.customerNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Integer getCustomernumber() {
        return customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.customerNumber
     *
     * @param customernumber the value for orders.customerNumber
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setCustomernumber(Integer customernumber) {
        this.customernumber = customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.comments
     *
     * @return the value of orders.comments
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.comments
     *
     * @param comments the value for orders.comments
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}