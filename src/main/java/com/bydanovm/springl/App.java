package com.bydanovm.springl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bydanovm.springl.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context 
            = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // System.out.println( "Hello World!" );

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
