package com.cafe.service.impl

import com.cafe.dao.PlanMapper
import com.cafe.model.Plan
import com.cafe.service.PlanService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

/**
 * @Project: note-boot
 * @Package: com.cafe.reminder.service.impl
 */
@Service
class PlanServiceImpl
@Autowired
constructor(
    private val planMapper : PlanMapper
) : PlanService {

    override fun list() : List<Plan> = planMapper.findAll(Sort.by(Sort.Order.asc("time")))
}
