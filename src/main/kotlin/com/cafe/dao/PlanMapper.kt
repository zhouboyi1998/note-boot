package com.cafe.dao

import com.cafe.model.Plan
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @Project: note-boot
 * @Package: com.cafe.reminder.dao
 */
interface PlanMapper : MongoRepository<Plan, ObjectId> {

}
