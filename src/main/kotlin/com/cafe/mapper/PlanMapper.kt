package com.cafe.mapper

import com.cafe.model.entity.Plan
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @Project: note-boot
 * @Package: com.cafe.mapper
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:16
 * @Description:
 */
interface PlanMapper: MongoRepository<Plan, ObjectId>
