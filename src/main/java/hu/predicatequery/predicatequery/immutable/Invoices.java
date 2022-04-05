package hu.predicatequery.predicatequery.immutable;

import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;

@Immutable
@Entity
@Subselect("select invoice_number as invoiceNumber from invoice_head")
@Data
public class Invoices {
    @Id
    private Long id;

    private String invoiceNumber;
}
