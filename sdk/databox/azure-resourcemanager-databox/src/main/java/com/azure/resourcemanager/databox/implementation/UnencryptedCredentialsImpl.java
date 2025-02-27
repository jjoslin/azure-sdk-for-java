// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

import com.azure.resourcemanager.databox.fluent.models.UnencryptedCredentialsInner;
import com.azure.resourcemanager.databox.models.JobSecrets;
import com.azure.resourcemanager.databox.models.UnencryptedCredentials;

public final class UnencryptedCredentialsImpl implements UnencryptedCredentials {
    private UnencryptedCredentialsInner innerObject;

    private final com.azure.resourcemanager.databox.DataBoxManager serviceManager;

    UnencryptedCredentialsImpl(UnencryptedCredentialsInner innerObject,
        com.azure.resourcemanager.databox.DataBoxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String jobName() {
        return this.innerModel().jobName();
    }

    public JobSecrets jobSecrets() {
        return this.innerModel().jobSecrets();
    }

    public UnencryptedCredentialsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databox.DataBoxManager manager() {
        return this.serviceManager;
    }
}
