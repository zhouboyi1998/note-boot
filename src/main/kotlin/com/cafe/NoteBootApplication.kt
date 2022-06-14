package com.cafe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NoteBootApplication

fun main(args: Array<String>) {
    runApplication<NoteBootApplication>(*args)
}
