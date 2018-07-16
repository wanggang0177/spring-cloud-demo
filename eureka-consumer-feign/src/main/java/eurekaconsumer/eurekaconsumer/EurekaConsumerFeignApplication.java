package eurekaconsumer.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 启动feign客户端
 * */
@EnableFeignClients
//@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
//		SpringApplication.run(EurekaConsumerApplication.class, args);
		new SpringApplicationBuilder(EurekaConsumerFeignApplication.class).web(true).run(args);
	}
}
