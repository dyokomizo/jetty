package org.bogus;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloPage extends WebPage {
	@Inject
	private HelloWorld world;

	public HelloPage() {
		super();
		add(new Label("message", world.getText()));
	}
}