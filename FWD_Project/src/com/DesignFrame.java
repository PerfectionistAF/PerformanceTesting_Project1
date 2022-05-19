package com;

import InvoiceHeader.InvoiceNumber;

import javax.swing.*;
import java.awt.*;

public class DesignFrame extends JFrame {                       //Design main frame for generator

    private JMenuBar MenuBar;                                   //Menu Bar
    private JMenu FileMenu;                                     //File
    private MenuItem LoadFileItem;                              //Load
    private MenuItem SaveFileItem;                              //Save

    public JPanel Left;                                         //LeftSide Panel
    public JPanel Right;                                        //RightSide Panel

    private JTable InvoicesTable;                               //Invoices Table
    private String[] headers={"No.", "Date", "Customer","Total"};
    private JTable InvoiceItemsTable;                           //Invoice Items Table
    private String[] columns={"No","Item Name","Item Price","Count","Item Total"};
    private JLabel InvoiceNumber;                               //Invoice Number Label(uneditable)
    private JLabel InvoiceDate;                                 //Invoice Date label(editable)
    private JLabel CustomerName;                                //Customer Name(editable)
    private JLabel InvoiceTotal;                                //Invoice Total (uneditable)

    private JTextField Date;                                    //Date editable field
    private JTextField Name;                                    //Name editable field

    private JButton CreateNewInvoice;                           //Create Button
    private JButton DeleteInvoice;                              //Delete Button
    private JButton SaveInvoice;                                //Save Button
    private JButton CancelInvoice;                              //Cancel Button

    public DesignFrame(){                                       //DesignFrame Constructor
        super("Sales Invoice Generator");
        setLayout(new GridLayout(1,2));               //Grid Layout in 2 cols and 1 row
        //setLayout(new FlowLayout());
        MenuBar=new JMenuBar();                                 //Create menu bar in frame
        LoadFileItem=new MenuItem("Load");                //Load in drop-down from File
        SaveFileItem=new MenuItem("Save");                //Save in drop-down from File
        FileMenu=new JMenu("File");                          //Menu "File"
        FileMenu.add(LoadFileItem);                            //"Load"
        FileMenu.add(SaveFileItem);                                                                                     //"Save"
        MenuBar.add(FileMenu);                                                                                          //File is added to menu bar

        setJMenuBar(MenuBar);                                                                                           //set menu bar to frame

        Left= new JPanel();
        add(Left);
        Left.setSize(400,600);

        InvoicesTable=new JTable();                              //Invoices Table instance
        Left.add(new JLabel("Invoices Table"));    //Add title to Invoices Table
        Left.add(new JScrollPane(InvoicesTable));       //Table continues the more data are added
        Left.add(InvoicesTable);                                     //Add it to first column of grid layout
        //InvoicesTable.setSize(400,600);             //Size of table

        Right= new JPanel();
        add(Right);
        Right.setSize(400,600);

        InvoiceNumber=new JLabel("Invoice Number");
        InvoiceNumber.setText(instanceof InvoiceHeader.InvoiceNumber);
        Right.add(InvoiceNumber);

        InvoiceDate=new JLabel("Invoice Date");
        Right.add(InvoiceDate);
        Date=new JTextField(15);
        Right.add(Date);
        CustomerName=new JLabel("Customer Name");
        Right.add(CustomerName);
        Name=new JTextField(50);
        Right.add(Name);
        InvoiceTotal=new JLabel("Invoice Total");
        Right.add(InvoiceTotal);
        InvoiceItemsTable=new JTable();
        Right.add(new JLabel("Invoice Items"));    //Add title to Invoices Table
        Right.add(new JScrollPane(InvoiceItemsTable));       //Table continues the more data are added
        Right.add(InvoiceItemsTable);                                     //Add it to first column of grid layout

        CreateNewInvoice=new JButton("Create");             //Create Button
        Left.add(CreateNewInvoice);
        DeleteInvoice= new JButton("Delete");                           //Delete Button
        Left.add(DeleteInvoice);

        SaveInvoice= new JButton("Save");                               //Save Button
        Right.add(SaveInvoice);
        CancelInvoice= new JButton("Cancel");                           //Cancel Button
        Right.add(CancelInvoice);

        setSize(800,600);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {

    }
}
