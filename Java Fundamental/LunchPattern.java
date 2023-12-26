class Lunch{
    public static void main(String args[]){
        System.out.println("Implementation");

        //Nested Loop
        int n = 5;
     for (int i = 0; i < 5; i++)
     {
       for(int j = 0; j < n ; j++)
       {
        if(1 == 0 || i == 4 || j == 0 || j == n )
        {
          System.out.println("*");
        }
        else{
        System.out.println(" ");
        }
       }
       
     }
    }
}