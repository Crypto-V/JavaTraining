package com.designPatterns;

import com.designPatterns.state.Canvas;
import com.designPatterns.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUP();
    }


}
