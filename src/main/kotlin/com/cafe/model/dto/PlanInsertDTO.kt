package com.cafe.model.dto

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

/**
 * @Project: note-boot
 * @Package: com.cafe.dto
 * @Author: zhouboyi
 * @Date: 2023/9/18 16:46
 * @Description:
 */
@ApiModel(value = "计划插入数据传输对象")
data class PlanInsertDTO(

    @ApiModelProperty(value = "标题")
    val title: String,

    @ApiModelProperty(value = "内容")
    val content: List<String>,

    @ApiModelProperty(value = "图标")
    val icon: String,

    @ApiModelProperty(value = "颜色")
    val color: String,

    @ApiModelProperty(value = "时间")
    val time: String
)
