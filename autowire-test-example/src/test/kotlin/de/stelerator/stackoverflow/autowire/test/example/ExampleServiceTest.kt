package de.stelerator.stackoverflow.autowire.test.example

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ExampleServiceTest(@Autowired val sut: ExampleService) {

    @Test
    fun exampleTest() {
        sut.test() shouldBe "Success"
    }

}