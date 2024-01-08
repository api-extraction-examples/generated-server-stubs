/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a simple directory listing of all requests
* Get a simple directory listing of all requests
*
* returns Object
* */
const requestGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a given request.
* Delete a given request.
*
* no response value expected for this operation
* */
const requestIdDELETE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Show details about a specified request.
* Show details about a specified request.
*
* id Integer Id of the choosen request.
* no response value expected for this operation
* */
const requestIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Apply certain actions on a specified request.
* Apply certain actions on a specified request.
*
* cmd String - `addreview`:   Add a review to a request. **NOTE:** You need to specify who has to address   the review by providing an additional paramter. Possible options are:   * by_user   * by_group   * by_project  - `assignreview`:   Accept a review for a given group and assign a new review to a specific user.   **NOTE:** You need to pass the group name in the `by_group` parameter   and the new reviewer in the `reviewer` parameter.  - `changestate`: Modify the state of a given request.   **NOTE:** You need to pass the new state throug the `newstate` parameter. Changing   from one state to another is in certain cases not allowed. You can still force   the operation by using the `force=1` parameter.  - `changereviewstate`:   Change the state of a review inside a given request.  - `setpriority`:   Change the priority of a given request. You have to pass the choosen priority through   the `priority` parameter. Possible values are:   * low   * moderate   * important   * critical  - `setincident`: Change the target incident for maintenance_incident actions   **NOTE:** You need to provide the incident number through the `incident`   parameter.  - `setacceptat`: Set or modify the accept_at time. Either specified by the `time`   parameter or by default set to now.  - `approve`: Pre-approve a request in the review state. It will turn into state `accepted`   after the last review.  - `cancelapproval`: Reset the approval of a request  (optional)
* newstate String Define the new state (optional)
* priority String Define the new priority (optional)
* byUnderscoreuser String Specify the user of a new review (optional)
* byUnderscoregroup String Specify the group of the new review (optional)
* byUnderscoreproject String Specify the project of the new review (optional)
* byUnderscorepackage String Specify the package of the new review (optional)
* incident String Specify the incident number for `setincident` (optional)
* time String Specify the time for `setacceptat` (optional)
* comment String Add a comment to one of the actions (optional)
* no response value expected for this operation
* */
const requestIdPOST = ({ cmd, newstate, priority, byUnderscoreuser, byUnderscoregroup, byUnderscoreproject, byUnderscorepackage, incident, time, comment }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
        newstate,
        priority,
        byUnderscoreuser,
        byUnderscoregroup,
        byUnderscoreproject,
        byUnderscorepackage,
        incident,
        time,
        comment,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Modify a given request.
* Modify a given request.  **NOTE:** Certain parts of a request can only be changed by admins. 
*
* body Object Request XML  **NOTE:** You cannot pass the request id in the xml. You can pass the history in the xml, but it will be simply ignored.  XML Schema used for body validation: [request.rng](../schema/request.rng) 
* no response value expected for this operation
* */
const requestIdPUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get the diff for all packages affected by the request.
* Get the diff for all packages affected by the request. 
*
* diffUnderscoretoUnderscoresuperseded String Diff relative to a given superseded request. State the id of the corresponding superseded request.  (optional)
* view String Set this parameter to xml in order to receive a structured diff instead of plain text. (optional)
* withissues String Include parsed issues (optional)
* returns _request__id__cmd_diff_post_200_response
* */
const requestIdcmddiffPOST = ({ diffUnderscoretoUnderscoresuperseded, view, withissues }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        diffUnderscoretoUnderscoresuperseded,
        view,
        withissues,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a request
* Create a request
*
* cmd String This endpoint will refuse the creation of a new request if this parameter is not set.
* requestPostRequest RequestPostRequest Request XML  **NOTE:** You cannot pass the request id in the xml. You can pass the history in the xml, but it will be simply ignored. 
* addrevision String Ask the server to add revisions of the current sources to the request. (optional)
* ignoreUnderscoredelegate String Enforce a new package instance in a project which has OBS:DelegateRequestTarget set (optional)
* ignoreUnderscorebuildUnderscorestate String Skip the build state check (optional)
* returns Object
* */
const requestPOST = ({ cmd, requestPostRequest, addrevision, ignoreUnderscoredelegate, ignoreUnderscorebuildUnderscorestate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
        requestPostRequest,
        addrevision,
        ignoreUnderscoredelegate,
        ignoreUnderscorebuildUnderscorestate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get a collection of requests for a specified target
* Get a collection of requests for a specified target. **NOTE:** You need to set at least one of the following parameters in order to use this endpoint:  * `user` * `project` * `package` * `states` * `types` * `ids` 
*
* user String Filter the results of requests and open reviews for a certain user. If no other parameters are applied, it will include requests where the user is maintainer of the target or the creator of the request.  (optional)
* project String Limit the results of requests and open review requests to the specified target project. (optional)
* package String Limit the results of requests and open review requests to the specified target package. (optional)
* states String Limit results to a given request state. Multiple states can be provided as a comma separated list. (optional)
* types String Limit the results to certain action types. Multiple types can be provided as a comma separated list. (optional)
* roles String Limit the results to a given role. Multiple roles can be provided as a comma separated list. (optional)
* withhistory String Include the request history in the results. (optional)
* withfullhistory String Includes both, request and review history in the results. (optional)
* limit Integer Limit the results to the specified amount of requests. (optional)
* ids String Limit the result to specified request id's. Multiple id's can be provided as a comma separated list. (optional)
* returns _request_view_collection_get_200_response
* */
const requestviewcollectionGET = ({ user, project, package, states, types, roles, withhistory, withfullhistory, limit, ids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        user,
        project,
        package,
        states,
        types,
        roles,
        withhistory,
        withfullhistory,
        limit,
        ids,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  requestGET,
  requestIdDELETE,
  requestIdGET,
  requestIdPOST,
  requestIdPUT,
  requestIdcmddiffPOST,
  requestPOST,
  requestviewcollectionGET,
};
