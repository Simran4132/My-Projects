package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	@Before(order=1)
	private void precodition2() {
		lanchBrowser();
	System.out.println("Launch the browser ");

	}

	@Before(order=2)
	private void precodition1() {
		WindoMaximize();
		System.out.println("Max the window ");

	}

	@Before(order =3,value="@Sanity")
	private void precodition3() {
		System.out.println("percodition ");


	}
	@After(order =10,value="@Sanity")
	private void postcondition2() {
		System.out.println("Take screenshot");

	}
	@After
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("close the browser");
	}
}
