// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.ModuleInner;
import com.azure.resourcemanager.automation.models.ContentLink;
import com.azure.resourcemanager.automation.models.Module;
import com.azure.resourcemanager.automation.models.ModuleErrorInfo;
import com.azure.resourcemanager.automation.models.ModuleProvisioningState;
import com.azure.resourcemanager.automation.models.PythonPackageCreateParameters;
import com.azure.resourcemanager.automation.models.PythonPackageUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ModuleImpl implements Module, Module.Definition, Module.Update {
    private ModuleInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Boolean isGlobal() {
        return this.innerModel().isGlobal();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Long sizeInBytes() {
        return this.innerModel().sizeInBytes();
    }

    public Integer activityCount() {
        return this.innerModel().activityCount();
    }

    public ModuleProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ContentLink contentLink() {
        return this.innerModel().contentLink();
    }

    public ModuleErrorInfo error() {
        return this.innerModel().error();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean isComposite() {
        return this.innerModel().isComposite();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ModuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String packageName;

    private PythonPackageCreateParameters createParameters;

    private PythonPackageUpdateParameters updateParameters;

    public ModuleImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Module create() {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .createOrUpdateWithResponse(resourceGroupName, automationAccountName, packageName, createParameters,
                Context.NONE)
            .getValue();
        return this;
    }

    public Module create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .createOrUpdateWithResponse(resourceGroupName, automationAccountName, packageName, createParameters,
                context)
            .getValue();
        return this;
    }

    ModuleImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new ModuleInner();
        this.serviceManager = serviceManager;
        this.packageName = name;
        this.createParameters = new PythonPackageCreateParameters();
    }

    public ModuleImpl update() {
        this.updateParameters = new PythonPackageUpdateParameters();
        return this;
    }

    public Module apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .updateWithResponse(resourceGroupName, automationAccountName, packageName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public Module apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .updateWithResponse(resourceGroupName, automationAccountName, packageName, updateParameters, context)
            .getValue();
        return this;
    }

    ModuleImpl(ModuleInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.packageName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "python2Packages");
    }

    public Module refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .getWithResponse(resourceGroupName, automationAccountName, packageName, Context.NONE)
            .getValue();
        return this;
    }

    public Module refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPython2Packages()
            .getWithResponse(resourceGroupName, automationAccountName, packageName, context)
            .getValue();
        return this;
    }

    public ModuleImpl withContentLink(ContentLink contentLink) {
        this.createParameters.withContentLink(contentLink);
        return this;
    }

    public ModuleImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
