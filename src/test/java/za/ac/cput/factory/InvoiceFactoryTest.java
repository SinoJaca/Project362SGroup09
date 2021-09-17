package za.ac.cput.factory;
/**
 * InvoiceFactoryTest.java
 * Test class which test the Invoice entity and factory class
 * Author: Siyanda Hlongwa (217091229)
 * Date: 14 September 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Invoice;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceFactoryTest {
    //Attributes
    private Invoice invoice;

    @BeforeEach
    void setUp()
    {
        invoice = new InvoiceFactory().createInvoice("1001", "14 June 2020", "217091229", "evt987", "R1000");
    }

    @Test
    void testCreateInvoiceLine(){

        System.out.println(invoice);
    }

}