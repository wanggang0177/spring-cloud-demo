package eurekaconsumer.eurekaconsumer.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import eurekaconsumer.configuration.FeignConfiguration;
import eurekaconsumer.configuration.FeignLogConf;
import eurekaconsumer.eurekaconsumer.hystric.SchedualServiceHiHystric;

/**
 * 作用：把其他服务变成本地服务 （接口-服务）
 * 
 * @FeignClient("服务名称")
 * 
 * */
@FeignClient(name = "eureka-client",configuration = {FeignLogConf.class,FeignConfiguration.class}, fallback = SchedualServiceHiHystric.class)
public interface DcClient {

	/**
	 * 调用具体某个服务功能
	 * */
	@GetMapping("/dc")
	String consumer();
}
