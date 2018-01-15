package com.fuxin.controller;

import com.fuxin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    @RequestMapping("/ssm")
    public String queryStaff()
    {
      return String.valueOf(staffService.queryStaff().size());
    }
}
