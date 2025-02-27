// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresql.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.models.PrivateEndpointConnection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"t\"},\"privateLinkServiceConnectionState\":{\"status\":\"kxn\",\"description\":\"edabgyvudtjue\",\"actionsRequired\":\"cihxuuwhcjyx\"},\"provisioningState\":\"ybvpay\"},\"id\":\"kkudzp\",\"name\":\"gwjplmag\",\"type\":\"tcyohpfkyrk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnection> response
            = manager.privateEndpointConnections().listByServer("r", "il", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("t", response.iterator().next().privateEndpoint().id());
        Assertions.assertEquals("kxn", response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("edabgyvudtjue",
            response.iterator().next().privateLinkServiceConnectionState().description());
    }
}
