package Ch16.Project_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
        Student student=context.getBean("Student",Student.class);
        System.out.println(student);
        AbstractApplicationContext context1=new AnnotationConfigApplicationContext(Myclass.class);
        System.out.println(context1.getBean(Student.class));
        
        
    }
}
