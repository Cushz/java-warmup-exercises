package Chapter3_4_5;

import java.util.Arrays;

public class MyStack<E> {
    private int MaxSize;
    private E[] Elements;
    private int top; // index for top element in Stack
    public MyStack(int MaxSize)
    {
        this.MaxSize = MaxSize;
        this.top = 0;
        this.Elements = (E[]) new Object[MaxSize];
    }
    public void push(E e) throws MaxCapacityException
    {
        if(top >= MaxSize)
        {
            throw new MaxCapacityException("Max limit has been reached");
        }
        Elements[top] = e;
        top++;
    }
    public E peek() throws EmptyStackException
    {
        if (top == 0)
        {
            throw new EmptyStackException("Stack is empty");
        }
        return Elements[top-1];
    }
    public boolean isEmpty()
    {
       return top == 0;
    }
    public int getSize()
    {
        return MaxSize;
    }
    public void pop() throws EmptyStackException
    {
        if (top == 0)
        {
            throw new EmptyStackException("Stack is empty");
        }
        top--;
        Elements[top] = null;

    }
    @Override
    public String toString()
    {
        return Arrays.toString(Elements)+"||"+MaxSize+"||"+top;
    }
}
