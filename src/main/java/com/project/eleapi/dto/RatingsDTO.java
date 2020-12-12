package com.project.eleapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hujun
 * @create: 2020-12-12 23:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RatingsDTO {

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "评价类型，0：好评 1：差评")
    private Integer type;

    @ApiModelProperty(value = "描述")
    private String text;

    @ApiModelProperty(value = "评价时间戳")
    private Long rateTime;
}
