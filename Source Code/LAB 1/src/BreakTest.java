// 3)
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                break;
            System.out.println(i + " " + i * i);
        }
    }
}
// There will be No Output as 0 is divisible by 2 so the if condition
// is true for the first time which ill break the for loop
