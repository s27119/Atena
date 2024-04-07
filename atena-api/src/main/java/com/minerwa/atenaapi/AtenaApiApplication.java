package com.minerwa.atenaapi;


import com.minerwa.atenaapi.repository.AngularQuestionRepository;
import com.minerwa.atenaapi.repository.JavaQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;



@RequiredArgsConstructor
@SpringBootApplication
public class AtenaApiApplication {
    AngularQuestionRepository angularQuestionRepository;
    JavaQuestionRepository javaQuestionRepository;


    public static void main(String[] args) {
        SpringApplication.run(AtenaApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(AngularQuestionRepository angularQuestionRepository, JavaQuestionRepository javaQuestionRepository) {
//        return args -> {
//            angularQuestionRepository.deleteAll();
//            javaQuestionRepository.deleteAll();
//            angularQuestionRepository.saveAll(
//                    List.of(
//                            new AngularQuestion("What is *ngFor directive in Angular?", OptionIndex.OPTION_0, List.of("A structural directive that repeats a portion of the HTML template for each item in a list", "A method to handle HTTP requests", "A tool for managing state", "A library for making animations")),
//                            new AngularQuestion("What does (click) do in Angular?", OptionIndex.OPTION_3, List.of( "Changes the color of the element", "Hides the element", "Makes the element draggable","Calls a method when the element is clicked")),
//                            new AngularQuestion("What does {{ }} do in Angular?", OptionIndex.OPTION_0, List.of("Updates the text content of an HTML element", "Creates a two-way data binding", "Applies a CSS style", "Inserts an image")),
//                            new AngularQuestion("What is the purpose of the ? operator in Angular?", OptionIndex.OPTION_2, List.of( "Checks if a variable is equal to a value", "Performs a deep copy of an object","Prevents null and undefined values in property paths", "Deletes a property from an object")),
//                            new AngularQuestion("What does | async do in Angular?", OptionIndex.OPTION_2, List.of( "Performs an HTTP request","Subscribes to an Observable or Promise and returns the latest value it has emitted", "Converts a string to a number", "Sorts an array"))
//                    )
//            );
//            javaQuestionRepository.saveAll(
//                    List.of(
//                            new JavaQuestion("What is the purpose of the main method in Java?", OPTION_3, List.of("To define variables", "To declare classes", "To create objects", "To start the execution of the program")),
//                            new JavaQuestion("What is the correct way to declare an array in Java?", OPTION_1, List.of("int array[];", "int[] array;", "array[] int;", "array int[];")),
//                            new JavaQuestion("What is the correct way to declare a method in Java?", OPTION_0, List.of("public void myMethod() {}", "public myMethod() void {}", "void public myMethod() {}", "myMethod() public void {}")),
//                            new JavaQuestion("What is the purpose of the 'final' keyword in Java?", OPTION_2, List.of("To define a method", "To declare a class", "To declare a constant", "To create an object")),
//                            new JavaQuestion("What is the correct way to declare a class in Java?", OPTION_1, List.of("class public MyClass {}", "public class MyClass {}", "MyClass public class {}", "public MyClass class {}")),
//                            new JavaQuestion("What is the purpose of the 'this' keyword in Java?", OPTION_0, List.of("To refer to the current object", "To create a new object", "To declare a class", "To define a method")),
//                            new JavaQuestion("What is the purpose of the 'super' keyword in Java?", OPTION_3, List.of("To declare a class", "To create a new object", "To define a method", "To refer to the parent class"))
//                    )
//            );
//
//        };
//    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(List.of("http://localhost:3000", "http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(List.of("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization, origin, accept", "X-Requested-With", "Access-Control-Request-Method",
                "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(List.of("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);

    }
}
