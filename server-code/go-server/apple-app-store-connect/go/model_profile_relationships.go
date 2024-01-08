/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProfileRelationships struct {

	BundleId ProfileRelationshipsBundleId `json:"bundleId,omitempty"`

	Certificates ProfileRelationshipsCertificates `json:"certificates,omitempty"`

	Devices ProfileRelationshipsDevices `json:"devices,omitempty"`
}

// AssertProfileRelationshipsRequired checks if the required fields are not zero-ed
func AssertProfileRelationshipsRequired(obj ProfileRelationships) error {
	if err := AssertProfileRelationshipsBundleIdRequired(obj.BundleId); err != nil {
		return err
	}
	if err := AssertProfileRelationshipsCertificatesRequired(obj.Certificates); err != nil {
		return err
	}
	if err := AssertProfileRelationshipsDevicesRequired(obj.Devices); err != nil {
		return err
	}
	return nil
}

// AssertProfileRelationshipsConstraints checks if the values respects the defined constraints
func AssertProfileRelationshipsConstraints(obj ProfileRelationships) error {
	return nil
}
