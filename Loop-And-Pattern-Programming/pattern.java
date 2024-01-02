class Pattern 
{
    public static void main(String[] args)
    {

        for(int i = 0; i < 5; i++)
        {
        //System.out.print("*");
        }

        //Nested loop
        // int n = 5;
        // for(int i = 0; i < n; i++)
        // {
        //   for(int j = 0; j < n; j++)
        //    {
        //       System.out.print("*");
        //    }
        // System.out.println(" *" + i);
        // }

        // Square shape
        int n = 5;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || i ==  n -1 || j == 0 || j == n - 1){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}