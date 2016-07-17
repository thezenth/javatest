public class HelloWorld {

    public static void main(String[] args) {
        Tester aTest = new Tester(22, 33, 44);
        System.out.println(aTest.giveANumber());
    }
}

class Tester {
    private int x;
    private int y;
    private int z;

    Tester(int xVal, int yVal, int zVal) {
        x = xVal;
        y = yVal;
        z = zVal;
        System.out.println("X:" + x);
        System.out.println("Y:" + y);
        System.out.println("Z:" + z);
    }

    public int giveANumber() {
        return x + y + z;
    }
}
