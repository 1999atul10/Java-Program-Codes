import java.util.*;

class priorityQueue {
    void heapify(ArrayList<Integer> hT, int i) {
        int size = hT.size();
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && hT.get(left) > hT.get(largest))
            largest = left;
        if (right < size && hT.get(right) > hT.get(largest))
            largest = right;
        if (largest != i) {
            int temp = hT.get(largest);
            hT.set(largest, hT.get(i));
            hT.set(i, temp);
            heapify(hT, largest);
        }
    }

    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(newNum);
        } else {
            hT.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }
        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);
        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<>();
        int size = array.size();
        priorityQueue h = new priorityQueue();
        h.insert(array, 10);
        h.insert(array, 5);
        h.insert(array, 2);
        h.insert(array, 1);
        h.insert(array, 9);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}