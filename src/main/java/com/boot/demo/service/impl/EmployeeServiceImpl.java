package com.boot.demo.service.impl;

import com.boot.demo.entity.Employee;
import com.boot.demo.mapper.EmployeeMapper;
import com.boot.demo.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
