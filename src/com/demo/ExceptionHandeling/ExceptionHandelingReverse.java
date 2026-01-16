package com.demo.ExceptionHandeling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandelingReverse {

}


//1. NO – 
class Parent101 {
 void m1() throws ArithmeticException {
 }
}

class Child101 extends Parent101 {
 @Override
 void m1() throws Exception { 
 }
}

//2. YES 
class Parent102 {
 void m1() throws IndexOutOfBoundsException {
 }
}

class Child102 extends Parent102 {
 @Override
 void m1() throws IndexOutOfBoundsException {
 }
}

//3. YES 
class Parent103 {
 void m1() throws IllegalArgumentException {
 }
}

class Child103 extends Parent103 {
 @Override
 void m1() throws NumberFormatException {
 }
}

//4. YES – 
class Parent104 {
 void m1() throws RuntimeException {
 }
}

class Child104 extends Parent104 {
 @Override
 void m1() throws NullPointerException {
 }
}

//5. NO –
class Parent105 {
 void m1() {
 }
}

class Child105 extends Parent105 {
 @Override
 void m1() throws IOException { 
 }
}

//6. YES 
class Parent106 {
 void m1() throws IOException {
 }
}

class Child106 extends Parent106 {
 @Override
 void m1() throws RuntimeException {
 }
}

//7. 
class Parent107 {
 void m1() throws FileNotFoundException {
 }
}

class Child107 extends Parent107 {
 @Override
 void m1() throws IOException {
 }
}

//8. NO 
class Parent108 {
 void m1() throws IOException {
 }
}

class Child108 extends Parent108 {
 @Override
 void m1() throws ClassNotFoundException { 
 }
}
