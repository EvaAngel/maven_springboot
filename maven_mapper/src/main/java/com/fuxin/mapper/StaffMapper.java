package com.fuxin.mapper;


import com.fuxin.po.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {
    public List<Staff> queryStaff();
}
