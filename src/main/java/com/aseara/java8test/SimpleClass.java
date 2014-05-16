package com.aseara.java8test;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/5/16
 * Time: 13:52
 */
public class SimpleClass {
    public static int simpleField = 100;

    public int greatThan(float floatOne, float floatTwo) {
        int result;
        if (floatOne > floatTwo) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }

    public int simpleSwitch(int intOne) {
        switch (intOne) {
            case 10:
                return 3;
            case 20:
                return 2;
            case 30:
                return 1;
            default:
                return -1;
        }
    }

    public int simpleSwitch(String stringOne) {
        switch (stringOne) {
            case "FB":
                return 0;
            case "Ea":
                return 2;
            default:
                return 5;
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 2) {
            i++;
        }
    }

    public void forLoop() {
        for(int i = 0; i < 2; i++) {

        }
    }

    public void doWhileLoop() {
        int i = 0;
        do {
            i++;
        } while (i < 2);
    }
}
