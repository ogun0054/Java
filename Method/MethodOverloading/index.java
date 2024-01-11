class Calculator
{
    int multiply(int a, int b)
    {
      return a * b;
    }


    

}

class Overloading
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int multiplyData = calc.multiply(3,7);
        System.out.println(multiplyData);
    }
}

