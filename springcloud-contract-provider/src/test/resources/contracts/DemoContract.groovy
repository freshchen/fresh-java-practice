package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "contract demo"

    request{
        method GET()
        url "/user"
    }
    response {
        body "{\"name\":\"xiang\",\"age\":22}"
        status OK()
    }
}
