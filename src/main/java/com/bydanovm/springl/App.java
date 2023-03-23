package com.bydanovm.springl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bydanovm.springl.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context 
            = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        p.setName("aaaa");
        System.out.println(p);
        System.out.println(p.getName());
    }
}
