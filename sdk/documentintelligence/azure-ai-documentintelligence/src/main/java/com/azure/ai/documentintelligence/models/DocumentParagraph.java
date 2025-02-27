// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A paragraph object consisting with contiguous lines generally with common
 * alignment and spacing.
 */
@Immutable
public final class DocumentParagraph implements JsonSerializable<DocumentParagraph> {

    /*
     * Semantic role of the paragraph.
     */
    @Generated
    private ParagraphRole role;

    /*
     * Concatenated content of the paragraph in reading order.
     */
    @Generated
    private final String content;

    /*
     * Bounding regions covering the paragraph.
     */
    @Generated
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the paragraph in the reading order concatenated content.
     */
    @Generated
    private final List<DocumentSpan> spans;

    /**
     * Creates an instance of DocumentParagraph class.
     *
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    @Generated
    private DocumentParagraph(String content, List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the role property: Semantic role of the paragraph.
     *
     * @return the role value.
     */
    @Generated
    public ParagraphRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: Concatenated content of the paragraph in reading order.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the paragraph.
     *
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the paragraph in the reading order concatenated content.
     *
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeArrayField("boundingRegions", this.boundingRegions,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentParagraph from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentParagraph if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentParagraph.
     */
    @Generated
    public static DocumentParagraph fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String content = null;
            List<DocumentSpan> spans = null;
            ParagraphRole role = null;
            List<BoundingRegion> boundingRegions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                } else if ("role".equals(fieldName)) {
                    role = ParagraphRole.fromString(reader.getString());
                } else if ("boundingRegions".equals(fieldName)) {
                    boundingRegions = reader.readArray(reader1 -> BoundingRegion.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            DocumentParagraph deserializedDocumentParagraph = new DocumentParagraph(content, spans);
            deserializedDocumentParagraph.role = role;
            deserializedDocumentParagraph.boundingRegions = boundingRegions;
            return deserializedDocumentParagraph;
        });
    }
}
