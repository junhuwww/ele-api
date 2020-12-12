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
@ApiModel(value="Seller对象", description="")
public class Seller extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
    @TableField("minPrice")
    private Integer minPrice;

    @ApiModelProperty(value = "配送费")
    private Integer deliveryPrice;

    @ApiModelProperty(value = "评价数量")
    private Integer ratingCount;

    @ApiModelProperty(value = "卖出数量")
    private Integer sellCount;

    @ApiModelProperty(value = "支持优惠")
    private String supports;

    @ApiModelProperty(value = "商品图片")
    private String pics;

    @ApiModelProperty(value = "商家信息")
    private String infos;


}
