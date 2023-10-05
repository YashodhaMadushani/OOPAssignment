class AccessModifiersDemo {

    private int privateVar;


    double defaultVar;


    protected boolean protectedVar;


    public String publicVar;


    public int getPrivateVar() {
        return privateVar;
    }


    double getDefaultVar() {
        return defaultVar;
    }


    protected boolean getProtectedVar() {
        return protectedVar;
    }


    public String getPublicVar() {
        return publicVar;
    }
}


class SubclassDemo extends AccessModifiersDemo {

    public void displayProtectedVar() {
        boolean value = getProtectedVar();
        System.out.println("ProtectedVar from Subclass: " + value);
    }
}


class Main {

    public static void main(String[] args) {

        AccessModifiersDemo demo = new AccessModifiersDemo();


        demo.defaultVar = 3.14;
        demo.protectedVar = true;
        demo.publicVar = "Hello, World!";


        System.out.println("privateVar: " + demo.getPrivateVar());
        System.out.println("defaultVar: " + demo.getDefaultVar());
        System.out.println("protectedVar: " + demo.getProtectedVar());
        System.out.println("publicVar: " + demo.getPublicVar());


        SubclassDemo subclassDemo = new SubclassDemo();
        subclassDemo.displayProtectedVar();
    }
}
