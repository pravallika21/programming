import java.io.*;
class Invoice
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String part_num;
    String part_des;
    int num_of_items;
    double price_of_items;
    double amount;

    Invoice()
    {
        part_num="1";
        part_des="hdd";
        num_of_items=0;
        price_of_items=1000;

    }

    public String get_part_num()throws IOException
    {
        System.out.println("Enter part number");
        part_num=br.readLine();
        return part_num;
    }
     public String get_part_des()throws IOException
    {
        System.out.println("Enter part description ");
        part_des=br.readLine();
        return part_des;
    }
    public int get_num_of_items()throws IOException
    {
        System.out.println("Enter number of items ");
        num_of_items=Integer.parseInt(br.readLine());
        return num_of_items;
    }
     public double get_price_of_items()throws IOException
    {
        System.out.println("Enter price of items");
        price_of_items=Double.parseDouble(br.readLine());
        return price_of_items;
    }
    public String set_part_num(String num)
    {
        part_num=num;
        return part_num;
    }
     public String set_part_des(String des)
    {
        part_des=des;
        return part_des;
    }
    public int set_num_of_items(int numitem)
    {
        num_of_items=numitem;
        return num_of_items;
    }
     public double set_price_of_items(double price )
    {
        price_of_items=price;
        return price_of_items;
    }
    public double Invoice_amount()
    {
        amount = price_of_items*num_of_items;
        //System.out.printf("\n Amount \n"+amount);
        amount = (amount>0)?amount:0;
        return amount;
    }
    public void displayInfo()
        {
            System.out.printf("part number\t"+part_num+"\tpart description\t"+part_des+"\tnum_of_items\t"+num_of_items+"\tprice_of_items\t"+price_of_items);
            System.out.printf("\n Amount \t"+amount);
            System.out.println();
        }
}
public class Main
{
    public static void main(String [] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Invoice inv1 = new Invoice();
        Invoice inv2 = new Invoice();

        inv1.get_part_num();
        inv1.get_part_des();
        inv1.get_num_of_items();
        inv1.get_price_of_items();
        inv1.Invoice_amount();
        inv1.displayInfo();

        inv2.set_part_num("1");
        inv2.set_part_des("chip");
        inv2.set_num_of_items(12);
        inv2.set_price_of_items(12);
        inv2.Invoice_amount();
        inv2.displayInfo();




    }
}
