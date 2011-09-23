package org.ratnikov;

import org.quartz.Trigger;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 9/23/11
 * Time: 1:51 PM
 */
public interface Triggerable {

    Trigger getTrigger();
}
