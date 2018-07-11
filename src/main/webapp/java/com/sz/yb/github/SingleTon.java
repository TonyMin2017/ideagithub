package com.sz.yb.github;

/**
 * Created by tony on 2018/7/11.
 */
public class SingleTon {
    //Java设计模式之闪单例模式：饿汉式；线程安全；
    private static SingleTon singleTon = new SingleTon();
    public static SingleTon getSingleTon(){
        return singleTon;
    }
    private SingleTon(){

    }
}
