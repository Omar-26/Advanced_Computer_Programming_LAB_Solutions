// 2)
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i + " " + i * i);
        }
    }
}
// Output is i  i^2
