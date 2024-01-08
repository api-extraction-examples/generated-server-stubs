/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * API version: 2019.10.15
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"fmt"
)


// FormDataFPStsly : Number of years (1 to 5) since date of last stack test. A value of 1 means it has been inspected within the year.
type FormDataFPStsly float32

// List of FormDataFPStsly
const (
	_1 FormDataFPStsly = 1
	_2 FormDataFPStsly = 2
	_3 FormDataFPStsly = 3
	_4 FormDataFPStsly = 4
	_5 FormDataFPStsly = 5
)

// AllowedFormDataFPStslyEnumValues is all the allowed values of FormDataFPStsly enum
var AllowedFormDataFPStslyEnumValues = []FormDataFPStsly{
	1,
	2,
	3,
	4,
	5,
}

// validFormDataFPStslyEnumValue provides a map of FormDataFPStslys for fast verification of use input
var validFormDataFPStslyEnumValues = map[FormDataFPStsly]struct{}{
	1: {},
	2: {},
	3: {},
	4: {},
	5: {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FormDataFPStsly) IsValid() bool {
	_, ok := validFormDataFPStslyEnumValues[v]
	return ok
}

// NewFormDataFPStslyFromValue returns a pointer to a valid FormDataFPStsly
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFormDataFPStslyFromValue(v float32) (FormDataFPStsly, error) {
	ev := FormDataFPStsly(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for FormDataFPStsly: valid values are %v", v, AllowedFormDataFPStslyEnumValues)
	}
}



// AssertFormDataFPStslyRequired checks if the required fields are not zero-ed
func AssertFormDataFPStslyRequired(obj FormDataFPStsly) error {
	return nil
}

// AssertFormDataFPStslyConstraints checks if the values respects the defined constraints
func AssertFormDataFPStslyConstraints(obj FormDataFPStsly) error {
	return nil
}