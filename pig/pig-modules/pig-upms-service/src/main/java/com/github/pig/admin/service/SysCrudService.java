package com.github.pig.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.github.pig.admin.model.entity.SysCrud;
import com.github.pig.admin.model.entity.SysUser;
import com.github.pig.common.util.Query;

import java.util.List;

/**
 * @auth luomu
 * @date 2019/2/12 16:12
 */

public interface SysCrudService extends IService<SysCrud> {

    Page selectCrudVoPage(Query query);
}
