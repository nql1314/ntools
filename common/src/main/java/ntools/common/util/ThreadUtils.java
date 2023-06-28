package ntools.common.util;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.concurrent.TimeUnit;

@UtilityClass
@Slf4j
public class ThreadUtils {

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.warn(ExceptionUtils.getMessage(e));
        }
    }

    public void sleep(long timeout, TimeUnit unit) {
        sleep(unit.toMillis(timeout));
    }
}