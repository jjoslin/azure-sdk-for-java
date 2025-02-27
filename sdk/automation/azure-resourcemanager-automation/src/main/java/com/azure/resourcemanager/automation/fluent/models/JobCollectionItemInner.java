// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.JobStatus;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Job collection item properties.
 */
@Fluent
public final class JobCollectionItemInner extends ProxyResource {
    /*
     * Job properties.
     */
    private JobCollectionItemProperties innerProperties = new JobCollectionItemProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of JobCollectionItemInner class.
     */
    public JobCollectionItemInner() {
    }

    /**
     * Get the innerProperties property: Job properties.
     * 
     * @return the innerProperties value.
     */
    private JobCollectionItemProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the runbook property: The runbook association.
     * 
     * @return the runbook value.
     */
    public RunbookAssociationProperty runbook() {
        return this.innerProperties() == null ? null : this.innerProperties().runbook();
    }

    /**
     * Get the jobId property: The id of the job.
     * 
     * @return the jobId value.
     */
    public UUID jobId() {
        return this.innerProperties() == null ? null : this.innerProperties().jobId();
    }

    /**
     * Get the creationTime property: The creation time of the job.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the status property: The status of the job.
     * 
     * @return the status value.
     */
    public JobStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the startTime property: The start time of the job.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the endTime property: The end time of the job.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Get the lastModifiedTime property: The last modified time of the job.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the provisioningState property: The provisioning state of a resource.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the runOn property: Specifies the runOn group name where the job was executed.
     * 
     * @return the runOn value.
     */
    public String runOn() {
        return this.innerProperties() == null ? null : this.innerProperties().runOn();
    }

    /**
     * Set the runOn property: Specifies the runOn group name where the job was executed.
     * 
     * @param runOn the runOn value to set.
     * @return the JobCollectionItemInner object itself.
     */
    public JobCollectionItemInner withRunOn(String runOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobCollectionItemProperties();
        }
        this.innerProperties().withRunOn(runOn);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model JobCollectionItemInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobCollectionItemInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobCollectionItemInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobCollectionItemInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JobCollectionItemInner.
     */
    public static JobCollectionItemInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobCollectionItemInner deserializedJobCollectionItemInner = new JobCollectionItemInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedJobCollectionItemInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedJobCollectionItemInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedJobCollectionItemInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedJobCollectionItemInner.innerProperties = JobCollectionItemProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobCollectionItemInner;
        });
    }
}
