package amazingpack.event;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
public @interface ListenerAnnotation {
    boolean ignoreCanceled() default true;
}
