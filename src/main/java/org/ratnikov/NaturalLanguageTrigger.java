package org.ratnikov;

import org.quartz.*;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 9/23/11
 * Time: 11:43 AM
 */
public class NaturalLanguageTrigger extends Trigger implements Triggerable {

    private String configuration;

    private CronTrigger cronTrigger;

    public NaturalLanguageTrigger(String configuration) {
        this.configuration = configuration;
        this.cronTrigger = new CronTrigger();
    }

    public Trigger getTrigger() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void triggered(Calendar calendar) {
        cronTrigger.triggered(calendar);
    }

    @Override
    public Date computeFirstFireTime(Calendar calendar) {
        return cronTrigger.computeFirstFireTime(calendar);
    }

    @Override
    public int executionComplete(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        return cronTrigger.executionComplete(jobExecutionContext, e);
    }

    @Override
    public boolean mayFireAgain() {
       return cronTrigger.mayFireAgain();
    }

    @Override
    public Date getStartTime() {
        return cronTrigger.getStartTime();
    }

    @Override
    public void setStartTime(Date date) {
        cronTrigger.setStartTime(date);
    }

    @Override
    public void setEndTime(Date date) {
        cronTrigger.setEndTime(date);
    }

    @Override
    public Date getEndTime() {
        return cronTrigger.getEndTime();
    }

    @Override
    public Date getNextFireTime() {
        return cronTrigger.getNextFireTime();
    }

    @Override
    public Date getPreviousFireTime() {
        return cronTrigger.getPreviousFireTime();
    }

    @Override
    public Date getFireTimeAfter(Date date) {
        return cronTrigger.getFireTimeAfter(date);
    }

    @Override
    public Date getFinalFireTime() {
        return cronTrigger.getFinalFireTime();
    }

    @Override
    protected boolean validateMisfireInstruction(int i) {
        //return cronTrigger.validateMisfireInstruction(i);
        return false;
    }

    @Override
    public void updateAfterMisfire(Calendar calendar) {
        cronTrigger.updateAfterMisfire(calendar);
    }

    @Override
    public void updateWithNewCalendar(Calendar calendar, long l) {
        cronTrigger.updateWithNewCalendar(calendar, l);
    }
}
