/**
 * 
 */
package com.sanya.springboot.SampleRest.controller;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.generated.NumberConversion;
import com.example.generated.NumberConversionSoapType;

/**
 * @author sanya_s
 *
 */
@RestController
public class NumberController {
	
	@GetMapping("/numbertowords/{number}")
	public String numberToWords(@PathVariable final int number){
		
		NumberConversion numbers = new NumberConversion();
		NumberConversionSoapType service = numbers.getPort(NumberConversionSoapType.class);
		System.out.println("The response is :"+service.numberToWords(BigInteger.valueOf(number)));
		return service.numberToWords(BigInteger.valueOf(number));
	}

}
