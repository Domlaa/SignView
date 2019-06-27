package com.xning.signview;

import com.xning.signview.signdate.DateUtil;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        int y = 2019;
        int m = 9;

        String mm=m>10?"-":"-0";

      System.out.println(y+mm+m);
    }
}