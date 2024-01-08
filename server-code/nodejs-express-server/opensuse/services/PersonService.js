/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List all people.
* List all people. 
*
* prefix String A prefix to filter the people to look for (optional)
* returns Object
* */
const personGET = ({ prefix }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        prefix,
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
* Get details about a person
*
* login String Person login.
* returns _person__login__get_200_response
* */
const personLoginGET = ({ login }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        login,
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
* List the groups of a person
* List the groups the person belongs to.
*
* returns Object
* */
const personLoginGroupGET = () => new Promise(
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
* Perform changes on a registered person
*
* cmd String The command to execute against the provided person.
* body String The password in plain text when the cmd param is 'change_password'. (optional)
* returns Object
* */
const personLoginPOST = ({ cmd, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
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
* Update person
*
* body Object The new data for the person referred in the login parameter.
* no response value expected for this operation
* */
const personLoginPUT = ({ body }) => new Promise(
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
* List the authentication tokens of a person.
* List the authentication tokens of a person.
*
* returns _person__login__token_get_200_response
* */
const personLoginTokenGET = () => new Promise(
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
* Delete a token of a person.
* Delete a token of the specified person.
*
* id String Id of the token to be removed.
* returns Object
* */
const personLoginTokenIdDELETE = ({ id }) => new Promise(
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
* Create a new authentication token for a person.
* Create a new authentication token for a person.  The token may be limited to a specific package. In this case the query parameters `project` and `package` should be provided.  With an empty request body, a token of the default kind 'runservice' is created. 
*
* project String Project name. Should be provided, together with the package query parameter, to limit the token to a specific package.  (optional)
* package String Package name. Should be provided, together with the project query parameter, to limit the token to a specific package.  (optional)
* operation String Operation indicates the kind of token that is going to be created.  When operation is not specified, 'runservice' is the default value.  (optional)
* scmUnderscoretoken String **(Beta/Unstable)**  SCM token used in OBS workflows to report back the workflow status, when the operation is workflow.  It's normally possible to generate SCM tokens directly on the SCM's website like GitHub or GitLab.  (optional)
* returns Object
* */
const personLoginTokenPOST = ({ project, package, operation, scmUnderscoretoken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        project,
        package,
        operation,
        scmUnderscoretoken,
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
* Executes a command on the person endpoint.
* Allows executing command on the person endpoint.  As of now, the only command allowed is 'register'. 
*
* cmd String The command to execute
* personPostRequest PersonPostRequest The data for the person to register.
* no response value expected for this operation
* */
const personPOST = ({ cmd, personPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
        personPostRequest,
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
* Registers a new person
*
* body Object Data for the person to register.
* no response value expected for this operation
* */
const personRegisterPOST = ({ body }) => new Promise(
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

module.exports = {
  personGET,
  personLoginGET,
  personLoginGroupGET,
  personLoginPOST,
  personLoginPUT,
  personLoginTokenGET,
  personLoginTokenIdDELETE,
  personLoginTokenPOST,
  personPOST,
  personRegisterPOST,
};
