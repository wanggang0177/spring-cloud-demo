package eurekaclient.eurekaclient.configution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eurekaclient.eurekaclient.filter.AccessFilter;
import eurekaclient.eurekaclient.route.RedisRouteLocator;

/**
 * 
 * 自定义网关的配置
 * 主要是RedisRouteLocator对象，因为有些路由需要从数据库中读取
 */
@Configuration
public class GateConfig {

	@Autowired
	ZuulProperties zuulProperties;

	@Autowired
	ServerProperties server;

	@Bean
	RedisRouteLocator redisRouteLocator() {
		RedisRouteLocator redisRouteLocator = new RedisRouteLocator(this.server.getServletPrefix(),
				this.zuulProperties);
		// redisRouteLocator.setRedisTemplate(this.redisTemplate);
		return redisRouteLocator;
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
