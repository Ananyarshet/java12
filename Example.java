package javaapplication31;
public class Example {
    static int staticCounter=0;
    int instanceCounter=0;
    static void incrementStaticCounter(){
        staticCounter++;
        System.out.println("Static Counter:"+staticCounter);
    }
    void incrementInstanceCounter()
    {
        instanceCounter++;
        System.out.println("instanceCounter:"+instanceCounter);
    }
    public static void main(String[] args) {
        Example.incrementStaticCounter();
        Example obj1=new Example();
        obj1.incrementInstanceCounter();
        Example.incrementStaticCounter();
         Example obj2=new Example();
        obj2.incrementInstanceCounter();
        Example.incrementStaticCounter();
    }
    
}
