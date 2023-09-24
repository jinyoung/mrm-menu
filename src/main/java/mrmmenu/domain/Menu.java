package mrmmenu.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmmenu.MenuApplication;

@Entity
@Table(name = "Menu_table")
@Data
//<<< DDD / Aggregate Root
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;

    private String name;

    private Boolean isChild;

    private String pageName;

    private Integer ser;

    private Boolean isActive;

    private String mode;

    private String root;

    private String type;

    @Embedded
    private MenuGroupId menuGroupId;

    public static MenuRepository repository() {
        MenuRepository menuRepository = MenuApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }
}
//>>> DDD / Aggregate Root
