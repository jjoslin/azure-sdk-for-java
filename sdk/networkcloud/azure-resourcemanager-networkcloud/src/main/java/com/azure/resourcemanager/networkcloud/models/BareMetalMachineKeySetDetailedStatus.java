// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The more detailed status of the key set.
 */
public final class BareMetalMachineKeySetDetailedStatus
    extends ExpandableStringEnum<BareMetalMachineKeySetDetailedStatus> {
    /**
     * Static value AllActive for BareMetalMachineKeySetDetailedStatus.
     */
    public static final BareMetalMachineKeySetDetailedStatus ALL_ACTIVE = fromString("AllActive");

    /**
     * Static value SomeInvalid for BareMetalMachineKeySetDetailedStatus.
     */
    public static final BareMetalMachineKeySetDetailedStatus SOME_INVALID = fromString("SomeInvalid");

    /**
     * Static value AllInvalid for BareMetalMachineKeySetDetailedStatus.
     */
    public static final BareMetalMachineKeySetDetailedStatus ALL_INVALID = fromString("AllInvalid");

    /**
     * Static value Validating for BareMetalMachineKeySetDetailedStatus.
     */
    public static final BareMetalMachineKeySetDetailedStatus VALIDATING = fromString("Validating");

    /**
     * Creates a new instance of BareMetalMachineKeySetDetailedStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BareMetalMachineKeySetDetailedStatus() {
    }

    /**
     * Creates or finds a BareMetalMachineKeySetDetailedStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BareMetalMachineKeySetDetailedStatus.
     */
    public static BareMetalMachineKeySetDetailedStatus fromString(String name) {
        return fromString(name, BareMetalMachineKeySetDetailedStatus.class);
    }

    /**
     * Gets known BareMetalMachineKeySetDetailedStatus values.
     * 
     * @return known BareMetalMachineKeySetDetailedStatus values.
     */
    public static Collection<BareMetalMachineKeySetDetailedStatus> values() {
        return values(BareMetalMachineKeySetDetailedStatus.class);
    }
}
