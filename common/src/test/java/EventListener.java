import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import ntools.common.util.ThreadUtils;

public class EventListener {

    /**
     * 监听 Integer 类型的消息
     */
    @Subscribe
    public void listenInteger(Integer param) {
        ThreadUtils.sleep(100L);
        System.out.println("EventListener#listenInteger ->" + param);
    }

    /**
     * 监听 String 类型的消息
     */
    @Subscribe
    public void listenString(String param) {
        System.out.println("EventListener#listenString ->" + param);
    }

    /**
     * 死信事件：接收没有订阅者的消息
     */
    @Subscribe
    public void listenerDeadEvent(DeadEvent deadEvent){
        System.out.println("EventListener#listenerDeadEvent ->" + deadEvent.getEvent());
    }
}
