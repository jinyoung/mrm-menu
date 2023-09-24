package mrmmenu.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmmenu.MenuApplication;

@Entity
@Table(name = "MenuGroup_table")
@Data
//<<< DDD / Aggregate Root
public class MenuGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String name;

    private String parent;

    private Integer ser;

    private Boolean isActive;

    private String selectedImg;

    private String deselectImg;

    private String type;

    public static MenuGroupRepository repository() {
        MenuGroupRepository menuGroupRepository = MenuApplication.applicationContext.getBean(
            MenuGroupRepository.class
        );
        return menuGroupRepository;
    }
}
//>>> DDD / Aggregate Root
