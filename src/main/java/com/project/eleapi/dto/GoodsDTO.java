package com.project.eleapi.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: hujun
 * @create: 2020-12-12 22:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsDTO {

    @ApiModelProperty(value = "商品名")
    private String name;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "旧价格")
    private Integer oldPrice;

    @ApiModelProperty(value = "评分")
    private Integer rating;

    @ApiModelProperty(value = "卖出数量")
    private Integer sellCount;

    @ApiModelProperty(value = "商品图片")
    private String image;

    @ApiModelProperty(value = "商品信息")
    private String info;

    @ApiModelProperty(value = "评价集合")
    private List<RatingsDTO> ratings;
}
