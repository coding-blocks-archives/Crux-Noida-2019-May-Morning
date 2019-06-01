package com.codingblocks.lecture_9.access.second;

import com.codingblocks.lecture_9.access.Parent;

public class ChildOther extends Parent {

    public void sample(){
        System.out.println(this.pub);
        System.out.println(this.prot);
//        System.out.println(this.deft);
//        System.out.println(this.pri);
    }
}
