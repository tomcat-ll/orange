package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class test {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(test.class,args);
    }
}
