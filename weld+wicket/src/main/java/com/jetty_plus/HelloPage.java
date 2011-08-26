package com.jetty_plus;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloPage extends WebPage {
	@Inject
	private transient HelloWorld world;

	public HelloPage() {
		super();
		add(new Label("message", world.getText()));
	}
}