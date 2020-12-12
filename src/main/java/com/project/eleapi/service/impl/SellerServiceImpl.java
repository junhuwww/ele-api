package com.project.eleapi.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.project.eleapi.dto.DiscountDTO;
import com.project.eleapi.dto.SellerDTO;
import com.project.eleapi.entity.Seller;
import com.project.eleapi.mapper.SellerMapper;
import com.project.eleapi.service.ISellerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@Service
public class SellerServiceImpl extends ServiceImpl<SellerMapper, Seller> implements ISellerService {

    @Resource
    private SellerMapper sellerMapper;

    /**
     * 查询店铺
     *
     * @return
     */
    @Override
    public SellerDTO querySeller() {
        List<Seller> list = sellerMapper.selectList(new LambdaQueryWrapper());
        SellerDTO sellerDTO = new SellerDTO();
        if (list.size() > 0) {
            Seller seller = list.get(0);
            BeanUtils.copyProperties(seller, sellerDTO);
            sellerDTO.setInfos(Arrays.asList(seller.getInfos().split("%")));
            sellerDTO.setPics(Arrays.asList(seller.getPics().split(",")));
            List<DiscountDTO> discountDTOS= JSON.parseArray(seller.getSupports(), DiscountDTO.class);
            sellerDTO.setSupports(discountDTOS);
        }
        return sellerDTO;
    }
}
