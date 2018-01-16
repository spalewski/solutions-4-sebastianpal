package pl.coderstrust.regex;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IsIpAddressTest {

    @Ignore
            ("Test passed. Warning, it takes 35 minutes")
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

    @Test
    public void shouldCheckisIpAddressQuickSectionOne() {

        IsIpAddress isIpAddress = new IsIpAddress();

        int i = -1;
        do {
            i++;
            int a = (i) & 0xff;
            String ip = a + "." + 0 + "." + 0 + "." + 0;
            Assert.assertEquals(true, IsIpAddress.isIpAddress(ip));
        }
        while (i != 256);

    }

    @Test
    public void shouldCheckisIpAddressQuickSectionTwo() {

        IsIpAddress isIpAddress = new IsIpAddress();

        int i = -1;
        do {
            i++;
            int a = (i) & 0xff;
            String ip = 255 + "." + a + "." + 0 + "." + 0;
            Assert.assertEquals(true, IsIpAddress.isIpAddress(ip));
        }
        while (i != 256);

    }

    @Test
    public void shouldCheckisIpAddressQuickSectionThree() {

        IsIpAddress isIpAddress = new IsIpAddress();

        int i = -1;
        do {
            i++;
            int a = (i) & 0xff;
            String ip = 255 + "." + 255 + "." + a + "." + 0;
            Assert.assertEquals(true, IsIpAddress.isIpAddress(ip));
        }
        while (i != 256);

    }

    @Test
    public void shouldCheckisIpAddressQuickSectionFour() {

        IsIpAddress isIpAddress = new IsIpAddress();

        int i = -1;
        do {
            i++;
            int a = (i) & 0xff;
            String ip = 255 + "." + 255 + "." + 255 + "." + a;
            Assert.assertEquals(true, IsIpAddress.isIpAddress(ip));
        }
        while (i != 256);

    }
}