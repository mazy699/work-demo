package com.example.workdemo.mapper;

import com.example.workdemo.entity.Tokens;
import com.example.workdemo.entity.TokensExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokensMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    long countByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    int deleteByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    int insert(Tokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    int insertSelective(Tokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    List<Tokens> selectByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    int updateByExampleSelective(@Param("record") Tokens record, @Param("example") TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Mon Apr 03 21:24:46 HKT 2023
     */
    int updateByExample(@Param("record") Tokens record, @Param("example") TokensExample example);
}