package com.boot.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("id")
    private Integer id;
    /**
     * 酒店名称
     */
    @TableField("departmentName")
    private String departmentName;


}
