package com.designPatterns;

public abstract class UiControl {
    public void enable(){
        System.out.println("enabled");
    }

    public abstract void draw();
}
