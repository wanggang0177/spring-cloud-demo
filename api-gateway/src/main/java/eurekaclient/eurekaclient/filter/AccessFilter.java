package eurekaclient.eurekaclient.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 过滤器，主要继承ZuulFilter在请求服务，通过网关时就会自动调用
 * 
 */
public class AccessFilter extends ZuulFilter {

	/**
	 * 是否被执行
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 具体过滤实现
	 */
	@Override
	public Object run() {
		
		System.out.println("---------AccessFilter----------");
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println(request.getMethod() + "\t" + request.getRequestURL().toString());
		Object accessToken = request.getParameter("accessToken");
		if (accessToken == null) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			return null;
		}
		return null;
	}

	/**
	 * 这里定义为pre，代表会在请求被路由之前执行。
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 执行顺序
	 */
	@Override
	public int filterOrder() {
		return 1;
	}

}
