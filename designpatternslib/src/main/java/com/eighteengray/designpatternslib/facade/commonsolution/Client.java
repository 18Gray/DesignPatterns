package com.eighteengray.designpatternslib.facade.commonsolution;

public class Client
{
	public static void main(String[] args)
	{

		new Presentation().generate();

		new Business().generate();

		new DAO().generate();
	}
}