package pl.krix.springplayground;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.krix.springplayground.domain.SomeBean;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringPlaygroundApplicationTests {

	@Autowired
	private SomeBean someBean;

	@Test
	public void checkBeanValue() {
		assertThat(someBean.getSomeValue(), is("test"));
	}

}
