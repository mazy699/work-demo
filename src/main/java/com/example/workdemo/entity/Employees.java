package com.example.workdemo.entity;

public class Employees {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.employeeNumber
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private Integer employeenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.lastName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.firstName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.extension
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.email
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.officeCode
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String officecode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.reportsTo
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private Integer reportsto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.jobTitle
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    private String jobtitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.employeeNumber
     *
     * @return the value of employees.employeeNumber
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public Integer getEmployeenumber() {
        return employeenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.employeeNumber
     *
     * @param employeenumber the value for employees.employeeNumber
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setEmployeenumber(Integer employeenumber) {
        this.employeenumber = employeenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.lastName
     *
     * @return the value of employees.lastName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.lastName
     *
     * @param lastname the value for employees.lastName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.firstName
     *
     * @return the value of employees.firstName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.firstName
     *
     * @param firstname the value for employees.firstName
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.extension
     *
     * @return the value of employees.extension
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.extension
     *
     * @param extension the value for employees.extension
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.email
     *
     * @return the value of employees.email
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.email
     *
     * @param email the value for employees.email
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.officeCode
     *
     * @return the value of employees.officeCode
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getOfficecode() {
        return officecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.officeCode
     *
     * @param officecode the value for employees.officeCode
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setOfficecode(String officecode) {
        this.officecode = officecode == null ? null : officecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.reportsTo
     *
     * @return the value of employees.reportsTo
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public Integer getReportsto() {
        return reportsto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.reportsTo
     *
     * @param reportsto the value for employees.reportsTo
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setReportsto(Integer reportsto) {
        this.reportsto = reportsto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.jobTitle
     *
     * @return the value of employees.jobTitle
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public String getJobtitle() {
        return jobtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.jobTitle
     *
     * @param jobtitle the value for employees.jobTitle
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }
}