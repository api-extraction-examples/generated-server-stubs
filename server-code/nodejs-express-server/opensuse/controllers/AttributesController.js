/**
 * The AttributesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AttributesService');
const attributeNamespaceAttributeNameDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceAttributeNameDELETE);
};

const attributeNamespaceAttributeNameMetaDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceAttributeNameMetaDELETE);
};

const attributeNamespaceAttributeNameMetaGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceAttributeNameMetaGET);
};

const attributeNamespaceAttributeNameMetaPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceAttributeNameMetaPOST);
};

const attributeNamespaceAttributeNameMetaPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.attributeNamespaceAttributeNameMetaPUT);
};


module.exports = {
  attributeNamespaceAttributeNameDELETE,
  attributeNamespaceAttributeNameMetaDELETE,
  attributeNamespaceAttributeNameMetaGET,
  attributeNamespaceAttributeNameMetaPOST,
  attributeNamespaceAttributeNameMetaPUT,
};
