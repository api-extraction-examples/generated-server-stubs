/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AppStoreVersionRelationships struct {

	// Deprecated
	AgeRatingDeclaration AppStoreVersionRelationshipsAgeRatingDeclaration `json:"ageRatingDeclaration,omitempty"`

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	AppStoreReviewDetail AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail `json:"appStoreReviewDetail,omitempty"`

	AppStoreVersionLocalizations AppStoreVersionRelationshipsAppStoreVersionLocalizations `json:"appStoreVersionLocalizations,omitempty"`

	AppStoreVersionPhasedRelease AppStoreVersionRelationshipsAppStoreVersionPhasedRelease `json:"appStoreVersionPhasedRelease,omitempty"`

	AppStoreVersionSubmission AppStoreVersionRelationshipsAppStoreVersionSubmission `json:"appStoreVersionSubmission,omitempty"`

	Build AppStoreVersionRelationshipsBuild `json:"build,omitempty"`

	IdfaDeclaration AppStoreVersionRelationshipsIdfaDeclaration `json:"idfaDeclaration,omitempty"`

	RoutingAppCoverage AppStoreVersionRelationshipsRoutingAppCoverage `json:"routingAppCoverage,omitempty"`
}
