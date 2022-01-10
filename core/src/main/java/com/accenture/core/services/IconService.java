package com.accenture.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component( service = IconService.class,
            configurationPolicy = ConfigurationPolicy.OPTIONAL)
@Designate(ocd = IconService.Cfg.class)
public class IconService {

    private static final Logger log = LoggerFactory.getLogger(IconService.class);

    private Cfg cfg;

    private List<String> icons = new ArrayList<>();

    public List<String> getIcons() {
        return icons;
    }

    @Activate
    protected final void activate(final Cfg cfg) throws Exception {
        this.cfg = cfg;
        icons = Arrays.asList(cfg.icons());
    }



    @ObjectClassDefinition(name = "Icon Service Configuration")
    public @interface Cfg {
        @AttributeDefinition(
                name = "icons",
                description = "The icons to display"
        )
        String[] icons();
    }


}
