package com.example.workdemo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Payments extends PaymentsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.paymentDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private Date paymentdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.amount
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    private BigDecimal amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.paymentDate
     *
     * @return the value of payments.paymentDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Date getPaymentdate() {
        return paymentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.paymentDate
     *
     * @param paymentdate the value for payments.paymentDate
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.amount
     *
     * @return the value of payments.amount
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.amount
     *
     * @param amount the value for payments.amount
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}