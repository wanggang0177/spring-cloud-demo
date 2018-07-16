package eurekaconsumer.eurekaconsumer.hystric;

import org.springframework.stereotype.Component;

import eurekaconsumer.eurekaconsumer.feignclient.DcClient;

/**
 * 降级服务处理（备用方案）
 */
@Component
public class SchedualServiceHiHystric implements DcClient{
	@Override
	public String consumer() {
		String str = " SchedualServiceHiHystric .... ";
		System.out.println(str);
		return str;
	}
}
