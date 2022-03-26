package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Car;
import uz.pdp.task2.entity.Model;


@Projection(types = Model.class)
public interface ModelProjection {

    Long getId();

    String getName();

}
