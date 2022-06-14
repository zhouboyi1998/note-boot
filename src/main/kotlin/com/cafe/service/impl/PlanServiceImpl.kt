package com.cafe.service.impl

import com.cafe.mapper.PlanMapper
import com.cafe.model.dto.PlanInsertDTO
import com.cafe.model.entity.Plan
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

    override fun insertBatch(dtoList: List<PlanInsertDTO>): List<Plan> {
        val planList = dtoList.map { dto ->
            Plan(ObjectId(), dto.title, dto.content, dto.icon, dto.color, dto.time)
        }
        return planMapper.insert(planList)
    }

    override fun update(plan: Plan): Plan = planMapper.save(plan)

    override fun updateBatch(planList: List<Plan>): List<Plan> = planMapper.saveAll(planList)

    override fun delete(id: String) = planMapper.deleteById(ObjectId(id))

    override fun deleteBatch(idList: List<String>) {
        val objectIdList = idList.map { ObjectId(it) }
        planMapper.deleteAllById(objectIdList)
    }
}
