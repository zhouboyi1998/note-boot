package com.cafe.service

import com.cafe.model.dto.PlanInsertDTO
import com.cafe.model.entity.Plan

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
     * 根据id查询计划
     */
    fun one(id: String): Plan

    /**
     * 新增计划
     */
    fun insert(dto: PlanInsertDTO): Plan

    /**
     * 批量新增计划
     */
    fun insertBatch(dtoList: List<PlanInsertDTO>): List<Plan>

    /**
     * 修改计划
     */
    fun update(plan: Plan): Plan

    /**
     * 批量修改计划
     */
    fun updateBatch(planList: List<Plan>): List<Plan>

    /**
     * 删除计划
     */
    fun delete(id: String)

    /**
     * 批量删除计划
     */
    fun deleteBatch(idList: List<String>)
}
