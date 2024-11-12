class OuterClass{
    private int outerValue=10;
    static int staticValue=20;
    class InnerClass{
        void display() {
            System.out.println("Outer value from Inner class:"+outerValue);
        }
    }
    static class StaticNestedClass{
        void display(){
            System.out.println("Static value from StaticNestedClass:"+staticValue);
        }
    }
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.display();
        OuterClass.StaticNestedClass staticNested=new OuterClass.StaticNestedClass();
        staticNested.display();
    }
}
        
            
   
    

