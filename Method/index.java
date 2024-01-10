class Calculator
{
    int num1,num2, result;

    int add(int num1, int num2)
    {
        // num1 = 16;
        // num2 = 22;
        result = num1 + num2;
        return result;
        // System.out.println(result);
    }
}

class Method
{
    public static void main(String[] args)
    {
        // System.out.println("Test");
        Calculator c = new Calculator();
        // c.add(17,78);
        System.out.println(c.add(17,78));

    }
}