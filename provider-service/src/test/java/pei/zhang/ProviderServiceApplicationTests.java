package pei.zhang;

import org.junit.Before;
import org.junit.Ignore;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderServiceApplication.class)
@Ignore
public class ProviderServiceApplicationTests {
	@Autowired
	WebApplicationContext webApplicationContext;

	@Before
	public void setUp() throws Exception {
		RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
	}
}
