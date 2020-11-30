package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * description payment dao
 *
 * @author Leet
 * @date 2020-11-27 20:08
 **/
@Mapper
public interface PaymentDao {
    @Insert("INSERT _payment (_serial) VALUES (#{payment.serial})")
    int create(@Param("payment") Payment payment);

    @Select("SELECT _id AS id, _serial AS serial FROM _payment WHERE _id = #{id}")
    Payment getPaymentById(@Param("id") long id);
}
