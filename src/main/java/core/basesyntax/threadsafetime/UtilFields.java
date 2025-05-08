package core.basesyntax.threadsafetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Date;

public class UtilFields {

    ThreadSaveSDF[] sdf = new ThreadSaveSDF[] {
            new ThreadSaveSDF("yyyy-MM-dd[ HH:mm:ss[.SSS]]"),
            new ThreadSaveSDF("yyyy.MM.dd[ HH:mm:ss[.SSS]]"),
            new ThreadSaveSDF("yyyy/MM/dd[ HH:mm:ss[.SSS]]"),
            new ThreadSaveSDF("yyyyMMddHHmmss"),
            new ThreadSaveSDF("yyyyMMdd"),
            new ThreadSaveSDF("ddMMyyyy"),
            new ThreadSaveSDF("dd-MM-yyyy"),
            new ThreadSaveSDF("dd.MM.yyyy"),
            new ThreadSaveSDF("dd/MM/yyyy"),
    };

    public Date dateConverter(String d) throws DateTimeParseException {
        DateTimeParseException ex = null;
        for (ThreadSaveSDF tssdf: sdf) {
            try {
                LocalDateTime dateTime = LocalDateTime.parse(d, tssdf.get());
                return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
            } catch (DateTimeParseException pex) {
                ex = pex;
            }
        }
        if (ex == null) {
            throw new RuntimeException(d + "has unknown format of date");
        }
        throw ex;
    }

    private static class ThreadSaveSDF extends ThreadLocal<DateTimeFormatter> {
        private String format;

        public ThreadSaveSDF(String format) {
            this.format = format;
        }

        protected DateTimeFormatter initialValue() {
            DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder().appendPattern(format)
                    .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
                    .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
                    .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
                    .parseDefaulting(ChronoField.NANO_OF_SECOND, 0);
            return builder.toFormatter();
        }
    }
}
