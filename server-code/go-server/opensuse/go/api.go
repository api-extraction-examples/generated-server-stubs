/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"reflect"
)



// AttributeNamespacesAPIRouter defines the required methods for binding the api requests to a responses for the AttributeNamespacesAPI
// The AttributeNamespacesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AttributeNamespacesAPIServicer to perform the required actions, then write the service results to the http response.
type AttributeNamespacesAPIRouter interface { 
	AttributeGet(http.ResponseWriter, *http.Request)
	AttributeNamespaceDelete(http.ResponseWriter, *http.Request)
	AttributeNamespaceGet(http.ResponseWriter, *http.Request)
	AttributeNamespaceMetaDelete(http.ResponseWriter, *http.Request)
	AttributeNamespaceMetaGet(http.ResponseWriter, *http.Request)
	AttributeNamespaceMetaPost(http.ResponseWriter, *http.Request)
	AttributeNamespaceMetaPut(http.ResponseWriter, *http.Request)
}
// AttributesAPIRouter defines the required methods for binding the api requests to a responses for the AttributesAPI
// The AttributesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AttributesAPIServicer to perform the required actions, then write the service results to the http response.
type AttributesAPIRouter interface { 
	AttributeNamespaceAttributeNameDelete(http.ResponseWriter, *http.Request)
	AttributeNamespaceAttributeNameMetaDelete(http.ResponseWriter, *http.Request)
	AttributeNamespaceAttributeNameMetaGet(http.ResponseWriter, *http.Request)
	AttributeNamespaceAttributeNameMetaPost(http.ResponseWriter, *http.Request)
	AttributeNamespaceAttributeNameMetaPut(http.ResponseWriter, *http.Request)
}
// BuildAPIRouter defines the required methods for binding the api requests to a responses for the BuildAPI
// The BuildAPIRouter implementation should parse necessary information from the http request,
// pass the data to a BuildAPIServicer to perform the required actions, then write the service results to the http response.
type BuildAPIRouter interface { 
	BuildGet(http.ResponseWriter, *http.Request)
	BuildProjectNameGet(http.ResponseWriter, *http.Request)
	BuildProjectNamePost(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameArchitectureNameBuilddepinfoGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameReasonGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameArchitectureNameRepositoryGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameBuildconfigGet(http.ResponseWriter, *http.Request)
	BuildProjectNameRepositoryNameGet(http.ResponseWriter, *http.Request)
	BuildProjectNameResultGet(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchPackageBuildinfo(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchPackageHistory(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchPackageLog(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchPackageStatus(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchitecturePackageFile(http.ResponseWriter, *http.Request)
	GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo(http.ResponseWriter, *http.Request)
	PutBuildProjectRepositoryArchitecturePackageFile(http.ResponseWriter, *http.Request)
}
// ConfigurationAPIRouter defines the required methods for binding the api requests to a responses for the ConfigurationAPI
// The ConfigurationAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ConfigurationAPIServicer to perform the required actions, then write the service results to the http response.
type ConfigurationAPIRouter interface { 
	ConfigurationGet(http.ResponseWriter, *http.Request)
	ConfigurationPut(http.ResponseWriter, *http.Request)
}
// DistributionsAPIRouter defines the required methods for binding the api requests to a responses for the DistributionsAPI
// The DistributionsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DistributionsAPIServicer to perform the required actions, then write the service results to the http response.
type DistributionsAPIRouter interface { 
	DistributionsBulkReplacePut(http.ResponseWriter, *http.Request)
	DistributionsDistributionIdDelete(http.ResponseWriter, *http.Request)
	DistributionsDistributionIdGet(http.ResponseWriter, *http.Request)
	DistributionsDistributionIdPut(http.ResponseWriter, *http.Request)
	DistributionsGet(http.ResponseWriter, *http.Request)
	DistributionsIncludeRemotesGet(http.ResponseWriter, *http.Request)
	DistributionsPost(http.ResponseWriter, *http.Request)
}
// GeneralInformationAPIRouter defines the required methods for binding the api requests to a responses for the GeneralInformationAPI
// The GeneralInformationAPIRouter implementation should parse necessary information from the http request,
// pass the data to a GeneralInformationAPIServicer to perform the required actions, then write the service results to the http response.
type GeneralInformationAPIRouter interface { 
	AboutGet(http.ResponseWriter, *http.Request)
	ArchitecturesArchitectureNameGet(http.ResponseWriter, *http.Request)
	ArchitecturesGet(http.ResponseWriter, *http.Request)
}
// GroupsAPIRouter defines the required methods for binding the api requests to a responses for the GroupsAPI
// The GroupsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a GroupsAPIServicer to perform the required actions, then write the service results to the http response.
type GroupsAPIRouter interface { 
	GroupGet(http.ResponseWriter, *http.Request)
	GroupGroupTitleDelete(http.ResponseWriter, *http.Request)
	GroupGroupTitleGet(http.ResponseWriter, *http.Request)
	GroupGroupTitlePost(http.ResponseWriter, *http.Request)
	GroupGroupTitlePut(http.ResponseWriter, *http.Request)
}
// IssueTrackersAPIRouter defines the required methods for binding the api requests to a responses for the IssueTrackersAPI
// The IssueTrackersAPIRouter implementation should parse necessary information from the http request,
// pass the data to a IssueTrackersAPIServicer to perform the required actions, then write the service results to the http response.
type IssueTrackersAPIRouter interface { 
	IssueTrackersGet(http.ResponseWriter, *http.Request)
	IssueTrackersIssueTrackerNameDelete(http.ResponseWriter, *http.Request)
	IssueTrackersIssueTrackerNameGet(http.ResponseWriter, *http.Request)
	IssueTrackersIssueTrackerNameIssuesIssueNameGet(http.ResponseWriter, *http.Request)
	IssueTrackersIssueTrackerNamePut(http.ResponseWriter, *http.Request)
	IssueTrackersPost(http.ResponseWriter, *http.Request)
}
// PersonAPIRouter defines the required methods for binding the api requests to a responses for the PersonAPI
// The PersonAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PersonAPIServicer to perform the required actions, then write the service results to the http response.
type PersonAPIRouter interface { 
	PersonGet(http.ResponseWriter, *http.Request)
	PersonLoginGet(http.ResponseWriter, *http.Request)
	PersonLoginGroupGet(http.ResponseWriter, *http.Request)
	PersonLoginPost(http.ResponseWriter, *http.Request)
	PersonLoginPut(http.ResponseWriter, *http.Request)
	PersonLoginTokenGet(http.ResponseWriter, *http.Request)
	PersonLoginTokenIdDelete(http.ResponseWriter, *http.Request)
	PersonLoginTokenPost(http.ResponseWriter, *http.Request)
	PersonPost(http.ResponseWriter, *http.Request)
	PersonRegisterPost(http.ResponseWriter, *http.Request)
}
// PublishedBinariesAPIRouter defines the required methods for binding the api requests to a responses for the PublishedBinariesAPI
// The PublishedBinariesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PublishedBinariesAPIServicer to perform the required actions, then write the service results to the http response.
type PublishedBinariesAPIRouter interface { 
	PublishedGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameRepositoryNameArchitectureNameGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameRepositoryNameGet(http.ResponseWriter, *http.Request)
	PublishedProjectNameRepositoryNameviewstatusGet(http.ResponseWriter, *http.Request)
}
// RequestAPIRouter defines the required methods for binding the api requests to a responses for the RequestAPI
// The RequestAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RequestAPIServicer to perform the required actions, then write the service results to the http response.
type RequestAPIRouter interface { 
	RequestGet(http.ResponseWriter, *http.Request)
	RequestIdDelete(http.ResponseWriter, *http.Request)
	RequestIdGet(http.ResponseWriter, *http.Request)
	RequestIdPost(http.ResponseWriter, *http.Request)
	RequestIdPut(http.ResponseWriter, *http.Request)
	RequestIdcmddiffPost(http.ResponseWriter, *http.Request)
	RequestPost(http.ResponseWriter, *http.Request)
	RequestviewcollectionGet(http.ResponseWriter, *http.Request)
}
// WorkersAPIRouter defines the required methods for binding the api requests to a responses for the WorkersAPI
// The WorkersAPIRouter implementation should parse necessary information from the http request,
// pass the data to a WorkersAPIServicer to perform the required actions, then write the service results to the http response.
type WorkersAPIRouter interface { 
	WorkerArchitectureNameworkerIdGet(http.ResponseWriter, *http.Request)
	WorkerStatusGet(http.ResponseWriter, *http.Request)
	WorkercmdcheckconstraintsPost(http.ResponseWriter, *http.Request)
}


// AttributeNamespacesAPIServicer defines the api actions for the AttributeNamespacesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AttributeNamespacesAPIServicer interface { 
	AttributeGet(context.Context) (ImplResponse, error)
	AttributeNamespaceDelete(context.Context) (ImplResponse, error)
	AttributeNamespaceGet(context.Context, string) (ImplResponse, error)
	AttributeNamespaceMetaDelete(context.Context) (ImplResponse, error)
	AttributeNamespaceMetaGet(context.Context) (ImplResponse, error)
	AttributeNamespaceMetaPost(context.Context, Object) (ImplResponse, error)
	AttributeNamespaceMetaPut(context.Context, Object) (ImplResponse, error)
}


// AttributesAPIServicer defines the api actions for the AttributesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AttributesAPIServicer interface { 
	AttributeNamespaceAttributeNameDelete(context.Context, string) (ImplResponse, error)
	AttributeNamespaceAttributeNameMetaDelete(context.Context) (ImplResponse, error)
	AttributeNamespaceAttributeNameMetaGet(context.Context) (ImplResponse, error)
	AttributeNamespaceAttributeNameMetaPost(context.Context, Object) (ImplResponse, error)
	AttributeNamespaceAttributeNameMetaPut(context.Context, Object) (ImplResponse, error)
}


// BuildAPIServicer defines the api actions for the BuildAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BuildAPIServicer interface { 
	BuildGet(context.Context) (ImplResponse, error)
	BuildProjectNameGet(context.Context, string) (ImplResponse, error)
	BuildProjectNamePost(context.Context, string, string, string, string) (ImplResponse, error)
	BuildProjectNameRepositoryNameArchitectureNameBuilddepinfoGet(context.Context, string, string) (ImplResponse, error)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameGet(context.Context, string) (ImplResponse, error)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGet(context.Context) (ImplResponse, error)
	BuildProjectNameRepositoryNameArchitectureNamePackageNameReasonGet(context.Context) (ImplResponse, error)
	BuildProjectNameRepositoryNameArchitectureNameRepositoryGet(context.Context) (ImplResponse, error)
	BuildProjectNameRepositoryNameBuildconfigGet(context.Context) (ImplResponse, error)
	BuildProjectNameRepositoryNameGet(context.Context, string) (ImplResponse, error)
	BuildProjectNameResultGet(context.Context, string, string, string, string, bool, bool, bool) (ImplResponse, error)
	GetBuildProjectRepositoryArchPackageBuildinfo(context.Context) (ImplResponse, error)
	GetBuildProjectRepositoryArchPackageHistory(context.Context) (ImplResponse, error)
	GetBuildProjectRepositoryArchPackageLog(context.Context) (ImplResponse, error)
	GetBuildProjectRepositoryArchPackageStatus(context.Context) (ImplResponse, error)
	GetBuildProjectRepositoryArchitecturePackageFile(context.Context, string) (ImplResponse, error)
	GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo(context.Context, []string) (ImplResponse, error)
	PutBuildProjectRepositoryArchitecturePackageFile(context.Context, []string, string) (ImplResponse, error)
}


// ConfigurationAPIServicer defines the api actions for the ConfigurationAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ConfigurationAPIServicer interface { 
	ConfigurationGet(context.Context) (ImplResponse, error)
	ConfigurationPut(context.Context, Object) (ImplResponse, error)
}


// DistributionsAPIServicer defines the api actions for the DistributionsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DistributionsAPIServicer interface { 
	DistributionsBulkReplacePut(context.Context, Object) (ImplResponse, error)
	DistributionsDistributionIdDelete(context.Context) (ImplResponse, error)
	DistributionsDistributionIdGet(context.Context, int32) (ImplResponse, error)
	DistributionsDistributionIdPut(context.Context, Object) (ImplResponse, error)
	DistributionsGet(context.Context) (ImplResponse, error)
	DistributionsIncludeRemotesGet(context.Context) (ImplResponse, error)
	DistributionsPost(context.Context, DistributionsPostRequest) (ImplResponse, error)
}


// GeneralInformationAPIServicer defines the api actions for the GeneralInformationAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type GeneralInformationAPIServicer interface { 
	AboutGet(context.Context) (ImplResponse, error)
	ArchitecturesArchitectureNameGet(context.Context, string) (ImplResponse, error)
	ArchitecturesGet(context.Context) (ImplResponse, error)
}


