// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractProperties;
import org.junit.jupiter.api.Assertions;

public final class GatewayHostnameConfigurationContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayHostnameConfigurationContractProperties model = BinaryData.fromString(
            "{\"hostname\":\"fyszzaczsinqbdnd\",\"certificateId\":\"bozsyvr\",\"negotiateClientCertificate\":true,\"tls10Enabled\":true,\"tls11Enabled\":true,\"http2Enabled\":true}")
            .toObject(GatewayHostnameConfigurationContractProperties.class);
        Assertions.assertEquals("fyszzaczsinqbdnd", model.hostname());
        Assertions.assertEquals("bozsyvr", model.certificateId());
        Assertions.assertEquals(true, model.negotiateClientCertificate());
        Assertions.assertEquals(true, model.tls10Enabled());
        Assertions.assertEquals(true, model.tls11Enabled());
        Assertions.assertEquals(true, model.http2Enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayHostnameConfigurationContractProperties model
            = new GatewayHostnameConfigurationContractProperties().withHostname("fyszzaczsinqbdnd")
                .withCertificateId("bozsyvr")
                .withNegotiateClientCertificate(true)
                .withTls10Enabled(true)
                .withTls11Enabled(true)
                .withHttp2Enabled(true);
        model = BinaryData.fromObject(model).toObject(GatewayHostnameConfigurationContractProperties.class);
        Assertions.assertEquals("fyszzaczsinqbdnd", model.hostname());
        Assertions.assertEquals("bozsyvr", model.certificateId());
        Assertions.assertEquals(true, model.negotiateClientCertificate());
        Assertions.assertEquals(true, model.tls10Enabled());
        Assertions.assertEquals(true, model.tls11Enabled());
        Assertions.assertEquals(true, model.http2Enabled());
    }
}
