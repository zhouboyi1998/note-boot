package com.cafe.service

import com.cafe.dto.PlanInsertDTO
import com.cafe.model.Plan

/**
 * @Project: note-boot
 * @Package: com.cafe.service
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:15
 * @Description:
 */
interface PlanService {

    /**
     * 查询计划列表
     */
    fun list(): List<Plan>

    /**
     * 根据id查询单个计划
     */
    fun one(id: String): Plan

    /**
     * 新增计划
     */
    fun insert(dto: PlanInsertDTO): Plan

    /**
     * 根据id修改计划
     */
    fun update(plan: Plan): Plan

    /**
     * 根据id删除计划
     */
    fun delete(id: String)
}
