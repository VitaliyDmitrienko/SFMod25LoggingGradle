package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

    public class Main2550{
        private static final Logger log = LogManager.getLogger(Main2550.class);
        public static void main(String[] args){
            log.info("Это информационное сообщение!");
            log.error("Это сообщение ошибки");
        }
    }
