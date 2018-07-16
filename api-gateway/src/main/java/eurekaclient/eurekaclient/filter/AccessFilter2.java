package eurekaclient.eurekaclient.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessFilter2 extends ZuulFilter {

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
		
		System.out.println("---------AccessFilter2----------");
		
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
		return 2;
	}

}
