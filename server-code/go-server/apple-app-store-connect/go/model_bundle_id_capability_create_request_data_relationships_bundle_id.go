/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdCapabilityCreateRequestDataRelationshipsBundleId struct {

	Data BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData `json:"data"`
}

// AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdRequired checks if the required fields are not zero-ed
func AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdRequired(obj BundleIdCapabilityCreateRequestDataRelationshipsBundleId) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdConstraints checks if the values respects the defined constraints
func AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdConstraints(obj BundleIdCapabilityCreateRequestDataRelationshipsBundleId) error {
	return nil
}