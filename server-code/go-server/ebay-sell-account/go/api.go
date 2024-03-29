/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
)



// AdvertisingEligibilityAPIRouter defines the required methods for binding the api requests to a responses for the AdvertisingEligibilityAPI
// The AdvertisingEligibilityAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AdvertisingEligibilityAPIServicer to perform the required actions, then write the service results to the http response.
type AdvertisingEligibilityAPIRouter interface { 
	GetAdvertisingEligibility(http.ResponseWriter, *http.Request)
}
// CustomPolicyAPIRouter defines the required methods for binding the api requests to a responses for the CustomPolicyAPI
// The CustomPolicyAPIRouter implementation should parse necessary information from the http request,
// pass the data to a CustomPolicyAPIServicer to perform the required actions, then write the service results to the http response.
type CustomPolicyAPIRouter interface { 
	CreateCustomPolicy(http.ResponseWriter, *http.Request)
	GetCustomPolicies(http.ResponseWriter, *http.Request)
	GetCustomPolicy(http.ResponseWriter, *http.Request)
	UpdateCustomPolicy(http.ResponseWriter, *http.Request)
}
// FulfillmentPolicyAPIRouter defines the required methods for binding the api requests to a responses for the FulfillmentPolicyAPI
// The FulfillmentPolicyAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FulfillmentPolicyAPIServicer to perform the required actions, then write the service results to the http response.
type FulfillmentPolicyAPIRouter interface { 
	CreateFulfillmentPolicy(http.ResponseWriter, *http.Request)
	DeleteFulfillmentPolicy(http.ResponseWriter, *http.Request)
	GetFulfillmentPolicies(http.ResponseWriter, *http.Request)
	GetFulfillmentPolicy(http.ResponseWriter, *http.Request)
	GetFulfillmentPolicyByName(http.ResponseWriter, *http.Request)
	UpdateFulfillmentPolicy(http.ResponseWriter, *http.Request)
}
// KycAPIRouter defines the required methods for binding the api requests to a responses for the KycAPI
// The KycAPIRouter implementation should parse necessary information from the http request,
// pass the data to a KycAPIServicer to perform the required actions, then write the service results to the http response.
type KycAPIRouter interface { 
	GetKYC(http.ResponseWriter, *http.Request)
}
// OnboardingAPIRouter defines the required methods for binding the api requests to a responses for the OnboardingAPI
// The OnboardingAPIRouter implementation should parse necessary information from the http request,
// pass the data to a OnboardingAPIServicer to perform the required actions, then write the service results to the http response.
type OnboardingAPIRouter interface { 
	GetPaymentsProgramOnboarding(http.ResponseWriter, *http.Request)
}
// PaymentPolicyAPIRouter defines the required methods for binding the api requests to a responses for the PaymentPolicyAPI
// The PaymentPolicyAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PaymentPolicyAPIServicer to perform the required actions, then write the service results to the http response.
type PaymentPolicyAPIRouter interface { 
	CreatePaymentPolicy(http.ResponseWriter, *http.Request)
	DeletePaymentPolicy(http.ResponseWriter, *http.Request)
	GetPaymentPolicies(http.ResponseWriter, *http.Request)
	GetPaymentPolicy(http.ResponseWriter, *http.Request)
	GetPaymentPolicyByName(http.ResponseWriter, *http.Request)
	UpdatePaymentPolicy(http.ResponseWriter, *http.Request)
}
// PaymentsProgramAPIRouter defines the required methods for binding the api requests to a responses for the PaymentsProgramAPI
// The PaymentsProgramAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PaymentsProgramAPIServicer to perform the required actions, then write the service results to the http response.
type PaymentsProgramAPIRouter interface { 
	GetPaymentsProgram(http.ResponseWriter, *http.Request)
}
// PrivilegeAPIRouter defines the required methods for binding the api requests to a responses for the PrivilegeAPI
// The PrivilegeAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PrivilegeAPIServicer to perform the required actions, then write the service results to the http response.
type PrivilegeAPIRouter interface { 
	GetPrivileges(http.ResponseWriter, *http.Request)
}
// ProgramAPIRouter defines the required methods for binding the api requests to a responses for the ProgramAPI
// The ProgramAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ProgramAPIServicer to perform the required actions, then write the service results to the http response.
type ProgramAPIRouter interface { 
	GetOptedInPrograms(http.ResponseWriter, *http.Request)
	OptInToProgram(http.ResponseWriter, *http.Request)
	OptOutOfProgram(http.ResponseWriter, *http.Request)
}
// RateTableAPIRouter defines the required methods for binding the api requests to a responses for the RateTableAPI
// The RateTableAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RateTableAPIServicer to perform the required actions, then write the service results to the http response.
type RateTableAPIRouter interface { 
	GetRateTables(http.ResponseWriter, *http.Request)
}
// ReturnPolicyAPIRouter defines the required methods for binding the api requests to a responses for the ReturnPolicyAPI
// The ReturnPolicyAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ReturnPolicyAPIServicer to perform the required actions, then write the service results to the http response.
type ReturnPolicyAPIRouter interface { 
	CreateReturnPolicy(http.ResponseWriter, *http.Request)
	DeleteReturnPolicy(http.ResponseWriter, *http.Request)
	GetReturnPolicies(http.ResponseWriter, *http.Request)
	GetReturnPolicy(http.ResponseWriter, *http.Request)
	GetReturnPolicyByName(http.ResponseWriter, *http.Request)
	UpdateReturnPolicy(http.ResponseWriter, *http.Request)
}
// SalesTaxAPIRouter defines the required methods for binding the api requests to a responses for the SalesTaxAPI
// The SalesTaxAPIRouter implementation should parse necessary information from the http request,
// pass the data to a SalesTaxAPIServicer to perform the required actions, then write the service results to the http response.
type SalesTaxAPIRouter interface { 
	CreateOrReplaceSalesTax(http.ResponseWriter, *http.Request)
	DeleteSalesTax(http.ResponseWriter, *http.Request)
	GetSalesTax(http.ResponseWriter, *http.Request)
	GetSalesTaxes(http.ResponseWriter, *http.Request)
}
// SubscriptionAPIRouter defines the required methods for binding the api requests to a responses for the SubscriptionAPI
// The SubscriptionAPIRouter implementation should parse necessary information from the http request,
// pass the data to a SubscriptionAPIServicer to perform the required actions, then write the service results to the http response.
type SubscriptionAPIRouter interface { 
	GetSubscription(http.ResponseWriter, *http.Request)
}


