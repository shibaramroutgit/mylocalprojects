package javafaq.basicpro;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        int firstNum = 0;
        int secondNum = 1;
        int nextNum=0;
        for(int i=1;i<10;i++) {

            nextNum=firstNum+secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.println(firstNum);
        }
    }
}
