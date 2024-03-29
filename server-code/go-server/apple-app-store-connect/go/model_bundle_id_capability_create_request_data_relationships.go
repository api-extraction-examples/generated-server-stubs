/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdCapabilityCreateRequestDataRelationships struct {

	BundleId BundleIdCapabilityCreateRequestDataRelationshipsBundleId `json:"bundleId"`
}

// AssertBundleIdCapabilityCreateRequestDataRelationshipsRequired checks if the required fields are not zero-ed
func AssertBundleIdCapabilityCreateRequestDataRelationshipsRequired(obj BundleIdCapabilityCreateRequestDataRelationships) error {
	elements := map[string]interface{}{
		"bundleId": obj.BundleId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBundleIdCapabilityCreateRequestDataRelationshipsBundleIdRequired(obj.BundleId); err != nil {
		return err
	}
	return nil
}

// AssertBundleIdCapabilityCreateRequestDataRelationshipsConstraints checks if the values respects the defined constraints
func AssertBundleIdCapabilityCreateRequestDataRelationshipsConstraints(obj BundleIdCapabilityCreateRequestDataRelationships) error {
	return nil
}
