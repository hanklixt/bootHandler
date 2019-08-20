package com.boot.demo.service;

import com.boot.demo.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
public interface IDepartmentService extends IService<Department> {

   //这里是为了使用spring缓存
  Department getInfoById(Integer id);

  boolean update(Department department);
}
