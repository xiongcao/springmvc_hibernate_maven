package com.ssh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class TestBase {

	@Test
	public void handler() {
		String flag = "true";
		boolean s = Boolean.parseBoolean(flag);
		System.out.println(s);
	}

}
