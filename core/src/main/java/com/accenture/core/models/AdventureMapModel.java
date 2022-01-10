package com.accenture.core.models;

import com.adobe.cq.wcm.core.components.models.Teaser;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.factory.ModelFactory;
import com.adobe.cq.wcm.core.components.models.Image;

import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = "training/components/adventureMap")
public class AdventureMapModel {

    @Self
    private SlingHttpServletRequest request;

    @OSGiService
    private ModelFactory modelFactory;

    @ValueMapValue
    private String title;

    @ValueMapValue
    @Default(values="fa-cloud")
    private String iconA1;

    @ValueMapValue
    @Default(values="fa-cloud")
    private String iconA2;

    @ValueMapValue
    @Default(values="fa-cloud")
    private String iconA3;

    @ValueMapValue
    @Default(values="fa-child")
    private String iconB1;

    @ValueMapValue
    @Default(values="fa-child")
    private String iconB2;

    @ValueMapValue
    @Default(values="fa-child")
    private String iconB3;


    public String getTitle() {

        return title;
    }


    public String getIconA1() {
        return iconA1;
    }

    public String getIconA2() {
        return iconA2;
    }

    public String getIconA3() {
        return iconA3;
    }

    public String getIconB1() {
        return iconB1;
    }

    public String getIconB2() {
        return iconB2;
    }

    public String getIconB3() {
        return iconB3;
    }
}

