package com.example.workdemo.entity;

public class PaymentsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.customerNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    private Integer customernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.checkNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    private String checknumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.customerNumber
     *
     * @return the value of payments.customerNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public Integer getCustomernumber() {
        return customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.customerNumber
     *
     * @param customernumber the value for payments.customerNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public void setCustomernumber(Integer customernumber) {
        this.customernumber = customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.checkNumber
     *
     * @return the value of payments.checkNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public String getChecknumber() {
        return checknumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.checkNumber
     *
     * @param checknumber the value for payments.checkNumber
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber == null ? null : checknumber.trim();
    }
}