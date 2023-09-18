package com.cafe.model

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer
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
@Document(value = "plan")
data class Plan(

    /**
     * ID
     */
    @Id
    @JsonSerialize(using = ToStringSerializer::class)
    val id: ObjectId,

    /**
     * 标题
     */
    val title: String,

    /**
     * 内容
     */
    val content: List<String>,

    /**
     * 图标
     */
    val icon: String,

    /**
     * 颜色
     */
    val color: String,

    /**
     * 计划时间
     */
    val time: String
)
