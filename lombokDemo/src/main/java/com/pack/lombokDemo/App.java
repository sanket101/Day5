package com.pack.lombokDemo;

import lombok.NonNull;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Emp e1 = new Emp("Raman");
//        e1.setName("Raman");
//        e1.setAge(19);
//        e1.setDesignation("Senior Software Developer");
//        e1.setSalary(45000);
        
    	Emp e1 = new Emp("Raman", 21, 45000, "Programmer");
//    	Emp e2 = new Emp("Raman", 21, 45000, "Programmer");
//    	
//        System.out.println(e1.equals(e2));
    	e1 = null;
    	App.display(e1);
    }
    
    public static void display(@NonNull Emp e) {
    	System.out.println("-----EMP DETAILS----");
    	System.out.println(e);
    }
}
