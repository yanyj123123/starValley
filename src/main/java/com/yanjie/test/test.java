package com.yanjie.test;

import org.python.util.PythonInterpreter;

public class test {
    public static void main(String [] args){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:\\javaweb_learn\\starValley\\src\\main\\java\\com\\yanjie\\test\\test.py");//放脚本的位置
        interpreter.cleanup();
    }
}
