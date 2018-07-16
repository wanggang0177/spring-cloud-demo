package eurekaconsumer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eurekaconsumer.interceptor.MyInterceptor;

@Configuration
public class FeignConfiguration{

	@Bean
	public MyInterceptor getMyInterceptor(){
		return new MyInterceptor();
	}
}
