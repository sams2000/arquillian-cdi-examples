package org.arquillian.example;

import org.arquillian.example.ui.LoginScreenSeleniumTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BasketTest.class,
	GreeterTest.class,
	LoginScreenSeleniumTest.class})
public class TestAll {

}
