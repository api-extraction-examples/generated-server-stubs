/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get user view grouping options.
*
* userId UUID User id.
* returns List
* */
const getGroupingOptions = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get user views.
*
* userId UUID User id.
* includeExternalContent Boolean Whether or not to include external views such as channels or live tv. (optional)
* presetViews List Preset views. (optional)
* includeHidden Boolean Whether or not to include hidden content. (optional)
* returns BaseItemDtoQueryResult
* */
const getUserViews = ({ userId, includeExternalContent, presetViews, includeHidden }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        includeExternalContent,
        presetViews,
        includeHidden,
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
  getGroupingOptions,
  getUserViews,
};
