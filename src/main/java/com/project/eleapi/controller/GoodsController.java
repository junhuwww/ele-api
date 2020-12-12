package com.project.eleapi.controller;


import com.project.eleapi.common.ResponseBase;
import com.project.eleapi.dto.ListsDTO;
import com.project.eleapi.service.IGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private IGoodsService iGoodsService;

    @GetMapping("/queryAllList")
    public ResponseBase<List<ListsDTO>> queryAllList() {
        return ResponseBase.createBySuccess(iGoodsService.queryAllList());
    }

}
