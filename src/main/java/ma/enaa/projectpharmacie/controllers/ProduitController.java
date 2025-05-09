package ma.enaa.projectpharmacie.controllers;

import ma.enaa.projectpharmacie.entities.Product;
import ma.enaa.projectpharmacie.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {
    private final ProductRepository productRepository;
    public ProduitController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public Product ajouterProduit(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/product")
    public List<Product> getProduits() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduitById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @DeleteMapping("/product/{id}")
    public void supprimerProduit(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
    @PutMapping("/product")
    public Product modifierProduit(@RequestBody Product product) {
        return productRepository.save(product);
    }

}
