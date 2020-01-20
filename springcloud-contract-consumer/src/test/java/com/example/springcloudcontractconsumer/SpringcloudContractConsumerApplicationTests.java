package com.example.springcloudcontractconsumer;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureStubRunner(ids = {"com.example:springcloud-contract-provider:0.0.1-SNAPSHOT:stubs:8081"},
		stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class SpringcloudContractConsumerApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}


	@Test
	public void testAddition() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/local/user"))
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
				.andExpect(MockMvcResultMatchers.content().string("{\"name\":\"xiang\",\"age\":22}"));
	}


}
