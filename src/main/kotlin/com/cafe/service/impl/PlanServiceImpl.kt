package com.cafe.service.impl

import com.cafe.dto.PlanInsertDTO
import com.cafe.mapper.PlanMapper
import com.cafe.model.Plan
import com.cafe.service.PlanService
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

/**
 * @Project: note-boot
 * @Package: com.cafe.service.impl
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:15
 * @Description:
 */
@Service
class PlanServiceImpl
@Autowired
constructor(
    private val planMapper: PlanMapper
): PlanService {

    override fun list(): List<Plan> = planMapper.findAll(Sort.by(Sort.Order.asc("time")))

    override fun one(id: String): Plan = planMapper.findById(ObjectId(id)).get()

    override fun insert(dto: PlanInsertDTO): Plan = planMapper.insert(Plan(ObjectId(), dto.title, dto.content, dto.icon, dto.color, dto.time))

    override fun update(plan: Plan): Plan = planMapper.save(plan)

    override fun delete(id: String) = planMapper.deleteById(ObjectId(id))
}
