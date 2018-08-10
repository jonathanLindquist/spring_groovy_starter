package com.jlindquist.groovy.controller

import com.jlindquist.groovy.service.HelloWorldService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService

    @GetMapping('/helloworld')
    String getHelloWorld() {
        return helloWorldService.getAction()
    }
}
