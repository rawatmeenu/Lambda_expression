

public class P1 {

    public static void main(String args[])
    {

        PI1 meth = () ->  System.out.println("this is the first example");

        PI1 meth2 = () -> { System.out.println("second example");};

        PI2 meth3 = (input) -> {System.out.println(input);};

        PI2 meth4 = (input) -> { System.out.println(input.toLowerCase());};

        PI2 meth5 = (input) -> { System.out.println(input.toUpperCase());};

        PI3 sum = (a,b) -> {System.out.println(a+b);};

        PI3 calc = (a,b) -> {System.out.println(a*b);};

        PI4 calretun= (a,b) -> {return(a*b);};

        PI5 checkodd = (val) -> {if(val%2==0) return true; else return false;};

        meth.printhello();
        meth2.printhello();
        meth3.printstr("UTTRAKHAND");
        meth3.printstr("SRINAGAR");
        meth5.printstr("ooty");
        sum.calculate(3, 9);
        calc.calculate(5,5);
        System.out.println(calretun.calctworeturn(2,9));
        System.out.println(checkodd.isOdd(5));


    }
}
