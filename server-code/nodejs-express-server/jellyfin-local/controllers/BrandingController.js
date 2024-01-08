/**
 * The BrandingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BrandingService');
const getBrandingCss = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBrandingCss);
};

const getBrandingCss_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBrandingCss_2);
};

const getBrandingOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBrandingOptions);
};


module.exports = {
  getBrandingCss,
  getBrandingCss_2,
  getBrandingOptions,
};
