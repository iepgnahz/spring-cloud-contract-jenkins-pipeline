package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url value(consumer(regex('/helloWorld')), producer('/helloWorld'))
    }

    response {
        status 200
        body "hello world!"
    }
}
