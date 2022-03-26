package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Category;
import uz.pdp.task2.entity.DealTank;
import uz.pdp.task2.entity.Series;

import java.util.Date;


@Projection(types = DealTank.class)
public interface DealTankProjection {

    Long getId();

    Category getCategory();

    Series getSeries();

    Date getFromYear();

    Date getToYear();

}
