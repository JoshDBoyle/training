package com.accenture.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component( service = SignupService.class,
        configurationPolicy = ConfigurationPolicy.OPTIONAL)
@Designate(ocd = SignupService.Cfg.class)
public class SignupService {
    private static final Logger log = LoggerFactory.getLogger(SignupService.class);

    private Cfg cfg;

    public String getSuccessTitle() {
        return cfg.title();
    }

    public String getSuccessDescription() {
        return cfg.description();
    }

    public String getPath() {
        return cfg.path();
    }

    @Activate
    protected final void activate(final Cfg cfg) throws Exception {
        log.info("In SignupService.activate");
        log.info("Configured title:        " + cfg.title());
        log.info("Configured description:  " + cfg.description());
        log.info("Configured path:         " + cfg.path());

        this.cfg= cfg;
    }

    @ObjectClassDefinition(name = "Signup Service Configuration")
    public @interface Cfg {
        @AttributeDefinition(
                name = "title",
                description = "The title text to display given successful signup"
        )
        String title() default "Success!";

        @AttributeDefinition(
                name = "description",
                description = "The description text to display given successful signup"
        )
        String description() default "You've been successfully signed up!";

        @AttributeDefinition(
                name = "path",
                description = "The full path (node name included) where you want sign ups persisted"
        )
        String path() default "/content/usergenerated/signup";
    }
}
