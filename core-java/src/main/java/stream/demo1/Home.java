package stream.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/12 22:32
 * @Author: Ling Chen
 * @Description:
 */
@Data
@AllArgsConstructor
public class Home {
    private String homeName;
    private List<Man> men;
}
