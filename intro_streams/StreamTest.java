public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> numStream = numeros.stream();

        int suma = numStream
            .filter(n -> n % 2 == 1) // {1, 3, 5}
            .map(n -> n * n) // {1, 9, 25}
            //.reduce(0, (n1, n2) -> n1 + n2);
            .reduce(0, Integer::sum); // 35

        System.out.println("La suma de los cuadrados de los números impares es: " + suma);
    }
}