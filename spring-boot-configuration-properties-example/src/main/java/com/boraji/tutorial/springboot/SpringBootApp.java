package com.boraji.tutorial.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.boraji.tutorial.springboot.config.MailProperties;
import com.boraji.tutorial.springboot.service.MailService;

@SpringBootApplication
@EnableConfigurationProperties(MailProperties.class)
public class SpringBootApp {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
    MailService mailService = context.getBean(MailService.class);
    mailService.print();
  }
  
}

/**
package com.appsdeveloperblog.DeployableWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeployableWarApplication extends SpringBootServletInitializer {

 public static void main(String[] args) {
  SpringApplication.run(DeployableWarApplication.class, args);
 }
 
 @Override
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
  return application.sources(DeployableWarApplication.class);
 }
}

2) Set Project Packaging to a WAR
Open the POM.xml file of your project and update the <packaging> XML element to have the value of WAR rather than JAR.

<packaging>war</packaging>

3) Add spring-boot-starter-tomcat to POM.XML
Next step is to add a new spring-boot-started-tomcat dependency to a pom.xml file of your project. Have a look at the example dependencies from my pom.xml file.

Please note that the <scope> XML element of spring-boot-starter-tomcat contains the value provided.


<dependencies>
 <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
 </dependency>
 <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-tomcat</artifactId>
  <scope>provided</scope>  //compile , runtime , system, test
 </dependency>

 <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
 </dependency>
</dependencies>
*/

