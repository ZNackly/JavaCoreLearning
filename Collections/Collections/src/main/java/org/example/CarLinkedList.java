package org.example;

public class CarLinkedList implements CarList {
    private Node first;
    private int size = 0;

    private Node last;


    @Override
    public Car get(int index) {

    }

    @Override
    public void add(Car car) {
        if(size == 0){
            Node node = new Node(null, car, null);
            first = node;
            last = first;
        }else{
            Node secondLast = last;
            last = new Node(secondLast, car, null);
            secondLast.next = last;
        }
        size++;
    }

    @Override
    public void add(Car car, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (index == size){
            add(car);
        }
    }

    @Override
    public boolean remove(Car car) {
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }
    private Node getNode(int index){
        Node node = first;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    public static class Node(){
        public Node previous;
        public Car value;
        public Node next;


        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}
