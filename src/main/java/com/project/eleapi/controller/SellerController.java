package com.project.eleapi.controller;


import com.project.eleapi.common.ResponseBase;
import com.project.eleapi.dto.SellerDTO;
import com.project.eleapi.service.ISellerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@RestController
@RequestMapping("/seller")
public class SellerController {

    @Resource
    private ISellerService iSellerService;

    @GetMapping("/querySeller")
    public ResponseBase<SellerDTO> querySeller() {
        return ResponseBase.createBySuccess(iSellerService.querySeller());
    }
}
