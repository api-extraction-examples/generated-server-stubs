/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* filterLeft_Square_BracketplatformsRight_Square_Bracket List filter by attribute 'platforms' (optional)
* existsLeft_Square_BracketparentRight_Square_Bracket List filter by existence or non-existence of related 'parent' (optional)
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* limitLeft_Square_BracketsubcategoriesRight_Square_Bracket Integer maximum number of related subcategories returned (when they are included) (optional)
* returns AppCategoriesResponse
* */
const appCategoriesGet_collection = ({ filterLeft_Square_BracketplatformsRight_Square_Bracket, existsLeft_Square_BracketparentRight_Square_Bracket, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket, limit, include, limitLeft_Square_BracketsubcategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketplatformsRight_Square_Bracket,
        existsLeft_Square_BracketparentRight_Square_Bracket,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
        limit,
        include,
        limitLeft_Square_BracketsubcategoriesRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* include List comma-separated list of relationships to include (optional)
* limitLeft_Square_BracketsubcategoriesRight_Square_Bracket Integer maximum number of related subcategories returned (when they are included) (optional)
* returns AppCategoryResponse
* */
const appCategoriesGet_instance = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket, include, limitLeft_Square_BracketsubcategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
        include,
        limitLeft_Square_BracketsubcategoriesRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appCategoriesParentGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* limit Integer maximum resources per page (optional)
* returns AppCategoriesResponse
* */
const appCategoriesSubcategoriesGet_to_many_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  appCategoriesGet_collection,
  appCategoriesGet_instance,
  appCategoriesParentGet_to_one_related,
  appCategoriesSubcategoriesGet_to_many_related,
};
