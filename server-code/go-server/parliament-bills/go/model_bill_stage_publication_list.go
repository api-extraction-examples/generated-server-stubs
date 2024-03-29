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




type BillStagePublicationList struct {

	BillStageId int32 `json:"billStageId,omitempty"`

	Publications *[]Publication `json:"publications,omitempty"`

	Sittings *[]BillStageSittingPublicationList `json:"sittings,omitempty"`
}

// AssertBillStagePublicationListRequired checks if the required fields are not zero-ed
func AssertBillStagePublicationListRequired(obj BillStagePublicationList) error {
	if obj.Publications != nil {
		for _, el := range *obj.Publications {
			if err := AssertPublicationRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.Sittings != nil {
		for _, el := range *obj.Sittings {
			if err := AssertBillStageSittingPublicationListRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertBillStagePublicationListConstraints checks if the values respects the defined constraints
func AssertBillStagePublicationListConstraints(obj BillStagePublicationList) error {
	return nil
}
