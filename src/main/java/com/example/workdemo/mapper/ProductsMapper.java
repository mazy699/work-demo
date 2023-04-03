package com.example.workdemo.mapper;

import com.example.workdemo.entity.Products;
import com.example.workdemo.entity.ProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    long countByExample(ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int deleteByExample(ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int deleteByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int insert(Products record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int insertSelective(Products record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    List<Products> selectByExampleWithBLOBs(ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    List<Products> selectByExample(ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    Products selectByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByExampleWithBLOBs(@Param("record") Products record, @Param("example") ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByPrimaryKeySelective(Products record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByPrimaryKeyWithBLOBs(Products record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 21:24:45 HKT 2023
     */
    int updateByPrimaryKey(Products record);
}