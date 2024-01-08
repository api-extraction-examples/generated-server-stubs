/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdRelationshipsProfiles struct {

	Data []BundleIdRelationshipsProfilesDataInner `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertBundleIdRelationshipsProfilesRequired checks if the required fields are not zero-ed
func AssertBundleIdRelationshipsProfilesRequired(obj BundleIdRelationshipsProfiles) error {
	for _, el := range obj.Data {
		if err := AssertBundleIdRelationshipsProfilesDataInnerRequired(el); err != nil {
			return err
		}
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertPagingInformationRequired(obj.Meta); err != nil {
		return err
	}
	return nil
}

// AssertBundleIdRelationshipsProfilesConstraints checks if the values respects the defined constraints
func AssertBundleIdRelationshipsProfilesConstraints(obj BundleIdRelationshipsProfiles) error {
	return nil
}
