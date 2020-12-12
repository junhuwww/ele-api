package com.project.eleapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: hujun
 * @create: 2020-12-12 22:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListsDTO {

    @ApiModelProperty(value = "榜单id")
    private Integer id;

    @ApiModelProperty(value = "榜单名")
    private String name;

    @ApiModelProperty(value = "榜单类型")
    private Integer type;

    @ApiModelProperty(value = "食物集合")
    private List<GoodsDTO> foods;



}
