package com.github.pig.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.service.SysCrudService;
import com.github.pig.common.util.Query;
import com.github.pig.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @auth luomu
 * @date 2019/2/12 15:47
 */
@RestController
@RequestMapping("/crud")
public class CrudController extends BaseController{

    @Autowired
    private SysCrudService crudService;

    @RequestMapping("/crudPage")
    public Page crudPage(@RequestParam Map<String, Object> params){
        return crudService.selectCrudVoPage(new Query(params));
    }
}
