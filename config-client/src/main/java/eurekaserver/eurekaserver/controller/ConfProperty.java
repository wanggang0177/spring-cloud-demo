package eurekaserver.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 开启更新机制、需要给加载变量的类上面加载@RefreshScope，在客户端执行/refresh的时候就会更新此类下面的变量值;
 */
@RestController
@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
@RequestMapping("refreshScope") //访问路径
public class ConfProperty {

	@Value("${info.profile}")
	private String infoProfile;

	@Value("${info.from}")
	private String infoFrom;
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/infoFrom")
	public String getInfoFrom() {
		return infoFrom;
	}
	
	@RequestMapping("/infoProfile")
	public String getInfoProfile() {
		return infoProfile;
	}

}
