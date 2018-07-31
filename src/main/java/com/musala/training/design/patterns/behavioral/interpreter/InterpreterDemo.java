package com.musala.training.design.patterns.behavioral.interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {

        //looking for lions
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alternation1 = new  AndExpression(terminal2, terminal3);

        Expression alternator2 = new OrExpression(terminal1, alternation1);


        return new AndExpression(terminal3, alternator2);
    }

    public static void main(String[] args) {

        //String context = "Lions";
        String context = "Lions and Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

}
