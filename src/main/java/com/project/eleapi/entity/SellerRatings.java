package com.project.eleapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="SellerRatings对象", description="")
public class SellerRatings extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "店铺ID")
    private String sellerId;

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
    private String recommend;


}
