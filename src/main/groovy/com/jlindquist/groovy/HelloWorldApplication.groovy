package com.jlindquist.groovy

import com.jlindquist.groovy.config.HelloWorldConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import([HelloWorldConfig.class])
class HelloWorldApplication {
    static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args)
    }
}