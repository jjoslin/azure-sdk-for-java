// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IotDpsResourcesGetPrivateEndpointConnectionWitMockTests {
    @Test
    public void testGetPrivateEndpointConnectionWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"git\"},\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"edjvcslynqw\",\"actionsRequired\":\"cwzzhxgktr\"}},\"id\":\"ucnapkteoellwp\",\"name\":\"fdygpfqbuaceopz\",\"type\":\"qrhhu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IotDpsManager manager = IotDpsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.iotDpsResources()
            .getPrivateEndpointConnectionWithResponse("xknalaulppg", "dtpnapnyiropuhp", "gvpgy",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("edjvcslynqw", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cwzzhxgktr",
            response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
