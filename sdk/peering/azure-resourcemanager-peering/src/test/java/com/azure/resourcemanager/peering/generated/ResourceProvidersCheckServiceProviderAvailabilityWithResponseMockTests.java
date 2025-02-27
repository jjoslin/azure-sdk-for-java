// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.models.CheckServiceProviderAvailabilityInput;
import com.azure.resourcemanager.peering.models.Enum0;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceProvidersCheckServiceProviderAvailabilityWithResponseMockTests {
    @Test
    public void testCheckServiceProviderAvailabilityWithResponse() throws Exception {
        String responseStr = "\"Unavailable\"";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PeeringManager manager = PeeringManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Enum0 response = manager.resourceProviders()
            .checkServiceProviderAvailabilityWithResponse(
                new CheckServiceProviderAvailabilityInput().withPeeringServiceLocation("ayrhyrnx")
                    .withPeeringServiceProvider("ueedndrdvs"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(Enum0.UNAVAILABLE, response);
    }
}
