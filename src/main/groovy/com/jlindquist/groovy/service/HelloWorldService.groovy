package com.jlindquist.groovy.service

import lombok.Getter
import lombok.Setter
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service(value = 'HelloWorldService')
class HelloWorldService {
    @Getter @Setter String serviceName

    private static Mono<String> getClassAction() {
        return Mono.just('Hello World!')
    }

    static Mono<String> getAction() {
        return getClassAction()
    }
}
