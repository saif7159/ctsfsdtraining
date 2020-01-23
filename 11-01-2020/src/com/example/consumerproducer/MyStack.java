package com.example.consumerproducer;

public class MyStack {
private int size;
private String[] array;
private int top;
public MyStack(int size) {
    this.size = size;
    array = new String[size];
    top = -1;
 }
 public void push(String j) {
    array[++top] = j;
 }
 public String pop() {
    return array[top--];
 }
 public String peek() {
    return array[top];
 }
}
