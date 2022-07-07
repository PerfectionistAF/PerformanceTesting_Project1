package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceHeader {
    //private int invoiceNum;
    //private String invoiceDate;
    //private String customerName;
    private ArrayList<InvoiceLine> invoiceLines;

    public static void main(String[] args) {
        int invoiceNum=getInvoiceNum();
        String invoiceDate=getInvoiceDate();
        String customerName=getCustomerName();

        printInvoiceHeader(invoiceNum,invoiceDate,customerName);

    }

    private static int getInvoiceNum(){
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }

    private static String getInvoiceDate(){
        Scanner sc= new Scanner(System.in);
        return sc.next();
    }

    private static String getCustomerName(){
        Scanner sc= new Scanner(System.in);
        return sc.next();
    }

    private static void printInvoiceHeader(int invoiceNum, String invoiceDate, String customerName){
        System.out.print(invoiceNum +" "+invoiceDate+" "+customerName);
    }

    private static void printArrayList(ArrayList<InvoiceLine> invoiceLines){

    }



    //invoice header data as follows: Invoice Number, Invoice Date, Customer Name
    //invoice lines as follows: Invoice Number, Item Name, Item Price, and Count
}
