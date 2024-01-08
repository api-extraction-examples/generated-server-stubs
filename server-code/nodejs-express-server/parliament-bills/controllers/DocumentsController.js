/**
 * The DocumentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DocumentsService');
const apiV1PublicationsPublicationIdDocumentsDocumentIdDownloadGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PublicationsPublicationIdDocumentsDocumentIdDownloadGET);
};

const apiV1PublicationsPublicationIdDocumentsDocumentIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PublicationsPublicationIdDocumentsDocumentIdGET);
};


module.exports = {
  apiV1PublicationsPublicationIdDocumentsDocumentIdDownloadGET,
  apiV1PublicationsPublicationIdDocumentsDocumentIdGET,
};
