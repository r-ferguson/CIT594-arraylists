/*
 * I attest that the code in this file is entirely my own except for the starter
 * code provided with the assignment and the following exceptions:
 * <
 * Enter all external resources and collaborations here. Note external code may
 * reduce your score but appropriate citation is required to avoid academic
 * integrity violations. Please see the Course Syllabus as well as the
 * university code of academic integrity:
 *  https://catalog.upenn.edu/pennbook/code-of-academic-integrity/
 * >
 * Signed,
 * Author: Ryan Ferguson
 * Penn email: <rfergu1@seas.upenn.edu>
 * Date: <2022-08-29>
 */

public class MyArrayList<E> {

    /*
     * Do not change this initial capacity; it is used by our test cases
     */
    private static final int INITIAL_CAPACITY = 4;

    /*
     * These are protected so that test cases can access them. Please do not change
     * the visibility of these fields!
     */
//    protected String[] data;
    protected Object[] data;
    protected int size = 0;

    public MyArrayList() {
//        data = new String[INITIAL_CAPACITY];
        data = new E[INITIAL_CAPACITY];
    }

    /*
     * Need to implement this in step 5
     */
//    public MyArrayList(String[] arr) {
    public MyArrayList(E[] arr) {

    }

//    public String get(int index) {
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else
            return data[index];
    }

    private void increaseCapacity() {
//        String[] newData = new String[Math.max(2 * data.length, INITIAL_CAPACITY)];
        Object[] newData = new Object[Math.max(2 * data.length, INITIAL_CAPACITY)];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    /*
     * This method adds the element to the list. Except for modifying it to use Java
     * Generics, DO NOT OTHERWISE CHANGE THIS METHOD as it is used in testing your
     * code.
     */
//    public void add(String value) {
    public void add(E value) {
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = value;
    }

//    public void add(int index, String element) {
    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == data.length) {
            increaseCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

//    public String remove(int index)
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        String target = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;
        return target;
    }

    /*
     * Need to implement this in Step 2.
     */
//    public boolean remove(String obj) {
    public boolean remove(E obj) {
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + data[i]);
        }
    }

//    public boolean contains(String obj) {
    public boolean contains(E obj) {
        for (int i = 0; i < size; i++) {
            if (obj == data[i] || (data[i] != null && data[i].equals(obj)))
                return true;
        }
        return false;
    }

    /*
     * Need to implement this in Step 4
     */
//    public String set(int index, String obj) {
//        return null;
//    }
    public E set(int index, E obj) {
        return null;
    }

}