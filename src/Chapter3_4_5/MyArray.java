package Chapter3_4_5;


import java.util.Arrays;
import java.util.Objects;


public class MyArray<E> {
    private E[] Objects;
    private int Capacity;
    private int size;
    public MyArray(int Capacity)
    {
        this.Capacity = Capacity;
        this.size = 0;
        this.Objects = (E[]) new Object[Capacity];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public void add(E e) throws MaxCapacityException
    {
        if(size > Capacity)
        {
            throw new MaxCapacityException("Max capacity has been reached");

        }
        Objects[size] = e;
        size++;
    }
    public void remove(int index)
    {
        if (index > size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        for (int i =0; i < size; i++)
        {
            if (index == i)
            {
                Objects[i] = null;
            }
            if (Objects[i] == null)
            {
                E e;
                e = Objects[i];
                Objects[i] = Objects[i+1];
                Objects[i+1] = e;
            }
        }
    }
    public E get(int i) throws InvalidIndexException
    {
        if(i > size || i < 0)
        {
            throw new InvalidIndexException("Invalid index");
        }
        return Objects[i];
    }
    public int find(E e) throws ElementNotFoundException
    {
        for (int i = 0; i < size; i++) {
            if (Objects[i] == e)
            {
                return i;
            }
        }
        throw new ElementNotFoundException("given element does not exist");

    }
    @Override
    public String toString()
    {
        return Arrays.toString(Objects);
    }

}
