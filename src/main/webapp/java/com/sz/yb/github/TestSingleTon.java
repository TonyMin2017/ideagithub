package com.sz.yb.github;

/**
 * Created by tony on 2018/7/11.
 */
public class TestSingleTon {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleTon();
        SingleTon singleTon1 = SingleTon.getSingleTon();
        System.out.println(singleTon==singleTon1);
    }
}
