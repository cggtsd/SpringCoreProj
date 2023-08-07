package cgg.springcore;

public interface Shape {
 public void draw();
}

/*coding to interface: instead of having an instance of bean directly
 * what you do is you have an interface and then you use the interface
 * and not the bean inside the application class
 * 
 * the advantage is the drawing application class does not have to know whether
 * its calling the draw() method of triangle or any other shape it just works on the
 * interface 
 * 
 * code to inteface and not to specific implementation
 * the drawing application does not whether it is drawing a circle or traiangle
 * or any other shape all it knows is that it is getting a bean which implements the 
 * shape interface and its calling a method of shape interface
 * in futue if a new class rectangle is added and as long as it implements the shape interface 
 * you just create the class and add configuration and call it as shape
 * 
 * shape has been defined as a trainagle in this instance you can later modify
 * it and add new implementations of the shape interface and all you need to do ois
 * to change just the class in the configuration
 * and modify the properties 
 * then the drawing application is going to draw a different shape which were not 
 * even there when this application was first coded
 * 
 * all this is happening because you are just concerned with the methods of the
 * interface itself amd not the methods of individual objects that implement the interface
 * 
 * this is the main advantage of coding to interface and what this transaltes to is in your application 
 * normally you would have say business services dao layer 
 * instead of having a view layer directly call a business service object what you would do is you would have
 * an interface for the business interface then you would call the methods of that interface then the implementations
 * would be later plugged in with the specific business service implementation that you have coded
 * and then if you want to chnage it later you dont have to change the view layer 
 * for example you have to just add the new business service implementation then rewire it in 
 * your spring.xml
 * 
 * whenever you are doing dependency injection always use interface
 * so that if you change the implementation you dont have to change the actual class
 * which depends on this interface
 * you just have to plugin the new implementation and change the wiring so that the class
 * can use the new implementation
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

