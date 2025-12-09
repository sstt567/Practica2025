
public class Main {
    public static void main(String[] args) {
        String[] animals = {"monkey", "lion", "bear", "elephant", "kangaroo"};
        AllMethods arr = new AllMethods(10);

        for (int i = 0; i < animals.length; i++) {
            arr.add(animals[i]);
        }

        System.out.println("Массив в порядке возрастания длины:");
        arr.printAll();

        System.out.println("\nСамая длинная строка: " + arr.getMax());
        System.out.println("Средняя длина строк: " + arr.getAverageLength());
    }
}