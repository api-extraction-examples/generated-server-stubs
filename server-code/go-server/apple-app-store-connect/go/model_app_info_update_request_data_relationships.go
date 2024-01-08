/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppInfoUpdateRequestDataRelationships struct {

	PrimaryCategory AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"primaryCategory,omitempty"`

	PrimarySubcategoryOne AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"primarySubcategoryOne,omitempty"`

	PrimarySubcategoryTwo AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"primarySubcategoryTwo,omitempty"`

	SecondaryCategory AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"secondaryCategory,omitempty"`

	SecondarySubcategoryOne AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"secondarySubcategoryOne,omitempty"`

	SecondarySubcategoryTwo AppInfoUpdateRequestDataRelationshipsPrimaryCategory `json:"secondarySubcategoryTwo,omitempty"`
}

// AssertAppInfoUpdateRequestDataRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppInfoUpdateRequestDataRelationshipsRequired(obj AppInfoUpdateRequestDataRelationships) error {
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.PrimaryCategory); err != nil {
		return err
	}
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.PrimarySubcategoryOne); err != nil {
		return err
	}
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.PrimarySubcategoryTwo); err != nil {
		return err
	}
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.SecondaryCategory); err != nil {
		return err
	}
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.SecondarySubcategoryOne); err != nil {
		return err
	}
	if err := AssertAppInfoUpdateRequestDataRelationshipsPrimaryCategoryRequired(obj.SecondarySubcategoryTwo); err != nil {
		return err
	}
	return nil
}

// AssertAppInfoUpdateRequestDataRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppInfoUpdateRequestDataRelationshipsConstraints(obj AppInfoUpdateRequestDataRelationships) error {
	return nil
}