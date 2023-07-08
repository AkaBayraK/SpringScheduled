package com.SpringScheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class Gorev {
	
    private int sayac=0;

    @Scheduled(cron = "*/10 * * * * *")
    public void calistirGorev() {
        sayac++;
        System.out.println("Program Çalıştı : İş Görevi : " +  sayac+" Zaman : " + new Date());
    }

}
