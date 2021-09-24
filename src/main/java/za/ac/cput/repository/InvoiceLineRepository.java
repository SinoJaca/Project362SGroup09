package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.InvoiceLine;

@Repository
public interface InvoiceLineRepository extends JpaRepository<InvoiceLine, String>
{

}
