# Parking Lot Application

A parking lot application built in Java.

* The parking lot have a capacity of n slots.
* Each slot can only hold a car with a registration number .
* Cars is always allocated the nearest slot to the entrance (lowest slot number)
* Available commands:
    1. create_parking_lot of size `<Size>`
    2. park a car `<Car-Num>` 
    3. leave `<Car-Num>` `<Hour>`
    4. status
    

## Requirements

1. Latest JDK
2. Maven

## Installing the application (required before other steps)
`mvn clean install`

## Running unit tests
`mvn test`
- unit tests will also be executed during installation


## Running the application
   1. Interactive mode: `java -jar target/parkinglot-1.0.jar`
   2. File mode: `java -jar target/parkinglot-1.0.jar <filename>`