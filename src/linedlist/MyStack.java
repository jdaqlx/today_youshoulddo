package linedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhongyang, Email:zhongyanga@ujumedia.com
 * @version v1.0.0
 * @since v1.0.0
 * Created on 2022-7-19 19:43
 */
public class MyStack {
    private List<String> list;
    private int top;
    private int size;

    public MyStack(){
        list = new ArrayList<>();
        top = 0;
        size = 0;
    }

    public int length(){
        return size;
    }

    public void push(String str){
        list.add(str);
        size++;
        top++;
    }

    public String peek() {
        return list.get(top - 1);
    }

    public String pop() {
        String str = list.get(top - 1);
        list.remove(top-1);
        size--;
        top--;
        return str;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List<Object> collect = list.stream().map(item -> {
            return null;
        }).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}

