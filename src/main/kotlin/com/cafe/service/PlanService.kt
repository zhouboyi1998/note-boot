package com.cafe.service

import com.cafe.model.Plan

/**
 * @Project: note-boot
 * @Package: com.cafe.service
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:15
 * @Description:
 */
interface PlanService {

    fun list(): List<Plan>

    fun one(id: String): Plan
}
