// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureEventDetails;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaAzureEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaAzureEventDetails model = BinaryData.fromString(
            "{\"instanceType\":\"HyperVReplicaAzure\",\"containerName\":\"psimsf\",\"fabricName\":\"pofqpmbhy\",\"remoteContainerName\":\"sdrmmttjxophgerh\"}")
            .toObject(HyperVReplicaAzureEventDetails.class);
        Assertions.assertEquals("psimsf", model.containerName());
        Assertions.assertEquals("pofqpmbhy", model.fabricName());
        Assertions.assertEquals("sdrmmttjxophgerh", model.remoteContainerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaAzureEventDetails model = new HyperVReplicaAzureEventDetails().withContainerName("psimsf")
            .withFabricName("pofqpmbhy")
            .withRemoteContainerName("sdrmmttjxophgerh");
        model = BinaryData.fromObject(model).toObject(HyperVReplicaAzureEventDetails.class);
        Assertions.assertEquals("psimsf", model.containerName());
        Assertions.assertEquals("pofqpmbhy", model.fabricName());
        Assertions.assertEquals("sdrmmttjxophgerh", model.remoteContainerName());
    }
}
