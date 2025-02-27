// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.BuilderResource;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BuildersListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"environmentId\":\"umljcirvpef\",\"containerRegistries\":[{\"containerRegistryServer\":\"veitit\",\"identityResourceId\":\"nsxzajlns\"}]},\"identity\":{\"principalId\":\"82ee0be0-090e-4ccc-818f-81f37399dca8\",\"tenantId\":\"e06e5929-004b-4bc5-85f0-b7255f9c8376\",\"type\":\"None\",\"userAssignedIdentities\":{\"xqvmvuay\":{\"principalId\":\"ebdb161f-384c-40a8-8c97-1ade775ffd9c\",\"clientId\":\"28b5e898-e0fa-4cc9-9d87-8d3f196899ba\"},\"dxk\":{\"principalId\":\"829c9a90-8bc7-479a-899e-a6db4e80e245\",\"clientId\":\"f2bc9f76-b941-4611-9c17-3c102575ee8b\"}}},\"location\":\"qbwpntghyk\",\"tags\":{\"vlzladl\":\"cdrnxsl\",\"pbqhvfdqqjwkr\":\"x\",\"atuztjct\":\"wzdanojisgglmvo\",\"wakwseivmakxhys\":\"bpvbkaehxsmzygd\"},\"id\":\"wljuxlkbectvt\",\"name\":\"j\",\"type\":\"skdchmaiubavl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BuilderResource> response
            = manager.builders().listByResourceGroup("ipowza", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qbwpntghyk", response.iterator().next().location());
        Assertions.assertEquals("cdrnxsl", response.iterator().next().tags().get("vlzladl"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("umljcirvpef", response.iterator().next().environmentId());
        Assertions.assertEquals("veitit",
            response.iterator().next().containerRegistries().get(0).containerRegistryServer());
        Assertions.assertEquals("nsxzajlns",
            response.iterator().next().containerRegistries().get(0).identityResourceId());
    }
}
