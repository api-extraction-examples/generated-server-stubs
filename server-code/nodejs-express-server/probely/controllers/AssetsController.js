/**
 * The AssetsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AssetsService');
const targetsTargetIdAssetsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsGET);
};

const targetsTargetIdAssetsIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsIdDELETE);
};

const targetsTargetIdAssetsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsIdGET);
};

const targetsTargetIdAssetsIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsIdPATCH);
};

const targetsTargetIdAssetsIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsIdPUT);
};

const targetsTargetIdAssetsIdVerifyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsIdVerifyPOST);
};

const targetsTargetIdAssetsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAssetsPOST);
};


module.exports = {
  targetsTargetIdAssetsGET,
  targetsTargetIdAssetsIdDELETE,
  targetsTargetIdAssetsIdGET,
  targetsTargetIdAssetsIdPATCH,
  targetsTargetIdAssetsIdPUT,
  targetsTargetIdAssetsIdVerifyPOST,
  targetsTargetIdAssetsPOST,
};
