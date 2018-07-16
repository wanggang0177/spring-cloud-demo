package eurekaconsumer.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class MyInterceptor implements RequestInterceptor{

	@Override
	public void apply(RequestTemplate template) {
		System.out.println("=======【feign拦截器】MyInterceptor=========");
		System.out.println(template.url());
		System.out.println(template.bodyTemplate());
		System.out.println(template.method());
	}
}
