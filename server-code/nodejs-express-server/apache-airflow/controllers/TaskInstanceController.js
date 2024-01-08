/**
 * The TaskInstanceController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TaskInstanceService');
const get_extra_links = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_extra_links);
};

const get_log = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_log);
};

const get_mapped_task_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_mapped_task_instance);
};

const get_mapped_task_instances = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_mapped_task_instances);
};

const get_task_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_task_instance);
};

const get_task_instances = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_task_instances);
};

const get_task_instances_batch = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_task_instances_batch);
};

const patch_mapped_task_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_mapped_task_instance);
};

const patch_task_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_task_instance);
};

const set_mapped_task_instance_note = async (request, response) => {
  await Controller.handleRequest(request, response, service.set_mapped_task_instance_note);
};

const set_task_instance_note = async (request, response) => {
  await Controller.handleRequest(request, response, service.set_task_instance_note);
};


module.exports = {
  get_extra_links,
  get_log,
  get_mapped_task_instance,
  get_mapped_task_instances,
  get_task_instance,
  get_task_instances,
  get_task_instances_batch,
  patch_mapped_task_instance,
  patch_task_instance,
  set_mapped_task_instance_note,
  set_task_instance_note,
};
