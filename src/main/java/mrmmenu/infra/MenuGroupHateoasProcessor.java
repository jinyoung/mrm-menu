package mrmmenu.infra;

import mrmmenu.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MenuGroupHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MenuGroup>> {

    @Override
    public EntityModel<MenuGroup> process(EntityModel<MenuGroup> model) {
        return model;
    }
}
