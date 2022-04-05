package hu.predicatequery.predicatequery.repository;

import hu.predicatequery.predicatequery.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
