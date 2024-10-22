package com.codedifferently.lesson12;

public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    int topmostValue = 0;
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    } else {
      topmostValue = top.val;
      top = top.next;
      return topmostValue;
    }
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty, no value to peek");
    }
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