// AdvertisingEligibilityAPIServicer defines the api actions for the AdvertisingEligibilityAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AdvertisingEligibilityAPIServicer interface { 
	GetAdvertisingEligibility(context.Context, string, string) (ImplResponse, error)
}


// CustomPolicyAPIServicer defines the api actions for the CustomPolicyAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type CustomPolicyAPIServicer interface { 
	CreateCustomPolicy(context.Context, string, CustomPolicyCreateRequest) (ImplResponse, error)
	GetCustomPolicies(context.Context, string, string) (ImplResponse, error)
	GetCustomPolicy(context.Context, string, string) (ImplResponse, error)
	UpdateCustomPolicy(context.Context, string, string, CustomPolicyRequest) (ImplResponse, error)
}


// FulfillmentPolicyAPIServicer defines the api actions for the FulfillmentPolicyAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FulfillmentPolicyAPIServicer interface { 
	CreateFulfillmentPolicy(context.Context, FulfillmentPolicyRequest) (ImplResponse, error)
	DeleteFulfillmentPolicy(context.Context, string) (ImplResponse, error)
	GetFulfillmentPolicies(context.Context, string) (ImplResponse, error)
	GetFulfillmentPolicy(context.Context, string) (ImplResponse, error)
	GetFulfillmentPolicyByName(context.Context, string, string) (ImplResponse, error)
	UpdateFulfillmentPolicy(context.Context, string, FulfillmentPolicyRequest) (ImplResponse, error)
}


// KycAPIServicer defines the api actions for the KycAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type KycAPIServicer interface { 
	GetKYC(context.Context) (ImplResponse, error)
}


// OnboardingAPIServicer defines the api actions for the OnboardingAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type OnboardingAPIServicer interface { 
	GetPaymentsProgramOnboarding(context.Context, string, string) (ImplResponse, error)
}


// PaymentPolicyAPIServicer defines the api actions for the PaymentPolicyAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PaymentPolicyAPIServicer interface { 
	CreatePaymentPolicy(context.Context, PaymentPolicyRequest) (ImplResponse, error)
	DeletePaymentPolicy(context.Context, string) (ImplResponse, error)
	GetPaymentPolicies(context.Context, string) (ImplResponse, error)
	GetPaymentPolicy(context.Context, string) (ImplResponse, error)
	GetPaymentPolicyByName(context.Context, string, string) (ImplResponse, error)
	UpdatePaymentPolicy(context.Context, string, PaymentPolicyRequest) (ImplResponse, error)
}


// PaymentsProgramAPIServicer defines the api actions for the PaymentsProgramAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PaymentsProgramAPIServicer interface { 
	GetPaymentsProgram(context.Context, string, string) (ImplResponse, error)
}


// PrivilegeAPIServicer defines the api actions for the PrivilegeAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PrivilegeAPIServicer interface { 
	GetPrivileges(context.Context) (ImplResponse, error)
}


// ProgramAPIServicer defines the api actions for the ProgramAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ProgramAPIServicer interface { 
	GetOptedInPrograms(context.Context) (ImplResponse, error)
	OptInToProgram(context.Context, Program) (ImplResponse, error)
	OptOutOfProgram(context.Context, Program) (ImplResponse, error)
}


// RateTableAPIServicer defines the api actions for the RateTableAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RateTableAPIServicer interface { 
	GetRateTables(context.Context, string) (ImplResponse, error)
}


// ReturnPolicyAPIServicer defines the api actions for the ReturnPolicyAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ReturnPolicyAPIServicer interface { 
	CreateReturnPolicy(context.Context, ReturnPolicyRequest) (ImplResponse, error)
	DeleteReturnPolicy(context.Context, string) (ImplResponse, error)
	GetReturnPolicies(context.Context, string) (ImplResponse, error)
	GetReturnPolicy(context.Context, string) (ImplResponse, error)
	GetReturnPolicyByName(context.Context, string, string) (ImplResponse, error)
	UpdateReturnPolicy(context.Context, string, ReturnPolicyRequest) (ImplResponse, error)
}


// SalesTaxAPIServicer defines the api actions for the SalesTaxAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type SalesTaxAPIServicer interface { 
	CreateOrReplaceSalesTax(context.Context, string, string, SalesTaxBase) (ImplResponse, error)
	DeleteSalesTax(context.Context, string, string) (ImplResponse, error)
	GetSalesTax(context.Context, string, string) (ImplResponse, error)
	GetSalesTaxes(context.Context, string) (ImplResponse, error)
}


// SubscriptionAPIServicer defines the api actions for the SubscriptionAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type SubscriptionAPIServicer interface { 
	GetSubscription(context.Context, string, string) (ImplResponse, error)
}
