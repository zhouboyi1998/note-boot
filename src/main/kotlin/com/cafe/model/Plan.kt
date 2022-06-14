package com.cafe.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @Project: note-boot
 * @Package: com.cafe.reminder.model
 */
@Document(value = "plan")
data class Plan(
    @Id
    val id : ObjectId,
    val title : String,
    val content : List<String>,
    val icon : String,
    val color : String,
    val time : String
)
