package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Category;


@Projection(types = Category.class)
public interface CategoryProjection {

    Long getId();

    String getName();

}
