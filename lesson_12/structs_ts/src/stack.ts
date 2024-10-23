import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    const newNode = new ListNode(value);
    newNode.next = this.top;
    this.top = newNode;
  }

  pop(): number | undefined {
    let topmostValue = undefined;
    if (this.isEmpty())
       throw new Error('No value to pop');
    else 
      topmostValue = this.top?.val;  
      this.top = this.top?.next;
      return topmostValue
  }

  peek(): number | null {
       return this.top ? this.top.val : null;
  }

  isEmpty(): boolean {
    return (this.top == null);
  }  
}
