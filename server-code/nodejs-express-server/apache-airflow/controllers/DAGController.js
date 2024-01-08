/**
 * The DAGController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DAGService');
const delete_dag = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_dag);
};

const get_dag = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag);
};

const get_dag_details = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag_details);
};

const get_dag_source = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag_source);
};

const get_dags = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dags);
};

const get_task = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_task);
};

const get_tasks = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_tasks);
};

const patch_dag = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_dag);
};

const patch_dags = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_dags);
};

const post_clear_task_instances = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_clear_task_instances);
};

const post_set_task_instances_state = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_set_task_instances_state);
};


module.exports = {
  delete_dag,
  get_dag,
  get_dag_details,
  get_dag_source,
  get_dags,
  get_task,
  get_tasks,
  patch_dag,
  patch_dags,
  post_clear_task_instances,
  post_set_task_instances_state,
};
