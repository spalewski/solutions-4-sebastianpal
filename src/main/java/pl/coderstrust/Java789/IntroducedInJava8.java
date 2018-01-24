package pl.coderstrust.Java789;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IntroducedInJava8 {

    //////////////////////////////////////////////////////////////////
    // default and static methods in Interfaces
    @FunctionalInterface
    interface Interface1 {

        void method1(String str);

        default void log(String str) {
            System.out.println("I1 logging::" + str);
        }

        static void print(String str) {
            System.out.println("Printing " + str);
        }
    }

    @FunctionalInterface
    interface Interface2 {

        void method2();

        default void log(String str) {
            System.out.println("I2 logging::" + str);
        }

    }

    class InterfacesDfltAndLambda implements Interface1, Interface2 {

        @Override
        public void method2() {
        }

        @Override
        public void method1(String str) {
        }

        @Override
        public void log(String str) {
            System.out.println("MyClass logging::" + str);
            Interface1.print("abc");
        }


    }


    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////
        // DateAPILegacySupport
        //Date to Instant
        Instant timestamp = new Date().toInstant();
        //Now we can convert Instant to LocalDateTime or other similar classes
        LocalDateTime date = LocalDateTime.ofInstant(timestamp,
                ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println("Date = " + date);

        //Calendar to Instant
        Instant time = Calendar.getInstance().toInstant();
        System.out.println(time);
        //TimeZone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);

        //ZonedDateTime from specific Calendar
        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
        System.out.println(gregorianCalendarDateTime);

        //Date API to Legacy classes
        Date dt = Date.from(Instant.now());
        System.out.println(dt);

        TimeZone tz = TimeZone.getTimeZone(defaultZone);
        System.out.println(tz);

        GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);
        System.out.println(gc);

        // DateParseFormatExample
        //Format examples
        LocalDate date1 = LocalDate.now();
        //default format
        System.out.println("Default format of LocalDate=" + date);
        //specific format
        System.out.println(date1.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date1.format(DateTimeFormatter.BASIC_ISO_DATE));


        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime=" + dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp1 = Instant.now();
        //default format
        System.out.println("Default format of Instant=" + timestamp1);

        // DateAPIUtilities

        LocalDate today = LocalDate.now();

        //Get the Year, check if it's leap year
        System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

        //Compare two LocalDate for before and after
        System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

        //Create LocalDateTime from LocalDate
        System.out.println("Current Time=" + today.atTime(LocalTime.now()));

        //plus and minus operations
        System.out.println("10 days after today will be " + today.plusDays(10));
        System.out.println("3 weeks after today will be " + today.plusWeeks(3));
        System.out.println("20 months after today will be " + today.plusMonths(20));

        System.out.println("10 days before today will be " + today.minusDays(10));
        System.out.println("3 weeks before today will be " + today.minusWeeks(3));
        System.out.println("20 months before today will be " + today.minusMonths(20));

        //Temporal adjusters for adjusting the dates
        System.out.println("First date of this month= " + today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format= " + period);
        System.out.println("Months remaining in the year= " + period.getMonths());

        // InstantExample

        //Current timestamp
        Instant timestamp2 = Instant.now();
        System.out.println("Current Timestamp = " + timestamp2);

        //Instant from timestamp
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Specific Time = " + specificTime);

        //Duration example
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);


        // LocalDateTimeExample

        //Current Date
        LocalDateTime today3 = LocalDateTime.now();
        System.out.println("Current DateTime=" + today3);

        //Current Date using LocalDate and LocalTime
        today3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime=" + today3);

        //Creating LocalDateTime by providing input arguments
        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date=" + specificDate);


        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST=" + todayKolkata);

        //Getting date from the base date i.e 01/01/1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970= " + dateFromBase);

        /////////////////////////////
        /// for each example

        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }

        });
        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        ///////////////////////////////////////
        //Lambda Expressions

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable");
            }
        };
        Runnable r1 = () -> {
            System.out.println("My Runnable");
        };
        IntroducedInJava8.Interface1 i1 = (s) -> System.out.println(s);

        i1.log("abc");

///////////////////////////////////////
        //Java Stream API for Bulk Data Operations on Collections

        List<Integer> myList3 = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList3.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList3.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList3.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));


        //////////////////////////////////////////////////////////////
        /////////// STRING JOINER

        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Prints nothing because it is empty
        System.out.println(joinNames);

        // We can set default empty value.
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);


        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        System.out.println(joinNames);

        // Returns length of StringJoiner
        int length = joinNames.length();
        System.out.println("Length: "+length);

        // Returns StringJoiner as String type
        String str = joinNames.toString();
        System.out.println(str);

        // Now, we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);

        // Adding one more element
        joinNames.add("Sorabh");
        System.out.println(joinNames);

        // Returns length
        int newLength = joinNames.length();
        System.out.println("New Length: "+newLength);


        ////////////////////////////////////////////////////
        /////// CLASS OPTIONAL

        String[] str1 = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str1[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str1[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");

    }


    ////////////////////////////
    //Consumer implementation that can be reused
    static class MyConsumer implements Consumer<Integer> {

        public void accept(Integer t) {
            System.out.println("Consumer impl Value::" + t);
        }
    }
}



