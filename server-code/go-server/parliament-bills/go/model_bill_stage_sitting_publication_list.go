/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BillStageSittingPublicationList struct {

	Publications *[]Publication `json:"publications,omitempty"`

	SittingId int32 `json:"sittingId,omitempty"`
}

// AssertBillStageSittingPublicationListRequired checks if the required fields are not zero-ed
func AssertBillStageSittingPublicationListRequired(obj BillStageSittingPublicationList) error {
	if obj.Publications != nil {
		for _, el := range *obj.Publications {
			if err := AssertPublicationRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertBillStageSittingPublicationListConstraints checks if the values respects the defined constraints
func AssertBillStageSittingPublicationListConstraints(obj BillStageSittingPublicationList) error {
	return nil
}