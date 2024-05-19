package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

/*
 * Builder: This interface declares the steps required to build a product (in this case, a car).
 * All concrete builders should implement these steps.
 *
 * Builder: এই ইন্টারফেসটি একটি পণ্য (এই ক্ষেত্রে, একটি গাড়ি) তৈরি করার জন্য প্রয়োজনীয় ধাপগুলি ঘোষণা করে।
 * সমস্ত কংক্রিট বিল্ডারদের এই ধাপগুলি বাস্তবায়ন করা উচিত।
 */
