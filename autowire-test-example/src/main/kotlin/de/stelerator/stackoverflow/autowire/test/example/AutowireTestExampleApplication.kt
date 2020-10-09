package de.stelerator.stackoverflow.autowire.test.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutowireTestExampleApplication

fun main(args: Array<String>) {
	runApplication<AutowireTestExampleApplication>(*args)
}
