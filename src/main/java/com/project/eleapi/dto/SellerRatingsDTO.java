package com.project.eleapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: hujun
 * @create: 2020-12-13 00:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellerRatingsDTO {

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "配送时间")
    private Integer deliveryTime;

    @ApiModelProperty(value = "评价类型，0：好评 1：差评")
    private Integer rateType;

    @ApiModelProperty(value = "评分")
    private Integer score;

    @ApiModelProperty(value = "描述")
    private String text;

    @ApiModelProperty(value = "评价时间戳")
    private Long rateTime;

    @ApiModelProperty(value = "食品集合")
    private List<String> recommend;

}
