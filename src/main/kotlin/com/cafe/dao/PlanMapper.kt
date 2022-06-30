package com.cafe.dao

import com.cafe.model.Plan
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @Project: note-boot
 * @Package: com.cafe.dao
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:16
 * @Description:
 */
interface PlanMapper : MongoRepository<Plan, ObjectId>
