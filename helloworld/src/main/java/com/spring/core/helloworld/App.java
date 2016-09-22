package com.spring.core.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
        Helloworld greet=(Helloworld) context.getBean("greetings");
        System.out.println(greet.sayHello());
    }
}
