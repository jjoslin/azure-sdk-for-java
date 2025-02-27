// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

/**
 * Samples for Extensions CreateOrUpdate.
 */
public final class ExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/
     * Extensions_CreateOrUpdate.json
     */
    /**
     * Sample code: Extensions_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void extensionsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.extensions()
            .define("provider.extension")
            .withExistingFarmBeat("examples-rg", "examples-farmbeatsResourceName")
            .create();
    }
}
