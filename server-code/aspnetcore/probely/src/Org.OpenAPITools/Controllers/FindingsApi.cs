/*
 * Probely Developers
 *
 * Probely is a Web Vulnerability Scanning suite for Agile Teams. It provides continuous scanning of your Web Applications and lets you efficiently manage the lifecycle of the vulnerabilities found, in a sleek and intuitive ~~web interface~~ API.  ## Quick-Start  ### Authentication  To use the API, you first need to create a token (API Key). To create a token, select a target from the drop-down list, go to the \"Settings\" page, and click on the \"Integrations\" tab.  Write a name for the API Key. For example, if you want to use the API Key for travis, you could name it \"travis\". In this example, we chose \"**example.com_key**\"  ![Creating API key][1]    [1]: assets/qs/create_api_key_1.png    The API key was created successfully:  ![API key created][2]    [2]: assets/qs/create_api_key_2.png   On every request, you need to pass this token in the authorization header, like this:   ```yaml Authorization: JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiJBRlNJQlp 3elFsMDEiLCJ1c2VybmFtZSI6IkNIZ2tkSUROdzV0NSJ9.90UwiPGS2hlvgOLktFU0LfKuatNKm mEP79u17VnqT9M ```   **WARNING: Treat this token as a password. With this token, you have the power to fully manage the target.**  In the following examples, the token will be named as *PROBELY_AUTH_TOKEN*.   ### Scan target  First let's view our target list:  ```bash curl https://api.probely.com/targets/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   From the results, we need the **target id**:  ```json {    \"count\":1,    \"page_total\":1,    \"page\":1,    \"length\":10,    \"results\":[       {          \"id\":\"AxtkqTE0v3E-\",          \"name\":\"test-site\",          \"desc\":\"\",          \"url\":\"https://test-site.example.com\",          \"settings\":             \"(...)\"          ,          \"stack\":             \"(...)\"          ,          \"verified\":true,          \"(...)\": \"(...)\"       }    ] } ```   Now we can send a request to start a scan on target id **AxtkqTE0v3E-**  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scan_now/ \\   -X POST \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   And we get a response saying that the scan is scheduled: the status is **queued**, and we've got a **scan id**:  ```json {    \"changed\":\"2017-08-01T13:37:00.843339Z\",    \"started\":null,    \"completed\":null,    \"mediums\":0,    \"changed_by\":     \"(...)\"    ,    \"highs\":0,    \"status\":\"queued\",    \"id\":\"S6dOMPn0SnoH\",    \"created_by\":     \"(...)\"    ,    \"target\":     \"(...)\"    ,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"lows\":0 } ```   Using the scan id **S6dOMPn0SnoH**, we can pool the scan status:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scans/S6dOMPn0SnoH/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   And we get a response saying that the scan status is now **started**:  ```json {    \"id\":\"S6dOMPn0SnoH\",    \"changed\":\"2017-08-01T13:38:12.623650Z\",    \"started\":null,    \"completed\":null,    \"mediums\":0,    \"changed_by\":     \"(...)\"    ,    \"highs\":0,    \"status\":\"started\",    \"created_by\":     \"(...)\"    ,    \"target\":     \"(...)\"    ,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"lows\":0 } ```   The possible statuses are:  | Status | Name | Description | | - -- -- - | - -- - | - -- -- -- -- -- | | queued | Queued | The scan is queued to start | | started | Started | The scan is currently running | | under_review | Under Review | The scan is complete but has some findings under review | | completed | Completed | The scan is complete | | completed_with_errors | Completed with errors | The scan is complete even after getting some error(s) | | failed | Failed | The scan failed | | canceled | Canceled | The scan was canceled | | canceling | Canceling | The scan is being canceled |   During the scan, the keys \"lows\", \"mediums\", and \"highs\" will be updated with the findings, as they are being found.  After we get either the status **completed** or **completed_with_errors**, we can view the findings.   ### Get vulnerabilities  Using the previous scan id **S6dOMPn0SnoH**, we can get the scan results:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/scans/S6dOMPn0SnoH/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```  We get a response saying that the scan status is now **completed**, and that **45** vulnerabilities were found. **14** low, **11** medium and **20** high:  ```json {    \"id\":\"S6dOMPn0SnoH\",    \"target\":     \"(...)\"    ,    \"status\":\"completed\",    \"started\":\"2017-08-01T13:37:12.623650Z\",    \"completed\":\"2017-08-01T14:17:48.559514Z\",    \"lows\":14,    \"mediums\":11,    \"highs\":20,    \"created\":\"2017-08-01T13:37:00.843339Z\",    \"created_by\":     \"(...)\"    ,    \"changed\":\"2017-08-01T14:17:48.559514Z\",    \"changed_by\":     \"(...)\" } ```  You can now view the results of this scan, or the target findings.   Let's start with the scan results:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/?scan=S6dOMPn0SnoH&page=1 \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```  ```json {    \"count\":45,    \"page_total\":5,    \"page\":1,    \"length\":10,    \"results\":[       {          \"id\":79,          \"target\":           \"(...)\"          ,          \"scans\":           \"(...)\"          ,          \"labels\":           \"(...)\"          ,          \"fix\":\"To fix an SQL Injection in PHP, you should use Prepared Statements. Prepared Statements can be thought of as a kind of compiled template for the SQL that an application wants to run, that can be customized using variable parameters.\\n\\nPHP's PDO extension supports Prepared Statements, so that's probably your best option.\\n\\nIn the example below you can see the use of prepared statements. Variables ```$username``` and ```$hashedPassword``` come from user input.\\n\\n```\\n$stmt = $dbg->prepare(\\\"SELECT id, name FROM users\\n                       WHERE username=? AND password=?\\\");\\n$stmt->bindParam(1, $username);\\n$stmt->bindParam(2, $hashedPassword);\\nif ($stmt->execute()) {\\n\\t$user = $stmt->fetch();\\n\\tif ($user) {\\n\\t\\t$_SESSION['authID'] = $user['id'];\\n\\t\\techo \\\"Hello \\\" . $user['name'];\\n\\t} else {\\n\\t\\techo \\\"Invalid Login\\\";\\n\\t}\\n}\\n```  \\n\\nAs an added bonus, if you're executing the same query several times, then it'll be even faster than when you're not using prepared statements. This is because when using prepared statements, the query needs to be parsed (prepared) only once, but can be executed multiple times with the same or different parameters. \\n\",          \"requests\":[             {                \"request\":\"(...)\",                \"response\":\"(...)\"             },             {                \"request\":\"(...)\",                \"response\":\"(...)\"             }          ],          \"evidence\":null,          \"extra\":\"\",          \"definition\":{             \"id\":\"xnV8PJVmSoLS\",             \"name\":\"SQL Injection\",             \"desc\":\"SQL Injections are the most common form of injections because SQL databases are very popular in dynamic web applications. This vulnerability allows an attacker to tamper existing SQL queries performed by the web application. Depending on the queries, the attacker might be able to access, modify or even destroy data from the database.\\n\\nSince databases are commonly used to store private data, such as authentication information, personal user data and site content, if an attacker gains access to it, the consequences are typically very severe, ranging from defacement of the web application to users data leakage or loss, or even full control of the web application or database server.\",          },          \"url\":\"http://test-site.example.com/login.php\",          \"path\":\"login.php\",          \"method\":\"post\",          \"parameter\":\"username\",          \"value\":\"\",          \"params\":{             \"username\":[                \"probely'\"             ],             \"password\":[                \"probely\"             ]          },          \"reporter\":           \"(...)\"          ,          \"assignee\":null,          \"state\":\"notfixed\",          \"severity\":30,          \"last_found\":\"2017-08-01T14:03:56.207794Z\",          \"changed\":\"2017-08-01T14:03:56.207794Z\",          \"changed_by\":           \"(...)\"          ,          \"comment\":\"\"       },       \"(...)\"    ] } ```  You can also view all the target findings, which will show all the findings that are not yet fixed. \\\\ The structure is similar to the previous result.  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   ### Get vulnerability details  You can also get details for a particular finding in a target. \\\\ In this example we will get the details for the same finding as in the previous section:  ```bash curl https://api.probely.com/targets/AxtkqTE0v3E-/findings/79/ \\   -X GET \\   -H \"Content-Type: application/json\" \\   -H \"Authorization: JWT PROBELY_AUTH_TOKEN\" ```   This will result on the same information, but just for this particular finding:  ```json {    \"id\":79,    \"target\":     \"(...)\"    ,    \"scans\":     \"(...)\"    ,    \"labels\":     \"(...)\"    ,    \"fix\":\"To fix an SQL Injection in PHP, you should use Prepared Statements. Prepared Statements can be thought of as a kind of compiled template for the SQL that an application wants to run, that can be customized using variable parameters.\\n\\nPHP's PDO extension supports Prepared Statements, so that's probably your best option.\\n\\nIn the example below you can see the use of prepared statements. Variables ```$username``` and ```$hashedPassword``` come from user input.\\n\\n```\\n$stmt = $dbg->prepare(\\\"SELECT id, name FROM users\\n                       WHERE username=? AND password=?\\\");\\n$stmt->bindParam(1, $username);\\n$stmt->bindParam(2, $hashedPassword);\\nif ($stmt->execute()) {\\n\\t$user = $stmt->fetch();\\n\\tif ($user) {\\n\\t\\t$_SESSION['authID'] = $user['id'];\\n\\t\\techo \\\"Hello \\\" . $user['name'];\\n\\t} else {\\n\\t\\techo \\\"Invalid Login\\\";\\n\\t}\\n}\\n```  \\n\\nAs an added bonus, if you're executing the same query several times, then it'll be even faster than when you're not using prepared statements. This is because when using prepared statements, the query needs to be parsed (prepared) only once, but can be executed multiple times with the same or different parameters. \\n\",    \"requests\":[       {          \"request\":\"(...)\",          \"response\":\"(...)\"       },       {          \"request\":\"(...)\",          \"response\":\"(...)\"       }    ],    \"evidence\":null,    \"extra\":\"\",    \"definition\":{       \"id\":\"xnV8PJVmSoLS\",       \"name\":\"SQL Injection\",       \"desc\":\"SQL Injections are the most common form of injections because SQL databases are very popular in dynamic web applications. This vulnerability allows an attacker to tamper existing SQL queries performed by the web application. Depending on the queries, the attacker might be able to access, modify or even destroy data from the database.\\n\\nSince databases are commonly used to store private data, such as authentication information, personal user data and site content, if an attacker gains access to it, the consequences are typically very severe, ranging from defacement of the web application to users data leakage or loss, or even full control of the web application or database server.\",    },    \"url\":\"http://test-site.example.com/login.php\",    \"path\":\"login.php\",    \"method\":\"post\",    \"parameter\":\"username\",    \"value\":\"\",    \"params\":{       \"username\":[          \"probely'\"       ],       \"password\":[          \"probely\"       ]    },    \"reporter\":     \"(...)\"    ,    \"assignee\":null,    \"state\":\"notfixed\",    \"severity\":30,    \"last_found\":\"2017-08-01T14:03:56.207794Z\",    \"changed\":\"2017-08-01T14:03:56.207794Z\",    \"changed_by\":     \"(...)\"    ,    \"comment\":\"\" } ```  ## Concepts  The short version is that you run *scans* on *targets*, and *findings* are created for any issue that is found. However, there are a few more concepts that must be explained in order to get a complete picture of how Probely works. We will spend the next few sections detailing the most important concepts.   ### Target  A *target* defines the scope of a scan, what will and won't be included in the scan plan. This is done by filling a *target*'s *site* and *assets*.  The entry point for the web application (and authentication) is setup in the *target*'s *site*.  In modern web applications, you are probably loading resources from multiple domains. A single page app, for example, will usualy load the page from one domain and make AJAX requests to another. This is what *assets* are for: they specify what domains our scanner should follow and create requests for.   ### Site A URL is probably not the only thing you will need to setup when scannning your application. Does the application have an authenticated area? Does it use basic auth? Does it expect a certain cookie or header? These parameters are all configured in the *target*'s *site*.   We need to ensure that only allowed web applications are scanned. Therefore, we must verify that you have control of any site you wish to include. This can be done by:   * Placing a file on a well-known location, on the site's server;   * Creating specific DNS records.   ### Asset  An *asset* is very similar to a *site*. The difference is that it is a domain instead of a URL. Additionally, an *asset* has no login or basic auth support. You can still have custom cookies and headers per *asset*.  As with the *site*, you will need to prove an *asset*'s ownership. We have added some rules to make your life easier, if you already have verified a *site* and the domains match, the validation is fast-tracked.  ### Scans  This is what you're here for. After configuring your *target*, you will want to run *scans* against it. You can either start a one off scan, or schedule one for later - recurring or not.  During the *scan*, we will spider and run several modules to check for security issues, which we call *findings*. You can check the *findings* even before a scan ends. If everything goes well, the scan will complete and that is it.  With some *findings*, our automated processes may have difficulties determining if it is a false positive or a legitimate issue. In these instances, a scan will be marked as under review, and we will further analyze the finding before making a decision. We will only show findings that, for some degree of confidence, are true positives. A finding that we are not sure of will never be displayed.  As much as we try to prevent it, a *scan* (or a sub-module) can malfunction. If this happens, a *scan* is marked as:   * \"failed\": the problem was irrecoverable;   * \"completed with errors\": some module failed but the scan itself completed.  During a scan, we try to determine what *frameworks* you are using and add this information to the *site* and *asset* objects discussed previously.   ### Findings  The last core concept is the *finding*, this is a security issue that we have found during our scans. If the same issue is found in a new scan it will not open a new finding but update the previous.  A *finding* will have a lot of information about the issue. Namely, where it was found, URL, insertion point (e.g. cookie), parameter, and method. Evidence we gathered, and the full request and response that we used. Sugestions of how to go about fixing it. A full description of the vulnerability is also present in the *definition* property. We also assign a severity and calculate the CVSS score for each.  Besides all this, there are also actions that you can perform on a *finding*. You can assign it to one user, leave comments for your team or add labels, and reduce or increase the severity.  If you don't plan on fixing the *finding* and accept the risk, or you think we reported a false positive, you can mark the finding to reflect that. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support@probely.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class FindingsApiController : ControllerBase
    { 
        /// <summary>
        /// Finding report
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="findingBulkIds"></param>
        /// <response code="200">Token to retrieve report. </response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpPost]
        [Route("/targets/{target_id}/findings/bulk/report/")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsBulkReportPost")]
        [SwaggerResponse(statusCode: 400, type: typeof(CheckPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsBulkReportPost([FromRoute (Name = "target_id")][Required]string targetId, [FromBody]FindingBulkIds findingBulkIds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CheckPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Bulk retest findings
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="findingBulkRetest"></param>
        /// <response code="200">List of assessment IDs. </response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpPost]
        [Route("/targets/{target_id}/findings/bulk/retest/")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsBulkRetestPost")]
        [SwaggerResponse(statusCode: 400, type: typeof(CheckPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsBulkRetestPost([FromRoute (Name = "target_id")][Required]string targetId, [FromBody]FindingBulkRetest findingBulkRetest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CheckPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Bulk update findings
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="findingBulkUpdate"></param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpPatch]
        [Route("/targets/{target_id}/findings/bulk/update/")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsBulkUpdatePatch")]
        [SwaggerResponse(statusCode: 400, type: typeof(AuthObtainPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsBulkUpdatePatch([FromRoute (Name = "target_id")][Required]string targetId, [FromBody]FindingBulkUpdate findingBulkUpdate)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(AuthObtainPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));

            throw new NotImplementedException();
        }

        /// <summary>
        /// List target findings
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="scan">Filter by scan ids</param>
        /// <param name="severity">Filter by finding severity</param>
        /// <param name="state">Filter by finding states</param>
        /// <param name="assignee">Filter by assignee ids</param>
        /// <param name="label">Filter by finding labels</param>
        /// <param name="page">Page number within the paginated result set</param>
        /// <param name="length">Number of results to return per page</param>
        /// <param name="ordering">Which field to use when ordering the results, prefix with &#x60;-&#x60; to invert ordering. </param>
        /// <param name="search">Search term</param>
        /// <response code="200">Finding list</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpGet]
        [Route("/targets/{target_id}/findings/")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TargetsTargetIdFindingsGet200Response), description: "Finding list")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsGet([FromRoute (Name = "target_id")][Required]string targetId, [FromQuery (Name = "scan")]List<string> scan, [FromQuery (Name = "severity")]FindingSeverity severity, [FromQuery (Name = "state")]FindingState state, [FromQuery (Name = "assignee")]List<string> assignee, [FromQuery (Name = "label")]List<string> label, [FromQuery (Name = "page")]int? page, [FromQuery (Name = "length")]int? length, [FromQuery (Name = "ordering")]string ordering, [FromQuery (Name = "search")]string search)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TargetsTargetIdFindingsGet200Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "{\n  \"page_total\" : 1,\n  \"count\" : 6,\n  \"length\" : 10,\n  \"page\" : 1,\n  \"results\" : [ {\n    \"cvss_score\" : 6.5,\n    \"evidence\" : \"evidence\",\n    \"last_found\" : \"2018-02-19T18:58:50.906015Z\",\n    \"requests\" : [ {\n      \"request\" : \"request\",\n      \"response\" : \"response\"\n    }, {\n      \"request\" : \"request\",\n      \"response\" : \"response\"\n    } ],\n    \"path\" : \"path\",\n    \"fix\" : \"fix\",\n    \"cvss_vector\" : \"CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:L/A:N\",\n    \"scans\" : [ \"scans\", \"scans\" ],\n    \"extra\" : \"extra\",\n    \"parameter\" : \"parameter\",\n    \"definition\" : {\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"desc\" : \"desc\"\n    },\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"value\" : \"value\",\n    \"reporter\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"params\" : \"params\",\n    \"url\" : \"url\",\n    \"labels\" : [ \"labels\", \"labels\" ],\n    \"target\" : {\n      \"stack\" : [ \"nginx\", \"nginx\" ],\n      \"name\" : \"Object name\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"url\" : \"url\",\n      \"desc\" : \"Object description\"\n    },\n    \"changed_by\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"comment\" : \"comment\",\n    \"assignee\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n  }, {\n    \"cvss_score\" : 6.5,\n    \"evidence\" : \"evidence\",\n    \"last_found\" : \"2018-02-19T18:58:50.906015Z\",\n    \"requests\" : [ {\n      \"request\" : \"request\",\n      \"response\" : \"response\"\n    }, {\n      \"request\" : \"request\",\n      \"response\" : \"response\"\n    } ],\n    \"path\" : \"path\",\n    \"fix\" : \"fix\",\n    \"cvss_vector\" : \"CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:L/A:N\",\n    \"scans\" : [ \"scans\", \"scans\" ],\n    \"extra\" : \"extra\",\n    \"parameter\" : \"parameter\",\n    \"definition\" : {\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"desc\" : \"desc\"\n    },\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"value\" : \"value\",\n    \"reporter\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"params\" : \"params\",\n    \"url\" : \"url\",\n    \"labels\" : [ \"labels\", \"labels\" ],\n    \"target\" : {\n      \"stack\" : [ \"nginx\", \"nginx\" ],\n      \"name\" : \"Object name\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"url\" : \"url\",\n      \"desc\" : \"Object description\"\n    },\n    \"changed_by\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"comment\" : \"comment\",\n    \"assignee\" : {\n      \"name\" : \"Henrique Cimento\",\n      \"id\" : \"jMXUw-BE_2vd\",\n      \"email\" : \"example@probely.com\"\n    },\n    \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TargetsTargetIdFindingsGet200Response>(exampleJson)
            : default(TargetsTargetIdFindingsGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Retrieve finding
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="id">Object Id</param>
        /// <response code="200">Finding object</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpGet]
        [Route("/targets/{target_id}/findings/{id}/")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsIdGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Finding), description: "Finding object")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsIdGet([FromRoute (Name = "target_id")][Required]string targetId, [FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Finding));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "{\n  \"cvss_score\" : 6.5,\n  \"evidence\" : \"evidence\",\n  \"last_found\" : \"2018-02-19T18:58:50.906015Z\",\n  \"requests\" : [ {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  }, {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  } ],\n  \"path\" : \"path\",\n  \"fix\" : \"fix\",\n  \"cvss_vector\" : \"CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:L/A:N\",\n  \"scans\" : [ \"scans\", \"scans\" ],\n  \"extra\" : \"extra\",\n  \"parameter\" : \"parameter\",\n  \"definition\" : {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"desc\" : \"desc\"\n  },\n  \"id\" : \"jMXUw-BE_2vd\",\n  \"value\" : \"value\",\n  \"reporter\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"params\" : \"params\",\n  \"url\" : \"url\",\n  \"labels\" : [ \"labels\", \"labels\" ],\n  \"target\" : {\n    \"stack\" : [ \"nginx\", \"nginx\" ],\n    \"name\" : \"Object name\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"url\" : \"url\",\n    \"desc\" : \"Object description\"\n  },\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"comment\" : \"comment\",\n  \"assignee\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Finding>(exampleJson)
            : default(Finding);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Finding activity log.
        /// </summary>
        /// <remarks>Finding activity log.</remarks>
        /// <param name="targetId">Target id</param>
        /// <param name="id">Object Id</param>
        /// <response code="200">Finding activity log</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpGet]
        [Route("/targets/{target_id}/findings/{id}/log/")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsIdLogGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Activity>), description: "Finding activity log")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsIdLogGet([FromRoute (Name = "target_id")][Required]string targetId, [FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Activity>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "[ {\n  \"field\" : \"field\",\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"change\" : 0,\n  \"old_value\" : \"old_value\",\n  \"value\" : \"value\",\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n}, {\n  \"field\" : \"field\",\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"change\" : 0,\n  \"old_value\" : \"old_value\",\n  \"value\" : \"value\",\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Activity>>(exampleJson)
            : default(List<Activity>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Partial update finding
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="id">Object Id</param>
        /// <param name="findingUpdate"></param>
        /// <response code="200">Finding object</response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="403">Not allowed to perform operation</response>
        /// <response code="404">Not found</response>
        [HttpPatch]
        [Route("/targets/{target_id}/findings/{id}/")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsIdPatch")]
        [SwaggerResponse(statusCode: 200, type: typeof(Finding), description: "Finding object")]
        [SwaggerResponse(statusCode: 400, type: typeof(AuthObtainPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 403, type: typeof(BillingPut403Response), description: "Not allowed to perform operation")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsIdPatch([FromRoute (Name = "target_id")][Required]string targetId, [FromRoute (Name = "id")][Required]string id, [FromBody]FindingUpdate findingUpdate)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Finding));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(AuthObtainPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(BillingPut403Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "{\n  \"cvss_score\" : 6.5,\n  \"evidence\" : \"evidence\",\n  \"last_found\" : \"2018-02-19T18:58:50.906015Z\",\n  \"requests\" : [ {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  }, {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  } ],\n  \"path\" : \"path\",\n  \"fix\" : \"fix\",\n  \"cvss_vector\" : \"CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:L/A:N\",\n  \"scans\" : [ \"scans\", \"scans\" ],\n  \"extra\" : \"extra\",\n  \"parameter\" : \"parameter\",\n  \"definition\" : {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"desc\" : \"desc\"\n  },\n  \"id\" : \"jMXUw-BE_2vd\",\n  \"value\" : \"value\",\n  \"reporter\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"params\" : \"params\",\n  \"url\" : \"url\",\n  \"labels\" : [ \"labels\", \"labels\" ],\n  \"target\" : {\n    \"stack\" : [ \"nginx\", \"nginx\" ],\n    \"name\" : \"Object name\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"url\" : \"url\",\n    \"desc\" : \"Object description\"\n  },\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"comment\" : \"comment\",\n  \"assignee\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Finding>(exampleJson)
            : default(Finding);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update finding
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="id">Object Id</param>
        /// <param name="findingUpdate"></param>
        /// <response code="200">Finding object</response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="403">Not allowed to perform operation</response>
        /// <response code="404">Not found</response>
        [HttpPut]
        [Route("/targets/{target_id}/findings/{id}/")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsIdPut")]
        [SwaggerResponse(statusCode: 200, type: typeof(Finding), description: "Finding object")]
        [SwaggerResponse(statusCode: 400, type: typeof(AuthObtainPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 403, type: typeof(BillingPut403Response), description: "Not allowed to perform operation")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsIdPut([FromRoute (Name = "target_id")][Required]string targetId, [FromRoute (Name = "id")][Required]string id, [FromBody]FindingUpdate findingUpdate)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Finding));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(AuthObtainPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(BillingPut403Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "{\n  \"cvss_score\" : 6.5,\n  \"evidence\" : \"evidence\",\n  \"last_found\" : \"2018-02-19T18:58:50.906015Z\",\n  \"requests\" : [ {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  }, {\n    \"request\" : \"request\",\n    \"response\" : \"response\"\n  } ],\n  \"path\" : \"path\",\n  \"fix\" : \"fix\",\n  \"cvss_vector\" : \"CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:L/A:N\",\n  \"scans\" : [ \"scans\", \"scans\" ],\n  \"extra\" : \"extra\",\n  \"parameter\" : \"parameter\",\n  \"definition\" : {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"desc\" : \"desc\"\n  },\n  \"id\" : \"jMXUw-BE_2vd\",\n  \"value\" : \"value\",\n  \"reporter\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"params\" : \"params\",\n  \"url\" : \"url\",\n  \"labels\" : [ \"labels\", \"labels\" ],\n  \"target\" : {\n    \"stack\" : [ \"nginx\", \"nginx\" ],\n    \"name\" : \"Object name\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"url\" : \"url\",\n    \"desc\" : \"Object description\"\n  },\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"comment\" : \"comment\",\n  \"assignee\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Finding>(exampleJson)
            : default(Finding);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Retest finding
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="id">Object Id</param>
        /// <response code="201">Scan object</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="403">Not allowed to perform operation</response>
        /// <response code="404">Not found</response>
        [HttpPost]
        [Route("/targets/{target_id}/findings/{id}/retest/")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsIdRetestPost")]
        [SwaggerResponse(statusCode: 201, type: typeof(Scan), description: "Scan object")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 403, type: typeof(BillingPut403Response), description: "Not allowed to perform operation")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsIdRetestPost([FromRoute (Name = "target_id")][Required]string targetId, [FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Scan));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(BillingPut403Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            exampleJson = "{\n  \"created\" : \"2018-01-31T16:32:17.238553Z\",\n  \"started\" : \"2018-01-31T16:32:17.238553Z\",\n  \"completed\" : \"2018-01-31T16:32:17.238553Z\",\n  \"created_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"lows\" : 5,\n  \"mediums\" : 2,\n  \"target\" : {\n    \"stack\" : [ \"nginx\", \"nginx\" ],\n    \"name\" : \"Object name\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"url\" : \"url\",\n    \"desc\" : \"Object description\"\n  },\n  \"crawler\" : {\n    \"warning\" : [ \"warning\", \"warning\" ],\n    \"state\" : \"started\",\n    \"error\" : [ \"error\", \"error\" ],\n    \"status\" : {\n      \"0\" : 0,\n      \"1\" : 6\n    }\n  },\n  \"changed_by\" : {\n    \"name\" : \"Henrique Cimento\",\n    \"id\" : \"jMXUw-BE_2vd\",\n    \"email\" : \"example@probely.com\"\n  },\n  \"fingerprinter\" : {\n    \"count\" : 1,\n    \"warning\" : [ \"warning\", \"warning\" ],\n    \"state\" : \"started\",\n    \"error\" : [ \"error\", \"error\" ]\n  },\n  \"scanner\" : {\n    \"warning\" : [ \"warning\", \"warning\" ],\n    \"state\" : \"started\",\n    \"error\" : [ \"error\", \"error\" ],\n    \"status\" : {\n      \"0\" : 7,\n      \"1\" : 9\n    }\n  },\n  \"highs\" : 5,\n  \"id\" : \"jMXUw-BE_2vd\",\n  \"changed\" : \"2018-01-31T16:32:17.238553Z\",\n  \"scan_profile\" : \"normal\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Scan>(exampleJson)
            : default(Scan);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Retrieve finding report PDF format
        /// </summary>
        /// <param name="targetId">Target id</param>
        /// <param name="token">Token received from the finding report endpoint.</param>
        /// <response code="200">Scan report PDF</response>
        /// <response code="400">Bad Request</response>
        /// <response code="401">Access token is missing or invalid</response>
        /// <response code="404">Not found</response>
        [HttpGet]
        [Route("/targets/{target_id}/findings/report/")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TargetsTargetIdFindingsReportGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Scan report PDF")]
        [SwaggerResponse(statusCode: 400, type: typeof(CheckPost400Response), description: "Bad Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(AccountGet401Response), description: "Access token is missing or invalid")]
        [SwaggerResponse(statusCode: 404, type: typeof(EventsIdGet404Response), description: "Not found")]
        public virtual IActionResult TargetsTargetIdFindingsReportGet([FromRoute (Name = "target_id")][Required]string targetId, [FromQuery (Name = "token")][Required()]string token)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(System.IO.Stream));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(CheckPost400Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(AccountGet401Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(EventsIdGet404Response));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<System.IO.Stream>(exampleJson)
            : default(System.IO.Stream);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
