/**
 * Created by PC on 3/18/2022.
 */
public class RotateSinglyLinkedList {
        static class LinkedList {
            Node head;
            /* Linked list Node*/
            class Node {
                int data;
                Node next;
                Node(int n)
                {
                    data = n;
                    next = null;
                }
            }

            void rotate(int m) {
                if (m == 0)
                    return;


                Node current = head;


                int count = 1;
                while (count < m && current != null) {
                    current = current.next;
                    count++;
                }

                if (current == null)
                    return;


            }}}
