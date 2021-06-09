package kz.bcc.tutorial.balatime.model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CustomPagination {

    private Object list;
    private Integer totalSize;
    private Integer size;
    private Integer page;
}
