package pl.coderstrust.regex;

import org.junit.Assert;
import org.junit.Test;

public class IsIpAddressTest {

    @Test
    public void shouldCheckisIpAddressValid() {

        IsIpAddress isIpAddress = new IsIpAddress();
        Assert.assertEquals(true, IsIpAddress.isIpAddress("255.255.255.254"));
        Assert.assertEquals(true, IsIpAddress.isIpAddress("192.168.0.1"));

        // test for whole ipv4 range
        int i = -1;
        do {
            i++;
            int b1 = (i >> 24) & 0xff;
            int b2 = (i >> 16) & 0xff;
            int b3 = (i >> 8) & 0xff;
            int b4 = (i) & 0xff;
            String ip = b1 + "." + b2 + "." + b3 + "." + b4;
            Assert.assertEquals(true, IsIpAddress.isIpAddress(ip));
        }
        while (i != -1);
    }
}