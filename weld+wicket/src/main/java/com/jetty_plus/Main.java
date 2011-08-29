package com.jetty_plus;

import java.net.URL;
import java.security.ProtectionDomain;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;


public class Main {
    public static void main(String[] args) throws Exception {
        final Server server = new Server(80);
        server.setHandler(new WebAppContext() {
            {
                final ProtectionDomain domain = Main.class.getProtectionDomain();
                final URL location = domain.getCodeSource().getLocation();
                setWar(location.toExternalForm());
                setDescriptor(location.toExternalForm() + "/WEB-INF/web.xml");
                setContextPath("/");
                setParentLoaderPriority(true);
            }
        });
        server.start();
        server.join();
    }
}
