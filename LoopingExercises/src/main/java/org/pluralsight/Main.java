package org.pluralsight;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WhileLoop whileLoop = new WhileLoop();
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        ForLoop forLoop = new ForLoop();

        System.out.print("\n-----||--While Loop--||-----\n");
        whileLoop.main();
        System.out.print("\n-----||--Do While Loop--||-----\n");
        doWhileLoop.main();
        System.out.print("\n-----||--For Loop--||-----\n");
        forLoop.main();
    }
}