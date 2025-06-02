package com.AB;

import com.birdbrain.Finch;

public class Catfish {
    public static void main(String[] args) {
        Finch bird = new Finch();
        bird.playNote(60,1);
        bird.setTail("all",50,25,25);
        bird.setBeak(72,49,13);
        bird.print("hello friend watch my dance!");
        for (int i = 0; i < 4; i++) {
            bird.setMove("F",15,100);    
            bird.setMove("B",15,100);
            bird.setTurn("R",90,100);
        }
        bird.stopAll();
    }
}