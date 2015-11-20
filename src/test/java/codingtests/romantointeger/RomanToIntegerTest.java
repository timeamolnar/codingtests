package codingtests.romantointeger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger converter = new RomanToInteger();

    @Test
    public void romanIShouldConvertToNumber1(){
        assertEquals(1 , converter.convertRomanToInteger("I"));
    }

    @Test
    public void romanIIShouldConvertToNumber2(){
        assertEquals(2 , converter.convertRomanToInteger("II"));
    }

    @Test
    public void romanIIIShouldConvertToNumber3(){
        assertEquals(3 , converter.convertRomanToInteger("III"));
    }

    @Test
    public void romanIVToXShouldConvertToNumber4To10(){
        assertEquals(4 , converter.convertRomanToInteger("IV"));
        assertEquals(5 , converter.convertRomanToInteger("V"));
        assertEquals(6 , converter.convertRomanToInteger("VI"));
        assertEquals(7 , converter.convertRomanToInteger("VII"));
        assertEquals(8 , converter.convertRomanToInteger("VIII"));
        assertEquals(9 , converter.convertRomanToInteger("IX"));
        assertEquals(10 , converter.convertRomanToInteger("X"));
    }

    @Test
    public void romanMCDXLIVShouldConvertToNumber1444(){
        assertEquals(1444 , converter.convertRomanToInteger("MCDXLIV"));
    }

}
