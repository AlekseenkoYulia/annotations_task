package task;

import java.lang.reflect.InvocationTargetException;

import static task.ValueAnnotationAnalyzer.analyze;

public class Foo {
    Foo() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        analyze(this);
    }
    @Value(c = MyClassGenerator.class)
    private MyClass field;

    public static void main(String[] args){
        try {
            Foo foo = new Foo();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
