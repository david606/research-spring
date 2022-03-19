package org.david.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author david
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setMaxSpeed(Float.valueOf(infos[0]));
        car.setBrand(infos[1]);
        car.setPrice(Double.valueOf(infos[2]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public String getCarInfo() {
        return carInfo;
    }
}
