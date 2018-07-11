package com.sz.yb.github;

/**
 * Created by tony on 2018/7/11.
 */
public class SingleTon {
    private static SingleTon singleTon = null;  //懒汉式单例设计模式；
    public static SingleTon getSingleTon(){
        if(singleTon==null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
    private SingleTon(){

    }
}
