package com.company.singleton;

public class Main {

    public static void main(String[] args) {

        ClipBoard clipBoard1 = ClipBoard.getInstance();
        ClipBoard clipBoard2 = ClipBoard.getInstance();

        clipBoard1.copy("abc");
        clipBoard1.paste(); //abc

        clipBoard1.paste(); //abc

        clipBoard2.copy("xyz");
        clipBoard1.paste(); //xyz
        clipBoard2.paste(); //xyz
        clipBoard1.copy("pqr");
        clipBoard2.paste(); //pqr

        ClipBoard clipBoard3 = ClipBoard.getInstance();
        clipBoard3.paste();//pqr
    }
}
