/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppRelationshipsInAppPurchases struct {

	Data []AppRelationshipsInAppPurchasesDataInner `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertAppRelationshipsInAppPurchasesRequired checks if the required fields are not zero-ed
func AssertAppRelationshipsInAppPurchasesRequired(obj AppRelationshipsInAppPurchases) error {
	for _, el := range obj.Data {
		if err := AssertAppRelationshipsInAppPurchasesDataInnerRequired(el); err != nil {
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

// AssertAppRelationshipsInAppPurchasesConstraints checks if the values respects the defined constraints
func AssertAppRelationshipsInAppPurchasesConstraints(obj AppRelationshipsInAppPurchases) error {
	return nil
}
