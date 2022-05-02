package linkedlist;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void addAtIndex(int index) {

    }


}
