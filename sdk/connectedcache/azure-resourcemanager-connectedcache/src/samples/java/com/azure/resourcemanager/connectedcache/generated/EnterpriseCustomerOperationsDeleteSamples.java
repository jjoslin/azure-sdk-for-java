// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.generated;

/**
 * Samples for EnterpriseCustomerOperations Delete.
 */
public final class EnterpriseCustomerOperationsDeleteSamples {
    /*
     * x-ms-original-file: 2023-05-01-preview/EnterpriseCustomerOperations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnterpriseCustomerOperations_Delete.
     * 
     * @param manager Entry point to ConnectedCacheManager.
     */
    public static void
        enterpriseCustomerOperationsDelete(com.azure.resourcemanager.connectedcache.ConnectedCacheManager manager) {
        manager.enterpriseCustomerOperations()
            .deleteByResourceGroupWithResponse("rgConnectedCache",
                "jeubxmhiaihcusgnahblvvckbdcetacvqgwbohlrqucodtlwuyefpejskvamgrdnwgucziodcfpjhqy",
                com.azure.core.util.Context.NONE);
    }
}
