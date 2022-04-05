package hu.predicatequery.predicatequery.repository;

import hu.predicatequery.predicatequery.model.InvoiceRow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRowRepository extends CrudRepository<InvoiceRow, Long> {
}
