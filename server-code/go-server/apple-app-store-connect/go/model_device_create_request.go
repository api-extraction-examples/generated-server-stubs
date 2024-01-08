/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type DeviceCreateRequest struct {

	Data DeviceCreateRequestData `json:"data"`
}

// AssertDeviceCreateRequestRequired checks if the required fields are not zero-ed
func AssertDeviceCreateRequestRequired(obj DeviceCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertDeviceCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertDeviceCreateRequestConstraints checks if the values respects the defined constraints
func AssertDeviceCreateRequestConstraints(obj DeviceCreateRequest) error {
	return nil
}
