public class AllMethods {
    private String[] array;

    private int count;

    public AllMethods(int size){

        array = new String[size];

        count = 0;
    }

    public void add(String str) {
        if (count >= array.length) {
            return;
        }

        int pos = 0;
        while (pos < count && array[pos].length() < str.length()) {
            pos++;
        }

        for (int i = count; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = str;

        count++;
    }

    public String getMax() {
        if (count == 0) {
            return null;
        }

        return array[count - 1];
    }

    public double getAverageLength() {
        if (count == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i].length();
        }

        return (double) sum / count;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i] + " (длина: " + array[i].length() + ")");
        }
    }
}
