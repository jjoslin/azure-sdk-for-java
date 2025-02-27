// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.monitor.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.resourcemanager.monitor.MonitorManager;
import com.azure.resourcemanager.monitor.models.MetricDefinition;
import com.azure.resourcemanager.monitor.models.MetricDefinitions;
import com.azure.resourcemanager.monitor.fluent.MetricDefinitionsClient;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.utils.PagedConverter;

/** Implementation for {@link MetricDefinitions}. */
public class MetricDefinitionsImpl implements MetricDefinitions {

    private final MonitorManager myManager;

    public MetricDefinitionsImpl(final MonitorManager monitorManager) {
        this.myManager = monitorManager;
    }

    @Override
    public MonitorManager manager() {
        return this.myManager;
    }

    public MetricDefinitionsClient inner() {
        return this.myManager.serviceClient().getMetricDefinitions();
    }

    @Override
    public PagedIterable<MetricDefinition> listByResource(String resourceId) {
        return PagedConverter.mapPage(this.inner().list(ResourceUtils.encodeResourceId(resourceId)),
            inner -> new MetricDefinitionImpl(inner, myManager));
    }

    @Override
    public PagedFlux<MetricDefinition> listByResourceAsync(String resourceId) {
        return PagedConverter.mapPage(this.inner().listAsync(ResourceUtils.encodeResourceId(resourceId)),
            inner -> new MetricDefinitionImpl(inner, myManager));
    }
}
