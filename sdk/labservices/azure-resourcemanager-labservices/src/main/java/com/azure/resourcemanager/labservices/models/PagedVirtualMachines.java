// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.labservices.fluent.models.VirtualMachineInner;
import java.io.IOException;
import java.util.List;

/**
 * Paged list of lab services virtual machines.
 */
@Immutable
public final class PagedVirtualMachines implements JsonSerializable<PagedVirtualMachines> {
    /*
     * The array page of virtual machine results.
     */
    private List<VirtualMachineInner> value;

    /*
     * The link to get the next page of virtual machine results.
     */
    private String nextLink;

    /**
     * Creates an instance of PagedVirtualMachines class.
     */
    public PagedVirtualMachines() {
    }

    /**
     * Get the value property: The array page of virtual machine results.
     * 
     * @return the value value.
     */
    public List<VirtualMachineInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to get the next page of virtual machine results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PagedVirtualMachines from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PagedVirtualMachines if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PagedVirtualMachines.
     */
    public static PagedVirtualMachines fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PagedVirtualMachines deserializedPagedVirtualMachines = new PagedVirtualMachines();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VirtualMachineInner> value
                        = reader.readArray(reader1 -> VirtualMachineInner.fromJson(reader1));
                    deserializedPagedVirtualMachines.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPagedVirtualMachines.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPagedVirtualMachines;
        });
    }
}
