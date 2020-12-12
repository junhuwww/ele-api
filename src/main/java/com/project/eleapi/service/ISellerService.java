package com.project.eleapi.service;

import com.project.eleapi.dto.SellerDTO;
import com.project.eleapi.entity.Seller;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
public interface ISellerService extends IService<Seller> {

    /**
     * 查询店铺
     * @return
     */
    SellerDTO querySeller();

}
