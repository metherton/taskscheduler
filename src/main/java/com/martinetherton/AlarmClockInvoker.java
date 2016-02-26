package com.martinetherton;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by martin on 26/11/15.
 */
public class AlarmClockInvoker {

    @Scheduled(fixedDelay=5000)
    public void invoke() {
        System.out.println("Invoker invoked");
    }

}
