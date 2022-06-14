package com.cafe.controller

import com.cafe.model.dto.PlanInsertDTO
import com.cafe.model.entity.Plan
import com.cafe.service.PlanService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Project: note-boot
 * @Package: com.cafe.controller
 * @Author: zhouboyi
 * @Date: 2022/6/14 15:14
 * @Description:
 */
@Api(tags = ["计划接口"])
@RestController
@RequestMapping(value = ["/plan"])
class PlanController
@Autowired
constructor(
    private val planService: PlanService
) {

    @ApiOperation(value = "查询计划列表")
    @GetMapping(value = [""])
    fun list(): List<Plan> = planService.list()

    @ApiOperation(value = "根据id查询计划")
    @ApiImplicitParam(value = "计划id", name = "id", dataType = "String", paramType = "path", required = true)
    @GetMapping(value = ["/{id}"])
    fun one(@PathVariable(value = "id") id: String): Plan = planService.one(id)

    @ApiOperation(value = "新增计划")
    @ApiImplicitParam(value = "计划插入数据DTO", name = "dto", dataType = "PlanInsertDTO", paramType = "body", required = true)
    @PostMapping(value = [""])
    fun insert(@RequestBody dto: PlanInsertDTO): Plan = planService.insert(dto)

    @ApiOperation(value = "批量新增计划")
    @ApiImplicitParam(value = "计划插入数据DTO集合", name = "dtoList", dataType = "List<PlanInsertDTO>", paramType = "body", required = true)
    @PostMapping(value = ["/batch"])
    fun insertBatch(@RequestBody dtoList: List<PlanInsertDTO>): List<Plan> = planService.insertBatch(dtoList)

    @ApiOperation(value = "修改计划")
    @ApiImplicitParam(value = "计划Model", name = "plan", dataType = "Plan", paramType = "body", required = true)
    @PutMapping(value = [""])
    fun update(@RequestBody plan: Plan): Plan = planService.update(plan)

    @ApiOperation(value = "批量修改计划")
    @ApiImplicitParam(value = "计划Model集合", name = "planList", dataType = "List<Plan>", paramType = "body", required = true)
    @PutMapping(value = ["/batch"])
    fun updateBatch(@RequestBody planList: List<Plan>): List<Plan> = planService.updateBatch(planList)

    @ApiOperation(value = "删除计划")
    @ApiImplicitParam(value = "计划id", name = "id", dataType = "String", paramType = "path", required = true)
    @DeleteMapping(value = ["/{id}"])
    fun delete(@PathVariable(value = "id") id: String) = planService.delete(id)

    @ApiOperation(value = "批量删除计划")
    @ApiImplicitParam(value = "计划id集合", name = "idList", dataType = "List<String>", paramType = "body", required = true)
    @DeleteMapping(value = ["/batch"])
    fun deleteBatch(@RequestBody idList: List<String>) = planService.deleteBatch(idList)
}
