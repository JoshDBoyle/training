package com.accenture.core.servlets;

import com.accenture.core.services.SignupService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Component( service = Servlet.class,
        property={
                "sling.servlet.methods=" + HttpConstants.METHOD_POST,
                "sling.servlet.paths="+ "/bin/training/signup"
        })
@ServiceDescription("Signup Servlet")
public class SignupServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Reference
    private SignupService sus;

    @Override
    protected void doPost(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws ServletException, IOException {
        String datetime = Calendar.getInstance().getTime().toString();
        if (null == request.getResourceResolver().getResource(sus.getPath())) {
            Map<String, Object> props = new HashMap<>();

            props.put("jcr:primaryType", "nt:unstructured");
            props.put("signupdate", datetime);

            ResourceUtil.getOrCreateResource(
                    request.getResourceResolver(),
                    sus.getPath(),
                    props,
                    "nt:unstructured",
                    true);
        } else {
            ModifiableValueMap mvm = request.getResourceResolver().getResource(sus.getPath()).adaptTo(ModifiableValueMap.class);
            if (null != mvm) {
                mvm.put("signupdate", datetime);
                request.getResourceResolver().commit();
            }
        }

        response.setContentType("text/plain");
        response.getWriter().write(datetime);
    }
}