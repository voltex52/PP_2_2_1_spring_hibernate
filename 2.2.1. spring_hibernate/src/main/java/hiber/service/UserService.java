package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void addWithCar(User user, Car car);
    List<User> listUsers();
    User getUserByCar(String model, int series);
}
