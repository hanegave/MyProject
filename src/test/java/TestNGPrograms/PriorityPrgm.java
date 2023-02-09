package TestNGPrograms;

import org.testng.annotations.Test;

public class PriorityPrgm {
@Test
public void demo1() {   //3st priority
System.out.println("demo1");	
}
@Test(priority=-2) //1st priority
public void demo2() {
System.out.println("demo2");	
}
@Test(priority=-1)   //2st priority
public void demo3() {
System.out.println("demo3");	
}
@Test
public void demo4() {  //4st priority
System.out.println("demo4");	
}
@Test(priority=1)
public void demo5() {  //5st priority
System.out.println("demo5");	
}
}