// GroupsAPIServicer defines the api actions for the GroupsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type GroupsAPIServicer interface { 
	GroupGet(context.Context) (ImplResponse, error)
	GroupGroupTitleDelete(context.Context) (ImplResponse, error)
	GroupGroupTitleGet(context.Context, string) (ImplResponse, error)
	GroupGroupTitlePost(context.Context, string, string, string) (ImplResponse, error)
	GroupGroupTitlePut(context.Context, Object) (ImplResponse, error)
}


// IssueTrackersAPIServicer defines the api actions for the IssueTrackersAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type IssueTrackersAPIServicer interface { 
	IssueTrackersGet(context.Context) (ImplResponse, error)
	IssueTrackersIssueTrackerNameDelete(context.Context) (ImplResponse, error)
	IssueTrackersIssueTrackerNameGet(context.Context, string) (ImplResponse, error)
	IssueTrackersIssueTrackerNameIssuesIssueNameGet(context.Context, string) (ImplResponse, error)
	IssueTrackersIssueTrackerNamePut(context.Context, Object) (ImplResponse, error)
	IssueTrackersPost(context.Context, Object) (ImplResponse, error)
}


// PersonAPIServicer defines the api actions for the PersonAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PersonAPIServicer interface { 
	PersonGet(context.Context, string) (ImplResponse, error)
	PersonLoginGet(context.Context, string) (ImplResponse, error)
	PersonLoginGroupGet(context.Context) (ImplResponse, error)
	PersonLoginPost(context.Context, string, string) (ImplResponse, error)
	PersonLoginPut(context.Context, Object) (ImplResponse, error)
	PersonLoginTokenGet(context.Context) (ImplResponse, error)
	PersonLoginTokenIdDelete(context.Context, string) (ImplResponse, error)
	PersonLoginTokenPost(context.Context, string, string, string, string) (ImplResponse, error)
	PersonPost(context.Context, string, PersonPostRequest) (ImplResponse, error)
	PersonRegisterPost(context.Context, Object) (ImplResponse, error)
}


