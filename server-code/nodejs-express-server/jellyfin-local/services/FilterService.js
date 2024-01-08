/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets query filters.
*
* userId UUID Optional. User id. (optional)
* parentId UUID Optional. Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* includeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* isAiring Boolean Optional. Is item airing. (optional)
* isMovie Boolean Optional. Is item movie. (optional)
* isSports Boolean Optional. Is item sports. (optional)
* isKids Boolean Optional. Is item kids. (optional)
* isNews Boolean Optional. Is item news. (optional)
* isSeries Boolean Optional. Is item series. (optional)
* recursive Boolean Optional. Search recursive. (optional)
* returns QueryFilters
* */
const getQueryFilters = ({ userId, parentId, includeItemTypes, isAiring, isMovie, isSports, isKids, isNews, isSeries, recursive }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        parentId,
        includeItemTypes,
        isAiring,
        isMovie,
        isSports,
        isKids,
        isNews,
        isSeries,
        recursive,
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
* Gets legacy query filters.
*
* userId UUID Optional. User id. (optional)
* parentId UUID Optional. Parent id. (optional)
* includeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* mediaTypes List Optional. Filter by MediaType. Allows multiple, comma delimited. (optional)
* returns QueryFiltersLegacy
* */
const getQueryFiltersLegacy = ({ userId, parentId, includeItemTypes, mediaTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        parentId,
        includeItemTypes,
        mediaTypes,
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
  getQueryFilters,
  getQueryFiltersLegacy,
};
