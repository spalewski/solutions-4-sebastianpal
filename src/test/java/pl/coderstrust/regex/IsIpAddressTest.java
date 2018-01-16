package pl.coderstrust.regex;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class IsIpAddressTest {

    public static ArrayList ipGenerator() {
        ArrayList ipList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        for (long n = Integer.MIN_VALUE; n <= Integer.MAX_VALUE; n++) {
            int i = (int) n;
            int b1 = (i >> 24) & 0xff;
            int b2 = (i >> 16) & 0xff;
            int b3 = (i >> 8) & 0xff;
            int b4 = (i) & 0xff;
            stringBuilder.append(b1+"."+b2+"."+b3+"."+b4);
            ipList.add(stringBuilder.toString());
            }
            return ipList;
    }

    @Test
    public void shouldCheckisIpAddressValid() {
        IsIpAddress isIpAddress = new IsIpAddress();

        Assert.assertEquals(true, IsIpAddress.isIpAddress("255.255.255.254"));
        Assert.assertEquals(true, IsIpAddress.isIpAddress("192.168.0.1"));
        for (int i = 0; i <ipGenerator().size() ; i++) {
            System.out.println(ipGenerator().get(i));;

        }
    }
    @Test
    @Parameters({"255.255.255.254"})

    public void checkAllAdresses(){
        return;
    }



}

