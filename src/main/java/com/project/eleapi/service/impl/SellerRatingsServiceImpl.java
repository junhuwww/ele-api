package com.project.eleapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.project.eleapi.dto.SellerRatingsDTO;
import com.project.eleapi.entity.Goods;
import com.project.eleapi.entity.SellerRatings;
import com.project.eleapi.entity.User;
import com.project.eleapi.mapper.GoodsMapper;
import com.project.eleapi.mapper.SellerRatingsMapper;
import com.project.eleapi.mapper.UserMapper;
import com.project.eleapi.service.ISellerRatingsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@Service
public class SellerRatingsServiceImpl extends ServiceImpl<SellerRatingsMapper, SellerRatings> implements ISellerRatingsService {

    @Resource
    private SellerRatingsMapper sellerRatingsMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private GoodsMapper goodsMapper;

    /**
     * 查询所有店铺评价
     *
     * @return
     */
    @Override
    public List<SellerRatingsDTO> querySellerRatings() {
        LambdaQueryWrapper<SellerRatings> lambdaQueryWrapper = new LambdaQueryWrapper();
        List<SellerRatings> sellerRatings = sellerRatingsMapper.selectList(lambdaQueryWrapper);
        List<SellerRatingsDTO> sellerRatingsDTOS = new ArrayList<>();
        sellerRatings.forEach(item -> {
            SellerRatingsDTO sellerRatingsDTO = new SellerRatingsDTO();
            BeanUtils.copyProperties(item, sellerRatingsDTO);
            User user = userMapper.selectById(item.getUserId());
            sellerRatingsDTO.setAvatar(user.getAvatar());
            sellerRatingsDTO.setUsername(user.getName());
            List<Goods> goods = goodsMapper.selectBatchIds(Arrays.asList(item.getRecommend().split(",")));
            List<String> stringList = goods.stream().map(Goods::getName).collect(Collectors.toList());
            sellerRatingsDTO.setRecommend(stringList);
            sellerRatingsDTOS.add(sellerRatingsDTO);
        });
        return sellerRatingsDTOS;
    }
}
