import java.util.Scanner;

/**
 * Created by ashoknath on 1/27/19.
 */
public class List
{
    double perm;
    double no;
    double curr;



   List()
    {
        perm=0;
        no=0;
        curr=0;

    }

    List (double perm, double no, double curr) {
        this.perm = perm;
        this.no = no;
        this.curr = curr;
    }

    public double calculation()
    {
         double calc =(perm*no*curr);
        return calc;

    }


    void display()
    {
        System.out.println("The magnetic Field is ::"+calculation());


    }

    public static void main(String[] args)
    {


        List list = new List();

        //list.List();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter permeability::");
        double perm=scanner.nextDouble();

        System.out.println("Enter no of turns per unit length::");
        double no=scanner.nextDouble();

        System.out.println("Enter current::");
        double curr=scanner.nextDouble();

        List list1= new List(perm,no,curr);

        list.display();
        list1.display();
    }
}
