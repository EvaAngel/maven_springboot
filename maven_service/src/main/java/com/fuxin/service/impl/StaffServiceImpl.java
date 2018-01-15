package com.fuxin.service.impl;

import com.fuxin.mapper.StaffMapper;
import com.fuxin.po.Staff;
import com.fuxin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffMapper staffMapper;
    public List<Staff> queryStaff()
    {
        return staffMapper.queryStaff();
    }
}
