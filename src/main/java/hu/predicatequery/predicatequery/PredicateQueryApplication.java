package hu.predicatequery.predicatequery;

import hu.predicatequery.predicatequery.model.Customer;
import hu.predicatequery.predicatequery.model.InvoiceHead;
import hu.predicatequery.predicatequery.model.InvoiceRow;
import hu.predicatequery.predicatequery.model.Product;
import hu.predicatequery.predicatequery.repository.CustomerRepository;
import hu.predicatequery.predicatequery.repository.InvoiceHeadRepository;
import hu.predicatequery.predicatequery.repository.InvoiceRowRepository;
import hu.predicatequery.predicatequery.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class PredicateQueryApplication implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	private final ProductRepository productRepository;
	private final InvoiceHeadRepository invoiceHeadRepository;
	private final InvoiceRowRepository invoiceRowRepository;

	public static void main(String[] args) {
		SpringApplication.run(PredicateQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Start ...");

		Customer customer1 = customerRepository.save(Customer.builder().id(1l).name("Customer01").build());
		Customer customer2 = customerRepository.save(Customer.builder().id(2l).name("Customer02").build());
		Customer customer3 = customerRepository.save(Customer.builder().id(3l).name("Customer03").build());

		Product product1 = productRepository.save(Product.builder().id(1l).name("Product01").price(10.5f).build());
		Product product2 = productRepository.save(Product.builder().id(2l).name("Product02").price(5.5f).build());
		Product product3 = productRepository.save(Product.builder().id(3l).name("Product03").price(25.2f).build());

		InvoiceHead invoiceHead1 = invoiceHeadRepository.save(InvoiceHead.builder().id(1l).invoiceNumber("I01").customer(customer1).build());
		InvoiceHead invoiceHead2 = invoiceHeadRepository.save(InvoiceHead.builder().id(2l).invoiceNumber("I02").customer(customer2).build());
		InvoiceHead invoiceHead3 = invoiceHeadRepository.save(InvoiceHead.builder().id(3l).invoiceNumber("I03").customer(customer3).build());

		invoiceRowRepository.save(InvoiceRow.builder().id(1l).product(product1).invoiceHead(invoiceHead1).build());
		invoiceRowRepository.save(InvoiceRow.builder().id(2l).product(product2).invoiceHead(invoiceHead1).build());
		invoiceRowRepository.save(InvoiceRow.builder().id(3l).product(product1).invoiceHead(invoiceHead2).build());
		invoiceRowRepository.save(InvoiceRow.builder().id(4l).product(product2).invoiceHead(invoiceHead3).build());

	}
}
