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
	"context"
	"net/http"
)



// FacilitiesAPIRouter defines the required methods for binding the api requests to a responses for the FacilitiesAPI
// The FacilitiesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FacilitiesAPIServicer to perform the required actions, then write the service results to the http response.
type FacilitiesAPIRouter interface { 
	AirRestServicesGetDownloadGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetDownloadPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetFacilitiesGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetFacilitiesPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetFacilityInfoGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetFacilityInfoPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetGeojsonGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetGeojsonPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetInfoClustersGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetInfoClustersPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetMapGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetMapPost(http.ResponseWriter, *http.Request)
	AirRestServicesGetQidGet(http.ResponseWriter, *http.Request)
	AirRestServicesGetQidPost(http.ResponseWriter, *http.Request)
}
// MetadataAPIRouter defines the required methods for binding the api requests to a responses for the MetadataAPI
// The MetadataAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MetadataAPIServicer to perform the required actions, then write the service results to the http response.
type MetadataAPIRouter interface { 
	AirRestServicesMetadataGet(http.ResponseWriter, *http.Request)
	AirRestServicesMetadataPost(http.ResponseWriter, *http.Request)
}


// FacilitiesAPIServicer defines the api actions for the FacilitiesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FacilitiesAPIServicer interface { 
	AirRestServicesGetDownloadGet(context.Context, string, string, string, float32) (ImplResponse, error)
	AirRestServicesGetDownloadPost(context.Context, string, string, string, float32) (ImplResponse, error)
	AirRestServicesGetFacilitiesGet(context.Context, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, float32, float32, float32, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, string, string, float32, string, string, string, float32, string, string, string, float32, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, float32, string, float32, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, float32, float32, string, string, float32, float32, string, string, string, string, string) (ImplResponse, error)
	AirRestServicesGetFacilitiesPost(context.Context, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, float32, float32, float32, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, string, string, float32, string, string, string, float32, string, string, string, float32, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, float32, string, float32, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, float32, float32, string, string, float32, float32, string, string, string, string, string) (ImplResponse, error)
	AirRestServicesGetFacilityInfoGet(context.Context, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, float32, float32, float32, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, string, string, float32, string, string, string, float32, string, string, string, float32, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, float32, string, float32, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, float32, float32, string, string, float32, float32, string, string, string, float32) (ImplResponse, error)
	AirRestServicesGetFacilityInfoPost(context.Context, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, float32, float32, float32, string, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, string, string, float32, string, string, string, float32, string, string, string, float32, string, string, string, string, string, string, string, string, string, string, float32, string, string, float32, string, string, string, string, string, float32, string, float32, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, float32, float32, float32, string, string, float32, float32, string, string, string, float32) (ImplResponse, error)
	AirRestServicesGetGeojsonGet(context.Context, string, string, string, float32, string, string, float32) (ImplResponse, error)
	AirRestServicesGetGeojsonPost(context.Context, string, string, string, float32, string, string, float32) (ImplResponse, error)
	AirRestServicesGetInfoClustersGet(context.Context, string, string, float32) (ImplResponse, error)
	AirRestServicesGetInfoClustersPost(context.Context, string, string, float32) (ImplResponse, error)
	AirRestServicesGetMapGet(context.Context, string, string, string, string, string, float32, float32, float32, float32) (ImplResponse, error)
	AirRestServicesGetMapPost(context.Context, string, string, string, string, string, float32, float32, float32, float32) (ImplResponse, error)
	AirRestServicesGetQidGet(context.Context, string, string, float32, string, float32, string, string) (ImplResponse, error)
	AirRestServicesGetQidPost(context.Context, string, string, float32, string, float32, string, string) (ImplResponse, error)
}


// MetadataAPIServicer defines the api actions for the MetadataAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MetadataAPIServicer interface { 
	AirRestServicesMetadataGet(context.Context, string, string) (ImplResponse, error)
	AirRestServicesMetadataPost(context.Context, string, string) (ImplResponse, error)
}