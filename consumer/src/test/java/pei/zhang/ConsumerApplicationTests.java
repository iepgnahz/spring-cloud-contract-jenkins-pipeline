package pei.zhang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(workOffline = true, ids = "pei.zhang:provider-service:+:stubs:8088")
@SpringBootTest(classes = ConsumerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConsumerApplicationTests {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        String result = restTemplate.getForObject("/request", String.class);
        assertThat(result, is("hello world!"));
    }
}
