// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Dataflow Operation Type properties.
 */
public final class OperationType extends ExpandableStringEnum<OperationType> {
    /**
     * Dataflow Source Operation.
     */
    public static final OperationType SOURCE = fromString("Source");

    /**
     * Dataflow Destination Operation.
     */
    public static final OperationType DESTINATION = fromString("Destination");

    /**
     * Dataflow BuiltIn Transformation Operation.
     */
    public static final OperationType BUILT_IN_TRANSFORMATION = fromString("BuiltInTransformation");

    /**
     * Creates a new instance of OperationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationType() {
    }

    /**
     * Creates or finds a OperationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationType.
     */
    public static OperationType fromString(String name) {
        return fromString(name, OperationType.class);
    }

    /**
     * Gets known OperationType values.
     * 
     * @return known OperationType values.
     */
    public static Collection<OperationType> values() {
        return values(OperationType.class);
    }
}
