package com.example.workdemo.mapper;

import com.example.workdemo.entity.Payments;
import com.example.workdemo.entity.PaymentsExample;
import com.example.workdemo.entity.PaymentsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    long countByExample(PaymentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int deleteByExample(PaymentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int deleteByPrimaryKey(PaymentsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int insert(Payments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int insertSelective(Payments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    List<Payments> selectByExample(PaymentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    Payments selectByPrimaryKey(PaymentsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByExampleSelective(@Param("record") Payments record, @Param("example") PaymentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByExample(@Param("record") Payments record, @Param("example") PaymentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByPrimaryKeySelective(Payments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payments
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByPrimaryKey(Payments record);
}