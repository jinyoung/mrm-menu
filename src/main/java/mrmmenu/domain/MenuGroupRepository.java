package mrmmenu.domain;

import mrmmenu.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "menuGroups",
    path = "menuGroups"
)
public interface MenuGroupRepository
    extends PagingAndSortingRepository<MenuGroup, Long> {}
