<h1>Springboot Framework</h1>
This project creates a sample REST web service which returns a hardcoded book information

<h3>SpringbootIn10StepsApplication.java</h3>
The @SpringBootApplication specifies three important things
<li>The annotation @SpringBootApplication indicates that it is a spring context file</li>
<li>It enables Auto Configuration - configures all the required beans required automatically </li>
<li>It enables Component Scan - meaning, it will automatically scan all the classes that are present inside the package in which the @SpringBootApplication annotation is defined </li>
<li>In this package, we have defined the BooksController.java file with the annotation @RestController annotation. So, it will register this class automatically as a Spring Bean and it will be managed by the Spring Framework</li>

<h3>Spring, Spring Boot & Spring MVC</h3>
<li> Usually Spring applications require lots of configurations</li>
<li>Springboot enables auto configuration based on Frameworks listed in ClassPath</li>
<li>Hence developer need not bother about the configuration headaches</li>
<li>Springboot Actuator enables monitoring and tracing of applications for free</li>
<li>Springboot Default Error handling</li>
<li>Springboot log4j enables logging</li>
