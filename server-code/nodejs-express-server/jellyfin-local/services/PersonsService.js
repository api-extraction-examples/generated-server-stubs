/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get person by name.
*
* name String Person name.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns BaseItemDto
* */
const getPerson = ({ name, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        userId,
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
* Gets all persons.
*
* limit Integer Optional. The maximum number of records to return. (optional)
* searchTerm String The search term. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* filters List Optional. Specify additional filters to apply. (optional)
* isFavorite Boolean Optional filter by items that are marked as favorite, or not. userId is required. (optional)
* enableUserData Boolean Optional, include user data. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* excludePersonTypes List Optional. If specified results will be filtered to exclude those containing the specified PersonType. Allows multiple, comma-delimited. (optional)
* personTypes List Optional. If specified results will be filtered to include only those containing the specified PersonType. Allows multiple, comma-delimited. (optional)
* appearsInItemId UUID Optional. If specified, person results will be filtered on items related to said persons. (optional)
* userId UUID User id. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* returns BaseItemDtoQueryResult
* */
const getPersons = ({ limit, searchTerm, fields, filters, isFavorite, enableUserData, imageTypeLimit, enableImageTypes, excludePersonTypes, personTypes, appearsInItemId, userId, enableImages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        searchTerm,
        fields,
        filters,
        isFavorite,
        enableUserData,
        imageTypeLimit,
        enableImageTypes,
        excludePersonTypes,
        personTypes,
        appearsInItemId,
        userId,
        enableImages,
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
  getPerson,
  getPersons,
};
