/**
 * The FiltersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FiltersService');
const changeFilterOwner = async (request, response) => {
  await Controller.handleRequest(request, response, service.changeFilterOwner);
};

const createFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFilter);
};

const deleteFavouriteForFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFavouriteForFilter);
};

const deleteFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFilter);
};

const getColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getColumns);
};

const getFavouriteFilters = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFavouriteFilters);
};

const getFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFilter);
};

const getFiltersPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFiltersPaginated);
};

const getMyFilters = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMyFilters);
};

const resetColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetColumns);
};

const setColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.setColumns);
};

const setFavouriteForFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.setFavouriteForFilter);
};

const updateFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateFilter);
};


module.exports = {
  changeFilterOwner,
  createFilter,
  deleteFavouriteForFilter,
  deleteFilter,
  getColumns,
  getFavouriteFilters,
  getFilter,
  getFiltersPaginated,
  getMyFilters,
  resetColumns,
  setColumns,
  setFavouriteForFilter,
  updateFilter,
};
