package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Car;
import uz.pdp.task2.entity.enums.InterestType;


@Projection(types = Car.class)
public interface UserProjection {

    Long getId();

    String getEmail();

    String getFirstName();

    String getLastName();

    String getUsername();

    String getPassword();

    InterestType getInterestType();

    String getPostalCode();

}
