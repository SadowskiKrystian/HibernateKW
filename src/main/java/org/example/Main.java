package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            CustomerDao customerDao = new CustomerDao();
        for (Customer customer : customerDao.findAll()) {
            System.out.println(customer + " - " + customer.getAddress());
        }
        InvoiceDao invoiceDao = new InvoiceDao();
        for (Invoice invoice : invoiceDao.findAll()) {
            System.out.println(invoice + " - " + invoice.getItems());
        }


    }
}