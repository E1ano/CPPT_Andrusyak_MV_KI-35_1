package Lab7AndrusiakKI35;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Shuttle<T extends ShuttleObject>{
    private List<T> listOfObj;

    public Shuttle() {
        listOfObj = new ArrayList<>();
    }

    public void Add(T element) {
        listOfObj.add(element);
    }

    public T Remove(T element) {
        int index = listOfObj.indexOf(element);
        T currentVariable = listOfObj.get(index);
        listOfObj.remove(element);
        return currentVariable;
    }

    public void SortMinToMax() {
        Comparator<T> comparator = new Comparator<T>(){

            @Override
            public int compare(T o1, T o2) {
                return o1.getValueObj() - o2.getValueObj();
            }
        };

        listOfObj.sort(comparator);
    }

    public void SortMaxToMin() {
        Comparator<T> comparator = new Comparator<T>(){

            @Override
            public int compare(T o1, T o2) {
                return o2.getValueObj() - o1.getValueObj();
            }
        };

        listOfObj.sort(comparator);
    }

    public T findMinElement() {
        T current = listOfObj.get(0);

        for (T element: listOfObj) {
            if ( current.getValueObj() > element.getValueObj()) {
                current = element;
            }
        }

        return current;
    }

    public T findMaxElement() {
        T current = listOfObj.get(0);

        for (T element: listOfObj) {
            if ( current.getValueObj() < element.getValueObj()) {
                current = element;
            }
        }

        return current;
    }

    public void printAll() {
        for (T element: listOfObj) {
            System.out.println(element);
        }
    }
}

