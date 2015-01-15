package com.example.switchyard.sfamock.bre;

import org.apache.camel.builder.RouteBuilder;

public class DQServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://DQService")
		.log("Received message for 'DQService' : ${body}")
		.delay(6000)
		.log("Sending to OutboundQ after a short delay!")
		.to("switchyard://OutboundQRef")
		.end();
	}

}
