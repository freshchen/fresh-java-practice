package com.example.springcloudcontractproviderrest;


import com.example.springcloudcontractproviderrest.controller.StockController;
import com.example.springcloudcontractproviderrest.dao.StockRepository;
import com.example.springcloudcontractproviderrest.model.StockDTO;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RestBaseCase {

    @Autowired
    private StockController stockController;

    @MockBean
    private StockRepository stockRepository;

    @Before
    public void setup() {
        init();
        RestAssuredMockMvc.standaloneSetup(stockController);
    }

    private void init() {
        Mockito.when(stockRepository.getStockById(600519)).thenReturn(new StockDTO(600519, "贵州茅台", 999L, "SH"));
    }

}
