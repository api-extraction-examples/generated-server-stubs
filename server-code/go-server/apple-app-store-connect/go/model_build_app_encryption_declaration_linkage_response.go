/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildAppEncryptionDeclarationLinkageResponse struct {

	Data BuildRelationshipsAppEncryptionDeclarationData `json:"data"`

	Links DocumentLinks `json:"links"`
}

// AssertBuildAppEncryptionDeclarationLinkageResponseRequired checks if the required fields are not zero-ed
func AssertBuildAppEncryptionDeclarationLinkageResponseRequired(obj BuildAppEncryptionDeclarationLinkageResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBuildRelationshipsAppEncryptionDeclarationDataRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertBuildAppEncryptionDeclarationLinkageResponseConstraints checks if the values respects the defined constraints
func AssertBuildAppEncryptionDeclarationLinkageResponseConstraints(obj BuildAppEncryptionDeclarationLinkageResponse) error {
	return nil
}