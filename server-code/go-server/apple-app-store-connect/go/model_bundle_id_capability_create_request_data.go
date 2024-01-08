/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdCapabilityCreateRequestData struct {

	Attributes BundleIdCapabilityCreateRequestDataAttributes `json:"attributes"`

	Relationships BundleIdCapabilityCreateRequestDataRelationships `json:"relationships"`

	Type string `json:"type"`
}

// AssertBundleIdCapabilityCreateRequestDataRequired checks if the required fields are not zero-ed
func AssertBundleIdCapabilityCreateRequestDataRequired(obj BundleIdCapabilityCreateRequestData) error {
	elements := map[string]interface{}{
		"attributes": obj.Attributes,
		"relationships": obj.Relationships,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBundleIdCapabilityCreateRequestDataAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertBundleIdCapabilityCreateRequestDataRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertBundleIdCapabilityCreateRequestDataConstraints checks if the values respects the defined constraints
func AssertBundleIdCapabilityCreateRequestDataConstraints(obj BundleIdCapabilityCreateRequestData) error {
	return nil
}
