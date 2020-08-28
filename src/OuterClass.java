public class OuterClass {
    private static class Innerclass
    {
        public void display()
        {
            System.out.println("This is a static inner class");
        }
    }
    public static void main(String[] args) {
        OuterClass.Innerclass obj=new OuterClass.Innerclass();
        obj.display();
    }
}
