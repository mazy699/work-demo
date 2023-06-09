package com.example.workdemo.mapper;

import com.example.workdemo.entity.Orders;
import com.example.workdemo.entity.OrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    long countByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int deleteByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int deleteByPrimaryKey(Integer ordernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    List<Orders> selectByExampleWithBLOBs(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    Orders selectByPrimaryKey(Integer ordernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByExampleWithBLOBs(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByPrimaryKeyWithBLOBs(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByPrimaryKey(Orders record);
}