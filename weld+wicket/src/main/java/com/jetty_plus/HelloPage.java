package com.jetty_plus;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;


public class HelloPage extends WebPage {
    // Injects the instance using Weld
    @Inject private transient HelloWorld world;


    public HelloPage() {
        super();
        // Notice how we reference the injected bean in the constructor
        add(new Label("message", world.getText()));
    }
}