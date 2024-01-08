/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get all channel features.
*
* returns List
* */
const getAllChannelFeatures = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get channel features.
*
* channelId UUID Channel id.
* returns ChannelFeatures
* */
const getChannelFeatures = ({ channelId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
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
* Get channel items.
*
* channelId UUID Channel Id.
* folderId UUID Optional. Folder Id. (optional)
* userId UUID Optional. User Id. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* sortOrder String Optional. Sort Order - Ascending,Descending. (optional)
* filters List Optional. Specify additional filters to apply. (optional)
* sortBy String Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getChannelItems = ({ channelId, folderId, userId, startIndex, limit, sortOrder, filters, sortBy, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
        folderId,
        userId,
        startIndex,
        limit,
        sortOrder,
        filters,
        sortBy,
        fields,
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
* Gets available channels.
*
* userId UUID User Id to filter by. Use System.Guid.Empty to not filter by user. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* supportsLatestItems Boolean Optional. Filter by channels that support getting latest items. (optional)
* supportsMediaDeletion Boolean Optional. Filter by channels that support media deletion. (optional)
* isFavorite Boolean Optional. Filter by channels that are favorite. (optional)
* returns BaseItemDtoQueryResult
* */
const getChannels = ({ userId, startIndex, limit, supportsLatestItems, supportsMediaDeletion, isFavorite }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        startIndex,
        limit,
        supportsLatestItems,
        supportsMediaDeletion,
        isFavorite,
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
* Gets latest channel items.
*
* userId UUID Optional. User Id. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* filters List Optional. Specify additional filters to apply. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* channelIds List Optional. Specify one or more channel id's, comma delimited. (optional)
* returns BaseItemDtoQueryResult
* */
const getLatestChannelItems = ({ userId, startIndex, limit, filters, fields, channelIds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        startIndex,
        limit,
        filters,
        fields,
        channelIds,
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
  getAllChannelFeatures,
  getChannelFeatures,
  getChannelItems,
  getChannels,
  getLatestChannelItems,
};
