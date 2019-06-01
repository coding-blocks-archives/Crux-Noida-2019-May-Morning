package com.codingblocks.lecture_9.access;

public class Child extends Parent {
    public void sample(){
        System.out.println(this.pub);
        System.out.println(this.prot);
//        System.out.println(this.pri);
        System.out.println(this.deft);
    }
}
