package com.wikipedia;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class wikiPediaAutomate extends Browser {
	
	@Given("User will opens the browser")
	public void user_will_opens_the_browser() {
		Browser.Openchrome();  
		wikipedia.getUrl();
	}

	@Then("Student providing data in the text field")
	public void student_providing_data_in_the_text_field() { 
		wikipedia.data();
	}

	@Then("Student wants to scroll the webpage for reading information.")
	public void student_wants_to_scroll_the_webpage_for_reading_information() throws InterruptedException {
	    wikipedia.scroll();
	}

	@Then("Student exploring external links functionality.")
	public void student_exploring_external_links_functionality() {
	    wikipedia.external_links();
	}

	@Then("Student sending a mail to friend")
	public void student_sending_a_mail_to_friend() {
		wikipedia.TextField_data(); 
	}

	@Then("Student closes the browser.")
	public void student_closes_the_browser() {
	   wikipedia.close(); 
	}


}
