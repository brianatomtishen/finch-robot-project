package com.AB;

import com.birdbrain.Finch;

public class Catfish {
    public static void main(String[] args) {
        Finch bird = new Finch();
        bird.setTail("all",50,25,25);
        bird.setBeak(72,49,13);
        bird.print("hello friend watch my dance");
        for (int i = 0; i < 4; i++) {
            bird.setMove("F",15,100);    
            bird.setMove("B",15,100);
           bird.setTurn("R",90,100);
        }
        bird.setTurn("L",360,100);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(67,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(62,1);
        bird.pause(0.5);
        bird.playNote(69,1);
        bird.pause(0.5);
        bird.playNote(71,1);
        bird.pause(0.5);
        bird.playNote(69,1);
        bird.pause(0.5);
        bird.playNote(62,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(71,1);
        bird.pause(0.5);
        bird.playNote(69,1);
        bird.pause(0.5);
        bird.playNote(62,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(67,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(67,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(62,1);
        bird.pause(0.5);
        bird.playNote(69,1);
        bird.pause(0.5);
        bird.playNote(71,1);
        bird.pause(0.5);
        bird.playNote(69,1);
        bird.pause(0.5);
        bird.playNote(62,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(67,1);
        bird.pause(0.5);
        bird.playNote(65,1);
        bird.pause(0.5);
        bird.playNote(67,1);
        bird.setTurn("L",360,100);
        bird.stopAll();
    }
}