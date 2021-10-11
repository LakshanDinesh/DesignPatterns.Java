package com.company.singleton;

public class ClipBoard {

    private String content;

    private static ClipBoard clipBoard;

    private ClipBoard(){
        System.out.println("Constructor called");
    }

     public static ClipBoard getInstance(){

        if (clipBoard == null) {
            clipBoard = new ClipBoard();
        }

        return clipBoard;
    }

    //copy
    public void copy(String text){
        this.content = text;
    }

    //paste
    public void paste(){
        System.out.println(this.content);
    }

}
