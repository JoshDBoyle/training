package com.accenture.core.services;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component( service = AdventureMapService.class,
        configurationPolicy = ConfigurationPolicy.OPTIONAL)
@Designate(ocd = AdventureMapService.Cfg.class)
public class AdventureMapService {
    private static final Logger log = LoggerFactory.getLogger(AdventureMapService.class);

    private Cfg cfg;

    public String getSuccessTitle() {
        return cfg.title();
    }

    public String getSuccessIconA1() {
        return cfg.iconA1();
    }

    public String getSuccessIconA2() {
        return cfg.iconA2();
    }

    public String getSuccessIconA3() {
        return cfg.iconA3();
    }

    public String getSuccessIconB1() {
        return cfg.iconB1();
    }

    public String getSuccessIconB2() {
        return cfg.iconB2();
    }

    public String getSuccessIconB3() {
        return cfg.iconB3();
    }


    @Activate
    protected final void activate(final Cfg cfg) throws Exception {
        log.info("In AdventureMapService.activate");
        log.info("Configured title:        " + cfg.title());
        log.info("Icon A1:        " + cfg.iconA1());

        log.info("Icon A2:        " + cfg.iconA2());
        log.info("Icon A3:        " + cfg.iconA3());
        log.info("Icon B1:        " + cfg.iconB1());
        log.info("Icon B2:        " + cfg.iconB2());
        log.info("Icon B3:        " + cfg.iconB3());

        this.cfg= cfg;
    }

    @ObjectClassDefinition(name = "AdventureMap Service Configuration")
    public @interface Cfg {
        @AttributeDefinition(
                name = "title",
                description = "The title text to display given successful signup"
        )
        String title() default "Success!";

        @AttributeDefinition(
                name = "iconA1",
                description = "Icon"
        )
        String iconA1() default "fa-rocket";

        @AttributeDefinition(
                name = "iconA2",
                description = "Icon"
        )
        String iconA2() default "fa-dragon";

        @AttributeDefinition(
                name = "iconA3",
                description = "Icon"
        )
        String iconA3() default "fa-cloud";

        @AttributeDefinition(
                name = "iconB1",
                description = "Icon"
        )
        String iconB1() default "fa-child";

        @AttributeDefinition(
                name = "iconB2",
                description = "Icon"
        )
        String iconB2() default "fa-car";

        @AttributeDefinition(
                name = "iconB3",
                description = "Icon"
        )
        String iconB3() default "fa-gift";

    }
}