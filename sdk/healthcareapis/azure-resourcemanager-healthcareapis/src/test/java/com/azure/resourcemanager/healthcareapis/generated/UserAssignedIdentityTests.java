// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.UserAssignedIdentity;

public final class UserAssignedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedIdentity model = BinaryData.fromString(
            "{\"principalId\":\"818ba509-5286-415a-a478-5d311bbb6ef9\",\"clientId\":\"cf60b310-61d2-43e9-98d9-2a9f7d9bdfaa\"}")
            .toObject(UserAssignedIdentity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedIdentity model = new UserAssignedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
    }
}
