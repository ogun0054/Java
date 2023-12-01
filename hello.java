class Hello 
{
    public static void main(String args[])
    {

        //byte b = 127;
        // int a = 12;
        // byte k = (byte) a;


        // System.out.println(b);
        // System.out.println(a);
        // float score = 6.6f;
        // byte by = 123;

        // System.out.println(3 + 5);
        // System.out.println(marks);
    // literals
        // int num1 = 0b101;
        // System.out.println(num1);
        // int num2 = 0x7E;
        // System.out.println(num2);
        // byte by = 124;
        // short sh = 556;
        // long l = 68456l;

        // float f = 5.8f;
        // double d = 5.8;
        // char c = 'k'; // literals
        // boolean b = true;

        //Operators in Java

        // int num = 7;
       // ++num;   // pre - increment
    //    num++;      // post-increment
        // 

        
        // System.out.println(num);

        // Operators in Java
        // int x = 6;
        // int y = 5;

        // boolean result = x < y;

        // System.out.println(result);

        //Logical  Operators & | ! 
        //Short circuit && || !!

        // int x = 6;
        // int y = 5;
        // int a = 8;
        // int b = 10;

        // boolean result = x > y && a < 10;
        // System.out.println(result);

        // Conditional Statement
        // int x = 3;
        // int y = 7;
        // int z = 9;

        // if( x > y && x > z)
        //      System.out.println("Hello");
        // else if(y > x && y > z)
        // System.out.println("Bye");

        //Ternary Operator
        // int n = 7;
        // int result = 0;

        // if(n%2 == 0)
        //   result = 10;
        // else
        //   result = 20;
        // result = n% 2 == 0 ? 10 : 20;

        // System.out.println(result);

        // Switch Statement

         int n = 1;

        switch (n) {
         case 1:
            System.out.println("Sunday");
            break;
         case 2:
            System.out.println("Monday");
            break;
         case 3:
            System.out.println("Tuesday");
            break;
         case 4:
            System.out.println("Wednesday");
            break;
         case 5:
            System.out.println("Thursday");
            break;
         case 6:
            System.out.println("Friday");
            break;
         case 7:
            System.out.println("Saturday");
            break;
        }

        // New Switch Syntax
        // String day = "Monday"

        // switch (day)
        // {
        //     case "Saturday", "Sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am")

        // }
        String day = "Monday";
        String result = "";

       switch (day)
        // {
        //     case "Saturday", "Sunday" -> result = "6am";
        //     case "Monday" -> result = "8am";
        //     default -> result = "7am";

        // }

        // Instead of arrow(->) we can use the keyword (yield)
        {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";

        }

        System.out.println(result);
        


//  int day = 4;
// switch (day) {
//   case 1:
//     System.out.println("Monday");
//     break;
//   case 2:
//     System.out.println("Tuesday");
//     break;
//   case 3:
//     System.out.println("Wednesday");
//     break;
//   case 4:
//     System.out.println("Thursday");
//     break;
//   case 5:
//     System.out.println("Friday");
//     break;
//   case 6:
//     System.out.println("Saturday");
//     break;
//   case 7:
//     System.out.println("Sunday");
//     break;
// }
        

        // int n = 1;
        // System.out.println("Sunday");
        // System.out.println("Monday");
        // System.out.println("Tuesday");
        // System.out.println("Wednesday");
        // System.out.println("Thursday");
        // System.out.println("Friday");
        // System.out.println("Saturday");


        








        
    }
}

 