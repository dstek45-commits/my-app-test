package com.adobe.aem.tutorial.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        adapters = { HeadingGroupModel.class, ComponentExporter.class },
        resourceType = "myproject/components/headinggroup",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeadingGroupModel implements ComponentExporter {

    @ValueMapValue
    @Default(values = "Default Heading")
    private String heading;

    @ValueMapValue
    @Default(values = "h2")
    private String headingType;

    @ValueMapValue
    @Default(values = "Default Subheading")
    private String subheading;

    public String getHeading() {
        return heading;
    }

    public String getHeadingType() {
        return headingType;
    }

    public String getSubheading() {
        return subheading;
    }

    @Override
    public String getExportedType() {
        return "myproject/components/headinggroup";
    }
}


