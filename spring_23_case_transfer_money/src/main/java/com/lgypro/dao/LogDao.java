package com.lgypro.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into log (info, createDate) values (#{info}, now())")
    void log(String info);
}
