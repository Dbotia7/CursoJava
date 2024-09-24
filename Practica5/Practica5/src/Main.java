@FunctionalInterface
interface Interfaz1 {
    void metodo(int a, String b, float c);
}

// 2. Interfaz 2: Entrada (A a, B b, C c) -> Salida D
@FunctionalInterface
interface Interfaz2<A, B, C, D> {
    D metodo(A a, B b, C c);
}

// 3. Interfaz 3: Entrada (String a, String b) -> Salida String
@FunctionalInterface
interface Interfaz3 {
    String metodo(String a, String b);
}

// 4. Interfaz 4: Sin entrada -> Salida void
@FunctionalInterface
interface Interfaz4 {
    void metodo();
}

// 5. Interfaz 5: Entrada (int a, int b) -> Salida Long
@FunctionalInterface
interface Interfaz5 {
    Long metodo(int a, int b);
}

// 6. Interfaz 6: Entrada (Integer a, Long b) -> Salida Number
@FunctionalInterface
interface Interfaz6 {
    Number metodo(Integer a, Long b);
}

// 7. Interfaz 7: Entrada (String a, StringBuilder b) -> Salida CharSequence
@FunctionalInterface
interface Interfaz7 {
    CharSequence metodo(String a, StringBuilder b);
}

// 8. Interfaz 8: Sin entrada -> Salida Object
@FunctionalInterface
interface Interfaz8 {
    Object metodo();
}

// 9. Interfaz 9: Entrada (Object a, Object b) -> Salida String
@FunctionalInterface
interface Interfaz9 {
    String metodo(Object a, Object b);
}

// 10. Interfaz 10: Entrada (int a, char b, float c) -> Salida String
@FunctionalInterface
interface Interfaz10 {
    String metodo(int a, char b, float c);
}

public class Main {

    public static void main(String[] args) {
        // 1. Uso de Interfaz1 (int a, String b, float c) -> void
        Interfaz1 i1 = (a, b, c) -> System.out.println("Valores: " + a + ", " + b + ", " + c);
        i1.metodo(5, "Hola", 3.14f);

        // 2. Uso de Interfaz2 (A a, B b, C c) -> D
        Interfaz2<Integer, Double, String, Boolean> i2 = (a, b, c) -> a > 0 && b > 0 && c.length() > 0;
        System.out.println(i2.metodo(10, 20.5, "Lambda"));

        // 3. Uso de Interfaz3 (String a, String b) -> String
        Interfaz3 i3 = (a, b) -> a.concat(b);
        System.out.println(i3.metodo("Hola ", "Mundo"));

        // 4. Uso de Interfaz4 () -> void
        Interfaz4 i4 = () -> System.out.println("No hay entrada, solo salida");
        i4.metodo();

        // 5. Uso de Interfaz5 (int a, int b) -> Long
        Interfaz5 i5 = (a, b) -> (long) (a + b);
        System.out.println(i5.metodo(10, 20));

        // 6. Uso de Interfaz6 (Integer a, Long b) -> Number
        Interfaz6 i6 = (a, b) -> a + b;
        System.out.println(i6.metodo(100, 200L));

        // 7. Uso de Interfaz7 (String a, StringBuilder b) -> CharSequence
        Interfaz7 i7 = (a, b) -> a + b.toString();
        System.out.println(i7.metodo("Hola", new StringBuilder(" Mundo")));

        // 8. Uso de Interfaz8 () -> Object
        Interfaz8 i8 = () -> new Object();
        System.out.println(i8.metodo());

        // 9. Uso de Interfaz9 (Object a, Object b) -> String
        Interfaz9 i9 = (a, b) -> a.toString() + " y " + b.toString();
        System.out.println(i9.metodo("Objeto1", "Objeto2"));

        // 10. Uso de Interfaz10 (int a, char b, float c) -> String
        Interfaz10 i10 = (a, b, c) -> "Valores: " + a + ", " + b + ", " + c;
        System.out.println(i10.metodo(1, 'A', 2.5f));
    }
}