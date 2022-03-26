package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Car;
import uz.pdp.task2.entity.SellerType;


@Projection(types = SellerType.class)
public interface SellerTypeProjection {

    Long getId();

    String getName();

}
