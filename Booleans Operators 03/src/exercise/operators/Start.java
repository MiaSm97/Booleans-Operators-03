package exercise.operators;

public class Start {
    public static void main(String[] args) {

        /*
           false ^ false ---> false
           !false ---> true
           true && true ---> true
           true || true ---> true
           !(!true) ---> true
           result: true
         */
       // System.out.println(!(!(!(false ^ false) || (true && true))));

        /*
           (3 * 2) <= 6 ---> true
           !true ---> false
           3 - 2 != 1 ---> false
           false && false ---> false
           result: false
         */
        int x = 3;
        int y = 2;
        System.out.println(!((x * y) <= 6) && (x - y != 1));

    }
}
   /* Try to solve on paper the following boolean algebra operations:

        [A]: !(!(!(false ^ false) || (true && true)))
        [B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1)
        Then compare your solutions with a Java program that tests the validity of your assumptions.*/