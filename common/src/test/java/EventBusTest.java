import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import ntools.common.util.ThreadUtils;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;

@Ignore("eventBus")
public class EventBusTest {
    @Test
    void testEventBus() {
        EventBus eventBus = new EventBus();

        eventBus.register(new EventListener());

        eventBus.post(1);
        eventBus.post(2);
        eventBus.post("3");
        eventBus.post(new Object());
    }

    @Test
    void testAsyncEventBus() {
        EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(10));

        eventBus.register(new EventListener());

        eventBus.post(1);
        eventBus.post(2);
        eventBus.post("3");
        eventBus.post(new Object());
        ThreadUtils.sleep(1000L);
    }
}
