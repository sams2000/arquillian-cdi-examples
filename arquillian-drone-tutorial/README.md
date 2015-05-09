========= How to run this project ==========
There are four profiles defined
- <id>arquillian-weld-ee-embedded</id> : NOT working
- <id>arquillian-glassfish-embedded</id>  : Verified to work fine
- <id>arquillian-jbossas-managed</id> : NOT working for <property name="jbossHome">target/serverdozer144</property> (arquillian.xml)
										NOT working for <property name="jbossHome">target/jboss-as-7.1.1.Final</property> (arquillian.xml)
- <id>arquillian-jbossas-remote</id> :  NOT working


run TestAll.java as junit and get all testing cases passed with following output:




13:16:49.396 INFO - Java: Oracle Corporation 25.20-b23
13:16:49.397 INFO - OS: Mac OS X 10.9.5 x86_64
13:16:49.399 INFO - v2.20.0, with Core v2.20.0. Built from revision 16008
13:16:49.474 INFO - RemoteWebDriver instances should connect to: http://127.0.0.1:14444/wd/hub
13:16:49.475 INFO - Version Jetty/5.1.x
13:16:49.476 INFO - Started HttpContext[/selenium-server,/selenium-server]
13:16:49.491 INFO - Started org.openqa.jetty.jetty.servlet.ServletHandler@292b08d6
13:16:49.491 INFO - Started HttpContext[/wd,/wd]
13:16:49.491 INFO - Started HttpContext[/selenium-server/driver,/selenium-server/driver]
13:16:49.491 INFO - Started HttpContext[/,/]
13:16:49.493 INFO - Started SocketListener on 0.0.0.0:14444
13:16:49.494 INFO - Started org.openqa.jetty.jetty.Server@647fd8ce
13:16:49.500 WARN - Configuration contain properties not supported by the backing object org.jboss.arquillian.container.glassfish.embedded_3_1.GlassFishConfiguration
Unused property entries: {outputToConsole=true, javaVmArguments=-Xmx512m -XX:MaxPermSize=128m -Xverify:none -XX:+UseFastAccessorMethods, jbossHome=target/serverplus114}
Supported property names: [instanceRoot, bindHttpPort, sunResourcesXml, resourcesXml, configurationXml, configurationReadOnly, installRoot]
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/Users/bzhou3/.m2/repository/org/slf4j/slf4j-simple/1.6.4/slf4j-simple-1.6.4.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/Users/bzhou3/.m2/repository/org/glassfish/main/extras/glassfish-embedded-all/3.1.2/glassfish-embedded-all-3.1.2.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
1 [main] INFO org.hibernate.validator.util.Version - Hibernate Validator 4.2.0.Final
13:16:50.249 ERROR - SEC5054: Certificate has expired: [
[
Version: V3
Subject: CN=GTE CyberTrust Root 5, OU="GTE CyberTrust Solutions, Inc.", O=GTE Corporation, C=US
Signature Algorithm: SHA1withRSA, OID = 1.2.840.113549.1.1.5

Key:  Sun RSA public key, 2048 bits
modulus: 23741889829347261660812437366387754385443431973861114865490414153884050331745811968523116847625570146592736935209718565296053386842135985534863157983128812774162998053673746470782252407673402238146869994438729551246768368782318393878374421033907597162218758024581735139682087126982809511479059100617027892880227587855877479432885604404402435662802390484099065871430585284534529627347717530352189612077130606642676951640071336717026459037542552927905851171460589361570392199748753414855675665635003335769915908187224347232807336022456537328962095005323382940080676931822787496212635993279098588863972868266229522169377
public exponent: 65537
Validity: [From: Fri Aug 14 07:50:00 PDT 1998,
			To: Wed Aug 14 16:59:00 PDT 2013]
Issuer: CN=GTE CyberTrust Root 5, OU="GTE CyberTrust Solutions, Inc.", O=GTE Corporation, C=US
SerialNumber: [    01b6]

Certificate Extensions: 4
[1]: ObjectId: 2.5.29.19 Criticality=true
BasicConstraints:[
CA:true
PathLen:5
]

[2]: ObjectId: 2.5.29.32 Criticality=false
CertificatePolicies [
[CertificatePolicyId: [1.2.840.113763.1.2.1.3]
[]  ]
]

[3]: ObjectId: 2.5.29.15 Criticality=true
KeyUsage [
Key_CertSign
Crl_Sign
]

[4]: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: 76 0A 49 21 38 4C 9F DE   F8 C4 49 C7 71 71 91 9D  v.I!8L....I.qq..
]
]

]
Algorithm: [SHA1withRSA]
Signature:
0000: 41 3A D4 18 5B DA B8 DE   21 1C E1 8E 09 E5 F1 68  A:..[...!......h
0010: 34 FF DE 96 F4 07 F5 A7   3C F3 AC 4A B1 9B FA 92  4.......<..J....
0020: FA 9B ED E6 32 21 AA 4A   76 C5 DC 4F 38 E5 DF D5  ....2!.Jv..O8...
0030: 86 E4 D5 C8 76 7D 98 D7   B1 CD 8F 4D B5 91 23 6C  ....v......M..#l
0040: 8B 8A EB EA 7C EF 14 94   C4 C6 F0 1F 4A 2D 32 71  ............J-2q
0050: 63 2B 63 91 26 02 09 B6   80 1D ED E2 CC B8 7F DB  c+c.&...........
0060: 87 63 C8 E1 D0 6C 26 B1   35 1D 40 66 10 1B CD 95  .c...l&.5.@f....
0070: 54 18 33 61 EC 13 4F DA   13 F7 99 AF 3E D0 CF 8E  T.3a..O.....>...
0080: A6 72 A2 B3 C3 05 9A C9   27 7D 92 CC 7E 52 8D B3  .r......'....R..
0090: AB 70 6D 9E 89 9F 4D EB   1A 75 C2 98 AA D5 02 16  .pm...M..u......
00A0: D7 0C 8A BF 25 E4 EB 2D   BC 98 E9 58 38 19 7C B9  ....%..-...X8...
00B0: 37 FE DB E2 99 08 73 06   C7 97 83 6A 7D 10 01 2F  7.....s....j.../
00C0: 32 B9 17 05 4A 65 E6 2F   CE BE 5E 53 A6 82 E9 9A  2...Je./..^S....
00D0: 53 0A 84 74 2D 83 CA C8   94 16 76 5F 94 61 28 F0  S..t-.....v_.a(.
00E0: 85 A7 39 BB D7 8B D9 A8   B2 13 1D 54 09 34 24 7D  ..9........T.4$.
00F0: 20 81 7D 66 7E A2 90 74   5C 10 C6 BD EC AB 1B C2   ..f...t\.......

]
13:16:50.371 INFO - Network listener https-listener on port 0 disabled per domain.xml
13:16:50.403 INFO - Grizzly Framework 1.9.46 started in: 33ms - bound to [0.0.0.0:8181]
13:16:50.467 INFO - GlassFish Server Open Source Edition 3.1.2 (java_re-private) startup time : Embedded (374ms), startup services(365ms), total(739ms)
13:16:50.565 INFO - JMX006: JMXStartupService had disabled JMXConnector system
13:16:51.084 INFO - Created EjbThreadPoolExecutor with thread-core-pool-size 16 thread-max-pool-size 32 thread-keep-alive-seconds 60 thread-queue-capacity 2147483647 allow-core-thread-timeout false
13:16:51.098 INFO - SEC1002: Security Manager is OFF.
13:16:51.108 INFO - SEC1010: Entering Security Startup Service
13:16:51.110 INFO - SEC1143: Loading policy provider com.sun.enterprise.security.jacc.provider.SimplePolicyProvider.
13:16:51.131 INFO - SEC1115: Realm [admin-realm] of classtype [com.sun.enterprise.security.auth.realm.file.FileRealm] successfully created.
13:16:51.133 INFO - SEC1115: Realm [file] of classtype [com.sun.enterprise.security.auth.realm.file.FileRealm] successfully created.
13:16:51.133 INFO - SEC1115: Realm [certificate] of classtype [com.sun.enterprise.security.auth.realm.certificate.CertificateRealm] successfully created.
13:16:51.135 INFO - SEC1011: Security Service(s) Started Successfully
13:16:51.239 INFO - WEB0169: Created HTTP listener [http-listener] on host/port [0.0.0.0:8181]
13:16:51.258 INFO - WEB0171: Created virtual server [server]
13:16:51.492 INFO - WEB0172: Virtual server [server] loaded default web module []
13:16:52.388 INFO - EJB5181:Portable JNDI names for EJB OrderRepositoryImpl: [java:global/test/OrderRepositoryImpl!org.arquillian.example.OrderRepository, java:global/test/OrderRepositoryImpl]
2402 [main] INFO org.jboss.weld.Version - WELD-000900 SNAPSHOT
13:16:52.851 INFO - WEB0671: Loading application [test] at [/test]
13:16:52.888 INFO - test was successfully deployed in 2,038 milliseconds.
PlainTextActionReporterSUCCESSNo monitoring data to report.
13:16:53.570 INFO - WEB0671: Loading application [test] at [/test]
13:16:53.581 INFO - test was successfully deployed in 274 milliseconds.
Hello, Earthling!
PlainTextActionReporterSUCCESSNo monitoring data to report.
13:16:53.663 INFO - Checking Resource aliases
13:16:53.665 INFO - Command request: getNewBrowserSession[*googlechrome, http://localhost:8080, ] on session null
13:16:53.667 INFO - creating new remote session
13:16:53.677 INFO - Allocated session 7b335594cb394232a910c333b7ed9242 for http://localhost:8080, launching...
13:16:53.677 INFO - Launching Google Chrome...
13:16:54.614 INFO - Couldn't proxy to http://localhost:8080/favicon.ico because host not listening
13:16:54.837 INFO - Started SocketListener on 0.0.0.0:50308
13:16:54.958 INFO - Started SocketListener on 0.0.0.0:50311
13:16:55.690 INFO - Couldn't proxy to http://localhost:8080/favicon.ico because host not listening
13:16:55.692 INFO - Couldn't proxy to http://localhost:8080/favicon.ico because host not listening
13:16:57.354 INFO - Got result: OK,7b335594cb394232a910c333b7ed9242 on session 7b335594cb394232a910c333b7ed9242
13:16:57.356 INFO - Command request: setSpeed[0, ] on session 7b335594cb394232a910c333b7ed9242
13:16:57.356 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:16:57.359 INFO - Command request: setTimeout[60000, ] on session 7b335594cb394232a910c333b7ed9242
13:16:58.352 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:16:58.500 INFO - Initializing Mojarra 2.1.6 (SNAPSHOT 20111206) for context '/login'
13:16:58.988 INFO - Started SocketListener on 0.0.0.0:50332
13:16:59.082 INFO - Started SocketListener on 0.0.0.0:50335
13:16:59.251 INFO - WEB0671: Loading application [login] at [/login]
13:16:59.259 INFO - login was successfully deployed in 893 milliseconds.
13:16:59.263 INFO - Command request: open[http://localhost:8181/login/login.jsf, ] on session 7b335594cb394232a910c333b7ed9242
13:16:59.263 WARN - you appear to be changing domains from http://localhost:8080 to http://localhost:8181/login/login.jsf
this may lead to a 'Permission denied' from the browser (unless it is running as *iehta or *chrome,
or alternatively the selenium server is running in proxy injection mode)
13:17:00.355 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:00.357 INFO - Command request: type[id=loginForm:username, user1] on session 7b335594cb394232a910c333b7ed9242
13:17:01.357 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:01.359 INFO - Command request: type[id=loginForm:password, demo] on session 7b335594cb394232a910c333b7ed9242
13:17:02.354 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:02.355 INFO - Command request: click[id=loginForm:login, ] on session 7b335594cb394232a910c333b7ed9242
13:17:02.659 INFO - Couldn't proxy to http://shlyiwkb/ because host not found
13:17:03.357 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:03.359 INFO - Command request: waitForPageToLoad[15000, ] on session 7b335594cb394232a910c333b7ed9242
13:17:04.356 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:04.357 INFO - Command request: isElementPresent[xpath=//li[contains(text(),'Welcome')], ] on session 7b335594cb394232a910c333b7ed9242
13:17:04.534 INFO - Couldn't proxy to http://ymacupgwho/ because host not found
13:17:04.535 INFO - Couldn't proxy to http://ywqxyeiobkhieit/ because host not found
13:17:05.355 INFO - Got result: OK,true on session 7b335594cb394232a910c333b7ed9242
13:17:05.357 INFO - Command request: close[, ] on session 7b335594cb394232a910c333b7ed9242
13:17:06.354 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
13:17:06.356 INFO - Command request: testComplete[, ] on session 7b335594cb394232a910c333b7ed9242
13:17:06.356 INFO - Killing Google Chrome...
13:17:06.660 WARN - Google Chrome seems to have ended on its own.
13:17:06.668 INFO - Got result: OK on session 7b335594cb394232a910c333b7ed9242
PlainTextActionReporterSUCCESSNo monitoring data to report.
13:17:06.685 INFO - Stopping Acceptor ServerSocket[addr=0.0.0.0/0.0.0.0,localport=14444]
13:17:06.786 INFO - Stopped SocketListener on 0.0.0.0:14444
13:17:06.786 INFO - Stopping Acceptor [SSL: ServerSocket[addr=0.0.0.0/0.0.0.0,localport=50308]]
13:17:06.887 INFO - Stopped SocketListener on 0.0.0.0:50308
13:17:06.889 INFO - Stopping Acceptor [SSL: ServerSocket[addr=0.0.0.0/0.0.0.0,localport=50311]]
13:17:06.990 INFO - Stopped SocketListener on 0.0.0.0:50311
13:17:06.991 INFO - Stopping Acceptor [SSL: ServerSocket[addr=0.0.0.0/0.0.0.0,localport=50332]]
13:17:07.092 INFO - Stopped SocketListener on 0.0.0.0:50332
13:17:07.094 INFO - Stopping Acceptor [SSL: ServerSocket[addr=0.0.0.0/0.0.0.0,localport=50335]]
13:17:07.195 INFO - Stopped SocketListener on 0.0.0.0:50335
13:17:07.386 INFO - Stopped HttpContext[/selenium-server,/selenium-server]
13:17:07.386 INFO - Stopped org.openqa.jetty.jetty.servlet.ServletHandler@292b08d6
13:17:07.470 INFO - Stopped HttpContext[/wd,/wd]
13:17:07.527 INFO - Stopped HttpContext[/selenium-server/driver,/selenium-server/driver]
13:17:07.645 INFO - Stopped HttpContext[/,/]
13:17:07.645 INFO - Stopped org.openqa.jetty.jetty.Server@647fd8ce
13:17:08.493 INFO - JMX001: JMXStartupService and JMXConnectors have been shut down.
13:17:08.493 INFO - Shutdown procedure finished
13:17:08.494 INFO - [Thread[GlassFish Kernel Main Thread,5,main]] exiting
