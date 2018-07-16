package eurekaconsumer.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import eurekaconsumer.eurekaconsumer.feignclient.DcClient;

@RestController
public class DcController {

//	@Autowired
//	LoadBalancerClient loadBalancerClient;
//	@Autowired
//	RestTemplate restTemplate;
	
	
	@Autowired
    DcClient dcClient;
	
	@GetMapping("/consumer")
    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);
		
		System.out.println("-----dc()-------");
		return dcClient.consumer();
    }
}
