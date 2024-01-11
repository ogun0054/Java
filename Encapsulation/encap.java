class Books
{
    private int pageNumber;


// Setter Method
    void setPageNumber(int num) 
    {
    //   (num >= 0) ? pageNumber = num : System.out.println("Give non negative value");
    //    pageNumber = num;
    if(num >= 0)
    {
        pageNumber = num;
    } else
    {
      System.out.println("Give non negative value");
    }
    }


// Getter Method
    int getPageNumber()
    {
        return pageNumber;
    }

    // int Pages()
    // {
    //  int totalPage = pageNumber + 7;
    //  return totalPage;
    // //  System.out.println(totalPage);
    // }
}

class Encapsulation
{
    public static void main(String[] args)
    {
        Books b = new Books();

        b.setPageNumber(-44);
        // b.pageNumber = 44;
        int pgNum = b.getPageNumber();
        
        System.out.println(pgNum);
    }
}