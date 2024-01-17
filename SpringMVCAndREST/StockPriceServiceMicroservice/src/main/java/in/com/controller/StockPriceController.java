package in.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.com.stockprice.service.StockPriceImpl;

@RestController
@RequestMapping(value = "/stock")
public class StockPriceController {

	@Autowired
	public StockPriceImpl impl ;
	
	@Autowired
	public Environment environment;
	 
	@GetMapping(value = "/price/{id}") 
	public ResponseEntity<Double> getStockPrice(@PathVariable(value = "id") Integer id) {
	System.out.println(environment.getProperty("local.server.port"));
	Double d = impl.findByCompanyId (id); 
	return  new ResponseEntity<>(d,HttpStatus.OK);  
	}
}