public class HelloWorld {

    public static void main(String[] args) {
        Tester aTest = new Tester(22, 33, 44);
        Debug.dbg(aTest.giveANumber() + "");
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
        Debug.dbg("X:" + x);
        Debug.dbg("Y:" + y);
        Debug.dbg("Z:" + z);
    }

    public int giveANumber() {
        return x + y + z;
    }
}
