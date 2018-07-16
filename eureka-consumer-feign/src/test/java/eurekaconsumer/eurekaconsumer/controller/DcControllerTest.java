package eurekaconsumer.eurekaconsumer.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import eurekaconsumer.eurekaconsumer.feignclient.DcClient;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class DcControllerTest {

	@Mock
	DcClient dcClient = PowerMockito.mock(DcClient.class);
	@InjectMocks
	DcController controller = new DcController();
	
	
	private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
	
	@Test
	public void dcTest() throws Exception{
        RequestBuilder request = null;
        request = MockMvcRequestBuilders.get("/consumer/");
        PowerMockito.when(dcClient.consumer()).thenReturn("hahah");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("hahah")));
	}
	
	
	
}
