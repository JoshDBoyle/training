package com.accenture.core.servlets;

import com.accenture.core.services.AdventureMapService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

import com.google.gson.JsonObject;

@Component(
        service = Servlet.class,
        property = {
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.paths="+ "/bin/training/adventureMap"
        }
)
@ServiceDescription("Adventure Map Servlet")
public class AdventureMapServlet extends SlingSafeMethodsServlet {


    @Reference
    private AdventureMapService adv;

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        JsonObject jsonResponse = new JsonObject();

        resp.setContentType("application/json");

        jsonResponse.addProperty("title", "Marc");
        jsonResponse.addProperty("iconA1", adv.getSuccessIconA1());
        jsonResponse.addProperty("iconA2", adv.getSuccessIconA2());
        jsonResponse.addProperty("iconA3", adv.getSuccessIconA3());
        jsonResponse.addProperty("iconB1", adv.getSuccessIconB1());
        jsonResponse.addProperty("iconB2", adv.getSuccessIconB2());
        jsonResponse.addProperty("iconB3", adv.getSuccessIconB3());


        resp.getWriter().write(jsonResponse.toString());



    }

}
