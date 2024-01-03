package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import java.util.Stack;

public class BroStack {
    public static void main(String[] args) {
//        need to declare the stack and instantiate it
//        this is done by declaring Stack
//        then we need to declare the type of variable we are using <String>
//        then we name the stack = new stack
        Stack<String> stack = new Stack<String>();


        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("Skyrim");
        stack.push("FFVII");

//        System.out.println(stack.empty());

//        popping removes it from the stack but you can save it to a variable before doing so.
//        String myFavGame = stack.pop();

//        instead we can use the peek method and look at the top most game if we don't plan on removing it

        System.out.println(stack.peek());
        System.out.println(stack);
//        System.out.println(myFavGame);

//        Search goes from the top to bottom since Stack is a LIFO (last in first out)

//        you can run out of memory in a stack
//        for(int i = 0; i < 1000000000; i++){
//            stack.push("Skyrim");
//        }

        System.out.println(stack.search("Doom"));

//        main uses of stacks?
//        undo/redo featuers in text editors
//        moving back/forward thru browser history
//        backtracking algorithms (maze, file directories)
//        calling functions (call stack)
//              Will be done in a later video
    }

}
