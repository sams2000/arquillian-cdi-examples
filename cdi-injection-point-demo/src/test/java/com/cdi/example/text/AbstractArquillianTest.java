package com.cdi.example.text;


import java.net.URISyntaxException;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp31.WebAppDescriptor;
import org.junit.Ignore;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
@Ignore
public class AbstractArquillianTest {
	@Deployment(testable = true)
	public static WebArchive createDeployment() {
		WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class)
				.version("3.0");

		WebArchive war = ShrinkWrap.create(WebArchive.class, "cdi-injection-point-demo.war")
				.setWebXML(new StringAsset(descriptor.exportAsString()))
				.addPackages(true, "com.cdi.example")
				.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
		System.out.println(war.toString(true));
		return war;
	}

	@ArquillianResource
	private URL serverUrl;

	public URL getServerUrl() {
		return serverUrl;
	}

	public String getServerUrlString() {
		try {
			return serverUrl.toURI().toString();
		} catch (URISyntaxException e) {
			System.out.println("Unable to decode URL for server");
			e.printStackTrace();
		}
		return null;
	}
}
