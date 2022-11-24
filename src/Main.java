public class Main {
    public static void main(String[] args) {
        int[] liczydlo = new int[]{2, 3, 7, 3, 3, 5, 2};
        int count = 0;
        for (int i = 0; i < liczydlo.length; i++) {
            if (liczydlo[i] == 3) {
                count++;
            }
        }
        System.out.println("Znaleziono "+count+ " trójki.");
    }
}