//package com.accenture.core.models;
//
//
//import com.adobe.cq.wcm.core.components.commons.link.Link;
//import com.adobe.cq.wcm.core.components.models.ListItem;
//import com.adobe.cq.wcm.core.components.models.Navigation;
//import com.adobe.cq.wcm.core.components.models.Teaser;
//import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
//import org.apache.sling.api.SlingHttpServletRequest;
//import org.apache.sling.api.resource.Resource;
//import org.apache.sling.models.annotations.DefaultInjectionStrategy;
//import org.apache.sling.models.annotations.Model;
//import org.apache.sling.models.annotations.Via;
//import org.apache.sling.models.annotations.injectorspecific.Self;
//import org.apache.sling.models.annotations.via.ResourceSuperType;
//
//import java.util.List;
//
//@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, adapters = Navigation.class, resourceType = "training/components/header")
//public class HeaderModel implements Navigation {
//
//
//    @Self
//    @Via(type = ResourceSuperType.class)
//    private Navigation navigation;
//
//
//    @Override
//    public String getDescription() {
//        return teaser.getDescription() + "\nDisclaimer: I'm an AEM Ninja";
//    }
//
//    @Override
//    public boolean isActionsEnabled() {
//        return teaser.isActionsEnabled();
//    }
//
//    @Override
//    public List<ListItem> getActions() {
//        return teaser.getActions();
//    }
//
//    @Override
//    public Link getLink() {
//        return teaser.getLink();
//    }
//
//    @Override
//    public String getLinkURL() {
//        return teaser.getLinkURL();
//    }
//
//
//
//
//
//}
