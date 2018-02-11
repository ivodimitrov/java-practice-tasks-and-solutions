package javafortesters.stringsrevisited;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringsRevisitedTest {

    @Test
    public void aStringLiteralIsAnObject() {
        assertThat("hello".length(), is(5));
    }

    @Test
    public void canUseEscapeSequencesInAString() {
        System.out.println("Bob said \"hello\" to his cat's friend");
        System.out.println("This is a single backslash \\");
    }

    @Test
    public void canConcatenateStringsInDifferentWays() {
        String thisIs = "This is ";
        String s1 = thisIs.concat("String1");
        assertThat(s1, is("This is String1"));

        String ps1 = "This is " + "String2";
        assertThat(ps1, is("This is String2"));
        String ps2 = "This is " + 4;
        assertThat(ps2, is("This is 4"));
    }

    @Test
    public void canConvertToStrings() {
        String intConcatConvert = "" + 1;
        assertThat(intConcatConvert, is("1"));

        String integerIntConvert = Integer.toString(2);
        assertThat(integerIntConvert, is("2"));

        String integerStringConvert = String.valueOf(3);
        assertThat(integerStringConvert, is("3"));
    }

    @Test
    public void canConvertFromStrings() {
        assertThat(Integer.valueOf("2"), is(2));

        char[] cArray = {'2', '3'};
        assertThat("23".toCharArray(), is(cArray));
    }
}
