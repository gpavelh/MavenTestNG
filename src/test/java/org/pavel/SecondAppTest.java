package org.pavel;

import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SecondAppTest {
    private static final Logger LOG = LoggerFactory.getLogger(SecondAppTest.class);

    @Test()
    public void testFirstTest2() {
        LOG.info("HI!");
    }

    @Test()
        public void testSecondTest2() {
        LOG.info("HI!");
    }
}