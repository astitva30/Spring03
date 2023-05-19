/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spr.beans.Hobby;
import spr.beans.Sports;

/**
 *
 * @author deshp
 */
public class Spring03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
//        Sports ref = (Sports)context.getBean("technosoft");
//        Sports ref1 = (Sports)context.getBean("universal");
//        Sports ref2 = (Sports)context.getBean("hello");
//        System.out.println(ref2);
//        System.out.println(ref1);
//        System.out.println(ref);

        Hobby h1 = (Hobby)context.getBean("hobby1");
        System.out.println(h1);
    }
    
}
