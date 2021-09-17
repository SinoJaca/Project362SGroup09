package za.ac.cput.factory;
/**
 * InvoiceLineFactoryTest.java
 * Test class which test the InvoiceLine entity and factory class
 * Author: Siyanda Hlongwa (217091229)
 * Date: 14 September 2021
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.InvoiceLine;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineFactoryTest {

    //Attributes
    private InvoiceLine invoiceLine;

    @BeforeEach
    void setUp()
    {
        invoiceLine = new InvoiceLineFactory().createInvoice("123", "1001", "fd654", "bv456", "2", "8", "R56.00");
    }

    @Test
    void testCreateInvoiceLine(){
        System.out.println(invoiceLine);
    }
}