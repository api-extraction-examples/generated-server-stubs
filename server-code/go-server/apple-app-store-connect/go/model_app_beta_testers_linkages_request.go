/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppBetaTestersLinkagesRequest struct {

	Data []AppBetaTestersLinkagesRequestDataInner `json:"data"`
}

// AssertAppBetaTestersLinkagesRequestRequired checks if the required fields are not zero-ed
func AssertAppBetaTestersLinkagesRequestRequired(obj AppBetaTestersLinkagesRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertAppBetaTestersLinkagesRequestDataInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAppBetaTestersLinkagesRequestConstraints checks if the values respects the defined constraints
func AssertAppBetaTestersLinkagesRequestConstraints(obj AppBetaTestersLinkagesRequest) error {
	return nil
}
