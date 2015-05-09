There are four container defined:
- <id>tomee-embedded</id>
- <id>arquillian-glassfish-embedded</id> : working fine
	Configurations for testing 1:
		- pom.xml, <id>arquillian-glassfish-embedded</id> including following <testResource> folders
			<testResource>
				<directory>src/test/resources-glassfish-embedded1</directory>
		- src/test/resources/arquillian.xml, enable following:
			<container qualifier="glassfish-embedded" default="true">
				<configuration>
					<property name="resourcesXml">
						src/test/resources-glassfish-embedded1/glassfish-resources.xml
					</property>
				</configuration>
			</container>

		- src/test/resources-glassfish-embedded1/test-persistence.xml (with build-in eclipselink provider)
		- src/test/resources-glassfish-embedded1/logging.properties (EclipseLink logging needs to be further configured by enabling the FINE level in the Java logging configuration file)
		- src/test/resources-glassfish-embedded1/glassfish-resources.xml (DataSource definition jdbc/arquillian)


	Configurations for testing 2:
		- pom.xml, <id>arquillian-glassfish-embedded</id> including following <testResource> folders
			<testResource>
				<directory>src/test/resources-glassfish-embedded2</directory>
		- src/test/resources/arquillian.xml, enable following:
			<container qualifier="glassfish-embedded" default="true">
				<configuration>
				</configuration>
			</container>

		- src/test/resources-glassfish-embedded2/test-persistence.xml (with build-in eclipselink provider)
		- src/test/resources-glassfish-embedded2/logging.properties (EclipseLink logging needs to be further configured by enabling the FINE level in the Java logging configuration file)


- <id>arquillian-glassfish-remote</id>
- <id>arquillian-jbossas-managed</id> : not working per test
	Configuration for testing:


- <id>arquillian-jbossas-remote</id>










Q/A:

If you see Game_.class is not vailable error, run following steps to resolve it:


We also need to configure Maven to run the JPA 2 annotation processor, which is done simply by adding the Hibernate JPA metamodel generator as a compile-only project dependency:

pom.xml
<!-- clip -->
<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-jpamodelgen</artifactId>
	<version>1.2.0.Final</version>
	<scope>provided</scope>
</dependency>
<!-- clip -->


Next, right click on the project and select Properties. Expand the Java Compiler node in the settings tree and select Annotation Processing. Change the following values:

Check the box "Enable project specific settings
Check the box “Enable annotation processing”
Set the “Generated source directory” to “target/generated-sources/annotations” (without quotes)
Click the Apply button and accept a full build
Uncheck the box “Enable annotation processing”
Click the Apply button and skip a full build
Check the box “Enable annotation processing”
Click the Apply button and accept a full build
You should now see Game_.java under the target/generated-sources/annotations directory, which should also be on the build path.