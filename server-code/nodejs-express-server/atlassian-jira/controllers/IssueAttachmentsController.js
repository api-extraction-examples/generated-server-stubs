/**
 * The IssueAttachmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueAttachmentsService');
const addAttachment = async (request, response) => {
  await Controller.handleRequest(request, response, service.addAttachment);
};

const expandAttachmentForHumans = async (request, response) => {
  await Controller.handleRequest(request, response, service.expandAttachmentForHumans);
};

const expandAttachmentForMachines = async (request, response) => {
  await Controller.handleRequest(request, response, service.expandAttachmentForMachines);
};

const getAttachment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachment);
};

const getAttachmentContent = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachmentContent);
};

const getAttachmentMeta = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachmentMeta);
};

const getAttachmentThumbnail = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachmentThumbnail);
};

const removeAttachment = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeAttachment);
};


module.exports = {
  addAttachment,
  expandAttachmentForHumans,
  expandAttachmentForMachines,
  getAttachment,
  getAttachmentContent,
  getAttachmentMeta,
  getAttachmentThumbnail,
  removeAttachment,
};
