/**
 * The BuildController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BuildService');
const buildGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildGET);
};

const buildProjectNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameGET);
};

const buildProjectNamePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNamePOST);
};

const buildProjectNameRepositoryNameArchitectureNameBuilddepinfoGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameArchitectureNameBuilddepinfoGET);
};

const buildProjectNameRepositoryNameArchitectureNamePackageNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameArchitectureNamePackageNameGET);
};

const buildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGET);
};

const buildProjectNameRepositoryNameArchitectureNamePackageNameReasonGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameArchitectureNamePackageNameReasonGET);
};

const buildProjectNameRepositoryNameArchitectureNameRepositoryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameArchitectureNameRepositoryGET);
};

const buildProjectNameRepositoryNameBuildconfigGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameBuildconfigGET);
};

const buildProjectNameRepositoryNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameRepositoryNameGET);
};

const buildProjectNameResultGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildProjectNameResultGET);
};

const getBuildProjectRepositoryArchPackageBuildinfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchPackageBuildinfo);
};

const getBuildProjectRepositoryArchPackageHistory = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchPackageHistory);
};

const getBuildProjectRepositoryArchPackageLog = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchPackageLog);
};

const getBuildProjectRepositoryArchPackageStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchPackageStatus);
};

const getBuildProjectRepositoryArchitecturePackageFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchitecturePackageFile);
};

const getBuildProjectRepositoryArchitecturePackageFileViewFileinfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBuildProjectRepositoryArchitecturePackageFileViewFileinfo);
};

const putBuildProjectRepositoryArchitecturePackageFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.putBuildProjectRepositoryArchitecturePackageFile);
};


module.exports = {
  buildGET,
  buildProjectNameGET,
  buildProjectNamePOST,
  buildProjectNameRepositoryNameArchitectureNameBuilddepinfoGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameReasonGET,
  buildProjectNameRepositoryNameArchitectureNameRepositoryGET,
  buildProjectNameRepositoryNameBuildconfigGET,
  buildProjectNameRepositoryNameGET,
  buildProjectNameResultGET,
  getBuildProjectRepositoryArchPackageBuildinfo,
  getBuildProjectRepositoryArchPackageHistory,
  getBuildProjectRepositoryArchPackageLog,
  getBuildProjectRepositoryArchPackageStatus,
  getBuildProjectRepositoryArchitecturePackageFile,
  getBuildProjectRepositoryArchitecturePackageFileViewFileinfo,
  putBuildProjectRepositoryArchitecturePackageFile,
};
