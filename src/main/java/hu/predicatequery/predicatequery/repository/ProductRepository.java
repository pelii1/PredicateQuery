package hu.predicatequery.predicatequery.repository;

import hu.predicatequery.predicatequery.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
