import static CatUtils.*;

public class Main {
    public static void main(String[] args) {
        var cats = readFile();

        print(cats);

        writeFile(cats);
    }
}
