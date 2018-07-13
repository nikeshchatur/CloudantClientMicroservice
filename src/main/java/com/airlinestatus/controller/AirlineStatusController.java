package com.airlinestatus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airlinestatus.dao.AirlineStatusDAO;
import com.airlinestatus.model.AirlineStatus;




@RestController
@RequestMapping("/airline")
public class AirlineStatusController {
	
	@Autowired
	AirlineStatusDAO airlineStatusDAO;
	
	/* to save an employee*/
	@RequestMapping(value ="/airlinestatus",method = RequestMethod.POST,produces="application/json")
	public List<AirlineStatus> getAirlineStatus(@RequestBody  AirlineStatus airlinedetail) {
		System.out.println("getAirlineStatus---> airlinedetail --> "+airlinedetail.getFligthnum());
		return airlineStatusDAO.getFlightDetails(airlinedetail);
	}
	
	
	
	


	
	

}
