/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets all album artists from a given item, folder, or the entire library.
*
* minCommunityRating Double Optional filter by minimum community rating. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* searchTerm String Optional. Search term. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* excludeItemTypes List Optional. If specified, results will be filtered out based on item type. This allows multiple, comma delimited. (optional)
* includeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* filters List Optional. Specify additional filters to apply. (optional)
* isFavorite Boolean Optional filter by items that are marked as favorite, or not. (optional)
* mediaTypes List Optional filter by MediaType. Allows multiple, comma delimited. (optional)
* genres List Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimited. (optional)
* genreIds List Optional. If specified, results will be filtered based on genre id. This allows multiple, pipe delimited. (optional)
* officialRatings List Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimited. (optional)
* tags List Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimited. (optional)
* years List Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimited. (optional)
* enableUserData Boolean Optional, include user data. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* person String Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
* personIds List Optional. If specified, results will be filtered to include only those containing the specified person ids. (optional)
* personTypes List Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited. (optional)
* studios List Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimited. (optional)
* studioIds List Optional. If specified, results will be filtered based on studio id. This allows multiple, pipe delimited. (optional)
* userId UUID User id. (optional)
* nameStartsWithOrGreater String Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
* nameStartsWith String Optional filter by items whose name is sorted equally than a given input string. (optional)
* nameLessThan String Optional filter by items whose name is equally or lesser than a given input string. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* enableTotalRecordCount Boolean Total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getAlbumArtists = ({ minCommunityRating, startIndex, limit, searchTerm, parentId, fields, excludeItemTypes, includeItemTypes, filters, isFavorite, mediaTypes, genres, genreIds, officialRatings, tags, years, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, userId, nameStartsWithOrGreater, nameStartsWith, nameLessThan, enableImages, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        minCommunityRating,
        startIndex,
        limit,
        searchTerm,
        parentId,
        fields,
        excludeItemTypes,
        includeItemTypes,
        filters,
        isFavorite,
        mediaTypes,
        genres,
        genreIds,
        officialRatings,
        tags,
        years,
        enableUserData,
        imageTypeLimit,
        enableImageTypes,
        person,
        personIds,
        personTypes,
        studios,
        studioIds,
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
/**
* Gets an artist by name.
*
* name String Studio name.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns BaseItemDto
* */
const getArtistByName = ({ name, userId }) => new Promise(
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
* Gets all artists from a given item, folder, or the entire library.
*
* minCommunityRating Double Optional filter by minimum community rating. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* searchTerm String Optional. Search term. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* excludeItemTypes List Optional. If specified, results will be filtered out based on item type. This allows multiple, comma delimited. (optional)
* includeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* filters List Optional. Specify additional filters to apply. (optional)
* isFavorite Boolean Optional filter by items that are marked as favorite, or not. (optional)
* mediaTypes List Optional filter by MediaType. Allows multiple, comma delimited. (optional)
* genres List Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimited. (optional)
* genreIds List Optional. If specified, results will be filtered based on genre id. This allows multiple, pipe delimited. (optional)
* officialRatings List Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimited. (optional)
* tags List Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimited. (optional)
* years List Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimited. (optional)
* enableUserData Boolean Optional, include user data. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* person String Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
* personIds List Optional. If specified, results will be filtered to include only those containing the specified person ids. (optional)
* personTypes List Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited. (optional)
* studios List Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimited. (optional)
* studioIds List Optional. If specified, results will be filtered based on studio id. This allows multiple, pipe delimited. (optional)
* userId UUID User id. (optional)
* nameStartsWithOrGreater String Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
* nameStartsWith String Optional filter by items whose name is sorted equally than a given input string. (optional)
* nameLessThan String Optional filter by items whose name is equally or lesser than a given input string. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* enableTotalRecordCount Boolean Total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getArtists = ({ minCommunityRating, startIndex, limit, searchTerm, parentId, fields, excludeItemTypes, includeItemTypes, filters, isFavorite, mediaTypes, genres, genreIds, officialRatings, tags, years, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, userId, nameStartsWithOrGreater, nameStartsWith, nameLessThan, enableImages, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        minCommunityRating,
        startIndex,
        limit,
        searchTerm,
        parentId,
        fields,
        excludeItemTypes,
        includeItemTypes,
        filters,
        isFavorite,
        mediaTypes,
        genres,
        genreIds,
        officialRatings,
        tags,
        years,
        enableUserData,
        imageTypeLimit,
        enableImageTypes,
        person,
        personIds,
        personTypes,
        studios,
        studioIds,
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
  getAlbumArtists,
  getArtistByName,
  getArtists,
};
