package com.jlindquist.groovy.config

import com.jlindquist.groovy.service.HelloWorldService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloWorldConfig {

    @Bean
    HelloWorldService helloWorldService() {
        return new HelloWorldService("Hello World Service")
    }

}
