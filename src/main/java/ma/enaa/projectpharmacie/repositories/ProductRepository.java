package ma.enaa.projectpharmacie.repositories;

import ma.enaa.projectpharmacie.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
