package org.pavel;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ParamTest extends Assert {
    private static final Logger LOG = LoggerFactory.getLogger(ParamTest.class);

    @DataProvider(name = "Calc")
    private Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {5, 5, 10},
                {4, 5, 9}
        };
    }

    @Test(dataProvider = "Calc")
    public void paramTest1(int valueA, int valueB, int result) {
        assertEquals(valueA + valueB, result);
        LOG.info("All good");
    }
}
