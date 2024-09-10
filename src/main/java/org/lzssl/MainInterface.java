package org.lzssl;

import org.lzssl.interfa.PersonIntf;

public class MainInterface {
    public static void main(String[] args) {
        PersonIntf personIntf = new PersonIntf("lzssl");
        personIntf.guzhang();
        personIntf.xishou();
    }
}
