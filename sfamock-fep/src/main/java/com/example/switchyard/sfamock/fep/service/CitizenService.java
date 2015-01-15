package com.example.switchyard.sfamock.fep.service;

import javax.ws.rs.core.Response;

import com.example.switchyard.sfamock.fep.model.Citizen;

public interface CitizenService {
	
	public Citizen process(Citizen citizen);
	public String getCitizen(String id);

}
