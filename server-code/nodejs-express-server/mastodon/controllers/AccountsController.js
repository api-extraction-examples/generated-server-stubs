/**
 * The AccountsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AccountsService');
const apiV1AccountsIdBlockPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdBlockPOST);
};

const apiV1AccountsIdFeaturedTagsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdFeaturedTagsGET);
};

const apiV1AccountsIdFollowPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdFollowPOST);
};

const apiV1AccountsIdFollowersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdFollowersGET);
};

const apiV1AccountsIdFollowingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdFollowingGET);
};

const apiV1AccountsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdGET);
};

const apiV1AccountsIdIdentityProofsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdIdentityProofsGET);
};

const apiV1AccountsIdListsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdListsGET);
};

const apiV1AccountsIdMutePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdMutePOST);
};

const apiV1AccountsIdNotePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdNotePOST);
};

const apiV1AccountsIdPinPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdPinPOST);
};

const apiV1AccountsIdStatusesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdStatusesGET);
};

const apiV1AccountsIdUnblockPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdUnblockPOST);
};

const apiV1AccountsIdUnfollowPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdUnfollowPOST);
};

const apiV1AccountsIdUnmutePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdUnmutePOST);
};

const apiV1AccountsIdUnpinPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsIdUnpinPOST);
};

const apiV1AccountsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsPOST);
};

const apiV1AccountsRelationshipsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsRelationshipsGET);
};

const apiV1AccountsSearchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsSearchGET);
};

const apiV1AccountsUpdateCredentialsPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsUpdateCredentialsPATCH);
};

const apiV1AccountsVerifyCredentialsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AccountsVerifyCredentialsGET);
};


module.exports = {
  apiV1AccountsIdBlockPOST,
  apiV1AccountsIdFeaturedTagsGET,
  apiV1AccountsIdFollowPOST,
  apiV1AccountsIdFollowersGET,
  apiV1AccountsIdFollowingGET,
  apiV1AccountsIdGET,
  apiV1AccountsIdIdentityProofsGET,
  apiV1AccountsIdListsGET,
  apiV1AccountsIdMutePOST,
  apiV1AccountsIdNotePOST,
  apiV1AccountsIdPinPOST,
  apiV1AccountsIdStatusesGET,
  apiV1AccountsIdUnblockPOST,
  apiV1AccountsIdUnfollowPOST,
  apiV1AccountsIdUnmutePOST,
  apiV1AccountsIdUnpinPOST,
  apiV1AccountsPOST,
  apiV1AccountsRelationshipsGET,
  apiV1AccountsSearchGET,
  apiV1AccountsUpdateCredentialsPATCH,
  apiV1AccountsVerifyCredentialsGET,
};
