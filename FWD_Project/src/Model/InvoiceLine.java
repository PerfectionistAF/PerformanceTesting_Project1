package Model;

import java.util.Scanner;

public class InvoiceLine {
    //private int invoiceNum;
    //private String itemName;
    //private double itemPrice;
    //private int count;

    public static void main(String[] args) {
        int invoiceNum=getInvoiceNum();
        String itemName=getItemName();
        double itemPrice=getItemPrice();
        int count=getCount();

        printInvoiceLine(invoiceNum,itemName,itemPrice,count);

    }

    private static int getInvoiceNum(){
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }

    private static String getItemName(){
        Scanner sc= new Scanner(System.in);
        return sc.next();
    }

    private static double getItemPrice(){
        Scanner sc= new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int getCount(){
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }

    private static void printInvoiceLine(int invoiceNum,String itemName, double itemPrice, int count){
        System.out.print(invoiceNum +" "+itemName +" "+itemPrice+" "+count);
    }

    //invoice header data as follows: Invoice Number, Invoice Date, Customer Name
    //invoice lines as follows: Invoice Number, Item Name, Item Price, and Count
}
