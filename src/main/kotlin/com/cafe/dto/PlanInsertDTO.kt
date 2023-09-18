package com.cafe.dto

/**
 * @Project: note-boot
 * @Package: com.cafe.dto
 * @Author: zhouboyi
 * @Date: 2023/9/18 16:46
 * @Description:
 */
data class PlanInsertDTO(

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
