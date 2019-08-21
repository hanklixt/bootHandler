package com.boot.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.boot.demo.entity.Department;
import com.boot.demo.mapper.DepartmentMapper;
import com.boot.demo.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
@Service
@CacheConfig(cacheNames = "depart")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {


    /**
     * 把方法的结果进行缓存，下次再查找相同的结果，不用查库了
     * condition 指定符合条件的情况下才进行缓存
     * unless  否定缓存，当unless指定的条件为true,就不缓存结果
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(key = "#id")  //使用普通key来作缓存的key
    // @Cacheable(cacheNames = {"depart"},key = "keyGenerator",unless = "#id>5",condition = "#id>0")  //使用key生成器
    public Department getInfoById(Integer id) {
        return super.getById(id);
    }

    /**
     * 更新数据，并且把更新后的数据放入缓存
     *
     * @param department
     * @return
     */
    @CachePut(key = "#department.id")
    public boolean update(Department department) {
        return super.updateById(department);
    }

    /**
     * 删除数据，并且清除缓存
     */
    @CacheEvict(key = "#id")
    public void deleteDepart(Integer id) {
        super.removeById(id);
    }

    /**
     * 使用caching进行缓存设置
     * @param name
     * @return
     */
    @Caching( cacheable ={
            @Cacheable(key = "#name")
    },put = {
            @CachePut(key = "#result.id")
//            ,
//            @CachePut(value = {"depart"},key = "#result.departmentName")
    }
    )
    @Override
    public Department getDepartmentByName(String name) {
        Department result = getOne(new LambdaQueryWrapper<Department>().eq(Department::getDepartmentName, name));
        return result;
    }

}
