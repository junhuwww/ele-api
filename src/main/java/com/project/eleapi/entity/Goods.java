package com.project.eleapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="Goods对象", description="")
public class Goods extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品名")
    private String name;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "旧价格")
    @TableField("oldPrice")
    private Integer oldPrice;

    @ApiModelProperty(value = "评分")
    private Integer rating;

    @ApiModelProperty(value = "卖出数量")
    private Integer sellCount;

    @ApiModelProperty(value = "商品图片")
    private String image;

    @ApiModelProperty(value = "商品信息")
    private String info;


}
