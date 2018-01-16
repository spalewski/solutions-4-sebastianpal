package pl.coderstrust.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class isIpAddressTestParametrized {

    private String testIP;
    private IsIpAddress isIpAddress;
    private boolean expected;

    @Before
    public void isIpAddress() {
        isIpAddress = new IsIpAddress();
    }

    public isIpAddressTestParametrized(String testIP, boolean expected) {
        this.testIP = testIP;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testIPs() {
        return Arrays.asList(new Object[][]{
                {"192.168.0.1", true},
                {"255.255.255.254", true},
                {"985.255.255.254", false},
                {"abb.0.0.1", false},
                {"192.168.15.1", true}});
    }

    @Test
    public void shoildCheckIpAddressesWithParameters() {
        Assert.assertEquals(expected, IsIpAddress.isIpAddress(testIP));
    }
}