package com.example.mcalc;

import junit.framework.TestCase;

import org.junit.Assert;

public class MortgageModelTest extends TestCase {

    public void testComputePayment() {
            String p, a, i;
            p = "700000"; a = "25"; i = "2.75";
            MortgageModel model = new MortgageModel(p, a, i);
            String testcase = p + "," + a + "," + i;
            Assert.assertEquals(testcase, "$3,229.18", model.computePayment());

            p = "300000"; a = "20"; i = "4.5";
            model = new MortgageModel(p, a, i);
            Assert.assertEquals("$1,897.95", model.computePayment());
    }
}