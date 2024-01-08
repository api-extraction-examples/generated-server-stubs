/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets a year.
*
* year Integer The year.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns BaseItemDto
* */
const getYear = ({ year, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
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
* Get years.
*
* startIndex Integer Skips over a given number of items within the results. Use for paging. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* sortOrder String Sort Order - Ascending,Descending. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* excludeItemTypes List Optional. If specified, results will be excluded based on item type. This allows multiple, comma delimited. (optional)
* includeItemTypes List Optional. If specified, results will be included based on item type. This allows multiple, comma delimited. (optional)
* mediaTypes List Optional. Filter by MediaType. Allows multiple, comma delimited. (optional)
* sortBy String Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* userId UUID User Id. (optional)
* recursive Boolean Search recursively. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* returns BaseItemDtoQueryResult
* */
const getYears = ({ startIndex, limit, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, mediaTypes, sortBy, enableUserData, imageTypeLimit, enableImageTypes, userId, recursive, enableImages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startIndex,
        limit,
        sortOrder,
        parentId,
        fields,
        excludeItemTypes,
        includeItemTypes,
        mediaTypes,
        sortBy,
        enableUserData,
        imageTypeLimit,
        enableImageTypes,
        userId,
        recursive,
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
  getYear,
  getYears,
};
