package Chapter2;

import java.util.ArrayList;
public class Stack {
    private int maxSize;
    private ArrayList<Integer> Elements  = new ArrayList<Integer>();
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
    }
    public void push(int Element)
    {
        Elements.addLast(Element);
    }
    public int Peek() {
        return Elements.getLast();
    }
    public ArrayList<Integer> getElements() {
        return Elements;
    }
    public int getSize() {
        return maxSize;
    }
    public int pop() {
        return Elements.removeLast();
    }
    public boolean isEmpty()
    {
        if(Elements != null)
        {
            return false;
        }
        return true;
    }
    public void Iterate()
    {
        for (int i : Elements)
        {
            System.out.println(i);
        }
    }

}
