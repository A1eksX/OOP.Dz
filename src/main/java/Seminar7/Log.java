package Seminar7;

import java.time.LocalDateTime;

public class Log implements Logger{
    public void writeLog(String str) {
        System.out.println(LocalDateTime.now() + " : " + str);
    }
}