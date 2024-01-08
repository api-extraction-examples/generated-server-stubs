/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets episodes for a tv season.
*
* seriesId UUID The series id.
* userId UUID The user id. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* season Integer Optional filter by season number. (optional)
* seasonId UUID Optional. Filter by season id. (optional)
* isMissing Boolean Optional. Filter by items that are missing episodes or not. (optional)
* adjacentTo String Optional. Return items that are siblings of a supplied item. (optional)
* startItemId UUID Optional. Skip through the list until a given item is found. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* sortBy String Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime. (optional)
* returns BaseItemDtoQueryResult
* */
const getEpisodes = ({ seriesId, userId, fields, season, seasonId, isMissing, adjacentTo, startItemId, startIndex, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData, sortBy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seriesId,
        userId,
        fields,
        season,
        seasonId,
        isMissing,
        adjacentTo,
        startItemId,
        startIndex,
        limit,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
        sortBy,
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
* Gets a list of next up episodes.
*
* userId UUID The user id of the user to get the next up episodes for. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* seriesId String Optional. Filter by series id. (optional)
* parentId UUID Optional. Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* enableImges Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* enableTotalRecordCount Boolean Whether to enable the total records count. Defaults to true. (optional)
* returns BaseItemDtoQueryResult
* */
const getNextUp = ({ userId, startIndex, limit, fields, seriesId, parentId, enableImges, imageTypeLimit, enableImageTypes, enableUserData, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        startIndex,
        limit,
        fields,
        seriesId,
        parentId,
        enableImges,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
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
* Gets seasons for a tv series.
*
* seriesId UUID The series id.
* userId UUID The user id. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* isSpecialSeason Boolean Optional. Filter by special season. (optional)
* isMissing Boolean Optional. Filter by items that are missing episodes or not. (optional)
* adjacentTo String Optional. Return items that are siblings of a supplied item. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* returns BaseItemDtoQueryResult
* */
const getSeasons = ({ seriesId, userId, fields, isSpecialSeason, isMissing, adjacentTo, enableImages, imageTypeLimit, enableImageTypes, enableUserData }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seriesId,
        userId,
        fields,
        isSpecialSeason,
        isMissing,
        adjacentTo,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
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
* Gets a list of upcoming episodes.
*
* userId UUID The user id of the user to get the upcoming episodes for. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* parentId UUID Optional. Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* enableImges Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* returns BaseItemDtoQueryResult
* */
const getUpcomingEpisodes = ({ userId, startIndex, limit, fields, parentId, enableImges, imageTypeLimit, enableImageTypes, enableUserData }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        startIndex,
        limit,
        fields,
        parentId,
        enableImges,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
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
  getEpisodes,
  getNextUp,
  getSeasons,
  getUpcomingEpisodes,
};
