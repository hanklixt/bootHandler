package com.boot.demo.controller;


import com.boot.demo.common.HttpResult;
import com.boot.demo.entity.Department;
import com.boot.demo.service.IDepartmentService;
import com.boot.demo.util.HttpResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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

    /**
     * 把方法的结果进行缓存，下次再查找相同的结果，不用查库了
     * @param id
     * @return
     */
    @GetMapping("/getInfo/{id}")
    public Mono<HttpResult> getInfo(@PathVariable Integer id) {
        Department result = departmentService.getInfoById(id);
        return Mono.create(x->x.success(HttpResultUtils.success(result)));
    }
//错误示范，同一个类，A方法调用B方法，就算B方法使用了缓存，此情景也无法缓存
//    /**
//     * 把方法的结果进行缓存，下次再查找相同的结果，不用查库了
//     * @param id
//     * @return
//     */
//    @Cacheable(cacheNames = {"depart"},key = "#id")
//    public Department getDepartment( Integer id) {
//        return departmentService.getById(id);
//    }

}
