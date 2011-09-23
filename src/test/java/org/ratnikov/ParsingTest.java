package org.ratnikov;


import org.junit.Test;
import org.quartz.Trigger;

/**
 * Unit test for simple App.
 */
public class ParsingTest
{
    @Test
    public void parseSimpleStringTest() {

        String everyTwoMinutes = "repeat every 2 minutes";

        Trigger trigger = new NaturalLanguageTrigger();
    }

}
