package com.airlinestatus.dao;

import java.util.List;


import org.springframework.stereotype.Service;

import com.airlinestatus.common.Connect;
import com.airlinestatus.model.AirlineStatus;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.IndexField;
import com.cloudant.client.api.model.IndexField.SortOrder;
import com.google.gson.Gson;




@Service
public class AirlineStatusDAO {
	
	
	
	
	/*get an AirlineStatus by flightnum*/
	public List<AirlineStatus> getFlightDetails(AirlineStatus airlinedetail) {
		
		Database db = Connect.connect().database("airlinestatus", true);;
		
		db.createIndex("airlinedetails","airlinedetails","json",
				new IndexField[]{
                	new IndexField("fligthnum",SortOrder.asc),
                	new IndexField("origincity",SortOrder.asc),
                	//new IndexField("destcity",SortOrder.asc)
                }
		);
		Gson gson = new Gson();
		String jsonInString = gson.toJson(airlinedetail);
		System.out.println("jsonInString----->"+jsonInString);
		
	//	List<AirlineStatus> status = db.findByIndex("{\"fligthnum\" :\"1\",\"origincity\":\"Pune\"}", AirlineStatus.class);
		
		List<AirlineStatus> status = db.findByIndex(jsonInString, AirlineStatus.class);
		
		System.out.println("status----->"+status.size());
		//for (AirlineStatus airlineStatus : status) {
//			System.out.println("flightnum"+status.get(0).getFligthnum());
//			System.out.println("city"+status.get(0).getOrigincity());
//			System.out.println("city"+status.get(0).getDestcity());
		//}
		return status;
	}
	
	
	
	

}
