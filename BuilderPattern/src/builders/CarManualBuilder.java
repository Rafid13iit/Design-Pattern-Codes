package builders;

import cars.CarType;
import cars.Manual;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

/*
 * CarManualBuilder: This concrete builder implements the Builder interface and provides the steps 
 * to create a Manual object, which is a documentation for the car.
 *
 * CarManualBuilder: এই কংক্রিট বিল্ডার Builder ইন্টারফেসটি বাস্তবায়ন করে এবং একটি Manual অবজেক্ট 
 * তৈরি করার জন্য প্রয়োজনীয় ধাপগুলি প্রদান করে, যা গাড়ির ডকুমেন্টেশন।
 */
