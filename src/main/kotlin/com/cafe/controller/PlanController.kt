package com.cafe.controller

import com.cafe.dto.PlanInsertDTO
import com.cafe.model.Plan
import com.cafe.service.PlanService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @Project: note-boot
 * @Package: com.cafe.controller
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:14
 * @Description:
 */
@Api(tags = ["计划接口"])
@RestController
@RequestMapping(value = ["/note/plan"])
class PlanController
@Autowired
constructor(
    private val planService: PlanService
) {

    @ApiOperation(value = "查询计划列表")
    @GetMapping(value = ["/list"])
    fun list(): List<Plan> = planService.list()

    @ApiOperation(value = "根据id查询单个计划")
    @ApiImplicitParam(value = "计划id", name = "id", dataType = "String", paramType = "path", required = true)
    @GetMapping(value = ["/one/{id}"])
    fun one(@PathVariable(value = "id") id: String): Plan = planService.one(id)

    @ApiOperation(value = "新增计划")
    @ApiImplicitParam(value = "计划新增DTO", name = "dto", dataType = "PlanInsertDTO", paramType = "body", required = true)
    @PostMapping(value = ["/insert"])
    fun insert(@RequestBody dto: PlanInsertDTO): Plan = planService.insert(dto)

    @ApiOperation(value = "根据id修改计划")
    @ApiImplicitParam(value = "计划Model", name = "plan", dataType = "Plan", paramType = "body", required = true)
    @PutMapping(value = ["/update"])
    fun update(@RequestBody plan: Plan): Plan = planService.update(plan)

    @ApiOperation(value = "根据id删除计划")
    @ApiImplicitParam(value = "计划id", name = "id", dataType = "String", paramType = "path", required = true)
    @DeleteMapping(value = ["/delete/{id}"])
    fun update(@PathVariable(value = "id") id: String) = planService.delete(id)
}
