package com.prac.demo;
/**
 * Complexity of HashMap
 * method		Best						Worst
 * put(K,V)		O(1) (Order Of 1)			O(n)
 * get(K)		O(1)						O(n)
 * 
 * In Java 8 Internally, LinkedList replaces with Balanced Search Tree (i.e Black Red Tree)
 * 
 * So, This improves the worst case performance from O(n) to O(logn)
 * 
 * HashMap resize:
 * 		Default initial capacity of the HashMap takes is 16 and load factor is 0.75f (i.e 75% of current map size).
 * 		The load factor represents at what level the HashMap capacity should be doubled.
 *  	For example product of capacity and load factor as 16 * 0.75 = 12 
 * @author SHIVRAJ S. UMBARKAR
 *
 */
 

public class CustomHashMap<K,V> {

    private int capacity = 16; //Initial default capacity

    private Entry [] table; //Array of Entry object

    public CustomHashMap(){
        table = new Entry[capacity];
    }

    public CustomHashMap(int capacity){
        this.capacity = capacity;
        table = new Entry[capacity];
    } 

    public void put(K key, V value){
        int index = index(key);
        Entry<K,V> newEntry = new Entry<>(key, value, null);
        if(table[index] == null){
            table[index] = newEntry;
        }else {
        	Entry<K,V> previousNode = null;
        	Entry<K,V> currentNode = table[index];
            while(currentNode != null){ 
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
            }
    }
    

    public V get(K key){
        V value = null;
        int index = index(key);
        Entry<K,V>  entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key){ 
        int index = index(key);
        Entry<K,V> previous = null;
        Entry<K,V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                if(previous == null){
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                }else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public void display(){
        for(int i = 0; i < capacity; i++){
            if(table[i] != null){
                Entry currentNode = table[i];
                while (currentNode != null){
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }
}


 class Entry<K,V> {

    private K key;
    private V value;
    private Entry<K,V> next;

    public Entry(K key, V value, Entry<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}


