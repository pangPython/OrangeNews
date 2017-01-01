package cn.edu.bzu.group12.orangenews.test;

import org.apache.log4j.Logger;


/**
 * @author pangPython
 *	≤‚ ‘Log4j
 */
public class TestLog {
	static Logger log = Logger.getLogger(TestLog.class.getName());
	public static void main(String[] args) {
		log.debug("this is a debug log!");
		log.info("this is a loginfo ");
		log.trace("heheh");
	}
}
