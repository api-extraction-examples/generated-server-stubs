/**
 * The AttributeNamespacesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AttributeNamespacesService');
const attributeGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeGET);
};

const attributeNamespaceDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceDELETE);
};

const attributeNamespaceGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceGET);
};

const attributeNamespaceMetaDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceMetaDELETE);
};

const attributeNamespaceMetaGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceMetaGET);
};

const attributeNamespaceMetaPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceMetaPOST);
};

const attributeNamespaceMetaPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceMetaPUT);
};


module.exports = {
  attributeGET,
  attributeNamespaceDELETE,
  attributeNamespaceGET,
  attributeNamespaceMetaDELETE,
  attributeNamespaceMetaGET,
  attributeNamespaceMetaPOST,
  attributeNamespaceMetaPUT,
};
