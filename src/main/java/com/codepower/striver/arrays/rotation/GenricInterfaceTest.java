package com.codepower.striver.arrays.rotation;

/**
 * @author Justin Mathew @dev_io
 */
public class GenricInterfaceTest {
    public static void main(String[] args) {
        MyGenricInterface<ArrayRotation>test=new GenricInterfaceImpl();
        GenricTests genricTests=new GenricTests();
        genricTests.setMyGenricInterface(test);
        MyGenricInterface myGenricInterface = genricTests.getMyGenricInterface();
        System.err.println(myGenricInterface.getClass());
    }
}
