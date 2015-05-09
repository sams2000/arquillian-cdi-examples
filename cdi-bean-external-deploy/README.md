cdi-bean-external-deploy
========================

cdi-bean-external-deploy example to demo CDI with a JAR as dependency of a WAR. Classes in WAR can use @Inject to use bean definition in JAR.


How to run this project:

1. nav into folder : cdi-bean-external-deploy
2. run 'mvn clean install'
3. deploy cdi-ext.war from cdi-bean-external-deploy-war/target to AS@P(e.g enterprise-server-webprofile 1.4.4)
4. start AS@P, and access http://<hostname>:<port>/cdi-ext/testServlet