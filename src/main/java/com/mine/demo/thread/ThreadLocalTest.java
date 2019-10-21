package com.mine.demo.thread;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {

            int num = i;

            executorService.execute(() -> {
//                System.out.println(num + "\t" + NumUtil.add10(num));
//                System.out.println(DateUtil.parse("2019-06-01"));
                System.out.println(DateUtilOf8.parse("2019-06-01 12:34:56"));;
            });
        }
    }

    static class DateUtilOf8 {

        static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        static Date parse(String datestr) {
            LocalDateTime localDateTime = LocalDateTime.parse(datestr, dateTimeFormatter);
            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());

//            LocalDate localDate = LocalDate.parse(datestr, dateTimeFormatter);
//            ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
            Date date = Date.from(zonedDateTime.toInstant());
            return date;
//            return null;
        }

    }

    static class DateUtil {

        static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

        static Date parse(String datestr) {
            SimpleDateFormat simpleDateFormat = threadLocal.get();
            Date parse = null;
            try {
                parse = simpleDateFormat.parse(datestr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }

    }

    static class NumUtil {

        static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        static int addNum = 0;

        static int add10(int num) {
            threadLocal.set(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return threadLocal.get() + 10;
        }
    }
}

