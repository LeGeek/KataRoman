package test;

import junit.framework.Assert;
import org.junit.Test;
import roman.Roman;

/**
 * Created by legeek on 14/02/14.
 */
public class RomanTest {

    Roman r = new Roman();

    @Test
    public void decodeIShouldReturn1() throws Exception{
        Assert.assertEquals(1, r.decode("I"));
    }

    @Test
    public void decodeIIShouldReturn2() throws Exception{
        Assert.assertEquals(2, r.decode("II"));
    }

    @Test
    public void decodeIIIShouldReturn3() throws Exception{
        Assert.assertEquals(3, r.decode("III"));
    }

    @Test
    public void decodeVShouldReturn5() throws Exception{
        Assert.assertEquals(5, r.decode("V"));
    }

    @Test
    public void decodeVIShouldReturn6() throws Exception{
        Assert.assertEquals(6, r.decode("VI"));
    }

    @Test
    public void decodeIVShouldReturn4() throws Exception{
        Assert.assertEquals(4, r.decode("IV"));
    }

    @Test
    public void decodeXShouldReturn10() throws Exception{
        Assert.assertEquals(10, r.decode("X"));
    }

    @Test
    public void decodeLShouldReturn50() throws Exception{
        Assert.assertEquals(50, r.decode("L"));
    }

    @Test
    public void decodeCShouldReturn100() throws Exception{
        Assert.assertEquals(100, r.decode("C"));
    }

    @Test
    public void decodeDShouldReturn500() throws Exception{
        Assert.assertEquals(500, r.decode("D"));
    }

    @Test
    public void decodeMShouldReturn1000() throws Exception{
        Assert.assertEquals(1000, r.decode("M"));
    }

    @Test(expected = Exception.class)
    public void decodeAShoudThrowException() throws Exception{
        Assert.assertEquals(0, r.decode("A"));
    }

    @Test
    public void decodeCCCLXIXShouldReturn369() throws Exception{
        Assert.assertEquals(369, r.decode("CCCLXIX"));
    }

    @Test
    public void decodeCDXLVIIIShouldReturn448() throws Exception{
        Assert.assertEquals(448, r.decode("CDXLVIII"));
    }

    @Test
    public void decodeMMDCCLIShouldReturn2751() throws Exception{
        Assert.assertEquals(2751, r.decode("MMDCCLI"));
    }

}
