package contracts.stock

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "query by id should return stock(id,price)"

    request {
        method GET()
        url value {
            // 消费者使用时请求任何 /stock/price/数字 都会被转为 /stock/price/600519
            consumer regex('/stock/price/\\d+')
            producer "/stock/price/600519"
        }
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        // 提供给消费者的默认返回
        body([
                id   : 600519,
                price: 999
        ])

        // 服务端在测试过程中，body需要满足的规则
        bodyMatchers {
            jsonPath '$.id', byRegex(number())
            jsonPath '$.price', byRegex(number())
        }
    }
}

