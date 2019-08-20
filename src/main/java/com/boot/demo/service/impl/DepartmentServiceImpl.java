package com.boot.demo.service.impl;

import com.boot.demo.entity.Department;
import com.boot.demo.mapper.DepartmentMapper;
import com.boot.demo.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    /**
     * 把方法的结果进行缓存，下次再查找相同的结果，不用查库了
     * @param id
     * @return
     */
    @Override
    @Cacheable(cacheNames = {"depart"},key = "#id")
    public Department getInfoById(Integer id) {
        return super.getById(id);
    }
}
