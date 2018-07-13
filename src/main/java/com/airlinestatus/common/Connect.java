package com.airlinestatus.common;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

public  class Connect {
	
	private static CloudantClient cloudantClient = null;
	
	private String password = System.getenv().get("PASSWORD");
	

	public static CloudantClient connect() {		
		//CREATE CLOUDANT CLIENT
		cloudantClient =  new CloudantClient("130c80b1-f960-4b5e-a834-4680589af13b-bluemix", "130c80b1-f960-4b5e-a834-4680589af13b-bluemix", "9ed2e5561092b57335570cc1281a44649e4d1d91c2838d4b207872a68f007637");
		
		System.out.println("CONNECTION SUCCESSFUL - " + cloudantClient.getBaseUri());
		
		return cloudantClient;
	}
	
	
		

}
