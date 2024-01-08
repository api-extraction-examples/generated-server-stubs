/**
 * The SiteController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SiteService');
const targetsTargetIdSiteGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdSiteGET);
};

const targetsTargetIdSitePATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdSitePATCH);
};

const targetsTargetIdSitePUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdSitePUT);
};

const targetsTargetIdSiteVerifyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdSiteVerifyPOST);
};


module.exports = {
  targetsTargetIdSiteGET,
  targetsTargetIdSitePATCH,
  targetsTargetIdSitePUT,
  targetsTargetIdSiteVerifyPOST,
};
