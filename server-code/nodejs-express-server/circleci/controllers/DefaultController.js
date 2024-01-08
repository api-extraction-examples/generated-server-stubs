/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const meGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.meGET);
};

const projectUsernameProjectBuildCacheDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildCacheDELETE);
};

const projectUsernameProjectBuildNumArtifactsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildNumArtifactsGET);
};

const projectUsernameProjectBuildNumCancelPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildNumCancelPOST);
};

const projectUsernameProjectBuildNumGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildNumGET);
};

const projectUsernameProjectBuildNumRetryPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildNumRetryPOST);
};

const projectUsernameProjectBuildNumTestsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectBuildNumTestsGET);
};

const projectUsernameProjectCheckoutKeyFingerprintDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectCheckoutKeyFingerprintDELETE);
};

const projectUsernameProjectCheckoutKeyFingerprintGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectCheckoutKeyFingerprintGET);
};

const projectUsernameProjectCheckoutKeyGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectCheckoutKeyGET);
};

const projectUsernameProjectCheckoutKeyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectCheckoutKeyPOST);
};

const projectUsernameProjectEnvvarGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectEnvvarGET);
};

const projectUsernameProjectEnvvarNameDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectEnvvarNameDELETE);
};

const projectUsernameProjectEnvvarNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectEnvvarNameGET);
};

const projectUsernameProjectEnvvarPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectEnvvarPOST);
};

const projectUsernameProjectGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectGET);
};

const projectUsernameProjectPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectPOST);
};

const projectUsernameProjectSshKeyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectSshKeyPOST);
};

const projectUsernameProjectTreeBranchPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectUsernameProjectTreeBranchPOST);
};

const projectsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectsGET);
};

const recent_buildsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.recent_buildsGET);
};

const userHerokuKeyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.userHerokuKeyPOST);
};


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
