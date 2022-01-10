package com.accenture.core.models;

import com.adobe.cq.wcm.core.components.commons.link.Link;
import com.adobe.cq.wcm.core.components.models.ListItem;
import com.adobe.cq.wcm.core.components.models.Teaser;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.via.ResourceSuperType;

import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, adapters = Teaser.class, resourceType = "training/components/textAndImage")
public class TextAndImageModel implements Teaser {

    @Self
    @Via(type = ResourceSuperType.class)
    private Teaser teaser;

    @Override
    public String getDescription() {
        return teaser.getDescription() + "\nDisclaimer: I'm an AEM Ninja";
    }

    @Override
    public boolean isActionsEnabled() {
        return teaser.isActionsEnabled();
    }

    @Override
    public List<ListItem> getActions() {
        return teaser.getActions();
    }

    @Override
    public Link getLink() {
        return teaser.getLink();
    }

    @Override
    public String getLinkURL() {
        return teaser.getLinkURL();
    }

    @Override
    public Resource getImageResource() {
        return teaser.getImageResource();
    }

    @Override
    public boolean isImageLinkHidden() {
        return teaser.isImageLinkHidden();
    }

    @Override
    public String getPretitle() {
        return teaser.getPretitle();
    }

    @Override
    public String getTitle() {
        return teaser.getTitle();
    }

    @Override
    public boolean isTitleLinkHidden() {
        return teaser.isTitleLinkHidden();
    }

    @Override
    public String getTitleType() {
        return teaser.getTitleType();
    }

    @Override
    public String getId() {
        return teaser.getId();
    }

    @Override
    public ComponentData getData() {
        return teaser.getData();
    }

    @Override
    public String getAppliedCssClasses() {
        return teaser.getAppliedCssClasses();
    }

    @Override
    public String getExportedType() {
        return teaser.getExportedType();
    }
}
