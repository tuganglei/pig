package com.github.pig.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.admin.model.entity.SysCrud;
import com.github.pig.admin.model.entity.SysUser;

import java.util.List;

/**
 * @auth luomu
 * @date 2019/2/12 15:54
 */
public interface SysCrudMapper extends BaseMapper<SysCrud> {

    List selectCrudVoPage();
}
