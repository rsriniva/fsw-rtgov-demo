package com.example.switchyard.sfamock.fep.model;

import org.apache.camel.builder.RouteBuilder;

public class CitizenServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://CitizenService")
		.log("Received msg for 'CitizenService' : ${body}")
		.to("switchyard://InboundQRef");
		}

}
