package week4;
class OuterClass {
    private String outerVar = "Outer Variable";
    class InnerClass {
        private String innerVar = "Inner Variable";
        public void displayOuterVariable() {
            System.out.println("Accessing from InnerClass: " + outerVar);
        }
        private String getInnerVar() {
            return innerVar;
        }
    }
    public void displayInnerVariable() {
        InnerClass inner = new InnerClass();
        System.out.println("Accessing from OuterClass: " + inner.innerVar);
    }
}
class OuterClassTest{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayOuterVariable();
        outer.displayInnerVariable();
        }
}
