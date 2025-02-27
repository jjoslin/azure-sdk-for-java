// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.support.fluent.models.ProblemClassificationInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection of ProblemClassification resources.
 */
@Fluent
public final class ProblemClassificationsListResult implements JsonSerializable<ProblemClassificationsListResult> {
    /*
     * List of ProblemClassification resources.
     */
    private List<ProblemClassificationInner> value;

    /**
     * Creates an instance of ProblemClassificationsListResult class.
     */
    public ProblemClassificationsListResult() {
    }

    /**
     * Get the value property: List of ProblemClassification resources.
     * 
     * @return the value value.
     */
    public List<ProblemClassificationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of ProblemClassification resources.
     * 
     * @param value the value value to set.
     * @return the ProblemClassificationsListResult object itself.
     */
    public ProblemClassificationsListResult withValue(List<ProblemClassificationInner> value) {
        this.value = value;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProblemClassificationsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProblemClassificationsListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProblemClassificationsListResult.
     */
    public static ProblemClassificationsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProblemClassificationsListResult deserializedProblemClassificationsListResult
                = new ProblemClassificationsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProblemClassificationInner> value
                        = reader.readArray(reader1 -> ProblemClassificationInner.fromJson(reader1));
                    deserializedProblemClassificationsListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProblemClassificationsListResult;
        });
    }
}
