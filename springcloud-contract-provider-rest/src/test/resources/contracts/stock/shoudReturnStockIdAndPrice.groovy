package contracts.stock

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return stock(id,price) by id=1"

    request {
        method GET()
        url "/stock/price/600519"
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body([
                id   : 600519,
                price: 999
        ])
    }
}

