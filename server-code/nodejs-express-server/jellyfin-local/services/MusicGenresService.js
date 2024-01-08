/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets a music genre, by name.
*
* genreName String The genre name.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns BaseItemDto
* */
const getMusicGenre = ({ genreName, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        genreName,
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
* Gets all music genres from a given item, folder, or the entire library.
*
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* searchTerm String The search term. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* excludeItemTypes List Optional. If specified, results will be filtered out based on item type. This allows multiple, comma delimited. (optional)
* includeItemTypes List Optional. If specified, results will be filtered in based on item type. This allows multiple, comma delimited. (optional)
* isFavorite Boolean Optional filter by items that are marked as favorite, or not. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* userId UUID User id. (optional)
* nameStartsWithOrGreater String Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
* nameStartsWith String Optional filter by items whose name is sorted equally than a given input string. (optional)
* nameLessThan String Optional filter by items whose name is equally or lesser than a given input string. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* enableTotalRecordCount Boolean Optional. Include total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getMusicGenres = ({ startIndex, limit, searchTerm, parentId, fields, excludeItemTypes, includeItemTypes, isFavorite, imageTypeLimit, enableImageTypes, userId, nameStartsWithOrGreater, nameStartsWith, nameLessThan, enableImages, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startIndex,
        limit,
        searchTerm,
        parentId,
        fields,
        excludeItemTypes,
        includeItemTypes,
        isFavorite,
        imageTypeLimit,
        enableImageTypes,
        userId,
        nameStartsWithOrGreater,
        nameStartsWith,
        nameLessThan,
        enableImages,
        enableTotalRecordCount,
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
  getMusicGenre,
  getMusicGenres,
};
