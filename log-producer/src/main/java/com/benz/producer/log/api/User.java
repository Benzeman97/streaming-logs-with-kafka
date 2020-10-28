package com.benz.producer.log.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User implements Runnable {

    final private static Logger logger= LogManager.getLogger(User.class);

    @Override
    public void run() {

        while(true) {

            try {
                String str = "Hello Benzema";

                logger.info(String.format("Print User %s ",str));

                Thread.sleep(3000);
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

}
