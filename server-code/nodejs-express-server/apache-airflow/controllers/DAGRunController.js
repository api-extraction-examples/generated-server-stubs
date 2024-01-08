/**
 * The DAGRunController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DAGRunService');
const clear_dag_run = async (request, response) => {
  await Controller.handleRequest(request, response, service.clear_dag_run);
};

const delete_dag_run = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_dag_run);
};

const get_dag_run = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag_run);
};

const get_dag_runs = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag_runs);
};

const get_dag_runs_batch = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_dag_runs_batch);
};

const get_upstream_dataset_events = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_upstream_dataset_events);
};

const post_dag_run = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_dag_run);
};

const set_dag_run_note = async (request, response) => {
  await Controller.handleRequest(request, response, service.set_dag_run_note);
};

const update_dag_run_state = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_dag_run_state);
};


module.exports = {
  clear_dag_run,
  delete_dag_run,
  get_dag_run,
  get_dag_runs,
  get_dag_runs_batch,
  get_upstream_dataset_events,
  post_dag_run,
  set_dag_run_note,
  update_dag_run_state,
};
