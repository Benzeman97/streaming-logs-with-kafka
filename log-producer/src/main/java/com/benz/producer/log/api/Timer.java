package com.benz.producer.log.api;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timer implements Runnable{

    final private static Logger logger= LogManager.getLogger(Timer.class);

    @Override
    public void run() {

        while(true)
        {
            try {
                logger.info("inside task - sending logs at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
                Thread.sleep(3000);
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

}
