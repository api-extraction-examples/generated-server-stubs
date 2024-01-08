/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Coach struct {

	FirstName string `json:"first_name,omitempty"`

	HireDate string `json:"hire_date,omitempty"`

	LastName string `json:"last_name,omitempty"`

	Seasons []CoachSeasonsInner `json:"seasons,omitempty"`
}

// AssertCoachRequired checks if the required fields are not zero-ed
func AssertCoachRequired(obj Coach) error {
	for _, el := range obj.Seasons {
		if err := AssertCoachSeasonsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCoachConstraints checks if the values respects the defined constraints
func AssertCoachConstraints(obj Coach) error {
	return nil
}