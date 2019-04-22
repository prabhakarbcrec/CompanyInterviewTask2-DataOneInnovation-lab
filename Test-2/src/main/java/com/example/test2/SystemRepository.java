package com.example.test2;

import java.awt.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemRepository extends CrudRepository<product,Long>{

	
	
	void groupBybrand(String brand);



	void sortedByPriceWithinPriductBrand(product person);

	
}
