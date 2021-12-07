package com.accenture.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String buttonText;

    @ValueMapValue
    @Default(values="fa-cloud")
    private String iconCode;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getButtonText() {
        return buttonText;
    }

    public String getIconCode() {
        return iconCode;
    }
}

