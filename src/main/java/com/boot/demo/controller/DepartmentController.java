package com.boot.demo.controller;


import com.boot.demo.common.HttpResult;
import com.boot.demo.entity.Department;
import com.boot.demo.service.IDepartmentService;
import com.boot.demo.util.HttpResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/getInfo/{id}")
    public Mono<HttpResult> getInfo(@PathVariable Integer id) {
        Department result = departmentService.getById(id);
        return Mono.create(x->x.success(HttpResultUtils.success(result)));
    }

}
