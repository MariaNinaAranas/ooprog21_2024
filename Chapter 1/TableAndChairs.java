public class TableAndChairs {

    public static void printPattern() {
        String[] lines = {
            "X                      X",
            "X                      X",
            "X      XXXXXXXXXX      X",
            "XXXXX  X        X  XXXXX",
            "X   X  X        X  X   X",
            "X   X  X        X  X   X"
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}
