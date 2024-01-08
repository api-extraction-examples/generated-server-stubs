/*
 * Probely Developers
 *
 * Probely is a Web Vulnerability Scanning suite for Agile Teams. It provides continuous scanning of your Web Applications and lets you efficiently manage the lifecycle of the vulnerabilities found, in a sleek and intuitive ~~web interface~~ API.  ## Quick-Start  ### Authentication  To use the API, you first need to create a token (API Key). To create a token, select a target from the drop-down list, go to the \"Settings\" page, and click on the \"Integrations\" tab.  Write a name for the API Key. For example, if you want to use the API Key for travis, you could name it \"travis\". In this example, we chose \"**example.com_key**\"  ![Creating API key][1]    [1]: assets/qs/create_api_key_1.png    The API key was created successfully:  ![API key created][2]    [2]: assets/qs/create_api_key_2.png   On every request, you need to pass this token in the authorization header, like this:   ```yaml Authorization: JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiJBRlNJQlp 3elFsMDEiLCJ1c2VybmFtZSI6IkNIZ2tkSUROdzV0NSJ9.90UwiPGS2hlvgOLktFU0LfKuatNKm mEP79u17VnqT9M ```   **WARNING: Treat this token as a password. With this token, you have the power to fully manage the target.**  In the following examples, the token will be named as *PROBELY_AUTH_TOKEN*.   ### Scan target  First let's view our target list:  ```bash curl https://api.probely.com/targets/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   From the results, we need the **target id**:  ```json {    \"count\":1,    \"page_total\":1,    \"page\":1,    \"length\":10,    \"results\":[       {          \"id\":\"AxtkqTE0v3E-\",          \"name\":\"test-site\",          \"desc\":\"\",          \"url\":\"https://test-site.example.com\",          \"settings\":             \"(...)\"          ,          \"stack\":             \"(...)\"          ,          \"verified\":true,          \"(...)\": \"(...)\"       }    ] } ```   Now we can send a request to start a scan on target id **AxtkqTE0v3E-**  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scan_now/ \\   -X POST \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   And we get a response saying that the scan is scheduled: the status is **queued**, and we've got a **scan id**:  ```json {    \"changed\":\"2017-08-01T13:37:00.843339Z\",    \"started\":null,    \"completed\":null,    \"mediums\":0,    \"changed_by\":     \"(...)\"    ,    \"highs\":0,    \"status\":\"queued\",    \"id\":\"S6dOMPn0SnoH\",    \"created_by\":     \"(...)\"    ,    \"target\":     \"(...)\"    ,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"lows\":0 } ```   Using the scan id **S6dOMPn0SnoH**, we can pool the scan status:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scans/S6dOMPn0SnoH/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   And we get a response saying that the scan status is now **started**:  ```json {    \"id\":\"S6dOMPn0SnoH\",    \"changed\":\"2017-08-01T13:38:12.623650Z\",    \"started\":null,    \"completed\":null,    \"mediums\":0,    \"changed_by\":     \"(...)\"    ,    \"highs\":0,    \"status\":\"started\",    \"created_by\":     \"(...)\"    ,    \"target\":     \"(...)\"    ,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"lows\":0 } ```   The possible statuses are:  | Status | Name | Description | | ------ | ---- | ----------- | | queued | Queued | The scan is queued to start | | started | Started | The scan is currently running | | under_review | Under Review | The scan is complete but has some findings under review | | completed | Completed | The scan is complete | | completed_with_errors | Completed with errors | The scan is complete even after getting some error(s) | | failed | Failed | The scan failed | | canceled | Canceled | The scan was canceled | | canceling | Canceling | The scan is being canceled |   During the scan, the keys \"lows\", \"mediums\", and \"highs\" will be updated with the findings, as they are being found.  After we get either the status **completed** or **completed_with_errors**, we can view the findings.   ### Get vulnerabilities  Using the previous scan id **S6dOMPn0SnoH**, we can get the scan results:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scans/S6dOMPn0SnoH/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```  We get a response saying that the scan status is now **completed**, and that **45** vulnerabilities were found. **14** low, **11** medium and **20** high:  ```json {    \"id\":\"S6dOMPn0SnoH\",    \"target\":     \"(...)\"    ,    \"status\":\"completed\",    \"started\":\"2017-08-01T13:37:12.623650Z\",    \"completed\":\"2017-08-01T14:17:48.559514Z\",    \"lows\":14,    \"mediums\":11,    \"highs\":20,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"created_by\":     \"(...)\"    ,    \"changed\":\"2017-08-01T14:17:48.559514Z\",    \"changed_by\":     \"(...)\" } ```  You can now view the results of this scan, or the target findings.   Let's start with the scan results:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/?scan=S6dOMPn0SnoH&page=1 \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```  ```json {    \"count\":45,    \"page_total\":5,    \"page\":1,    \"length\":10,    \"results\":[       {          \"id\":79,          \"target\":           \"(...)\"          ,          \"scans\":           \"(...)\"          ,          \"labels\":           \"(...)\"          ,          \"fix\":\"To fix an SQL Injection in PHP, you should use Prepared Statements. Prepared Statements can be thought of as a kind of compiled template for the SQL that an application wants to run, that can be customized using variable parameters.\\n\\nPHP's PDO extension supports Prepared Statements, so that's probably your best option.\\n\\nIn the example below you can see the use of prepared statements. Variables ```$username``` and ```$hashedPassword``` come from user input.\\n\\n```\\n$stmt = $dbg->prepare(\\\"SELECT id, name FROM users\\n                       WHERE username=? AND password=?\\\");\\n$stmt->bindParam(1, $username);\\n$stmt->bindParam(2, $hashedPassword);\\nif ($stmt->execute()) {\\n\\t$user = $stmt->fetch();\\n\\tif ($user) {\\n\\t\\t$_SESSION['authID'] = $user['id'];\\n\\t\\techo \\\"Hello \\\" . $user['name'];\\n\\t} else {\\n\\t\\techo \\\"Invalid Login\\\";\\n\\t}\\n}\\n```  \\n\\nAs an added bonus, if you're executing the same query several times, then it'll be even faster than when you're not using prepared statements. This is because when using prepared statements, the query needs to be parsed (prepared) only once, but can be executed multiple times with the same or different parameters. \\n\",          \"requests\":[             {                \"request\":\"(...)\",                \"response\":\"(...)\"             },             {                \"request\":\"(...)\",                \"response\":\"(...)\"             }          ],          \"evidence\":null,          \"extra\":\"\",          \"definition\":{             \"id\":\"xnV8PJVmSoLS\",             \"name\":\"SQL Injection\",             \"desc\":\"SQL Injections are the most common form of injections because SQL databases are very popular in dynamic web applications. This vulnerability allows an attacker to tamper existing SQL queries performed by the web application. Depending on the queries, the attacker might be able to access, modify or even destroy data from the database.\\n\\nSince databases are commonly used to store private data, such as authentication information, personal user data and site content, if an attacker gains access to it, the consequences are typically very severe, ranging from defacement of the web application to users data leakage or loss, or even full control of the web application or database server.\",          },          \"url\":\"http://test-site.example.com/login.php\",          \"path\":\"login.php\",          \"method\":\"post\",          \"parameter\":\"username\",          \"value\":\"\",          \"params\":{             \"username\":[                \"probely'\"             ],             \"password\":[                \"probely\"             ]          },          \"reporter\":           \"(...)\"          ,          \"assignee\":null,          \"state\":\"notfixed\",          \"severity\":30,          \"last_found\":\"2017-08-01T14:03:56.207794Z\",          \"changed\":\"2017-08-01T14:03:56.207794Z\",          \"changed_by\":           \"(...)\"          ,          \"comment\":\"\"       },       \"(...)\"    ] } ```  You can also view all the target findings, which will show all the findings that are not yet fixed. \\\\ The structure is similar to the previous result.  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   ### Get vulnerability details  You can also get details for a particular finding in a target. \\\\ In this example we will get the details for the same finding as in the previous section:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/79/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   This will result on the same information, but just for this particular finding:  ```json {    \"id\":79,    \"target\":     \"(...)\"    ,    \"scans\":     \"(...)\"    ,    \"labels\":     \"(...)\"    ,    \"fix\":\"To fix an SQL Injection in PHP, you should use Prepared Statements. Prepared Statements can be thought of as a kind of compiled template for the SQL that an application wants to run, that can be customized using variable parameters.\\n\\nPHP's PDO extension supports Prepared Statements, so that's probably your best option.\\n\\nIn the example below you can see the use of prepared statements. Variables ```$username``` and ```$hashedPassword``` come from user input.\\n\\n```\\n$stmt = $dbg->prepare(\\\"SELECT id, name FROM users\\n                       WHERE username=? AND password=?\\\");\\n$stmt->bindParam(1, $username);\\n$stmt->bindParam(2, $hashedPassword);\\nif ($stmt->execute()) {\\n\\t$user = $stmt->fetch();\\n\\tif ($user) {\\n\\t\\t$_SESSION['authID'] = $user['id'];\\n\\t\\techo \\\"Hello \\\" . $user['name'];\\n\\t} else {\\n\\t\\techo \\\"Invalid Login\\\";\\n\\t}\\n}\\n```  \\n\\nAs an added bonus, if you're executing the same query several times, then it'll be even faster than when you're not using prepared statements. This is because when using prepared statements, the query needs to be parsed (prepared) only once, but can be executed multiple times with the same or different parameters. \\n\",    \"requests\":[       {          \"request\":\"(...)\",          \"response\":\"(...)\"       },       {          \"request\":\"(...)\",          \"response\":\"(...)\"       }    ],    \"evidence\":null,    \"extra\":\"\",    \"definition\":{       \"id\":\"xnV8PJVmSoLS\",       \"name\":\"SQL Injection\",       \"desc\":\"SQL Injections are the most common form of injections because SQL databases are very popular in dynamic web applications. This vulnerability allows an attacker to tamper existing SQL queries performed by the web application. Depending on the queries, the attacker might be able to access, modify or even destroy data from the database.\\n\\nSince databases are commonly used to store private data, such as authentication information, personal user data and site content, if an attacker gains access to it, the consequences are typically very severe, ranging from defacement of the web application to users data leakage or loss, or even full control of the web application or database server.\",    },    \"url\":\"http://test-site.example.com/login.php\",    \"path\":\"login.php\",    \"method\":\"post\",    \"parameter\":\"username\",    \"value\":\"\",    \"params\":{       \"username\":[          \"probely'\"       ],       \"password\":[          \"probely\"       ]    },    \"reporter\":     \"(...)\"    ,    \"assignee\":null,    \"state\":\"notfixed\",    \"severity\":30,    \"last_found\":\"2017-08-01T14:03:56.207794Z\",    \"changed\":\"2017-08-01T14:03:56.207794Z\",    \"changed_by\":     \"(...)\"    ,    \"comment\":\"\" } ```  ## Concepts  The short version is that you run *scans* on *targets*, and *findings* are created for any issue that is found. However, there are a few more concepts that must be explained in order to get a complete picture of how Probely works. We will spend the next few sections detailing the most important concepts.   ### Target  A *target* defines the scope of a scan, what will and won't be included in the scan plan. This is done by filling a *target*'s *site* and *assets*.  The entry point for the web application (and authentication) is setup in the *target*'s *site*.  In modern web applications, you are probably loading resources from multiple domains. A single page app, for example, will usualy load the page from one domain and make AJAX requests to another. This is what *assets* are for: they specify what domains our scanner should follow and create requests for.   ### Site A URL is probably not the only thing you will need to setup when scannning your application. Does the application have an authenticated area? Does it use basic auth? Does it expect a certain cookie or header? These parameters are all configured in the *target*'s *site*.   We need to ensure that only allowed web applications are scanned. Therefore, we must verify that you have control of any site you wish to include. This can be done by:   * Placing a file on a well-known location, on the site's server;   * Creating specific DNS records.   ### Asset  An *asset* is very similar to a *site*. The difference is that it is a domain instead of a URL. Additionally, an *asset* has no login or basic auth support. You can still have custom cookies and headers per *asset*.  As with the *site*, you will need to prove an *asset*'s ownership. We have added some rules to make your life easier, if you already have verified a *site* and the domains match, the validation is fast-tracked.  ### Scans  This is what you're here for. After configuring your *target*, you will want to run *scans* against it. You can either start a one off scan, or schedule one for later - recurring or not.  During the *scan*, we will spider and run several modules to check for security issues, which we call *findings*. You can check the *findings* even before a scan ends. If everything goes well, the scan will complete and that is it.  With some *findings*, our automated processes may have difficulties determining if it is a false positive or a legitimate issue. In these instances, a scan will be marked as under review, and we will further analyze the finding before making a decision. We will only show findings that, for some degree of confidence, are true positives. A finding that we are not sure of will never be displayed.  As much as we try to prevent it, a *scan* (or a sub-module) can malfunction. If this happens, a *scan* is marked as:   * \"failed\": the problem was irrecoverable;   * \"completed with errors\": some module failed but the scan itself completed.  During a scan, we try to determine what *frameworks* you are using and add this information to the *site* and *asset* objects discussed previously.   ### Findings  The last core concept is the *finding*, this is a security issue that we have found during our scans. If the same issue is found in a new scan it will not open a new finding but update the previous.  A *finding* will have a lot of information about the issue. Namely, where it was found, URL, insertion point (e.g. cookie), parameter, and method. Evidence we gathered, and the full request and response that we used. Sugestions of how to go about fixing it. A full description of the vulnerability is also present in the *definition* property. We also assign a severity and calculate the CVSS score for each.  Besides all this, there are also actions that you can perform on a *finding*. You can assign it to one user, leave comments for your team or add labels, and reduce or increase the severity.  If you don't plan on fixing the *finding* and accept the risk, or you think we reported a false positive, you can mark the finding to reflect that. 
 *
 * API version: 1.2.0
 * Contact: support@probely.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"reflect"
	"reflect"
)



// APIKeysAPIRouter defines the required methods for binding the api requests to a responses for the APIKeysAPI
// The APIKeysAPIRouter implementation should parse necessary information from the http request,
// pass the data to a APIKeysAPIServicer to perform the required actions, then write the service results to the http response.
type APIKeysAPIRouter interface { 
	KeysGet(http.ResponseWriter, *http.Request)
	KeysIdDelete(http.ResponseWriter, *http.Request)
	KeysIdGet(http.ResponseWriter, *http.Request)
	KeysPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdKeysGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdKeysIdDelete(http.ResponseWriter, *http.Request)
	TargetsTargetIdKeysIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdKeysPost(http.ResponseWriter, *http.Request)
}
// AccountAPIRouter defines the required methods for binding the api requests to a responses for the AccountAPI
// The AccountAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AccountAPIServicer to perform the required actions, then write the service results to the http response.
type AccountAPIRouter interface { 
	AccountGet(http.ResponseWriter, *http.Request)
	BillingActionsPost(http.ResponseWriter, *http.Request)
	BillingEstimatePost(http.ResponseWriter, *http.Request)
	BillingGet(http.ResponseWriter, *http.Request)
	BillingPatch(http.ResponseWriter, *http.Request)
	BillingPut(http.ResponseWriter, *http.Request)
	BillingSubscribePost(http.ResponseWriter, *http.Request)
	TargetActionsPost(http.ResponseWriter, *http.Request)
}
// ArchiveAPIRouter defines the required methods for binding the api requests to a responses for the ArchiveAPI
// The ArchiveAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ArchiveAPIServicer to perform the required actions, then write the service results to the http response.
type ArchiveAPIRouter interface { 
	TargetsActivatePost(http.ResponseWriter, *http.Request)
	TargetsArchivePost(http.ResponseWriter, *http.Request)
	TargetsArchivedPost(http.ResponseWriter, *http.Request)
}
// AssetsAPIRouter defines the required methods for binding the api requests to a responses for the AssetsAPI
// The AssetsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AssetsAPIServicer to perform the required actions, then write the service results to the http response.
type AssetsAPIRouter interface { 
	TargetsTargetIdAssetsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsIdDelete(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsIdPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsIdPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsIdVerifyPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdAssetsPost(http.ResponseWriter, *http.Request)
}
// EventsAPIRouter defines the required methods for binding the api requests to a responses for the EventsAPI
// The EventsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a EventsAPIServicer to perform the required actions, then write the service results to the http response.
type EventsAPIRouter interface { 
	EventsGet(http.ResponseWriter, *http.Request)
	EventsIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdEventsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdEventsIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksIdDelete(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksIdPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksIdPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdWebhooksPost(http.ResponseWriter, *http.Request)
	WebhooksGet(http.ResponseWriter, *http.Request)
	WebhooksIdDelete(http.ResponseWriter, *http.Request)
	WebhooksIdGet(http.ResponseWriter, *http.Request)
	WebhooksIdPatch(http.ResponseWriter, *http.Request)
	WebhooksIdPut(http.ResponseWriter, *http.Request)
	WebhooksPost(http.ResponseWriter, *http.Request)
}
// FindingsAPIRouter defines the required methods for binding the api requests to a responses for the FindingsAPI
// The FindingsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FindingsAPIServicer to perform the required actions, then write the service results to the http response.
type FindingsAPIRouter interface { 
	TargetsTargetIdFindingsBulkReportPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsBulkRetestPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsBulkUpdatePatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdLogGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdRetestPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsReportGet(http.ResponseWriter, *http.Request)
}
// FrameworksAPIRouter defines the required methods for binding the api requests to a responses for the FrameworksAPI
// The FrameworksAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FrameworksAPIServicer to perform the required actions, then write the service results to the http response.
type FrameworksAPIRouter interface { 
	FrameworksGet(http.ResponseWriter, *http.Request)
	FrameworksIdGet(http.ResponseWriter, *http.Request)
}
// IntegrationsAPIRouter defines the required methods for binding the api requests to a responses for the IntegrationsAPI
// The IntegrationsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a IntegrationsAPIServicer to perform the required actions, then write the service results to the http response.
type IntegrationsAPIRouter interface { 
	IntegrationsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsGet(http.ResponseWriter, *http.Request)
}
// JiraCloudIntegrationAPIRouter defines the required methods for binding the api requests to a responses for the JiraCloudIntegrationAPI
// The JiraCloudIntegrationAPIRouter implementation should parse necessary information from the http request,
// pass the data to a JiraCloudIntegrationAPIServicer to perform the required actions, then write the service results to the http response.
type JiraCloudIntegrationAPIRouter interface { 
	IntegrationsJiraCloudProjectsGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraCloudGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraCloudPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraCloudPut(http.ResponseWriter, *http.Request)
}
// JiraServerIntegrationAPIRouter defines the required methods for binding the api requests to a responses for the JiraServerIntegrationAPI
// The JiraServerIntegrationAPIRouter implementation should parse necessary information from the http request,
// pass the data to a JiraServerIntegrationAPIServicer to perform the required actions, then write the service results to the http response.
type JiraServerIntegrationAPIRouter interface { 
	IntegrationsJiraServerProjectsGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraServerProjectsProjectIdIssueTypesGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGet(http.ResponseWriter, *http.Request)
	IntegrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraServerGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraServerPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdFindingsIdIntegrationsJiraServerPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraServerGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraServerPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsJiraServerPut(http.ResponseWriter, *http.Request)
}
// LabelsAPIRouter defines the required methods for binding the api requests to a responses for the LabelsAPI
// The LabelsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a LabelsAPIServicer to perform the required actions, then write the service results to the http response.
type LabelsAPIRouter interface { 
	LabelsGet(http.ResponseWriter, *http.Request)
	LabelsIdDelete(http.ResponseWriter, *http.Request)
	LabelsIdGet(http.ResponseWriter, *http.Request)
	LabelsIdPatch(http.ResponseWriter, *http.Request)
	LabelsIdPut(http.ResponseWriter, *http.Request)
	LabelsPost(http.ResponseWriter, *http.Request)
}
// LoginAPIRouter defines the required methods for binding the api requests to a responses for the LoginAPI
// The LoginAPIRouter implementation should parse necessary information from the http request,
// pass the data to a LoginAPIServicer to perform the required actions, then write the service results to the http response.
type LoginAPIRouter interface { 
	AuthObtainPost(http.ResponseWriter, *http.Request)
	AuthRefreshPost(http.ResponseWriter, *http.Request)
	AuthRevokePost(http.ResponseWriter, *http.Request)
	AuthVerifyPost(http.ResponseWriter, *http.Request)
	EnterpriseAuthObtainPost(http.ResponseWriter, *http.Request)
	EnterpriseAuthRefreshPost(http.ResponseWriter, *http.Request)
	EnterpriseAuthRevokePost(http.ResponseWriter, *http.Request)
	EnterpriseAuthVerifyPost(http.ResponseWriter, *http.Request)
}
// PasswordResetAPIRouter defines the required methods for binding the api requests to a responses for the PasswordResetAPI
// The PasswordResetAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PasswordResetAPIServicer to perform the required actions, then write the service results to the http response.
type PasswordResetAPIRouter interface { 
	CheckPost(http.ResponseWriter, *http.Request)
	ResetPost(http.ResponseWriter, *http.Request)
	SetpasswordPost(http.ResponseWriter, *http.Request)
}
// PlanAPIRouter defines the required methods for binding the api requests to a responses for the PlanAPI
// The PlanAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PlanAPIServicer to perform the required actions, then write the service results to the http response.
type PlanAPIRouter interface { 
	PlansGet(http.ResponseWriter, *http.Request)
}
// ScansAPIRouter defines the required methods for binding the api requests to a responses for the ScansAPI
// The ScansAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ScansAPIServicer to perform the required actions, then write the service results to the http response.
type ScansAPIRouter interface { 
	TargetsAllScansGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScanNowPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansDatesGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdCancelPost(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdEndpointsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdReportDefaultGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdReportGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdReportOwaspGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansIdReportPciGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScansRetrievePageGet(http.ResponseWriter, *http.Request)
}
// ScheduledAPIRouter defines the required methods for binding the api requests to a responses for the ScheduledAPI
// The ScheduledAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ScheduledAPIServicer to perform the required actions, then write the service results to the http response.
type ScheduledAPIRouter interface { 
	TargetsAllScheduledscansExpandedGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansExpandedGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansIdDelete(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansIdGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansIdPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansIdPut(http.ResponseWriter, *http.Request)
	TargetsTargetIdScheduledscansPost(http.ResponseWriter, *http.Request)
}
// SiteAPIRouter defines the required methods for binding the api requests to a responses for the SiteAPI
// The SiteAPIRouter implementation should parse necessary information from the http request,
// pass the data to a SiteAPIServicer to perform the required actions, then write the service results to the http response.
type SiteAPIRouter interface { 
	// Deprecated
	TargetsTargetIdSiteGet(http.ResponseWriter, *http.Request)
	// Deprecated
	TargetsTargetIdSitePatch(http.ResponseWriter, *http.Request)
	// Deprecated
	TargetsTargetIdSitePut(http.ResponseWriter, *http.Request)
	// Deprecated
	TargetsTargetIdSiteVerifyPost(http.ResponseWriter, *http.Request)
}
// SlackIntegrationAPIRouter defines the required methods for binding the api requests to a responses for the SlackIntegrationAPI
// The SlackIntegrationAPIRouter implementation should parse necessary information from the http request,
// pass the data to a SlackIntegrationAPIServicer to perform the required actions, then write the service results to the http response.
type SlackIntegrationAPIRouter interface { 
	TargetsTargetIdIntegrationsSlackGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsSlackPatch(http.ResponseWriter, *http.Request)
	TargetsTargetIdIntegrationsSlackPut(http.ResponseWriter, *http.Request)
}
// StatisticsAPIRouter defines the required methods for binding the api requests to a responses for the StatisticsAPI
// The StatisticsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a StatisticsAPIServicer to perform the required actions, then write the service results to the http response.
type StatisticsAPIRouter interface { 
	TargetsAllAverageFixTimeGet(http.ResponseWriter, *http.Request)
	TargetsAllNeedsAttentionPieGet(http.ResponseWriter, *http.Request)
	TargetsAllNeedsAttentionTopGet(http.ResponseWriter, *http.Request)
	TargetsAllRiskTrendGet(http.ResponseWriter, *http.Request)
	TargetsAllSeverityTrendGet(http.ResponseWriter, *http.Request)
	TargetsAllTopVulnsGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdAverageFixTimeGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdRiskTrendGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdSeverityTrendGet(http.ResponseWriter, *http.Request)
	TargetsTargetIdTopVulnsGet(http.ResponseWriter, *http.Request)
}
// TargetsAPIRouter defines the required methods for binding the api requests to a responses for the TargetsAPI
// The TargetsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a TargetsAPIServicer to perform the required actions, then write the service results to the http response.
type TargetsAPIRouter interface { 
	TargetsGet(http.ResponseWriter, *http.Request)
	TargetsIdDelete(http.ResponseWriter, *http.Request)
	TargetsIdGet(http.ResponseWriter, *http.Request)
	TargetsIdPatch(http.ResponseWriter, *http.Request)
	TargetsIdPut(http.ResponseWriter, *http.Request)
	TargetsPost(http.ResponseWriter, *http.Request)
}
// UsersAPIRouter defines the required methods for binding the api requests to a responses for the UsersAPI
// The UsersAPIRouter implementation should parse necessary information from the http request,
// pass the data to a UsersAPIServicer to perform the required actions, then write the service results to the http response.
type UsersAPIRouter interface { 
	ProfileChangePasswordPost(http.ResponseWriter, *http.Request)
	ProfileGet(http.ResponseWriter, *http.Request)
	UsersGet(http.ResponseWriter, *http.Request)
	UsersIdDelete(http.ResponseWriter, *http.Request)
	UsersIdGet(http.ResponseWriter, *http.Request)
	UsersIdPatch(http.ResponseWriter, *http.Request)
	UsersIdPut(http.ResponseWriter, *http.Request)
	UsersPost(http.ResponseWriter, *http.Request)
}
// VulnerabilitiesAPIRouter defines the required methods for binding the api requests to a responses for the VulnerabilitiesAPI
// The VulnerabilitiesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a VulnerabilitiesAPIServicer to perform the required actions, then write the service results to the http response.
type VulnerabilitiesAPIRouter interface { 
	VulnerabilityDefinitionsGet(http.ResponseWriter, *http.Request)
	VulnerabilityDefinitionsIdGet(http.ResponseWriter, *http.Request)
}


// APIKeysAPIServicer defines the api actions for the APIKeysAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type APIKeysAPIServicer interface { 
	KeysGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	KeysIdDelete(context.Context, string) (ImplResponse, error)
	KeysIdGet(context.Context, string) (ImplResponse, error)
	KeysPost(context.Context, ApiKey) (ImplResponse, error)
	TargetsTargetIdKeysGet(context.Context, string, int32, int32, string, string) (ImplResponse, error)
	TargetsTargetIdKeysIdDelete(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdKeysIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdKeysPost(context.Context, string, ApiKey) (ImplResponse, error)
}


// AccountAPIServicer defines the api actions for the AccountAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AccountAPIServicer interface { 
	AccountGet(context.Context) (ImplResponse, error)
	BillingActionsPost(context.Context, []string) (ImplResponse, error)
	BillingEstimatePost(context.Context, Subscription) (ImplResponse, error)
	BillingGet(context.Context) (ImplResponse, error)
	BillingPatch(context.Context, Billing) (ImplResponse, error)
	BillingPut(context.Context, Billing) (ImplResponse, error)
	BillingSubscribePost(context.Context, Subscription) (ImplResponse, error)
	TargetActionsPost(context.Context, []string) (ImplResponse, error)
}


// ArchiveAPIServicer defines the api actions for the ArchiveAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ArchiveAPIServicer interface { 
	TargetsActivatePost(context.Context, []string) (ImplResponse, error)
	TargetsArchivePost(context.Context, []string) (ImplResponse, error)
	TargetsArchivedPost(context.Context, []string) (ImplResponse, error)
}


// AssetsAPIServicer defines the api actions for the AssetsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AssetsAPIServicer interface { 
	TargetsTargetIdAssetsGet(context.Context, string, int32, int32, string, string) (ImplResponse, error)
	TargetsTargetIdAssetsIdDelete(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdAssetsIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdAssetsIdPatch(context.Context, string, string, Asset) (ImplResponse, error)
	TargetsTargetIdAssetsIdPut(context.Context, string, string, Asset) (ImplResponse, error)
	TargetsTargetIdAssetsIdVerifyPost(context.Context, string, string, TargetsTargetIdAssetsIdVerifyPostRequest) (ImplResponse, error)
	TargetsTargetIdAssetsPost(context.Context, string, Asset) (ImplResponse, error)
}


// EventsAPIServicer defines the api actions for the EventsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type EventsAPIServicer interface { 
	EventsGet(context.Context) (ImplResponse, error)
	EventsIdGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdEventsGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdEventsIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdWebhooksGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdWebhooksIdDelete(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdWebhooksIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdWebhooksIdPatch(context.Context, string, string, Webhook) (ImplResponse, error)
	TargetsTargetIdWebhooksIdPut(context.Context, string, string, Webhook) (ImplResponse, error)
	TargetsTargetIdWebhooksPost(context.Context, string, Webhook) (ImplResponse, error)
	WebhooksGet(context.Context) (ImplResponse, error)
	WebhooksIdDelete(context.Context, string) (ImplResponse, error)
	WebhooksIdGet(context.Context, string) (ImplResponse, error)
	WebhooksIdPatch(context.Context, string, Webhook) (ImplResponse, error)
	WebhooksIdPut(context.Context, string, Webhook) (ImplResponse, error)
	WebhooksPost(context.Context, Webhook) (ImplResponse, error)
}


// FindingsAPIServicer defines the api actions for the FindingsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FindingsAPIServicer interface { 
	TargetsTargetIdFindingsBulkReportPost(context.Context, string, FindingBulkIds) (ImplResponse, error)
	TargetsTargetIdFindingsBulkRetestPost(context.Context, string, FindingBulkRetest) (ImplResponse, error)
	TargetsTargetIdFindingsBulkUpdatePatch(context.Context, string, FindingBulkUpdate) (ImplResponse, error)
	TargetsTargetIdFindingsGet(context.Context, string, []string, FindingSeverity, FindingState, []string, []string, int32, int32, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdLogGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdPatch(context.Context, string, string, FindingUpdate) (ImplResponse, error)
	TargetsTargetIdFindingsIdPut(context.Context, string, string, FindingUpdate) (ImplResponse, error)
	TargetsTargetIdFindingsIdRetestPost(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsReportGet(context.Context, string, string) (ImplResponse, error)
}


// FrameworksAPIServicer defines the api actions for the FrameworksAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FrameworksAPIServicer interface { 
	FrameworksGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	FrameworksIdGet(context.Context, string) (ImplResponse, error)
}


// IntegrationsAPIServicer defines the api actions for the IntegrationsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type IntegrationsAPIServicer interface { 
	IntegrationsGet(context.Context) (ImplResponse, error)
	TargetsTargetIdIntegrationsGet(context.Context, string) (ImplResponse, error)
}


// JiraCloudIntegrationAPIServicer defines the api actions for the JiraCloudIntegrationAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type JiraCloudIntegrationAPIServicer interface { 
	IntegrationsJiraCloudProjectsGet(context.Context) (ImplResponse, error)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesGet(context.Context, string) (ImplResponse, error)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGet(context.Context, string, string) (ImplResponse, error)
	IntegrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudPatch(context.Context, string, string, JiraFinding) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraCloudPut(context.Context, string, string, JiraFinding) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraCloudGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraCloudPatch(context.Context, string, JiraScope) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraCloudPut(context.Context, string, JiraScope) (ImplResponse, error)
}


// JiraServerIntegrationAPIServicer defines the api actions for the JiraServerIntegrationAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type JiraServerIntegrationAPIServicer interface { 
	IntegrationsJiraServerProjectsGet(context.Context) (ImplResponse, error)
	IntegrationsJiraServerProjectsProjectIdIssueTypesGet(context.Context, string) (ImplResponse, error)
	IntegrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGet(context.Context, string, string) (ImplResponse, error)
	IntegrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraServerGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraServerPatch(context.Context, string, string, JiraFinding) (ImplResponse, error)
	TargetsTargetIdFindingsIdIntegrationsJiraServerPut(context.Context, string, string, JiraFinding) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraServerGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraServerPatch(context.Context, string, JiraScope) (ImplResponse, error)
	TargetsTargetIdIntegrationsJiraServerPut(context.Context, string, JiraScope) (ImplResponse, error)
}


// LabelsAPIServicer defines the api actions for the LabelsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type LabelsAPIServicer interface { 
	LabelsGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	LabelsIdDelete(context.Context, string) (ImplResponse, error)
	LabelsIdGet(context.Context, string) (ImplResponse, error)
	LabelsIdPatch(context.Context, string, Label) (ImplResponse, error)
	LabelsIdPut(context.Context, string, Label) (ImplResponse, error)
	LabelsPost(context.Context, Label) (ImplResponse, error)
}


// LoginAPIServicer defines the api actions for the LoginAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type LoginAPIServicer interface { 
	AuthObtainPost(context.Context, Login) (ImplResponse, error)
	AuthRefreshPost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
	AuthRevokePost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
	AuthVerifyPost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
	EnterpriseAuthObtainPost(context.Context, Login) (ImplResponse, error)
	EnterpriseAuthRefreshPost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
	EnterpriseAuthRevokePost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
	EnterpriseAuthVerifyPost(context.Context, AuthRefreshPostRequest) (ImplResponse, error)
}


// PasswordResetAPIServicer defines the api actions for the PasswordResetAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PasswordResetAPIServicer interface { 
	CheckPost(context.Context, CheckPostRequest) (ImplResponse, error)
	ResetPost(context.Context, ResetPostRequest) (ImplResponse, error)
	SetpasswordPost(context.Context, SetpasswordPostRequest) (ImplResponse, error)
}


// PlanAPIServicer defines the api actions for the PlanAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PlanAPIServicer interface { 
	PlansGet(context.Context) (ImplResponse, error)
}


// ScansAPIServicer defines the api actions for the ScansAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ScansAPIServicer interface { 
	TargetsAllScansGet(context.Context, int32, int32, string, string, []string, ScanStatus) (ImplResponse, error)
	TargetsTargetIdScanNowPost(context.Context, string, TargetsTargetIdScanNowPostRequest) (ImplResponse, error)
	TargetsTargetIdScansDatesGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdScansGet(context.Context, string, int32, int32, string, string, []string, ScanStatus) (ImplResponse, error)
	TargetsTargetIdScansIdCancelPost(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdEndpointsGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdReportDefaultGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdReportGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdReportOwaspGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansIdReportPciGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScansRetrievePageGet(context.Context, string, string, int32) (ImplResponse, error)
}


// ScheduledAPIServicer defines the api actions for the ScheduledAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ScheduledAPIServicer interface { 
	TargetsAllScheduledscansExpandedGet(context.Context, int32) (ImplResponse, error)
	TargetsTargetIdScheduledscansExpandedGet(context.Context, string, int32) (ImplResponse, error)
	TargetsTargetIdScheduledscansGet(context.Context, string, int32, int32, string, string) (ImplResponse, error)
	TargetsTargetIdScheduledscansIdDelete(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScheduledscansIdGet(context.Context, string, string) (ImplResponse, error)
	TargetsTargetIdScheduledscansIdPatch(context.Context, string, string, TargetsTargetIdScheduledscansPostRequest) (ImplResponse, error)
	TargetsTargetIdScheduledscansIdPut(context.Context, string, string, TargetsTargetIdScheduledscansPostRequest) (ImplResponse, error)
	TargetsTargetIdScheduledscansPost(context.Context, string, TargetsTargetIdScheduledscansPostRequest) (ImplResponse, error)
}


// SiteAPIServicer defines the api actions for the SiteAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type SiteAPIServicer interface { 
	// Deprecated
	TargetsTargetIdSiteGet(context.Context, string) (ImplResponse, error)
	// Deprecated
	TargetsTargetIdSitePatch(context.Context, string, Site) (ImplResponse, error)
	// Deprecated
	TargetsTargetIdSitePut(context.Context, string, Site) (ImplResponse, error)
	// Deprecated
	TargetsTargetIdSiteVerifyPost(context.Context, string, TargetsTargetIdAssetsIdVerifyPostRequest) (ImplResponse, error)
}


// SlackIntegrationAPIServicer defines the api actions for the SlackIntegrationAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type SlackIntegrationAPIServicer interface { 
	TargetsTargetIdIntegrationsSlackGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdIntegrationsSlackPatch(context.Context, string, Slack) (ImplResponse, error)
	TargetsTargetIdIntegrationsSlackPut(context.Context, string, Slack) (ImplResponse, error)
}


// StatisticsAPIServicer defines the api actions for the StatisticsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type StatisticsAPIServicer interface { 
	TargetsAllAverageFixTimeGet(context.Context) (ImplResponse, error)
	TargetsAllNeedsAttentionPieGet(context.Context) (ImplResponse, error)
	TargetsAllNeedsAttentionTopGet(context.Context) (ImplResponse, error)
	TargetsAllRiskTrendGet(context.Context) (ImplResponse, error)
	TargetsAllSeverityTrendGet(context.Context) (ImplResponse, error)
	TargetsAllTopVulnsGet(context.Context) (ImplResponse, error)
	TargetsTargetIdAverageFixTimeGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdRiskTrendGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdSeverityTrendGet(context.Context, string) (ImplResponse, error)
	TargetsTargetIdTopVulnsGet(context.Context, string) (ImplResponse, error)
}


// TargetsAPIServicer defines the api actions for the TargetsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type TargetsAPIServicer interface { 
	TargetsGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	TargetsIdDelete(context.Context, string) (ImplResponse, error)
	TargetsIdGet(context.Context, string) (ImplResponse, error)
	TargetsIdPatch(context.Context, string, Target) (ImplResponse, error)
	TargetsIdPut(context.Context, string, Target) (ImplResponse, error)
	TargetsPost(context.Context, Target) (ImplResponse, error)
}


// UsersAPIServicer defines the api actions for the UsersAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type UsersAPIServicer interface { 
	ProfileChangePasswordPost(context.Context, ProfileChangePasswordPostRequest) (ImplResponse, error)
	ProfileGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	UsersGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	UsersIdDelete(context.Context, string) (ImplResponse, error)
	UsersIdGet(context.Context, string) (ImplResponse, error)
	UsersIdPatch(context.Context, string, UsersPostRequest) (ImplResponse, error)
	UsersIdPut(context.Context, string, UsersPostRequest) (ImplResponse, error)
	UsersPost(context.Context, UsersPostRequest) (ImplResponse, error)
}


// VulnerabilitiesAPIServicer defines the api actions for the VulnerabilitiesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type VulnerabilitiesAPIServicer interface { 
	VulnerabilityDefinitionsGet(context.Context, int32, int32, string, string) (ImplResponse, error)
	VulnerabilityDefinitionsIdGet(context.Context, string) (ImplResponse, error)
}
