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
@ApiModel(value="Ratings对象", description="")
public class Ratings extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "食物ID")
    private String goodId;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "评价类型，0：好评 1：差评")
    private Integer type;

    @ApiModelProperty(value = "描述")
    private String text;

    @ApiModelProperty(value = "评价时间戳")
    private Long rateTime;


}
