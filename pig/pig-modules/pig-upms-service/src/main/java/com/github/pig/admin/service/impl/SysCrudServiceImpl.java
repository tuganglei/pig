package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.SysCrudMapper;
import com.github.pig.admin.model.entity.SysCrud;
import com.github.pig.admin.service.SysCrudService;
import com.github.pig.common.util.Query;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @auth luomu
 * @date 2019/2/12 16:14
 */

@Slf4j
@Service
@AllArgsConstructor
public class SysCrudServiceImpl extends ServiceImpl<SysCrudMapper, SysCrud> implements SysCrudService {

    private final SysCrudMapper sysCrudMapper;

    @Override
    public Page selectCrudVoPage(Query query) {
        query.setRecords(sysCrudMapper.selectCrudVoPage());
        return query;
    }
}
