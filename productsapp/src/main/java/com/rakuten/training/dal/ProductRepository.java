package com.rakuten.training.dal;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.rakuten.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>
{
	public List<Product> findByPrice(float p);
	public List<Product> findByPriceLessThan(float p);
	public List<Product> findByName(String s);
	@Query("SELECT p FROM Product AS p WHERE p.qoh =: q")
	public List<Product> myComplexQuery(@Param("q") int i);
}
