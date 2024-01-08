/**
 * The AttachmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AttachmentsService');
const createAttachmentForObject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createAttachmentForObject);
};

const deleteAttachment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAttachment);
};

const getAttachment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachment);
};

const getAttachmentsForObject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAttachmentsForObject);
};


module.exports = {
  createAttachmentForObject,
  deleteAttachment,
  getAttachment,
  getAttachmentsForObject,
};
