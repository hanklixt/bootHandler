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
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("id")
    private Integer id;
    /**
     * 名称
     */
    private String lastName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 宾馆id
     */
    private Integer dId;


}
