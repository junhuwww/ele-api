package com.project.eleapi.service;

import com.project.eleapi.dto.ListsDTO;
import com.project.eleapi.entity.Goods;
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
public interface IGoodsService extends IService<Goods> {

    /**
     * 查询所有榜单及商品信息
     * @return
     */
    List<ListsDTO> queryAllList();

}
