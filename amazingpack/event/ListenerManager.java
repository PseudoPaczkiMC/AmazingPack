package amazingpack.event;

import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ListenerManager
{
    private static ListenerManager 12;
    private Map<Listener, List<Method>> listeners;
    
    private ListenerManager() {
        this.listeners = new HashMap<Listener, List<Method>>();
    }
    
    public void addListener(final Listener e) {
        if (!this.listeners.containsKey(e)) {
            final List<Method> tmp = new ArrayList<Method>();
            Method[] methods;
            for (int length = (methods = e.getClass().getMethods()).length, i = 0; i < length; ++i) {
                final Method m = methods[i];
                final Object b = m.getAnnotation(ListenerAnnotation.class);
                if (b != null && !tmp.contains(m)) {
                    tmp.add(m);
                }
            }
            this.listeners.put(e, tmp);
        }
    }
    
    public void removeListener(final Listener e) {
        this.listeners.remove(e);
    }
    
    public boolean call(final Event e) {
        final AtomicBoolean cancelled = new AtomicBoolean(false);
        this.listeners.forEach(ListenerManager::u);
        return cancelled.get();
    }
    
    public static ListenerManager t() {
        if (ListenerManager .12 == null) {
            ListenerManager .12 = new ListenerManager();
        }
        return ListenerManager .12;
    }
    
    private static void u(final Event event2, final AtomicBoolean atomicBoolean, final Listener el, final List m) {
        m.forEach(ListenerManager::v);
    }
    
    private static void v(final Event event3, final Listener listener, final AtomicBoolean atomicBoolean, final Method fm) {
        if (fm != null && fm.getParameterTypes()[0] != null && fm.getParameterTypes()[0].getSimpleName().equals(event3.getClass().getSimpleName())) {
            try {
                fm.invoke(listener, event3);
                atomicBoolean.set(event3.isCancelled());
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    
    static {
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\ud173\uccbd\ud139\ue75d\ud130\ucca8\ud132\ue751\ud13c\ucce6\ud134\ue75c\ud129\uccac", -333532230))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u1c3d\u019e\u1c53\u2a7c\u1c53\u0181\u1c1c\u2a35\u1c10\u019e\u1c53\u2a61\u1c1c\u01d1\u1c17\u2a70\u1c11\u0184\u1c14\u2a60\u1c19\u0194\u1c00\u2a6f\u1c4c", -914260329));
        }
        if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\uf74d\ueaa8\uf721\uc150\uf721\ueaa3\uf727\uc143\uf72e\ueab6\uf75a", 360355204))) {
            throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\ucf56\ud2f5\ucf38\uf917\ucf38\ud2ea\ucf77\uf95e\ucf7b\ud2f5\ucf38\uf90a\ucf77\ud2ba\ucf7c\uf91b\ucf7a\ud2ef\ucf7f\uf90b\ucf72\ud2ff\ucf6b\uf904\ucf27", -230969860));
        }
    }
}
