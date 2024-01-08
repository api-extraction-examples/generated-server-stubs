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


// FormDataFPPd : Population Density Limiter (per sq mile). Enter a value to limit results to facilities located in area of a given population density. - NONE = 0 population density per square mile - GT100 = More than 100 population density per square mile - GT500 = More than 500 population density per square mile - GT1000 = More than 1000 population density per square mile - GT5000 = More than 5000 population density per square mile - GT10000 = More than 10000 population density per square mile - GT20000 = More than 20000 population density per square mile
type FormDataFPPd string

// List of FormDataFPPd
const (
	NONE FormDataFPPd = "NONE"
	GT100 FormDataFPPd = "GT100"
	GT500 FormDataFPPd = "GT500"
	GT1000 FormDataFPPd = "GT1000"
	GT5000 FormDataFPPd = "GT5000"
	GT10000 FormDataFPPd = "GT10000"
	GT20000 FormDataFPPd = "GT20000"
)

// AllowedFormDataFPPdEnumValues is all the allowed values of FormDataFPPd enum
var AllowedFormDataFPPdEnumValues = []FormDataFPPd{
	"NONE",
	"GT100",
	"GT500",
	"GT1000",
	"GT5000",
	"GT10000",
	"GT20000",
}

// validFormDataFPPdEnumValue provides a map of FormDataFPPds for fast verification of use input
var validFormDataFPPdEnumValues = map[FormDataFPPd]struct{}{
	"NONE": {},
	"GT100": {},
	"GT500": {},
	"GT1000": {},
	"GT5000": {},
	"GT10000": {},
	"GT20000": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FormDataFPPd) IsValid() bool {
	_, ok := validFormDataFPPdEnumValues[v]
	return ok
}

// NewFormDataFPPdFromValue returns a pointer to a valid FormDataFPPd
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFormDataFPPdFromValue(v string) (FormDataFPPd, error) {
	ev := FormDataFPPd(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for FormDataFPPd: valid values are %v", v, AllowedFormDataFPPdEnumValues)
	}
}



// AssertFormDataFPPdRequired checks if the required fields are not zero-ed
func AssertFormDataFPPdRequired(obj FormDataFPPd) error {
	return nil
}

// AssertFormDataFPPdConstraints checks if the values respects the defined constraints
func AssertFormDataFPPdConstraints(obj FormDataFPPd) error {
	return nil
}
