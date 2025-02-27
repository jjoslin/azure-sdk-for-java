// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.ServerUsageInner;

public final class ServerUsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerUsageInner model = BinaryData.fromString(
            "{\"name\":\"rjvzuyt\",\"resourceName\":\"mlmuowol\",\"displayName\":\"uir\",\"currentValue\":52.581829080184136,\"limit\":78.64054728971267,\"unit\":\"nw\",\"nextResetTime\":\"2021-02-20T02:06:19Z\"}")
            .toObject(ServerUsageInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerUsageInner model = new ServerUsageInner();
        model = BinaryData.fromObject(model).toObject(ServerUsageInner.class);
    }
}
