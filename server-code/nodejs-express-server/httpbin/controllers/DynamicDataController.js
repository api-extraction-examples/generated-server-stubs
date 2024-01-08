/**
 * The DynamicDataController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DynamicDataService');
const base64ValueGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.base64ValueGET);
};

const bytesNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.bytesNGET);
};

const delayDelayDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayDELETE);
};

const delayDelayGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayGET);
};

const delayDelayPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayPATCH);
};

const delayDelayPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayPOST);
};

const delayDelayPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayPUT);
};

const delayDelayTRACE = async (request, response) => {
  await Controller.handleRequest(request, response, service.delayDelayTRACE);
};

const dripGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.dripGET);
};

const linksNOffsetGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.linksNOffsetGET);
};

const rangeNumbytesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.rangeNumbytesGET);
};

const streamNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.streamNGET);
};

const stream_bytesNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.stream_bytesNGET);
};

const uuidGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.uuidGET);
};


module.exports = {
  base64ValueGET,
  bytesNGET,
  delayDelayDELETE,
  delayDelayGET,
  delayDelayPATCH,
  delayDelayPOST,
  delayDelayPUT,
  delayDelayTRACE,
  dripGET,
  linksNOffsetGET,
  rangeNumbytesGET,
  streamNGET,
  stream_bytesNGET,
  uuidGET,
};
