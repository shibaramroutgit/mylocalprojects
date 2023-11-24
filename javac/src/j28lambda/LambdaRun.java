package j28lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaRun {
    public static void main(String[] args)
    {
        //Example1
        InterfaceEX1 ex1 = ()-> {
            System.out.println("Hello Lambda");
        };
        ex1.function1();

        //Example2
        InterfaceEX2 ex2 = (int a, int b)->{
        int c = a+b;
        System.out.println(c);
        };
        ex2.function2(10,30);

        //Example3
        InterfaceEX3<String> ex3 = (String a, String b)->{
            String c = a+b;
            System.out.println(c);
        };
        ex3.function3("Shibaram-","Rout-");
        InterfaceEX3<Integer> ex31 = (Integer a, Integer b)->{
          Integer c = a+b;
            System.out.println(c);
        };
        ex31.function3(100,300);

        //Example4
        InterfaceEX4<String> ex4 = (String s1, String s2, String s3)->{
            System.out.println("Now Function Returning value");
            return s1+s2+s3;
        };
        String name = ex4.function4("Shibaram-","Rout-","BLR-");
        System.out.println(name);

        //Example5
        List<StudentT> st = new ArrayList<StudentT>();
        st.add(new StudentT(30,"Shibara"));
        st.add(new StudentT(40,"Sanjay"));
        st.add(new StudentT(20,"Arabinda"));
        st.add(new StudentT(50,"Prafulla"));
        st.add(new StudentT(10,"Subash"));

        InterfaceEX5<StudentT> ex5 = (List<StudentT> pst)->{
            for (StudentT st1:pst) {
                System.out.println(st1.toString());
            }

        };
        ex5.function5(st);











    }
}
