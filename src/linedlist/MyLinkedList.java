package linedlist;

import java.util.Objects;

/**
 * @author zhongyang, Email:zhongyanga@ujumedia.com
 * @version v1.0.0
 * @since v1.0.0
 * Created on 2022-4-3 11:52
 */
public class MyLinkedList {
    static class Node {
        Node next;
        Integer value;
        public Node(Integer value) {
            this.value = value;
        }
    }
    int size;
    Node head;

    public MyLinkedList(int size, Node head) {
        this.size = 0;
        this.head = head;
    }
    public MyLinkedList() {
    }

    public Integer get(int index) {

        if (index < 0 || index > size || head == null) {
            return -1;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void addAtHead(int val){
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    public void addAtTail(int val){
        Node node  = new Node(val);
        if (size == 0) {
            this.head = node;
        }else{
            while (this.head.next != null) {
                this.head = head.next;
            }
            this.head.next = node;
        }
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node temp = this.head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node insertNode = new Node(val);
        insertNode.next = temp.next;
        temp.next = insertNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null || index > size) {
            return;
        }
        if (index == 0) {
            if (size != 1) {
                Node temp = head.next;
                this.head = temp;
                size--;
                return;
            }else{
                this.head=null;
                size--;
                return;
            }
        }
        Node temp = this.head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        size--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList that = (MyLinkedList) o;
        return size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, head);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
