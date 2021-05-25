// "static void main" must be defined in a public class.


class calc {
    public static int add(int num1, int num2)
    {
        return num1+num2;
    }
}

class calc2 extends calc {
    public static int sub (int num1, int num2)
    {
        return num1 - num2;
    }
}




public class inherit {
    public static void main(String[] args) {
        
        System.out.println("we used inheritance");
        calc2 ca = new calc2();
        int result = ca.add(11,54);
        System.out.println(result);
        
    }
}
