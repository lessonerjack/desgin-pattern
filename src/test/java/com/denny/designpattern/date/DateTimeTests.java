package com.denny.designpattern.date;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2020/2/21 16:15
 * @Version: 1.0
 */
@Slf4j
public class DateTimeTests {
  @Test
  public void today() {
    LocalDate today = LocalDate.now();
    log.info("今天：{}", today);
    int year = today.getYear();
    int monthValue = today.getMonthValue();
    int dayOfYear = today.getDayOfYear();
    int dayOfMonth = today.getDayOfMonth();
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    log.info("year:{}", year);
    log.info("month:{}", monthValue);
    log.info("dayOfYear:{}", dayOfYear);
    log.info("day:{}", dayOfMonth);
    log.info("day:{}", dayOfWeek.getValue());
    LocalDate of = LocalDate.of(2020, 8, 8);
    log.info("特定日期:{}", of);
  }

  @Test
  public void equalDate() {
    LocalDate now = LocalDate.now();
    LocalDate date = LocalDate.of(2020, 2, 21);
    if (date.equals(now)) {
      log.info("两个时间相等");
    } else {
      log.info("两个时间不相等");
    }
  }

  @Test
  public void checkBirth() {
    LocalDate now = LocalDate.now();
    LocalDate birth = LocalDate.of(1990, 8, 10);
    MonthDay monthDay = MonthDay.of(birth.getMonthValue(), birth.getDayOfMonth());
    MonthDay from = MonthDay.from(now);
    if (monthDay.equals(from)) {
      log.info("今天是你的生日");
    } else {
      log.info("今天不是你的生日");
    }
  }

  @Test
  public void now() {
    LocalDateTime now = LocalDateTime.now();
    log.info("当前时间:{}", now);
    LocalDateTime localDateTime = now.plusDays(3);
    LocalDateTime localDateTime2 = now.plusDays(-2);
    log.info("3天后:{}", localDateTime);
    log.info("2天前:{}", localDateTime2);
    LocalDateTime localDateTime1 = now.plusHours(10);
    log.info("10小时后:{}", localDateTime1);
  }

  @Test
  public void ofWeek() {
    LocalDateTime now = LocalDateTime.now();
    log.info("当前时间:{}", now);
    LocalDateTime newTime = now.plus(2, ChronoUnit.WEEKS);
    log.info("2周后:{}", newTime);
  }

  @Test
  public void moveDate() {
    LocalDate today = LocalDate.now();
    LocalDate lastYeay = today.minus(1, ChronoUnit.YEARS);
    LocalDate nextYeay = today.plus(1, ChronoUnit.YEARS);
    log.info("去年:{}", lastYeay);
    log.info("明年:{}", nextYeay);
  }

  @Test
  public void testClock() {
    Clock clock = Clock.systemUTC();
    long millis = clock.millis();
    log.info("millis:{}",millis);
    Clock clock1 = Clock.systemDefaultZone();
    ZoneId zone = clock1.getZone();
    long millis1 = clock1.millis();
    log.info("当前时间戳:{}",millis1);
    log.info("当前zone:{}",zone.toString());
  }
  @Test
  public void beforeOrAfterToday(){
    LocalDate today = LocalDate.now();
    LocalDate yesterday = LocalDate.of(2019, 9, 11);
    LocalDate tomorrow = LocalDate.of(2021, 9, 11);
    if (tomorrow.isAfter(today)){
      log.info("This is tomorrow");
    }
    if (yesterday.isBefore(today)){
      log.info("This is yesterday");
    }
  }
  @Test
  public void testYearMonth() {
    YearMonth currentYearMonth = YearMonth.now();
    log.info("Days in month year {}: {}", currentYearMonth, currentYearMonth.lengthOfMonth());
    YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
    log.info("Your credit card expires on {}", creditCardExpiry);
    System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
  }
  @Test
  public void testCheckLeapYear(){
    LocalDate now = LocalDate.now();
    if (now.isLeapYear()){
      log.info("{}是闰年",now.getYear());
    }else {
      log.info("今年不是闰年");
    }
  }

  @Test
  public void testDemo15(){
    LocalDate today = LocalDate.now();

    LocalDate java8Release = LocalDate.of(2018, 12, 14);

    Period periodToNextJavaRelease = Period.between(today, java8Release);
    System.out.println("days left between today and Java 8 release : "
            + periodToNextJavaRelease.getDays() );
    System.out.println("Months left between today and Java 8 release : "
            + periodToNextJavaRelease.getMonths() );

  }

  @Test
  public void testDemo16(){
    Instant now = Instant.now();
    log.info("时间戳:{}",now.toEpochMilli());
  }

  @Test
  public void testParseDate(){
    String parseDate = "20200102000909";
    LocalDateTime parse = LocalDateTime.parse(parseDate, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    log.info("{}",parse.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

    LocalDateTime date = LocalDateTime.now();

    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //日期转字符串
    String str = date.format(format1);

    System.out.println("日期转换为字符串:"+str);

    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //字符串转日期
    LocalDate date2 = LocalDate.parse(str,format2);
    System.out.println("日期类型:"+date2);
  }
}
