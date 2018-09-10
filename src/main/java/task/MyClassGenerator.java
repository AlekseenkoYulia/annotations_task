package task;

public class MyClassGenerator implements Generator<MyClass> {
    public MyClass generate() {
        return new MyClass();
    }
}
