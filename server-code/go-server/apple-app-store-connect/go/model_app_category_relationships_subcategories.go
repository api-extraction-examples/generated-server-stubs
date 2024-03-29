/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppCategoryRelationshipsSubcategories struct {

	Data []AppCategoryRelationshipsParentData `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertAppCategoryRelationshipsSubcategoriesRequired checks if the required fields are not zero-ed
func AssertAppCategoryRelationshipsSubcategoriesRequired(obj AppCategoryRelationshipsSubcategories) error {
	for _, el := range obj.Data {
		if err := AssertAppCategoryRelationshipsParentDataRequired(el); err != nil {
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

// AssertAppCategoryRelationshipsSubcategoriesConstraints checks if the values respects the defined constraints
func AssertAppCategoryRelationshipsSubcategoriesConstraints(obj AppCategoryRelationshipsSubcategories) error {
	return nil
}
