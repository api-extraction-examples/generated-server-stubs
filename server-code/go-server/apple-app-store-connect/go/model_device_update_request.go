/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type DeviceUpdateRequest struct {

	Data DeviceUpdateRequestData `json:"data"`
}

// AssertDeviceUpdateRequestRequired checks if the required fields are not zero-ed
func AssertDeviceUpdateRequestRequired(obj DeviceUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertDeviceUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertDeviceUpdateRequestConstraints checks if the values respects the defined constraints
func AssertDeviceUpdateRequestConstraints(obj DeviceUpdateRequest) error {
	return nil
}