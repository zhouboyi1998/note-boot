package com.cafe.controller

import com.cafe.dto.PlanInsertDTO
import com.cafe.model.Plan
import com.cafe.service.PlanService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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
    private val planService: PlanService
) {

    @GetMapping(value = ["/list"])
    fun list(): List<Plan> = planService.list()

    @GetMapping(value = ["/one/{id}"])
    fun one(@PathVariable(value = "id") id: String): Plan = planService.one(id)

    @PostMapping(value = ["/insert"])
    fun insert(@RequestBody dto: PlanInsertDTO): Plan = planService.insert(dto)

    @PutMapping(value = ["/update"])
    fun update(@RequestBody plan: Plan): Plan = planService.update(plan)

    @DeleteMapping(value = ["/delete/{id}"])
    fun update(@PathVariable(value = "id") id: String) = planService.delete(id)
}
