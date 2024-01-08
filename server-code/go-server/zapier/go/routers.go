/*
 * Zapier Natural Language Actions (NLA) API - Beta
 *
 * <img src=\"https://cdn.zappy.app/945f9bf9e44126873952ec5113949c3f.png\" width=\"100\" />  ## Hi, there! Welcome to the **Zapier Natural Language Actions API docs**. You are currently viewing the **root** API.  The endpoints of this **root** API are static and useful for reference. To see the live playground with dynamic API endpoints that match up to your own **actions**, [log in first](/login/zapier/), then go here:  **[NLA Dynamic API](/api/v1/dynamic/docs).**   ## Overview <a name=\"overview\"></a>  Zapier is an integration platform with over 5,000+ apps and 50,000+ actions. You can view the [full list here](https://zapier.com/apps). Zapier is used by millions of users, most of whom are non-technical builders -- but often savvy with software. Zapier offers several no code products to connect together the various apps on our platform. NLA exposes the same integrations Zapier uses to build our products, to you, to plug-in the capabilties of Zapier's platform into your own products.   For example, you can use the NLA API to: * Send messages in [Slack](https://zapier.com/apps/slack/integrations) * Add a row to a [Google Sheet](https://zapier.com/apps/google-sheets/integrations) * Draft a new email in [Gmail](https://zapier.com/apps/gmail/integrations) * ... and thousands more, with one universal natural language API  The typical use-case for NLA is to expose our ecosystem of thousands of apps/actions within your own product. NLA is optimized for products that receive user input in natural language (eg. chat, assistant, or other large language model based experience) -- that said, it can also be used to power _any_ product that needs integrations. In this case, think of NLA as a more friendly, human API.  NLA contains a decade of experience with API shenanigans, so you don't have to. Common API complexity, automatically handled: * **Every type of auth** (Basic, Session, API Key, OAuth v1, Oauth v2, Digest, ...), Zapier securely handles and signs requests for you * **Support for create, update, and search actions**, endpoints optimized for natural language usage * **Support for custom fields**, Spreadsheet, CRM, and Mailing List friendly! * **Reference by name, not ID**, humans use natural language names, not IDs, to reference things in their apps, so NLA does too * **Smart, human defaults**, APIs sometimes have 100 options. Zapier's platform data helps us make NLA simpler for users out of the box  #### Two Usage Modes <a name=\"usage-modes\"></a>  NLA handles all the underlying API auth and translation from natural language --> underlying API call --> return simplified output. The key idea is you (the developer), or your users, expose a set of actions via an oauth-like setup window, which you can then query and execute via a REST API. NLA offers both API Key and OAuth for signing NLA API requests.  1. **Server-side only** (API Key): for quickly getting started, testing, and production scenarios where your app will only use actions exposed in the developer's Zapier account (and will use the developer's connected accounts on Zapier.com)  2. **User-facing** (Oauth): for production scenarios where you are deploying an end-user facing application and your app needs access to end-user's exposed actions and connected accounts on Zapier.com  #### Why Natural Language?   Simply, it makes the API easier to use for both developers and users (and also for [large language models](https://en.wikipedia.org/wiki/Wikipedia:Large_language_models)!)  We designed NLA to expose the power of Zapier's platform without passing along the complexity. A few design choices: * There is a [user-facing component](https://cdn.zappy.app/83728f684b91c0afe7d435445fe4ac90.png) to NLA, exposed via a popup window, users set up and enable basic actions which \"expose\" them to you, the `provider`. * The default action setup for users is minimal and fast. [All required fields are guessed](https://cdn.zappy.app/20afede9be56bf4e30d31986bc5325f8.png). This guessing is accomplished using an lanuage model on the NLA side. * Users can [choose to override any guessed field](https://cdn.zappy.app/e07f6eabfe7512e9decf01cba0c9e847.png) with a fixed value or choice, increasing trust to use the natural language interface. * Custom fields (ex. spreadsheet columns) can also be [dynamically guessed at action run time](https://cdn.zappy.app/9061499b4b973200fc345f695b33e3c7.png), or fixed by the user.  Using the API is then simple:  ``` curl -v \\     -d '{\"instructions\": \"Add Bryan Helmig at Zapier to my NLA test sheet, oh and he loves guitars!\"}' \\     -H \"Authorization: Bearer <ACCESS_TOKEN>\" \\     -H \"Content-Type: application/json\" \\     'https://nla.zapier.com/api/v1/dynamic/exposed/<ACTION_ID>/execute/' ```  Or mix in some fixed values:  ``` curl -v \\     -d '{\"instructions\": \"Send a short poem about automation to slack\", \"channel\": \"#fun-zapier\"}' \\     -H \"Authorization: Bearer <ACCESS_TOKEN>\" \\     -H \"Content-Type: application/json\" \\     'https://nla.zapier.com/api/v1/dynamic/exposed/<ACTION_ID>/execute/' ```  ## Auth <a name=\"auth\"></a>  #### For Quickly Exploring <a name=\"exploring\"></a>  It's best to take advantage of session auth built into the OpenAPI docs.  1. [Log in](/login/zapier/) 2. [Create and enable an action](/demo/) using our `demo` provider  then all your enabled (\"exposed\") actions will be available at the bottom of the the **[dynamic API](/api/v1/dynamic/docs)**.  #### For Testing or Production (Server-side only mode) <a name=\"server-side\"></a>  For development purposes, or using NLA in a server-side only use case, you can get started quickly using the provider `dev`. You can generate an `API key` using this provider and make authenticated requests.  Please follow these steps:  1. Go to the [Dev App provider](/dev/provider/debug/) debug page. 2. Look for \"User\" -> \"Information\" -> \"API Key\". If a key does not exist, follow the instructions to generate one. 3. Use this key in the header `x-api-key` to make authenticated requests.  Test that the API key is working:  ``` curl -v \\     -H \"Content-Type: application/json\" \\     -H \"x-api-key: <API_KEY>\" \\     'https://nla.zapier.com/api/v1/check/' ```  #### For Production (User-facing mode) <a name=\"production\"></a>  The API is authenticated via [standard OAuth v2](https://oauth.net/2/). Submit [this form](https://share.hsforms.com/1DWkLQ7SpSZCuZbTxcBB98gck10t) to get access and receive a `cliend_id`, `client_secret`, and your `provider` name (ex. 'acme'). You'll also need to share with us a `redirect_uri` to receive each `code`. This API uses both `access_token` and `refresh_token`.  Each of your users will get a per-user access token which you'll use to sign requests. The access token both authenticates and authorizes a request to access or run (execute) a given user's actions.  The basic auth flow is:  1. **Send user to our OAuth start URL, ideally in a popup window**  ```javascript var url = https://nla.zapier.com/oauth/authorize/?     response_type=code&     client_id=<YOUR_CLIENT_ID>&     redirect_uri=<YOUR_REDIRECT_URI>&     scope=nla%3Aexposed_actions%3Aexecute var nla = window.open(url, 'nla', 'width=650,height=700'); ```  2. **User approves request for access**  3. **NLA will redirect user via `GET` to the `redirect_uri` you provided us with a `?code=` in the query string**  4. **Snag the `code` and `POST` it to the NLA token endpoint `https://nla.zapier.com/oauth/token/`**  ``` curl -v \\     -d '{ \\         \"code\": \"<CODE>\", \\         \"grant_type\": \"authorization_code\", \\         \"client_id\": \"<YOUR_CLIENT_ID>\", \\         \"client_secret\": \"<YOUR_CLIENT_SECRET>\" \\         }' \\     -H \"Content-Type: application/json\" \\     -X POST 'https://nla.zapier.com/oauth/token/' ```  5. **Finally, receive `refresh_token` and `access_token` in response**  Save the refresh token, you'll need to use it to request a new access tokehn when it expires.  Now you can use the `access_token` to make authenticated requests:  ``` curl -v -H \"Authorization: Bearer <ACCESS_TOKEN>\" https://nla.zapier.com/api/v1/dynamic/openapi.json ```  6. **When the `access_token` expires, refresh it**  ``` curl -v \\     -d '{ \\         \"refresh_token\": \"<REFRESH_TOKEN>\", \\         \"grant_type\": \"refresh_token\", \\         \"client_id\": \"<YOUR_CLIENT_ID>\", \\         \"client_secret\": \"<YOUR_CLIENT_SECRET>\" \\         }' \\     -H \"Content-Type: application/json\" \\     -X POST 'https://nla.zapier.com/oauth/token/' ```  ## Action Setup Window <a name=\"action-setup-window\"></a>  Users set up their actions inside a window popup, that looks and feels similar to an OAuth window. The setup URL is the same for all your users: `https://nla.zapier.com/<PROVIDER>/start/`  You can check the validity of an access/refresh token by checking against the `api/v1/check/` endpoint to determine if you should present the `oauth/authorize/` or `<PROVIDER>/start/` url.  You'd typically include a button or link somewhere inside your product to open the setup window.  ```javascript var nla = window.open('https://nla.zapier.com/<PROVIDER>/start', 'nla', 'width=650,height=700'); ```  _Note: the setup window is optimized for 650px width, 700px height_  ## Using the API <a name=\"using-the-api\"></a>  #### Understanding the AI guessing flow <a name=\"ai-guessing\"></a>  NLA is optimized for a chat/assistant style usage paradigm where you want to offload as much work to a large language model, as possible. For end users, the action setup flow that takes ~seconds (compared to minutes/hours with traditional, complex integration setup).  An action is then run (executed) via an API call with one single natural language parameter `instructions`. In the chat/assistant use case, these instructions are likely being generated by your own large language model. However NLA works just as well even in more traditional software paradigm where `instructions` are perhaps hard-coded into your codebase or supplied by the user directly.  Consider the case where you've built a chat product and your end user wants to expose a \"Send Slack Message\" action to your product. Their action setup [might look like this](https://cdn.zappy.app/d19215e5a2fb3896f6cddf435dfcbe27.png).  The user only has to pick Slack and authorize their Slack account. By default, all required fields are set to \"Have AI guess\". In this example there are two required fields: Channel and Message Text.  If a field uses \"Have AI guess\", two things happen: 1. When the action is run via the API, NLA will interpret passed `instructions` (using a language model) to fill in the values for Channel and Message Text. NLA is smart about fields like Channel -- Slack's API requires a Channel ID, not a plain text Channel name. NLA handles all such cases automatically. 2. The field will be listed as an optional hint parameter in the OpenAPI spec (see \"hint parameters\" below) which allows you (the developer) to override any `instructions` guessing.  Sometimes language models hallucinate or guess wrong. And if this were a particuarly sensitive Slack message, the user may not want to leave the selection of \"Channel\" up to chance. NLA allows the user [to use a specific, fixed value like this](https://cdn.zappy.app/dc4976635259b4889f8412d231fb3be4.png).  Now when the action executes, the Message Text will still be automatically guessed but Channel will be fixed to \"#testing\". This significantly increases user trust and unlocks use cases where the user may have partial but not full trust in an AI guessing.  We call the set of fields the user denoted \"Have AI guess\" as \"hint parameters\" -- Message Text above in the above example is one. They are *always* optional. When running actions via the API, you (the developer) can choose to supply none/any/all hint parameters. Any hint parameters provided are treated exactly like \"Use a specific value\" at the user layer -- as an override.   One aside: custom fields. Zapier supports custom fields throughout the platform. The degenerate case is a spreadsheet, where _every_ column is a custom field. This introduces complexity because sheet columns are unknowable at action setup time if the user picks \"Have AI guess\" for which spreadsheet. NLA handles such custom fields using the same pattern as above with one distinction: they are not listed as hint parameters because they are literally unknowable until run time. Also as you may expect, if the user picks a specific spreadsheet during action setup, custom fields act like regular fields and flow through normally.  In the typical chat/assistant product use case, you'll want to expose these hint parameters alongside the exposed action list to your own language model. Your language model is likely to have broader context about the user vs the narrowly constrained `instructions` string passed to the API and will result in a better guess.  In summary:  ``` [user supplied \"Use specific value\"] --overrides--> [API call supplied hint parameters] --overrides--> [API call supplied \"instructions\"] ```   #### Common API use cases <a name=\"common-api-uses\"></a>  There are three common usages: 1. Get a list of the current user's exposed actions 2. Get a list of an action's optional hint parameters 3. Execute an action  Let's go through each, assuming you have a valid access token already.  ### 1. Get a list of the current user's exposed actions <a name=\"list-exposed-actions\"></a>  ``` # via the RESTful list endpoint: curl -v -H \"Authorization: Bearer <ACCESS_TOKEN>\" https://nla.zapier.com/api/v1/dynamic/exposed/  # via the dynamic openapi.json schema: curl -v -H \"Authorization: Bearer <ACCESS_TOKEN>\" https://nla.zapier.com/api/v1/dynamic/openapi.json ```  Example of [full list endpoint response here](https://nla.zapier.com/api/v1/dynamic/exposed/), snipped below:  ``` {     \"results\": [         {             \"id\": \"01GTB1KMX72QTJEXXXXXXXXXX\",             \"description\": \"Slack: Send Channel Message\",             ... ```  Example of [full openapi.json response here](https://nla.zapier.com/api/v1/dynamic/openapi.json), snipped below:  ``` {     ...     \"paths\": {         ...         \"/api/v1/dynamic/exposed/01GTB1KMX72QTJEXXXXXXXXXX/execute/\": {             \"post\": {                 \"operationId\": \"exposed_01GTB1KMX72QTJEXXXXXXXXXX_execute\",                 \"summary\": \"Slack: Send Channel Message (execute)\",                 ...  ```  ### 2. Get a list of an action's optional hint parameters <a name=\"get-hints\"></a>  As a reminder, hint parameters are _always_ optional. By default, all parameters are filled in via guessing based on a provided `instructions` parameter. If a hint parameter is supplied in an API request along with instructions, the hint parameter will _override_ the guess.  ``` # via the RESTful list endpoint: curl -v -H \"Authorization: Bearer <ACCESS_TOKEN>\" https://nla.zapier.com/api/v1/dynamic/exposed/  # via the dynamic openapi.json schema: curl -v -H \"Authorization: Bearer <ACCESS_TOKEN>\" https://nla.zapier.com/api/v1/dynamic/openapi.json ```  Example of [full list endpoint response here](https://nla.zapier.com/api/v1/dynamic/exposed/), snipped below:  ``` {     \"results\": [         {             \"id\": \"01GTB1KMX72QTJEXXXXXXXXXX\",             \"description\": \"Slack: Send Channel Message\",             \"input_params\": {                 \"instructions\": \"str\",                 \"Message_Text\": \"str\",                 \"Channel\": \"str\",                 ... ```  Example of [full openapi.json response here](https://nla.zapier.com/api/v1/dynamic/openapi.json), snipped below:  ``` {     ...     \"components\": {         \"schemas\": {             ...             \"PreviewExecuteRequest_01GTB1KMX72QTJEXXXXXXXXXX\": {                 \"title\": \"PreviewExecuteRequest_01GTB1KMX72QTJEXXXXXXXXXX\",                 \"type\": \"object\",                 \"properties\": {                     \"instructions\": {                         ...                     },                     \"Message_Text\": {                         ...                     },                     \"Channel_Name\": {                         ...                     }  ```  _Note: Every list of input_params will contain `instructions`, the only required parameter for execution._   ### 3. Execute (or preview) an action <a name=\"execute-action\"></a>  Finally, with an action ID and any desired, optional, hint parameters in hand, we can run (execute) an action. The parameter `instructions` is the only required parameter run an action.  ``` curl -v \\     -d '{\"instructions\": \"send a short poem about automation and robots to slack\", \"Channel_Name\": \"#fun-zapier\"}' \\     -H \"Content-Type: application/json\" \\     -X POST 'https://nla.zapier.com/api/v1/dynamic/exposed/01GTB1KMX72QTJEXXXXXXXXXX/execute/' ```  Another example, this time an action to retrieve data:  ``` curl -v \\     -d '{\"instructions\": \"grab the latest email from bryan helmig\"}' \\     -H \"Content-Type: application/json\" \\     -X POST 'https://nla.zapier.com/api/v1/dynamic/exposed/01GTA3G1WD49GN1XXXXXXXXX/execute/' ```  One more example, this time requesting a preview of the action:  ``` curl -v \\     -d '{\"instructions\": \"say Hello World to #fun-zapier\", \"preview_only\": true}' \\     -H \"Content-Type: application/json\" \\     -X POST 'https://nla.zapier.com/api/v1/dynamic/exposed/01GTB1KMX72QTJEXXXXXXXXXX/execute/' ```   #### Execution Return Data <a name=\"return-data\"></a>  ##### The Status Key <a name=\"status-key\"></a>  All actions will contain a `status`. The status can be one of four values:  `success`  The action executed successfully and found results.  `error`  The action failed to execute. An `error` key will have its value populated.  Example:  ```     {         ...         \"action_used\": \"Gmail: Send Email\",         \"result\": null,         \"status\": \"error\",         \"error\": \"Error from app: Required field \"subject\" (subject) is missing. Required field \"Body\" (body) is missing.\"     } ```  `empty`  The action executed successfully, but no results were found. This status exists to be explicit that having an empty `result` is correct.  `preview`  The action is a preview and not a real execution. A `review_url` key will contain a URL to optionally execute the action from a browser, or just rerun without the `preview_only` input parameter.  Example:  ```     {         ...         \"action_used\": \"Slack: Send Channel Message\",         \"input_params\": {             \"Channel\": \"fun-zapier\",             \"Message_Text\": \"Hello World\"         },         \"review_url\": \"https://nla.zapier.com/execution/01GW2E2ZNE5W07D32E41HFT5GJ/?needs_confirmation=true\",         \"status\": \"preview\",     } ```  ##### The Result Key <a name=\"result-key\"></a>  All actions will return trimmed `result` data. `result` is ideal for humans and language models alike! By default, `full_results` is not included but can be useful for machines (contact us if you'd like access to full results). The trimmed version is created using some AI and heuristics:  * selects for data that is plain text and human readable * discards machine data like IDs, headers, etc. * prioritizes data that is very popular on Zapier * reduces final result into about ~500 words  Trimmed results are ideal for inserting directly back into the prompt context of a large language models without blowing up context token window limits.  Example of a trimmed results payload from \"Gmail: Find Email\":  ```     {         \"result\": {             \"from__email\": \"mike@zapier.com\",             \"from__name\": \"Mike Knoop\",             \"subject\": \"Re: Getting setup\",             \"body_plain\": \"Hi Karla, thanks for following up. I can confirm I got access to everything! ... Thanks! Mike\",             \"cc__emails\": \"bryan@zapier.com, wade@zapier.com\"             \"to__email\": \"Mike Knoop\",         }     } ``` ## Changelog <a name=\"changelog\"></a>  **Mar 20, 2023** Shipped two minor but breaking changes, and one other minor change to the API's response data:  * Route: `/api/v1/configuration-link/`   * Key `url` is now `configuration_link` **(breaking change)** * Route: `/api/v1/exposed/{exposed_app_action_id}/execute/`   * Key `rating_url` is now `review_url` **(breaking change)** * Route: `/api/v1/exposed/`   * Added `configuration_link` key
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"errors"
	"time"
	"github.com/gorilla/mux"
	"io"
	"mime/multipart"
	"net/http"
	"os"
	"strconv"
	"strings"
)

// A Route defines the parameters for an api endpoint
type Route struct {
	Method	  string
	Pattern	 string
	HandlerFunc http.HandlerFunc
}

// Routes is a map of defined api endpoints
type Routes map[string]Route

// Router defines the required methods for retrieving api routes
type Router interface {
	Routes() Routes
}

const errMsgRequiredMissing = "required parameter is missing"
const errMsgMinValueConstraint = "provided parameter is not respecting minimum value constraint"
const errMsgMaxValueConstraint = "provided parameter is not respecting maximum value constraint"

// NewRouter creates a new router for any number of api routers
func NewRouter(routers ...Router) *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, api := range routers {
		for name, route := range api.Routes() {
			var handler http.Handler
			handler = route.HandlerFunc
			handler = Logger(handler, name)

			router.
				Methods(route.Method).
				Path(route.Pattern).
				Name(name).
				Handler(handler)
		}
	}

	return router
}

// EncodeJSONResponse uses the json encoder to write an interface to the http response with an optional status code
func EncodeJSONResponse(i interface{}, status *int, w http.ResponseWriter) error {
	wHeader := w.Header()

	f, ok := i.(*os.File)
	if ok {
		data, err := io.ReadAll(f)
		if err != nil {
			return err
		}
		wHeader.Set("Content-Type", http.DetectContentType(data))
		wHeader.Set("Content-Disposition", "attachment; filename="+f.Name())
		if status != nil {
			w.WriteHeader(*status)
		} else {
			w.WriteHeader(http.StatusOK)
		}
		_, err = w.Write(data)
		return err
	}
	wHeader.Set("Content-Type", "application/json; charset=UTF-8")

	if status != nil {
		w.WriteHeader(*status)
	} else {
		w.WriteHeader(http.StatusOK)
	}

	if i != nil {
		return json.NewEncoder(w).Encode(i)
	}

	return nil
}

// ReadFormFileToTempFile reads file data from a request form and writes it to a temporary file
func ReadFormFileToTempFile(r *http.Request, key string) (*os.File, error) {
	_, fileHeader, err := r.FormFile(key)
	if err != nil {
		return nil, err
	}

	return readFileHeaderToTempFile(fileHeader)
}

// ReadFormFilesToTempFiles reads files array data from a request form and writes it to a temporary files
func ReadFormFilesToTempFiles(r *http.Request, key string) ([]*os.File, error) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		return nil, err
	}

	files := make([]*os.File, 0, len(r.MultipartForm.File[key]))

	for _, fileHeader := range r.MultipartForm.File[key] {
		file, err := readFileHeaderToTempFile(fileHeader)
		if err != nil {
			return nil, err
		}

		files = append(files, file)
	}

	return files, nil
}

// readFileHeaderToTempFile reads multipart.FileHeader and writes it to a temporary file
func readFileHeaderToTempFile(fileHeader *multipart.FileHeader) (*os.File, error) {
	formFile, err := fileHeader.Open()
	if err != nil {
		return nil, err
	}

	defer formFile.Close()

	file, err := os.CreateTemp("", fileHeader.Filename)
	if err != nil {
		return nil, err
	}

	defer file.Close()

	_, err = io.Copy(file, formFile)
	if err != nil {
		return nil, err
	}
	
	return file, nil
}

func parseTimes(param string) ([]time.Time, error) {
	splits := strings.Split(param, ",")
	times := make([]time.Time, 0, len(splits))
	for _, v := range splits {
		t, err := parseTime(v)
		if err != nil {
			return nil, err
		}
		times = append(times, t)
	}
	return times, nil
}

// parseTime will parses a string parameter into a time.Time using the RFC3339 format
func parseTime(param string) (time.Time, error) {
	if param == "" {
		return time.Time{}, nil
	}
	return time.Parse(time.RFC3339, param)
}

type Number interface {
	~int32 | ~int64 | ~float32 | ~float64
}

type ParseString[T Number | string | bool] func(v string) (T, error)

// parseFloat64 parses a string parameter to an float64.
func parseFloat64(param string) (float64, error) {
	if param == "" {
		return 0, nil
	}

	return strconv.ParseFloat(param, 64)
}

// parseFloat32 parses a string parameter to an float32.
func parseFloat32(param string) (float32, error) {
	if param == "" {
		return 0, nil
	}

	v, err := strconv.ParseFloat(param, 32)
	return float32(v), err
}

// parseInt64 parses a string parameter to an int64.
func parseInt64(param string) (int64, error) {
	if param == "" {
		return 0, nil
	}

	return strconv.ParseInt(param, 10, 64)
}

// parseInt32 parses a string parameter to an int32.
func parseInt32(param string) (int32, error) {
	if param == "" {
		return 0, nil
	}

	val, err := strconv.ParseInt(param, 10, 32)
	return int32(val), err
}

// parseBool parses a string parameter to an bool.
func parseBool(param string) (bool, error) {
	if param == "" {
		return false, nil
	}

	return strconv.ParseBool(param)
}

type Operation[T Number | string | bool] func(actual string) (T, bool, error)

func WithRequire[T Number | string | bool](parse ParseString[T]) Operation[T] {
	var empty T
	return func(actual string) (T, bool, error) {
		if actual == "" {
			return empty, false, errors.New(errMsgRequiredMissing)
		}

		v, err := parse(actual)
		return v, false, err
	}
}

func WithDefaultOrParse[T Number | string | bool](def T, parse ParseString[T]) Operation[T] {
	return func(actual string) (T, bool, error) {
		if actual == "" {
			return def, true, nil
		}

		v, err := parse(actual)
		return v, false, err
	}
}

func WithParse[T Number | string | bool](parse ParseString[T]) Operation[T] {
	return func(actual string) (T, bool, error) {
		v, err := parse(actual)
		return v, false, err
	}
}

type Constraint[T Number | string | bool] func(actual T) error

func WithMinimum[T Number](expected T) Constraint[T] {
	return func(actual T) error {
		if actual < expected {
			return errors.New(errMsgMinValueConstraint)
		}

		return nil
	}
}

func WithMaximum[T Number](expected T) Constraint[T] {
	return func(actual T) error {
		if actual > expected {
			return errors.New(errMsgMaxValueConstraint)
		}

		return nil
	}
}

// parseNumericParameter parses a numeric parameter to its respective type.
func parseNumericParameter[T Number](param string, fn Operation[T], checks ...Constraint[T]) (T, error) {
	v, ok, err := fn(param)
	if err != nil {
		return 0, err
	}

	if !ok {
		for _, check := range checks {
			if err := check(v); err != nil {
				return 0, err
			}
		}
	}

	return v, nil
}

// parseBoolParameter parses a string parameter to a bool
func parseBoolParameter(param string, fn Operation[bool]) (bool, error) {
	v, _, err := fn(param)
	return v, err
}

// parseNumericArrayParameter parses a string parameter containing array of values to its respective type.
func parseNumericArrayParameter[T Number](param, delim string, required bool, fn Operation[T], checks ...Constraint[T]) ([]T, error) {
	if param == "" {
		if required {
			return nil, errors.New(errMsgRequiredMissing)
		}

		return nil, nil
	}

	str := strings.Split(param, delim)
	values := make([]T, len(str))

	for i, s := range str {
		v, ok, err := fn(s)
		if err != nil {
			return nil, err
		}

		if !ok {
			for _, check := range checks {
				if err := check(v); err != nil {
					return nil, err
				}
			}
		}

		values[i] = v
	}

	return values, nil
}
