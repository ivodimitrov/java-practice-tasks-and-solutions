package javafortesters.datestimes;

import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalendarTest {

    @Test
    public void calendarExploration() {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime().getTime());
        System.out.println(System.currentTimeMillis());

        System.out.println(cal);

        Calendar sameDate = Calendar.getInstance();
        sameDate.setTime(cal.getTime());
        assertThat(cal.equals(sameDate), is(true));
        assertThat(cal.compareTo(sameDate), is(0));

        System.out.println(cal.getTime());
        Calendar oneWeekFromNow = Calendar.getInstance();
        oneWeekFromNow.setTime(cal.getTime());
        oneWeekFromNow.add(Calendar.DATE, 7);
        System.out.println(oneWeekFromNow.getTime());

        assertThat(oneWeekFromNow.after(cal), is(true));
        assertThat(cal.before(oneWeekFromNow), is(true));
        assertThat(cal.compareTo(oneWeekFromNow), is(-1));
        assertThat(oneWeekFromNow.compareTo(cal), is(1));
    }
}
