package by.javatr.task1.util;

import by.javatr.task1.exception.NoSuchIndexException;

import java.util.Iterator;

public class Array implements Iterable<Integer> {


    private final int DEFAULT_SIZE = 10;

    private int[] array;

    private int length;
    private int nextSetableIndex;
    private int size;


    public Array(int... element) {
        array = new int[element.length];
        for (int i = 0; i < element.length; i++) {
            array[i] = element[i];
            nextSetableIndex++;
        }

        length = element.length;
        size = element.length;
    }

    public Array() {
        array = new int[DEFAULT_SIZE];
        length = 0;
        nextSetableIndex = 0;
        size = DEFAULT_SIZE;
    }

    public int getLength() {
        return length;
    }

    private int getSize() {
        return size;
    }


    public int getElement(int index) throws NoSuchIndexException {
        if (index > length - 1) {
            throw new NoSuchIndexException("The requested index goes beyond the bounds of the array");
        }
        return array[index];
    }

    public boolean isContains(int elem) {
        for (int i = 0; i < length; i++) {
            if (array[i] == elem) {
                return true;
            }
        }
        return false;
    }

    public void setElement(int index, int element) throws NoSuchIndexException {
        if (index > length - 1) {
            throw new NoSuchIndexException("The requested nextSetableIndex goes beyond the bounds of the array");
        }
        for (int i = 0; i < length; i++) {
            if (index == i) {
                if (size < length + 1) {
                    increaseArrayLength();
                }
                for (int j = length; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = element;
                length++;
                this.nextSetableIndex++;
                break;
            }
        }

    }

    public void replaceElement(int index, int element) throws NoSuchIndexException {
        if (index > length - 1) {
            throw new NoSuchIndexException("The requested nextSetableIndex goes beyond the bounds of the array");
        }
        array[index] = element;
    }

    public boolean addElement(int element) {
        int[] newArray;
        if (nextSetableIndex >= length) {
            increaseArrayLength();
        }
        array[nextSetableIndex] = element;
        nextSetableIndex++;
        length++;
        size = array.length;
        return true;
    }

    private void increaseArrayLength() {
        int[] newArray;
        newArray = new int[size + 10];
        size = size + 10;
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public boolean deleteElement(int elem) {
        int i;
        for (i = 0; i < length; i++) {
            if (array[i] == elem) {
                break;
            }
        }
        for (int k = i; k < length - 1; k++) {
            array[k] = array[k + 1];
        }
        array[length - 1] = 0;
        length = length - 1;
        --nextSetableIndex;
        return true;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Array array1 = (Array) obj;
        if (length != array1.length) return false;
        if (nextSetableIndex != array1.nextSetableIndex) return false;
        if (size != array1.size) return false;
        if (array == null) {
            return array==array1.array;
        }
        if (array.length != array1.length) return false;
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] != array1.getElement(i)) return false;
            } catch (NoSuchIndexException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + length;
        result = prime * result + size;
        result = prime * result + nextSetableIndex;
        for (int i = 0; i < array.length; i++) {
            result = prime * result + array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < length; i++) {

            sb.append(array[i]);
            if (length - i != 1) {
                sb.append(", ");
            }
        }
        sb.append(']');

        return getClass().getName() + '@' +
                ", length=" + length +
                ", nextSetableIndex=" + nextSetableIndex +
                ", size=" + size +
                ", array=" + sb;

    }

    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < length;
            }

            @Override
            public Integer next() {
                return array[currentIndex++];
            }

        };
        return it;
    }

}
