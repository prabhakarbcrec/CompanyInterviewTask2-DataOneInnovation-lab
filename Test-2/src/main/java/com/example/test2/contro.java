package com.example.test2;

import java.awt.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
@EnableJpaRepositories("com.example.test2")
@EntityScan("com.example.test2")
public class contro {
	@Autowired
    DataSource dataSource;
	 @Autowired
	 SystemRepository systemRepository;

	
		// TODO Auto-generated method stub
		
		 @GetMapping("/persons")
		    private java.util.List<product> getAllproduct() {
		        return ((contro) systemRepository).getAllproduct();
		    }

		    @GetMapping("/persons/{id}")
		    private SystemRepository getPerson(@PathVariable("id") int id) {
		        return ((SystemRepository) systemRepository);
		    }

		    @GetMapping("/product/{brand}")
		    private void groupProduct(@PathVariable("brand") String brand) {
		    	systemRepository.groupBybrand(brand);
		    }

		    @PostMapping("/productByPrice")
		    private int orderOfPrice(@RequestBody  product p) {
		    	systemRepository.sortedByPriceWithinPriductBrand(p);
				return 0;
		       
		    }
		
		
     
         
 
    }

		
	

