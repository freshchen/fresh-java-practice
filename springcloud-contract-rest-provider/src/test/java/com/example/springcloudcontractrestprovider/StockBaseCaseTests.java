package com.example.springcloudcontractrestprovider;

import com.example.springcloudcontractrestprovider.controller.StockRestController;
import com.example.springcloudcontractrestprovider.dto.StockDTO;
import com.example.springcloudcontractrestprovider.service.StockService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : freshchen
 * <P>Created on 2020-01-21 22:53 </p>
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class StockBaseCaseTests {

    @Autowired
    private StockRestController stockRestController;

    @MockBean
    private StockService stockService;

    @Before
    public void before() {
        Mockito.when(this.stockService.getStockById(1L))
                .thenReturn(new StockDTO(1L, "贵州茅台", 999999L));
        RestAssuredMockMvc.standaloneSetup(this.stockRestController);
    }
}
