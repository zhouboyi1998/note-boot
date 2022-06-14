package com.cafe.service

import com.cafe.model.Plan

/**
 * @Project: note-boot
 * @Package: com.cafe.reminder.service
 */
interface PlanService {

    fun list() : List<Plan>
}
