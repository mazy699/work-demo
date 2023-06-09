package com.example.workdemo.mapper;

import com.example.workdemo.entity.Offices;
import com.example.workdemo.entity.OfficesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OfficesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    long countByExample(OfficesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int deleteByExample(OfficesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int deleteByPrimaryKey(String officecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int insert(Offices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int insertSelective(Offices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    List<Offices> selectByExample(OfficesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    Offices selectByPrimaryKey(String officecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByExampleSelective(@Param("record") Offices record, @Param("example") OfficesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByExample(@Param("record") Offices record, @Param("example") OfficesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByPrimaryKeySelective(Offices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated Sun Jul 02 11:44:03 HKT 2023
     */
    int updateByPrimaryKey(Offices record);
}