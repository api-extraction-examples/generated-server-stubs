/**
 * The ProductsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProductsService');
const getCodeName = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCodeName);
};

const getProductInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProductInfo);
};

const getProductList = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProductList);
};

const getorderinginfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getorderinginfo);
};


module.exports = {
  getCodeName,
  getProductInfo,
  getProductList,
  getorderinginfo,
};
