/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type AppEncryptionDeclarationAttributes struct {

	AppEncryptionDeclarationState AppEncryptionDeclarationState `json:"appEncryptionDeclarationState,omitempty"`

	AvailableOnFrenchStore bool `json:"availableOnFrenchStore,omitempty"`

	CodeValue string `json:"codeValue,omitempty"`

	ContainsProprietaryCryptography bool `json:"containsProprietaryCryptography,omitempty"`

	ContainsThirdPartyCryptography bool `json:"containsThirdPartyCryptography,omitempty"`

	DocumentName string `json:"documentName,omitempty"`

	DocumentType string `json:"documentType,omitempty"`

	DocumentUrl string `json:"documentUrl,omitempty"`

	Exempt bool `json:"exempt,omitempty"`

	Platform Platform `json:"platform,omitempty"`

	UploadedDate time.Time `json:"uploadedDate,omitempty"`

	UsesEncryption bool `json:"usesEncryption,omitempty"`
}

// AssertAppEncryptionDeclarationAttributesRequired checks if the required fields are not zero-ed
func AssertAppEncryptionDeclarationAttributesRequired(obj AppEncryptionDeclarationAttributes) error {
	return nil
}

// AssertAppEncryptionDeclarationAttributesConstraints checks if the values respects the defined constraints
func AssertAppEncryptionDeclarationAttributesConstraints(obj AppEncryptionDeclarationAttributes) error {
	return nil
}
