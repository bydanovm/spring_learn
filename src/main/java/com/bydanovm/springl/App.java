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

        // Выведент бин с аннотацией @Primary
        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p1.getName());

        // Выведент бин с именем "miki"
        Parrot p2 = context.getBean("miki", Parrot.class);
        System.out.println(p2.getName());

        // Выведент бин с именем класса parrot1
        Parrot p3 = context.getBean("parrot1", Parrot.class);
        System.out.println(p3.getName());
    }
}
