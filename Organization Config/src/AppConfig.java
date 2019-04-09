package com.capgemini.spring.organization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.organization.*;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

@Configuration
public class AppConfig{
	
	public Address getAddress(){
		Address address = new Address("502","Viduyuth nagar","Hyderabad","Telangana",500060);
		return address;
	}

	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("Lahari");
		directors.add("Mukhesh");
		directors.add("Nandini");
		directors.add("Karthik");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("Developing");
		branches.add("Testing");
		branches.add("Analysing");
		return branches;
	}

	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("Developing","John");
		branchWiseHead.put("Testing","Mary");
		branchWiseHead.put("Analysing","Alex");
		return branchWiseHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/ip.properties");
			ipAddress.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbconfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return databaseDetails;
	}

		

	@Bean("organization")
	public Organization organization(){
		Organization organization = new Organization();
		organization.setOrgId(101);
		organization.setOrgName("KLM");
		organization.setMarketPrice(34450);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}
	