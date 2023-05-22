package com.springcore.lifecycle;

/*
Life cycle methods 
1> public void init()
2> public void destroy()


subse phele object is created
fir values set hongi <constructor ya fir setter injection ke though>
fir init method call hoga 
fir user the bean
fir destroy method call hoga 
object is destroyed
*/

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		samosa s = (samosa)context.getBean("s1");
        System.out.println(s);
        
        context.registerShutdownHook(); // by this we are regestering shitdown hook <iske bina destroy method nehi call hoga> 
        
        System.out.println("");
        pepsi p =(pepsi) context.getBean("p1");
        System.out.println(p);
        
        System.out.println("");
        example e =(example)context.getBean("e1");
        System.out.println(e);
	}

}
