/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type AppStoreVersionPhasedReleaseAttributes struct {

	CurrentDayNumber int32 `json:"currentDayNumber,omitempty"`

	PhasedReleaseState PhasedReleaseState `json:"phasedReleaseState,omitempty"`

	StartDate time.Time `json:"startDate,omitempty"`

	TotalPauseDuration int32 `json:"totalPauseDuration,omitempty"`
}

// AssertAppStoreVersionPhasedReleaseAttributesRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionPhasedReleaseAttributesRequired(obj AppStoreVersionPhasedReleaseAttributes) error {
	return nil
}

// AssertAppStoreVersionPhasedReleaseAttributesConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionPhasedReleaseAttributesConstraints(obj AppStoreVersionPhasedReleaseAttributes) error {
	return nil
}
