/*
 * Discovery Market Research
 *
 * <p>This API drives the <a href=\"https://discovery.gsa.gov\">Discovery Market Research Tool</a>. It contains information on the vendors that are part of the OASIS and OASIS Small Business contracting vehicles, such as their contracting history, their elligibility for contract awards, and their small business designations. To learn more about the tool, please visit <a href=\"https://discovery.gsa.gov\">Discovery</a> or see the README on our <a href=\"https://github.com/PSHCDevOps/discovery\">GitHub repository</a>.</p> <p><strong>Please note that the base path for this API is <code>https://api.data.gov/gsa/discovery/</code></strong></p> <p>It requires an API key, obtainable at <a href=\"http://api.data.gov/\">api.data.gov</a>. It must be passed in the <code>api_key</code> parameter with each request.</p>
 *
 * API version: 0.1
 * Contact: discovery-18f@gsa.gov
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
)



// ContractsAPIRouter defines the required methods for binding the api requests to a responses for the ContractsAPI
// The ContractsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ContractsAPIServicer to perform the required actions, then write the service results to the http response.
type ContractsAPIRouter interface { 
	ListContractsGET(http.ResponseWriter, *http.Request)
}
// MetadataAPIRouter defines the required methods for binding the api requests to a responses for the MetadataAPI
// The MetadataAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MetadataAPIServicer to perform the required actions, then write the service results to the http response.
type MetadataAPIRouter interface { 
	MetadataGET(http.ResponseWriter, *http.Request)
}
// NaicsAPIRouter defines the required methods for binding the api requests to a responses for the NaicsAPI
// The NaicsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a NaicsAPIServicer to perform the required actions, then write the service results to the http response.
type NaicsAPIRouter interface { 
	ListNaicsGET(http.ResponseWriter, *http.Request)
}
// VendorAPIRouter defines the required methods for binding the api requests to a responses for the VendorAPI
// The VendorAPIRouter implementation should parse necessary information from the http request,
// pass the data to a VendorAPIServicer to perform the required actions, then write the service results to the http response.
type VendorAPIRouter interface { 
	GetVendorGET(http.ResponseWriter, *http.Request)
}
// VendorsAPIRouter defines the required methods for binding the api requests to a responses for the VendorsAPI
// The VendorsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a VendorsAPIServicer to perform the required actions, then write the service results to the http response.
type VendorsAPIRouter interface { 
	ListVendorsGET(http.ResponseWriter, *http.Request)
}


// ContractsAPIServicer defines the api actions for the ContractsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ContractsAPIServicer interface { 
	ListContractsGET(context.Context, string, string, string, string, string) (ImplResponse, error)
}


// MetadataAPIServicer defines the api actions for the MetadataAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MetadataAPIServicer interface { 
	MetadataGET(context.Context) (ImplResponse, error)
}


// NaicsAPIServicer defines the api actions for the NaicsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type NaicsAPIServicer interface { 
	ListNaicsGET(context.Context) (ImplResponse, error)
}


// VendorAPIServicer defines the api actions for the VendorAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type VendorAPIServicer interface { 
	GetVendorGET(context.Context, string) (ImplResponse, error)
}


// VendorsAPIServicer defines the api actions for the VendorsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type VendorsAPIServicer interface { 
	ListVendorsGET(context.Context, string, []string, string) (ImplResponse, error)
}
