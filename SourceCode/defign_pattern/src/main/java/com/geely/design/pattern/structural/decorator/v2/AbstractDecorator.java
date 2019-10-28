package com.geely.design.pattern.structural.decorator.v2;

public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomeThing();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}