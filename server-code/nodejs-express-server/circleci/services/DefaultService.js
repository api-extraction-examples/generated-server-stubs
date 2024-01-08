/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Provides information about the signed in user. 
*
* returns User
* */
const meGET = () => new Promise(
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
* Clears the cache for a project. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* returns _project__username___project__build_cache_delete_200_response
* */
const projectUsernameProjectBuildCacheDELETE = ({ username, project }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
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
* List the artifacts produced by a given build. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* buildUnderscorenum Integer XXXXXXXXXX 
* returns List
* */
const projectUsernameProjectBuildNumArtifactsGET = ({ username, project, buildUnderscorenum }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        buildUnderscorenum,
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
* Cancels the build, returns a summary of the build. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* buildUnderscorenum Integer XXXXXXXXXX 
* returns Build
* */
const projectUsernameProjectBuildNumCancelPOST = ({ username, project, buildUnderscorenum }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        buildUnderscorenum,
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
* Full details for a single build. The response includes all of the fields from the build summary. This is also the payload for the [notification webhooks](/docs/configuration/#notify), in which case this object is the value to a key named 'payload'. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* buildUnderscorenum Integer XXXXXXXXXX 
* returns BuildDetail
* */
const projectUsernameProjectBuildNumGET = ({ username, project, buildUnderscorenum }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        buildUnderscorenum,
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
* Retries the build, returns a summary of the new build. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* buildUnderscorenum Integer XXXXXXXXXX 
* returns Build
* */
const projectUsernameProjectBuildNumRetryPOST = ({ username, project, buildUnderscorenum }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        buildUnderscorenum,
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
* Provides test metadata for a build Note: [Learn how to set up your builds to collect test metadata](https://circleci.com/docs/test-metadata/) 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* buildUnderscorenum Integer XXXXXXXXXX 
* returns Tests
* */
const projectUsernameProjectBuildNumTestsGET = ({ username, project, buildUnderscorenum }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        buildUnderscorenum,
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
* Delete a checkout key. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* fingerprint String XXXXXXXXXX 
* returns _project__username___project__checkout_key__fingerprint__delete_200_response
* */
const projectUsernameProjectCheckoutKeyFingerprintDELETE = ({ username, project, fingerprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        fingerprint,
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
* Get a checkout key. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* fingerprint String XXXXXXXXXX 
* returns Key
* */
const projectUsernameProjectCheckoutKeyFingerprintGET = ({ username, project, fingerprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        fingerprint,
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
* Lists checkout keys. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* returns List
* */
const projectUsernameProjectCheckoutKeyGET = ({ username, project }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
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
* Creates a new checkout key. Only usable with a user API token. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* body String The type of key to create. Can be 'deploy-key' or 'github-user-key'.  (optional)
* returns Key
* */
const projectUsernameProjectCheckoutKeyPOST = ({ username, project, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
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
* Lists the environment variables for :project 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* returns List
* */
const projectUsernameProjectEnvvarGET = ({ username, project }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
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
* Deletes the environment variable named ':name' 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* name String XXXXXXXXXX 
* returns _project__username___project__checkout_key__fingerprint__delete_200_response
* */
const projectUsernameProjectEnvvarNameDELETE = ({ username, project, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        name,
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
* Gets the hidden value of environment variable :name 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* name String XXXXXXXXXX 
* returns Envvar
* */
const projectUsernameProjectEnvvarNameGET = ({ username, project, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        name,
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
* Creates a new environment variable 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* returns Envvar
* */
const projectUsernameProjectEnvvarPOST = ({ username, project }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
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
* Build summary for each of the last 30 builds for a single git repo. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* limit Integer The number of builds to return. Maximum 100, defaults to 30.  (optional)
* offset Integer The API returns builds starting from this offset, defaults to 0.  (optional)
* filter String Restricts which builds are returned. Set to \"completed\", \"successful\", \"failed\", \"running\", or defaults to no filter.  (optional)
* returns List
* */
const projectUsernameProjectGET = ({ username, project, limit, offset, filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        limit,
        offset,
        filter,
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
* Triggers a new build, returns a summary of the build. 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* projectUsernameProjectPostRequest ProjectUsernameProjectPostRequest  (optional)
* returns BuildSummary
* */
const projectUsernameProjectPOST = ({ username, project, projectUsernameProjectPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        projectUsernameProjectPostRequest,
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
* Create an ssh key used to access external systems that require SSH key-based authentication 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* contentType String 
* projectUsernameProjectSshKeyPostRequest ProjectUsernameProjectSshKeyPostRequest 
* returns _project__username___project__ssh_key_post_default_response
* */
const projectUsernameProjectSshKeyPOST = ({ username, project, contentType, projectUsernameProjectSshKeyPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        contentType,
        projectUsernameProjectSshKeyPostRequest,
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
* Triggers a new build, returns a summary of the build. Optional build parameters can be set using an experimental API.  Note: For more about build parameters, read about [using parameterized builds](https://circleci.com/docs/parameterized-builds/) 
*
* username String XXXXXXXXX 
* project String XXXXXXXXX 
* branch String The branch name should be url-encoded. 
* projectUsernameProjectTreeBranchPostRequest ProjectUsernameProjectTreeBranchPostRequest  (optional)
* returns Build
* */
const projectUsernameProjectTreeBranchPOST = ({ username, project, branch, projectUsernameProjectTreeBranchPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        project,
        branch,
        projectUsernameProjectTreeBranchPostRequest,
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
* List of all the projects you're following on CircleCI, with build information organized by branch. 
*
* returns List
* */
const projectsGET = () => new Promise(
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
* Build summary for each of the last 30 recent builds, ordered by build_num. 
*
* limit Integer The number of builds to return. Maximum 100, defaults to 30.  (optional)
* offset Integer The API returns builds starting from this offset, defaults to 0.  (optional)
* returns List
* */
const recent_buildsGET = ({ limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
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
* Adds your Heroku API key to CircleCI, takes apikey as form param name. 
*
* no response value expected for this operation
* */
const userHerokuKeyPOST = () => new Promise(
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

module.exports = {
  meGET,
  projectUsernameProjectBuildCacheDELETE,
  projectUsernameProjectBuildNumArtifactsGET,
  projectUsernameProjectBuildNumCancelPOST,
  projectUsernameProjectBuildNumGET,
  projectUsernameProjectBuildNumRetryPOST,
  projectUsernameProjectBuildNumTestsGET,
  projectUsernameProjectCheckoutKeyFingerprintDELETE,
  projectUsernameProjectCheckoutKeyFingerprintGET,
  projectUsernameProjectCheckoutKeyGET,
  projectUsernameProjectCheckoutKeyPOST,
  projectUsernameProjectEnvvarGET,
  projectUsernameProjectEnvvarNameDELETE,
  projectUsernameProjectEnvvarNameGET,
  projectUsernameProjectEnvvarPOST,
  projectUsernameProjectGET,
  projectUsernameProjectPOST,
  projectUsernameProjectSshKeyPOST,
  projectUsernameProjectTreeBranchPOST,
  projectsGET,
  recent_buildsGET,
  userHerokuKeyPOST,
};
