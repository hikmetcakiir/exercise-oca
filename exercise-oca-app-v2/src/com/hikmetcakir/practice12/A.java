package com.hikmetcakir.practice12;


class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

public class A extends Game{
    public void play(){
        System.out.println("Playing Soccer...");
    }
    public static void main(String[] args) throws Exception{
        Game g = new A();
        g.play();
    }
}