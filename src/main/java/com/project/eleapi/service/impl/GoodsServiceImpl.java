package com.project.eleapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.project.eleapi.dto.GoodsDTO;
import com.project.eleapi.dto.ListsDTO;
import com.project.eleapi.dto.RatingsDTO;
import com.project.eleapi.entity.Goods;
import com.project.eleapi.entity.Lists;
import com.project.eleapi.entity.Ratings;
import com.project.eleapi.entity.User;
import com.project.eleapi.mapper.GoodsMapper;
import com.project.eleapi.mapper.ListsMapper;
import com.project.eleapi.mapper.RatingsMapper;
import com.project.eleapi.mapper.UserMapper;
import com.project.eleapi.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Resource
    private ListsMapper listsMapper;

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private RatingsMapper ratingsMapper;

    /**
     * 查询所有榜单及商品信息
     *
     * @return
     */
    @Override
    public List<ListsDTO> queryAllList() {
        List<ListsDTO> listsDTOS = new ArrayList<>();
        List<Lists> list = listsMapper.selectList(new LambdaQueryWrapper());
        list.forEach(item -> {
            ListsDTO listsDTO = new ListsDTO();
            BeanUtils.copyProperties(item, listsDTO);
            List<GoodsDTO> goodsDTOS = new ArrayList<>();
            Arrays.asList(item.getFoods().split(",")).forEach(e -> {
                Goods goods = goodsMapper.selectById(e);
                GoodsDTO goodsDTO = new GoodsDTO();
                BeanUtils.copyProperties(goods, goodsDTO);
                LambdaQueryWrapper<Ratings> lambdaQueryWrapper = new LambdaQueryWrapper<>();
                lambdaQueryWrapper.eq(Ratings::getGoodId, e);
                List<Ratings> ratings = ratingsMapper.selectList(lambdaQueryWrapper);
                List<RatingsDTO> ratingsDTOS = new ArrayList<>();
                ratings.forEach(v -> {
                    RatingsDTO ratingsDTO = new RatingsDTO();
                    BeanUtils.copyProperties(v, ratingsDTO);
                    User user = userMapper.selectById(v.getUserId());
                    ratingsDTO.setAvatar(user.getAvatar());
                    ratingsDTO.setUsername(user.getName());
                    ratingsDTOS.add(ratingsDTO);
                });
                goodsDTO.setRatings(ratingsDTOS);
                goodsDTOS.add(goodsDTO);
            });
            listsDTO.setFoods(goodsDTOS);
            listsDTOS.add(listsDTO);
        });
        return listsDTOS;
    }
}
