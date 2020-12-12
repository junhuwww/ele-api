package com.project.eleapi.service;

import com.project.eleapi.dto.SellerRatingsDTO;
import com.project.eleapi.entity.SellerRatings;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
public interface ISellerRatingsService extends IService<SellerRatings> {

    /**
     * 查询所有店铺评价
     * @return
     */
    List<SellerRatingsDTO> querySellerRatings();

}
