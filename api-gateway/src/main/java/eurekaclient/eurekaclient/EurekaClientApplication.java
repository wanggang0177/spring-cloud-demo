package eurekaclient.eurekaclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import eurekaclient.eurekaclient.filter.AccessFilter;
import eurekaclient.eurekaclient.filter.AccessFilter2;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
	}
}
