package com.geely.design.pattern.creational.singleton;

import org.omg.CORBA.Object;

public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();

    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
