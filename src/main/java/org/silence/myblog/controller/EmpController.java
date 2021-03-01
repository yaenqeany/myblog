package org.silence.myblog.controller;


import org.silence.myblog.entity.Emp;
import org.silence.myblog.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Silence.Liu
 * @since 2021-03-01
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private IEmpService empService;

    @GetMapping("/test")
    public Emp test() {
        return empService.getById("7900");
    }

}
