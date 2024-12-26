/*
Rules for Writing an Interface:-
---------------------------------

Rule:-
--------
1). An Interfaces having methods by default public and abstract, even we can write these keyword while writing the methods inside an interface there is no harm.

    Ex-

    interface Test {
        
        void meth1();
        void meth2();

        // or

        public abstract void meth1();
        public abstract void meth2();

    }

2). These method can not be private because they are suppose to be implemented by classes.

    interface Test {
        
        void meth1();
        void meth2();

        // or

        // private abstract void meth1();      // (give an error)
        public abstract void meth2();

    }

3). The identifier what we give inside an interface should be in uppercase naming convension. And these indentifiers are by default final as well as static

    interface Test {

        // int x = 10;     // ( that indicate identifier does not follows naming convension)
        int X = 10;     // ( this is correct, by default final as well as static )
        
        void meth1();
        void meth2();

        // or

        public abstract void meth1();
        public abstract void meth2();

    }

4). Inside an interfaces, An abstract method can not have body.

    interface Test {

        // int x = 10;     // ( that indicate identifier does not follows naming convension)
        int X = 10;     // ( this is correct, by default final as well as static )
        
        void meth1();
        void meth2();

        // or

        public abstract void meth1();
        public abstract void meth2();
//        void meth3() {          // This would shown an abstract method can not have body
//
//        }    

    }



    // Valid 

    interface Test {

        // int X = 10;      // these identifier inside an interface are by default static and final
        static final int X = 10;

        public abstract void meth1();
        public abstract void meth2();


        public static void meth3() {
            System.out.println("meth3 of Test");
        }
    }

5). We can directly access them member from the main method by using the Interface name and dot(.) operator directly.




    package pkg14.interfaces.inheritance;


    interface Test {

        // int X = 10;      // these identifier inside an interface are by default static and final
        static final int X = 10;

        public abstract void meth1();
        public abstract void meth2();


        public static void meth3() {
            System.out.println("meth3 of Test");
        }
    }


    public class RulesForImplementingInterface {
        public static void main(String[] args) {

            // LEt try to access the static member inside an interface
            System.out.println(Test.X);     // 10
            Test.meth3();       // meth3 of Test

        }
    }



    Output:-
    ---------
    10
    meth3 of Test





6). An Interface can be extends from another interface



    interface Test {

        // int X = 10;      // these identifier inside an interface are by default static and final
        static final int X = 10;

        public abstract void meth1();
        public abstract void meth2();


        public static void meth3() {
            System.out.println("meth3 of Test");
        }
    }


    interface Test2 extends Test {
        void meth4();
    }


    // All the above method should be overrided
    class My implements Test2 {
        public void meth1() {}
        public void meth2() {}
        public void meth4() {}
    }

    public class RulesForImplementingInterface {
        public static void main(String[] args) {

            // LEt try to access the static member inside an interface
            System.out.println(Test.X);     // 10
            Test.meth3();       // meth3 of Test

        }
    }




*/



package pkg14.interfaces.inheritance;


interface Test {
    
    // int X = 10;      // these identifier inside an interface are by default static and final
    static final int X = 10;
    
    public abstract void meth1();
    public abstract void meth2();
    
    
    public static void meth3() {
        System.out.println("meth3 of Test");
    }
}


interface Test2 extends Test {
    void meth4();
}

// All the above method should be overrided
class My implements Test2 {
    public void meth1() {}
    public void meth2() {}
    public void meth4() {}
}

public class RulesForImplementingInterface {
    public static void main(String[] args) {
        
        // LEt try to access the static member inside an interface
        System.out.println(Test.X);     // 10
        Test.meth3();       // meth3 of Test
        
    }
}


/*
Output:-
---------
10
meth3 of Test


*/