package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Car;


@Projection(types = Car.class)
public interface SellerTypeProjection {

    Long getId();

    String getName();

}
