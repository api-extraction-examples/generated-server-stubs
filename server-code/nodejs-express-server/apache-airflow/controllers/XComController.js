/**
 * The XComController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/XComService');
const get_xcom_entries = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_xcom_entries);
};

const get_xcom_entry = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_xcom_entry);
};


module.exports = {
  get_xcom_entries,
  get_xcom_entry,
};
