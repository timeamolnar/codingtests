package codingtests.integertoroman;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanBasicTest {

    private final IntegerToRomanBasic converter = new IntegerToRomanBasic();

    @Test
    public void number1ShouldConvertToI(){
        assertEquals("I", converter.convertIntegerToRoman(1));
    }

    @Test
    public void number2ShouldConvertToII(){
        assertEquals("II", converter.convertIntegerToRoman(2));
    }

    @Test
    public void number3ShouldConvertToIII(){
        assertEquals("III", converter.convertIntegerToRoman(3));
    }

    @Test
    public void number4ShouldConvertToIV(){
        assertEquals("IV", converter.convertIntegerToRoman(4));
    }

    @Test
    public void number5ShouldConvertToV(){
        assertEquals("V", converter.convertIntegerToRoman(5));
    }

    @Test
    public void number6to8ShouldConvertToRoman(){
        assertEquals("VI", converter.convertIntegerToRoman(6));
        assertEquals("VII", converter.convertIntegerToRoman(7));
        assertEquals("VIII", converter.convertIntegerToRoman(8));
    }

    @Test
    public void number9ShouldConvertToIX(){
        assertEquals("IX", converter.convertIntegerToRoman(9));
    }

    @Test
    public void number10ShouldConvertToX(){
        assertEquals("X", converter.convertIntegerToRoman(10));
    }

    @Test
    public void number11to13ShouldConvertToRoman(){
        assertEquals("XI", converter.convertIntegerToRoman(11));
        assertEquals("XII", converter.convertIntegerToRoman(12));
        assertEquals("XIII", converter.convertIntegerToRoman(13));
    }

    @Test
    public void number19ShouldConvertToXIX(){
        assertEquals("XIX", converter.convertIntegerToRoman(19));
    }

    @Test
    public void number20ShouldConvertToXX(){
        assertEquals("XX", converter.convertIntegerToRoman(20));
    }

    @Test
    public void number21to23ShouldConvertToRoman(){
        assertEquals("XXI", converter.convertIntegerToRoman(21));
        assertEquals("XXII", converter.convertIntegerToRoman(22));
        assertEquals("XXIII", converter.convertIntegerToRoman(23));
    }

    @Test
    public void number40ShouldConvertToXL(){
        assertEquals("XL", converter.convertIntegerToRoman(40));
    }

    @Test
    public void number50ShouldConvertToL(){
        assertEquals("L", converter.convertIntegerToRoman(50));
    }

    @Test
    public void number1666ShouldConvertToMDCLXVI(){
        assertEquals("MDCLXVI", converter.convertIntegerToRoman(1666));
    }

    @Test(expected = IllegalArgumentException.class)
    public void number0ShouldBeInvalid(){
        converter.convertIntegerToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void number2001ShouldBeInvalid(){
        converter.convertIntegerToRoman(2001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeNumberShouldBeInvalid(){
        converter.convertIntegerToRoman(-1);
    }

}
