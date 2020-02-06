package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "get one stock by id = 1"

    request {
        method GET()
        url "/stock/1"
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body([id: 1, stockName: "贵州茅台213123", stockMoney: 999999])
    }
}
