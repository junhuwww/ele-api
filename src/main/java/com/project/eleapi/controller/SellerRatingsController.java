package com.project.eleapi.controller;


import com.project.eleapi.common.ResponseBase;
import com.project.eleapi.dto.SellerRatingsDTO;
import com.project.eleapi.service.ISellerRatingsService;
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
@RequestMapping("/seller_ratings")
public class SellerRatingsController {

    @Resource
    private ISellerRatingsService iSellerRatingsService;

    @GetMapping("/querySellerRatings")
    public ResponseBase<List<SellerRatingsDTO>> querySellerRatings() {
        return ResponseBase.createBySuccess(iSellerRatingsService.querySellerRatings());
    }

}
