// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphApplicationInner;
import com.azure.resourcemanager.resources.fluentcore.model.Appliable;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.resources.fluentcore.model.Updatable;

import java.net.URL;
import java.util.Map;
import java.util.Set;

/** An immutable client-side representation of an Azure AD application. */
@Fluent
public interface ActiveDirectoryApplication extends ActiveDirectoryObject,
    HasInnerModel<MicrosoftGraphApplicationInner>, Updatable<ActiveDirectoryApplication.Update> {
    /**
     * Gets the application ID.
     *
     * @return the application ID
     */
    String applicationId();

    /**
     * @return whether the application is be available to other tenants
     * @deprecated use {@link #accountType()}, false only when account type is "AzureADMyOrg"
     */
    @Deprecated
    boolean availableToOtherTenants();

    /**
     * Gets the application account type.
     *
     * @return the application account type
     */
    ApplicationAccountType accountType();

    /**
     * Gets a collection of URIs for the application.
     *
     * @return a collection of URIs for the application
     */
    Set<String> identifierUris();

    /**
     * Gets a collection of reply URLs for the application.
     *
     * @return a collection of reply URLs for the application
     */
    Set<String> replyUrls();

    /**
     * Gets the home page of the application.
     *
     * @return the home page of the application
     */
    URL signOnUrl();

    /**
     * Gets the mapping of password credentials from their names.
     *
     * @return the mapping of password credentials from their names
     */
    Map<String, PasswordCredential> passwordCredentials();

    /**
     * Gets the mapping of certificate credentials from their names.
     *
     * @return the mapping of certificate credentials from their names
     */
    Map<String, CertificateCredential> certificateCredentials();

    /**************************************************************
     * Fluent interfaces to provision an application
     **************************************************************/

    /** Container interface for all the definitions that need to be implemented. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /** Grouping of all the application definition stages. */
    interface DefinitionStages {
        /** The first stage of the application definition. */
        interface Blank extends WithCreate {
        }

        /** The stage of application definition allowing specifying the sign on URL. */
        interface WithSignOnUrl {
            /**
             * Specifies the sign on URL.
             *
             * @param signOnUrl the URL where users can sign in and use this app
             * @return the next stage in application definition
             */
            WithCreate withSignOnUrl(String signOnUrl);
        }

        /** The stage of application definition allowing specifying reply URLs. */
        interface WithReplyUrl {
            /**
             * Adds a reply URL to the application.
             *
             * @param replyUrl URIs to which Azure AD will redirect in response to an OAuth 2.0 request
             * @return the next stage in application definition
             */
            WithCreate withReplyUrl(String replyUrl);
        }

        /** The stage of application definition allowing specifying identifier URLs. */
        interface WithIdentifierUrl {
            /**
             * Adds an identifier URL to the application.
             *
             * @param identifierUrl unique URI that Azure AD can use for this app
             * @return the next stage in application definition
             */
            WithCreate withIdentifierUrl(String identifierUrl);
        }

        /** The stage of application definition allowing specifying identifier keys. */
        interface WithCredential {
            /**
             * Starts the definition of a certificate credential.
             *
             * @param name the descriptive name of the certificate credential
             * @return the first stage in certificate credential definition
             */
            CertificateCredential.DefinitionStages.Blank<? extends WithCreate> defineCertificateCredential(String name);

            /**
             * Starts the definition of a password credential.
             *
             * @param name the descriptive name of the password credential
             * @return the first stage in password credential definition
             */
            PasswordCredential.DefinitionStages.Blank<? extends WithCreate> definePasswordCredential(String name);
        }

        /**
         * The stage of application definition allowing specifying if the application can be used in multiple tenants.
         * @deprecated use {@link WithAccountType}
         */
        @Deprecated
        interface WithMultiTenant {
            /**
             * Specifies if the application can be used in multiple tenants.
             *
             * @param availableToOtherTenants true if this application is available in other tenants
             * @return the next stage in application definition
             * @deprecated use {@link WithAccountType#withAccountType(ApplicationAccountType)}
             */
            @Deprecated
            WithCreate withAvailableToOtherTenants(boolean availableToOtherTenants);
        }

        /**
         * The stage of application definition allowing specifying the application account type.
         */
        interface WithAccountType {
            /**
             * Specifies the application account type.
             *
             * @param accountType the application account type
             * @return the next stage in application definition
             */
            WithCreate withAccountType(ApplicationAccountType accountType);

            /**
             * Specifies the application account type.
             *
             * @param accountType the application account type
             * @return the next stage in application definition
             */
            WithCreate withAccountType(String accountType);
        }

        /**
         * An application definition with sufficient inputs to create a new application in the cloud, but exposing
         * additional optional inputs to specify.
         */
        interface WithCreate extends Creatable<ActiveDirectoryApplication>, WithSignOnUrl, WithIdentifierUrl,
            WithReplyUrl, WithCredential, WithAccountType, WithMultiTenant {
        }
    }

    /** Grouping of all the application update stages. */
    interface UpdateStages {
        /** The stage of application update allowing specifying the sign on URL. */
        interface WithSignOnUrl {
            /**
             * Specifies the sign on URL.
             *
             * @param signOnUrl the URL where users can sign in and use this app
             * @return the next stage in application update
             */
            Update withSignOnUrl(String signOnUrl);
        }

        /** The stage of application update allowing specifying reply URLs. */
        interface WithReplyUrl {
            /**
             * Adds a reply URL to the application.
             *
             * @param replyUrl URIs to which Azure AD will redirect in response to an OAuth 2.0 request
             * @return the next stage in application update
             */
            Update withReplyUrl(String replyUrl);

            /**
             * Removes a reply URL.
             *
             * @param replyUrl the reply URL to remove
             * @return the next stage in application update
             */
            Update withoutReplyUrl(String replyUrl);
        }

        /** The stage of application update allowing specifying identifier URLs. */
        interface WithIdentifierUrl {
            /**
             * Adds an identifier URL to the application.
             *
             * @param identifierUrl unique URI that Azure AD can use for this app
             * @return the next stage in application update
             */
            Update withIdentifierUrl(String identifierUrl);

            /**
             * Removes an identifier URL from the application.
             *
             * @param identifierUrl identifier URI to remove
             * @return the next stage in application update
             */
            Update withoutIdentifierUrl(String identifierUrl);
        }

        /** The stage of application update allowing specifying identifier keys. */
        interface WithCredential {
            /**
             * Starts the definition of a certificate credential.
             *
             * @param name the descriptive name of the certificate credential
             * @return the first stage in certificate credential definition
             */
            CertificateCredential.DefinitionStages.Blank<? extends Update> defineCertificateCredential(String name);

            /**
             * Starts the definition of a password credential.
             *
             * @param name the descriptive name of the password credential
             * @return the first stage in password credential definition
             */
            PasswordCredential.DefinitionStages.Blank<? extends Update> definePasswordCredential(String name);

            /**
             * Removes a key.
             *
             * @param name the name of the key
             * @return the next stage of the application update
             */
            Update withoutCredential(String name);
        }

        /**
         * The stage of application update allowing specifying if the application can be used in multiple tenants.
         * @deprecated use {@link WithAccountType}
         */
        @Deprecated
        interface WithMultiTenant {
            /**
             * Specifies if the application can be used in multiple tenants.
             *
             * @param availableToOtherTenants true if this application is available in other tenants
             * @return the next stage in application update
             * @deprecated use {@link WithAccountType#withAccountType(ApplicationAccountType)}
             */
            @Deprecated
            Update withAvailableToOtherTenants(boolean availableToOtherTenants);
        }

        /**
         * The stage of application update allowing specifying the application account type.
         */
        interface WithAccountType {
            /**
             * Specifies the application account type.
             *
             * @param accountType the application account type
             * @return the next stage in application update
             */
            Update withAccountType(ApplicationAccountType accountType);

            /**
             * Specifies the application account type.
             *
             * @param accountType the application account type
             * @return the next stage in application update
             */
            Update withAccountType(String accountType);
        }
    }

    /** The template for an application update operation, containing all the settings that can be modified. */
    interface Update extends Appliable<ActiveDirectoryApplication>, UpdateStages.WithSignOnUrl,
        UpdateStages.WithIdentifierUrl, UpdateStages.WithReplyUrl, UpdateStages.WithCredential,
        UpdateStages.WithAccountType, UpdateStages.WithMultiTenant {
    }
}
