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

import (
	"encoding/json"
	"net/http"
	"strings"
	"reflect"

	"github.com/gorilla/mux"
)

// BillsAPIController binds http requests to an api service and writes the service results to the http response
type BillsAPIController struct {
	service BillsAPIServicer
	errorHandler ErrorHandler
}

// BillsAPIOption for how the controller is set up.
type BillsAPIOption func(*BillsAPIController)

// WithBillsAPIErrorHandler inject ErrorHandler into controller
func WithBillsAPIErrorHandler(h ErrorHandler) BillsAPIOption {
	return func(c *BillsAPIController) {
		c.errorHandler = h
	}
}

// NewBillsAPIController creates a default api controller
func NewBillsAPIController(s BillsAPIServicer, opts ...BillsAPIOption) Router {
	controller := &BillsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BillsAPIController
func (c *BillsAPIController) Routes() Routes {
	return Routes{
		"ApiV1BillsBillIdStagesGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/Bills/{billId}/Stages",
			c.ApiV1BillsBillIdStagesGet,
		},
		"GetBill": Route{
			strings.ToUpper("Get"),
			"/api/v1/Bills/{billId}",
			c.GetBill,
		},
		"GetBillStageDetails": Route{
			strings.ToUpper("Get"),
			"/api/v1/Bills/{billId}/Stages/{billStageId}",
			c.GetBillStageDetails,
		},
		"GetBills": Route{
			strings.ToUpper("Get"),
			"/api/v1/Bills",
			c.GetBills,
		},
	}
}

// ApiV1BillsBillIdStagesGet - Returns all Bill stages.
func (c *BillsAPIController) ApiV1BillsBillIdStagesGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	billIdParam, err := parseNumericParameter[int32](
		params["billId"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var skipParam int32
	if query.Has("Skip") {
		param, err := parseNumericParameter[int32](
			query.Get("Skip"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		skipParam = param
	} else {
	}
	var takeParam int32
	if query.Has("Take") {
		param, err := parseNumericParameter[int32](
			query.Get("Take"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		takeParam = param
	} else {
	}
	result, err := c.service.ApiV1BillsBillIdStagesGet(r.Context(), billIdParam, skipParam, takeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetBill - Return a Bill.
func (c *BillsAPIController) GetBill(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	billIdParam, err := parseNumericParameter[int32](
		params["billId"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetBill(r.Context(), billIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetBillStageDetails - Returns a Bill stage.
func (c *BillsAPIController) GetBillStageDetails(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	billIdParam, err := parseNumericParameter[int32](
		params["billId"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	billStageIdParam, err := parseNumericParameter[int32](
		params["billStageId"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetBillStageDetails(r.Context(), billIdParam, billStageIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetBills - Returns a list of Bills.
func (c *BillsAPIController) GetBills(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var searchTermParam string
	if query.Has("SearchTerm") {
		param := query.Get("SearchTerm")

		searchTermParam = param
	} else {
	}
	var sessionParam int32
	if query.Has("Session") {
		param, err := parseNumericParameter[int32](
			query.Get("Session"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		sessionParam = param
	} else {
	}
	var currentHouseParam House
	if query.Has("CurrentHouse") {
		param := House(query.Get("CurrentHouse"))

		currentHouseParam = param
	} else {
	}
	var originatingHouseParam OriginatingHouse
	if query.Has("OriginatingHouse") {
		param := OriginatingHouse(query.Get("OriginatingHouse"))

		originatingHouseParam = param
	} else {
	}
	var memberIdParam int32
	if query.Has("MemberId") {
		param, err := parseNumericParameter[int32](
			query.Get("MemberId"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		memberIdParam = param
	} else {
	}
	var departmentIdParam int32
	if query.Has("DepartmentId") {
		param, err := parseNumericParameter[int32](
			query.Get("DepartmentId"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		departmentIdParam = param
	} else {
	}
	billStageParam, err := parseNumericArrayParameter[int32](
		query.Get("BillStage"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	billStagesExcludedParam, err := parseNumericArrayParameter[int32](
		query.Get("BillStagesExcluded"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var isDefeatedParam bool
	if query.Has("IsDefeated") {
		param, err := parseBoolParameter(
			query.Get("IsDefeated"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isDefeatedParam = param
	} else {
	}
	var isWithdrawnParam bool
	if query.Has("IsWithdrawn") {
		param, err := parseBoolParameter(
			query.Get("IsWithdrawn"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isWithdrawnParam = param
	} else {
	}
	billTypeParam, err := parseNumericArrayParameter[int32](
		query.Get("BillType"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var sortOrderParam BillSortOrder
	if query.Has("SortOrder") {
		param := BillSortOrder(query.Get("SortOrder"))

		sortOrderParam = param
	} else {
	}
	billIdsParam, err := parseNumericArrayParameter[int32](
		query.Get("BillIds"), ",", false,
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var skipParam int32
	if query.Has("Skip") {
		param, err := parseNumericParameter[int32](
			query.Get("Skip"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		skipParam = param
	} else {
	}
	var takeParam int32
	if query.Has("Take") {
		param, err := parseNumericParameter[int32](
			query.Get("Take"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		takeParam = param
	} else {
	}
	result, err := c.service.GetBills(r.Context(), searchTermParam, sessionParam, currentHouseParam, originatingHouseParam, memberIdParam, departmentIdParam, billStageParam, billStagesExcludedParam, isDefeatedParam, isWithdrawnParam, billTypeParam, sortOrderParam, billIdsParam, skipParam, takeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
