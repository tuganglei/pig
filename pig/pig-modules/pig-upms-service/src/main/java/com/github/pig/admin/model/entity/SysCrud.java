package com.github.pig.admin.model.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @auth luomu
 * @date 2019/2/12 15:55
 */

@Data
@TableName("sys_crud")
public class SysCrud extends Model<SysCrud> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "crud_id", type = IdType.AUTO)
    private Integer crudId;

    private String username;

    private int type;

    private String stars;

    private String address;

    private String info;

    @Override
    protected Serializable pkVal() {
        return this.crudId;
    }
}
