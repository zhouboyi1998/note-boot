package com.cafe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @Project: note-boot
 * @Package: com.cafe
 * @Author: zhouboyi
 * @Date: 2022/6/30 15:09
 * @Description:
 */
@SpringBootApplication
class NoteApplication

fun main(args: Array<String>) {
    runApplication<NoteApplication>(*args)
}
