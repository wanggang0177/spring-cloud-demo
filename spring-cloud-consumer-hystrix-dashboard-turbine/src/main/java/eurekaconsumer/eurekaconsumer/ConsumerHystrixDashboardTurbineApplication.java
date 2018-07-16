package eurekaconsumer.eurekaconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 启动feign客户端
 * */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableTurbine
@EnableHystrixDashboard
//@EnableCircuitBreaker
public class ConsumerHystrixDashboardTurbineApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
//		SpringApplication.run(EurekaConsumerApplication.class, args);
		new SpringApplicationBuilder(ConsumerHystrixDashboardTurbineApplication.class).web(true).run(args);
	}
}
