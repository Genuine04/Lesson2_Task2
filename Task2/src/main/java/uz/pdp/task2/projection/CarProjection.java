package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Car;
import uz.pdp.task2.entity.SellerType;
import uz.pdp.task2.entity.User;


@Projection(types = Car.class)
public interface CarProjection {

    Long getId();

    String getName();

    int getYear();

    double getPrice();

    String getModel();

    String getVin();

    double getMileage();

    String getTransmission();

    String getStatus();

    String getColor();

    User getSeller();

    SellerType getSellerType();

    double getLan();

    double getLat();

}
