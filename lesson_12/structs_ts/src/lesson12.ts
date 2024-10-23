import { ListNode } from './list_node.js';

export class Lesson12 {
  public gameResult(head: ListNode | null): string {
    const result: number[] = [0, 0];
    let current: ListNode | null = head;

    while (current && current.next) {
        if (current.val !== current.next.val && current.val % 2 === 0) {
            if (current.val > current.next.val) {
                result[current.val % 2] += 1;
            } else {
                result[current.next.val % 2] += 1;
            }
        }
        current = current.next;
    }
    return (result[0] == result[1]) ? 'Tie' : (result[0] > result[1] ? 'Even' : 'Odd');
 } 

}  