// PublishedBinariesAPIServicer defines the api actions for the PublishedBinariesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PublishedBinariesAPIServicer interface { 
	PublishedGet(context.Context) (ImplResponse, error)
	PublishedProjectNameGet(context.Context) (ImplResponse, error)
	PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet(context.Context, string) (ImplResponse, error)
	PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet(context.Context) (ImplResponse, error)
	PublishedProjectNameRepositoryNameArchitectureNameGet(context.Context) (ImplResponse, error)
	PublishedProjectNameRepositoryNameGet(context.Context) (ImplResponse, error)
	PublishedProjectNameRepositoryNameviewstatusGet(context.Context, string) (ImplResponse, error)
}


// RequestAPIServicer defines the api actions for the RequestAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RequestAPIServicer interface { 
	RequestGet(context.Context) (ImplResponse, error)
	RequestIdDelete(context.Context) (ImplResponse, error)
	RequestIdGet(context.Context, int32) (ImplResponse, error)
	RequestIdPost(context.Context, string, string, string, string, string, string, string, string, string, string) (ImplResponse, error)
	RequestIdPut(context.Context, Object) (ImplResponse, error)
	RequestIdcmddiffPost(context.Context, string, string, string) (ImplResponse, error)
	RequestPost(context.Context, string, RequestPostRequest, string, string, string) (ImplResponse, error)
	RequestviewcollectionGet(context.Context, string, string, string, string, string, string, string, string, int32, string) (ImplResponse, error)
}


// WorkersAPIServicer defines the api actions for the WorkersAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type WorkersAPIServicer interface { 
	WorkerArchitectureNameworkerIdGet(context.Context, string) (ImplResponse, error)
	WorkerStatusGet(context.Context) (ImplResponse, error)
	WorkercmdcheckconstraintsPost(context.Context, string, string, string, string, WorkerCmdCheckconstraintsPostRequest) (ImplResponse, error)
}
