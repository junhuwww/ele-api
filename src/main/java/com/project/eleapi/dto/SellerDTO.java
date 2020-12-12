package com.project.eleapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: hujun
 * @create: 2020-12-12 22:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerDTO {

    @ApiModelProperty(value = "商家名")
    private String name;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "公告")
    private String bulletin;

    @ApiModelProperty(value = "配送时间")
    private Integer deliveryTime;

    @ApiModelProperty(value = "评分")
    private Double score;

    @ApiModelProperty(value = "服务态度")
    private Double serviceScore;

    @ApiModelProperty(value = "食品评分")
    private Double foodScore;

    @ApiModelProperty(value = "对比水平")
    private Double rankRate;

    @ApiModelProperty(value = "多少元起送")
    private Integer minPrice;

    @ApiModelProperty(value = "配送费")
    private Integer deliveryPrice;

    @ApiModelProperty(value = "评价数量")
    private Integer ratingCount;

    @ApiModelProperty(value = "卖出数量")
    private Integer sellCount;

    @ApiModelProperty(value = "支持优惠")
    private List<DiscountDTO> supports;

    @ApiModelProperty(value = "商品图片")
    private List<String> pics;

    @ApiModelProperty(value = "商家信息")
    private List<String> infos;
}
