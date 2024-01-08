/**
 * The PublishedBinariesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PublishedBinariesService');
const publishedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedGET);
};

const publishedProjectNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameGET);
};

const publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGET);
};

const publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGET);
};

const publishedProjectNameRepositoryNameArchitectureNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameRepositoryNameArchitectureNameGET);
};

const publishedProjectNameRepositoryNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameRepositoryNameGET);
};

const publishedProjectNameRepositoryNameviewstatusGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishedProjectNameRepositoryNameviewstatusGET);
};


module.exports = {
  publishedGET,
  publishedProjectNameGET,
  publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGET,
  publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGET,
  publishedProjectNameRepositoryNameArchitectureNameGET,
  publishedProjectNameRepositoryNameGET,
  publishedProjectNameRepositoryNameviewstatusGET,
};
