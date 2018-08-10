package com.jlindquist.groovy.service

import org.springframework.stereotype.Service

@Service
class HelloWorldService {
    private String serviceName

    String getServiceName() {
        return this.serviceName
    }

    private static String getClassAction() {
        return 'Hello World!'
    }

    String getAction() {
        return getClassAction()
    }
}
