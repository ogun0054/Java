class Cat
{
    int cost;
    String name;
    int age;

    void disp()
    {
        System.out.println(cost);
        System.out.println(name);
        System.out.println(age);
    }
}

class Object 
{
    public static void main(String[] args)
    {

        // Fundamentals of OOPs



        Cat c = new Cat();
        c.disp();
        

        //System.out.print("*");
    }
}