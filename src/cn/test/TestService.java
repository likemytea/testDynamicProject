package cn.test;

import org.apache.log4j.Logger;

public class TestService {
	private static Logger log = Logger.getLogger(TestService.class);

	public void testa() {
		log.info("this is service");
	}
}
