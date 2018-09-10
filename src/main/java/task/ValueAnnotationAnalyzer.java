package task;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ValueAnnotationAnalyzer {
    public static void analyze(Object o) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Field[] fields = o.getClass().getFields();
        for (Field f : fields) {
            Value v = f.getAnnotation(Value.class);
            if (v != null) {
                Object value =  v.c().getMethod("generate").invoke(v.c().newInstance());
                f.set(o, value);
            }
        }
    }
}
