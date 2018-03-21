package pei.zhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/request")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String get(){
        return restTemplate.getForObject("http://localhost:8082/helloWorld",String.class);
    }

}
