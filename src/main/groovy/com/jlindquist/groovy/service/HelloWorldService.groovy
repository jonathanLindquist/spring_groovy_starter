package com.jlindquist.groovy.service

import lombok.Getter
import lombok.Setter
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

//@Service(value = 'HelloWorldService')
@Getter
@Setter
class HelloWorldService {

    String serviceName

    HelloWorldService(String item) {
        this.serviceName = item
    }

    private Mono<String> getClassAction() {
        return Mono.just(this.serviceName)
    }

    Mono<String> getAction() {
        return getClassAction()
    }
}
