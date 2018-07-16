package eurekaclient.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

	int count = 0;
	
	@Autowired
	DiscoveryClient discoveryClient;

	/**
	 * 返回注册中心的所有服务清单
	 */
	@GetMapping("/dc")
	public String dc() {
		//所有服务清单
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return "dc服务被调用：" + ++count + "次";
	}
}
