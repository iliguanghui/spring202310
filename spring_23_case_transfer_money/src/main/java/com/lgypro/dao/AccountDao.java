package com.lgypro.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    @Update("update account set money = money + #{amount} where name = #{name}")
    void changeBalance(@Param("name") String name, @Param("amount") double amount);
}
