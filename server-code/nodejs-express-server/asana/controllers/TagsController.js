/**
 * The TagsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TagsService');
const createTag = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTag);
};

const createTagForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTagForWorkspace);
};

const deleteTag = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteTag);
};

const getTag = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTag);
};

const getTags = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTags);
};

const getTagsForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTagsForTask);
};

const getTagsForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTagsForWorkspace);
};

const updateTag = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateTag);
};


module.exports = {
  createTag,
  createTagForWorkspace,
  deleteTag,
  getTag,
  getTags,
  getTagsForTask,
  getTagsForWorkspace,
  updateTag,
};
