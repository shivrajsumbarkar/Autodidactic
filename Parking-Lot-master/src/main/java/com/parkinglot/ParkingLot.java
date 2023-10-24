package com.parkinglot;

import java.util.*;

public class ParkingLot {
    private int capacity;
    private Map<String, Car> regNumToCar;
    private Map<Integer, Car> slotNumToCar;
    private TreeSet<Integer> freeSlots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        regNumToCar = new HashMap<String, Car>();
        slotNumToCar = new HashMap<Integer, Car>();
        freeSlots = new TreeSet<Integer>();
        for (int i = 1; i <= capacity; i++) {
            freeSlots.add(i);
        }
    }  

    public int parkCar(String regNum, String color) {
        if (regNumToCar.containsKey(regNum)) {
            System.out.println("Car with same RegNum already parked!");
            return -1;
        } else if (freeSlots.isEmpty()) {
            System.out.println("Sorry, parking lot is full");
            return -1;
        }
        Car newCar = new Car(regNum, color);
        regNumToCar.put(regNum, newCar);
        
//To do to calculate the charges as per parking hours
        int allocatedSlot = freeSlots.pollFirst();//Retrieves and removes the first (lowest) element, or returns null if this set is empty.
        newCar.setSlotNumber(allocatedSlot);
        slotNumToCar.put(allocatedSlot, newCar);

        System.out.println("Allocated slot number: " + allocatedSlot);
        return allocatedSlot;
    }

    public Car leaveCar(String regNum, int slotNum) {
        if (!slotNumToCar.containsKey(slotNum)) {
            System.out.println("Slot number " + slotNum + " is invalid, leave car aborted");
            System.out.println("Registration number " + regNum + " not found");
            return null;
        }
        Car evictCar = slotNumToCar.get(slotNum);
        regNumToCar.remove(evictCar.getRegNum());
        slotNumToCar.remove(slotNum);
        freeSlots.add(slotNum);
//        System.out.println("Slot number " + slotNum + " is free");
        System.out.println("Registration number "+ regNum +" with Slot number " + slotNum + " is free");
        return evictCar; 
    }

    public void printStatus() {
        System.out.println("Slot No.    Registration No");
        for (int i = 1; i <= capacity; i++) {
            Car car = slotNumToCar.get(i);
            if (car != null) {
                System.out.println(String.format("%-12s%-19s%s", i, car.getRegNum(), car.getColor()));
            }
        }
    }

	}
