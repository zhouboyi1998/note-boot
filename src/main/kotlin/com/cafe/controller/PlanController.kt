package com.cafe.controller

import com.cafe.model.Plan
import com.cafe.service.PlanService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Project: note-boot
 * @Package: com.cafe.controller
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:14
 * @Description:
 */
@RestController
@RequestMapping(value = ["/note/plan"])
class PlanController
@Autowired
constructor(
    private val planService : PlanService
) {

    @GetMapping(value = ["/list"])
    fun list() : List<Plan> = planService.list()
}
