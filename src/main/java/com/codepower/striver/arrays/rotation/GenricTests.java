package com.codepower.striver.arrays.rotation;

/**
 * @author Justin Mathew @dev_io
 */
public class GenricTests {

    public void setString(String s) {
        System.out.println(s);
    }
    public String getString() {
        return "Hello";
    }
    public MyGenricInterface interfaces;

    public void setMyGenricInterface(MyGenricInterface<?> interfaces) {
        this.interfaces = interfaces;
    }

    public MyGenricInterface getMyGenricInterface() {
        return interfaces;
    }
}
