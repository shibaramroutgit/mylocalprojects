package j28pratice.j28p4;

public class SingleTonTest {

    private static final SingleTonTest st = new SingleTonTest();

    private SingleTonTest()
    {

    }

    public static SingleTonTest getobj()
    {

        return st;
    }

}
