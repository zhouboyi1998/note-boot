package com.cafe.model.entity

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @Project: note-boot
 * @Package: com.cafe.model
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:14
 * @Description:
 */
@ApiModel(value = "计划")
@Document(value = "note_plan")
data class Plan(

    @ApiModelProperty(value = "主键")
    @Id
    @JsonSerialize(using = ToStringSerializer::class)
    val id: ObjectId,

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
