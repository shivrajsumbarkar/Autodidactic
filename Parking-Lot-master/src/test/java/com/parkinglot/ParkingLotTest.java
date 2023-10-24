package com.parkinglot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
	ParkingLot parkingLot;
	String TEST_REG_NUM = "test-reg-num";
	String TEST_COLOR = "test-color";

	@Before
	public void init() {
		parkingLot = new ParkingLot(3);
	}

	@Test
	public void testParkCarSucceed() {
		int expectedAllocatedSlot = 1;
		int actualAllocatedSlot = parkingLot.parkCar(TEST_REG_NUM, TEST_COLOR);

		assertEquals(actualAllocatedSlot, expectedAllocatedSlot);
	}

	@Test
	public void testParkCarNoSlotLeft() {
		int expectedAllocatedSlot = -1;
		parkingLot = new ParkingLot(0);
		int actualAllocatedSlot = parkingLot.parkCar(TEST_REG_NUM, TEST_COLOR);

		assertEquals(actualAllocatedSlot, expectedAllocatedSlot);
	}

	@Test
	public void testParkCarDuplicated() {
		int expectedAllocatedSlot = -1;
		parkingLot.parkCar(TEST_REG_NUM, TEST_COLOR);
		int actualAllocatedSlot = parkingLot.parkCar(TEST_REG_NUM, TEST_COLOR);

		assertEquals(actualAllocatedSlot, expectedAllocatedSlot);
	}

	@Test
	public void testLeaveCarSucceed() {
		int allocatedSlot = parkingLot.parkCar(TEST_REG_NUM, TEST_COLOR);
		Car evictedCar = parkingLot.leaveCar(TEST_REG_NUM,allocatedSlot);

		assertNotNull(evictedCar);
	}

	@Test
	public void testLeaveCarInvalid() {
		Car evictedCar = parkingLot.leaveCar(TEST_REG_NUM,99);

		assertNull(evictedCar);
	}

}