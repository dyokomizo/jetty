package org.bogus;

import org.apache.wicket.Page;
import org.jboss.weld.wicket.WeldApplication;

public class HelloApplication extends WeldApplication {
	@Override
	public Class<? extends Page> getHomePage() {
		return HelloPage.class;
	}
}