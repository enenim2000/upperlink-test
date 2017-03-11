package enenim.asukwo.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Question1 {

	public static void main(String[] args) {        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("question1Context.xml"); 

        Book b= (Book)appContext.getBean("book");  

        b.display();  

	}

}
