package com.eighteengray.designpatternslib.facade.patternsolution_expand;

public class Client {
	public static void main(String[] args) {
		FacadeApi api = FacadeFactory.createFacadeApi();
		
		api.generate();
	}
	
	
}