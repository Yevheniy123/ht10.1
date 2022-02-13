package iterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

public class CollectionClass {

    public class CollectionIterator implements Iterator {
        private int index = -1;


        public boolean hasNext() {
            return (index + 1 < count);
        }


        public Object next() {
            if(!hasNext()) throw new NoSuchElementException("Элемент отсутствует");
            index++;
            return objectCollection[index];
        }


        public void reset() {
            count = 0;
        }
    }

    private CollectionIterator iterator = new CollectionIterator();
    private int startSize = 10;
    private int count;
    private Object[] objectCollection;

    public CollectionClass() {
        objectCollection = new Object[startSize];
        count = 0;
    }

    public CollectionClass(int size) {
        objectCollection = new Object[size];
        count = 0;
    }



    public Iterator getIterator() {
        return iterator;
    }


    public boolean add(Object obj) {
        if (count + 1 > objectCollection.length) changeSize();
        objectCollection[count++] = obj;
        return true;
    }


    public boolean add(int index, Object object) {
        if (count + 2 > objectCollection.length) changeSize();

        if (index > count || index < 0) return false;
        if (count + 1 - index >= 0) System.arraycopy(objectCollection, index, objectCollection, index + 1, count + 1 - index);
        objectCollection[count] = object;
        count++;
        return true;
    }


    public boolean delete(Object object)  {
        int temp = -1;
        for (int i = 0; i <= count; i++) {
            try {
                if (objectCollection[i].equals(object)) {
                    temp = i;
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("НЕТ");
            }
        }
        delete(temp);
        return true;
    }


    public boolean delete(int index) {
        if (index > objectCollection.length) return false;
        else {
            if (count - index >= 0)
                System.arraycopy(objectCollection, index + 1, objectCollection, index, count - index);
            count--;
        }
        return true;
    }


    public Object get(int index) {
        if (index > count || index < 0) throw new ArrayIndexOutOfBoundsException("Индекс не найден ");
        else return objectCollection[index];
    }


    public boolean contain(Object object) {
        for (Object obj : objectCollection) return object.equals(obj);
        return false;
    }


    public boolean equals(Collection str) {
        if (this.getClass() != str.getClass()) return false;
        if (str == this) return true;
        CollectionClass collection = (CollectionClass) str;
        return Arrays.equals(this.objectCollection, collection.objectCollection) && (this.count == collection.count);
    }


    public boolean clear() {
        if (objectCollection.length == startSize) objectCollection = new Object[startSize];
        else objectCollection = new Object[objectCollection.length];
        return true;
    }


    public int size() {
        return count;
    }

    private void changeSize() {
        int sizeObject = objectCollection.length * 2 / 3 + 1;
        Object[] Array = new Object[objectCollection.length + sizeObject];
        System.arraycopy(objectCollection, 0, Array, 0, objectCollection.length);
        objectCollection = Array;
    }

    public void show() {
        for (Object o : objectCollection) {
            System.out.print(o+" ");
        }
    }


}