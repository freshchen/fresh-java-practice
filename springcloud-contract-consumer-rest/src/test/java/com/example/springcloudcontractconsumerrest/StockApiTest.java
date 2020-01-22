package com.example.springcloudcontractconsumerrest;


import com.example.springcloudcontractconsumerrest.api.StockApi;
import com.example.springcloudcontractconsumerrest.model.StockPriceDTO;


import org.assertj.core.api.BDDAssertions;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(
        ids = {"com.example:springcloud-contract-provider-rest:+:stubs:8880"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL
)
public class StockApiTest {

    @Autowired
    private StockApi stockApi;

    @Test
    public void testStockApi() throws IOException {
        StockPriceDTO stockPrice = stockApi.getStockPrice(600519).execute().body();
        BDDAssertions.then(stockPrice.getId()).isEqualTo(600519);
        BDDAssertions.then(stockPrice.getPrice()).isEqualTo(999);

    }
}
