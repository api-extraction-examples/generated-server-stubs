/**
 * The DashboardsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DashboardsService');
const addGadget = async (request, response) => {
  await Controller.handleRequest(request, response, service.addGadget);
};

const copyDashboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.copyDashboard);
};

const createDashboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.createDashboard);
};

const deleteDashboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDashboard);
};

const deleteDashboardItemProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDashboardItemProperty);
};

const getAllAvailableDashboardGadgets = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllAvailableDashboardGadgets);
};

const getAllDashboards = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllDashboards);
};

const getAllGadgets = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllGadgets);
};

const getDashboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDashboard);
};

const getDashboardItemProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDashboardItemProperty);
};

const getDashboardItemPropertyKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDashboardItemPropertyKeys);
};

const getDashboardsPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDashboardsPaginated);
};

const removeGadget = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeGadget);
};

const setDashboardItemProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDashboardItemProperty);
};

const updateDashboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDashboard);
};

const updateGadget = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGadget);
};


module.exports = {
  addGadget,
  copyDashboard,
  createDashboard,
  deleteDashboard,
  deleteDashboardItemProperty,
  getAllAvailableDashboardGadgets,
  getAllDashboards,
  getAllGadgets,
  getDashboard,
  getDashboardItemProperty,
  getDashboardItemPropertyKeys,
  getDashboardsPaginated,
  removeGadget,
  setDashboardItemProperty,
  updateDashboard,
  updateGadget,
};
