/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreOrderCreateRequestDataRelationshipsApp struct {

	Data AppEncryptionDeclarationRelationshipsAppData `json:"data"`
}

// AssertAppPreOrderCreateRequestDataRelationshipsAppRequired checks if the required fields are not zero-ed
func AssertAppPreOrderCreateRequestDataRelationshipsAppRequired(obj AppPreOrderCreateRequestDataRelationshipsApp) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppEncryptionDeclarationRelationshipsAppDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppPreOrderCreateRequestDataRelationshipsAppConstraints checks if the values respects the defined constraints
func AssertAppPreOrderCreateRequestDataRelationshipsAppConstraints(obj AppPreOrderCreateRequestDataRelationshipsApp) error {
	return nil
}