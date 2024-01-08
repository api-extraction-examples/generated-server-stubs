/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets the search hint result.
*
* searchTerm String The search term to filter on.
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* userId UUID Optional. Supply a user id to search within a user's library or omit to search all. (optional)
* includeItemTypes List If specified, only results with the specified item types are returned. This allows multiple, comma delimeted. (optional)
* excludeItemTypes List If specified, results with these item types are filtered out. This allows multiple, comma delimeted. (optional)
* mediaTypes List If specified, only results with the specified media types are returned. This allows multiple, comma delimeted. (optional)
* parentId UUID If specified, only children of the parent are returned. (optional)
* isMovie Boolean Optional filter for movies. (optional)
* isSeries Boolean Optional filter for series. (optional)
* isNews Boolean Optional filter for news. (optional)
* isKids Boolean Optional filter for kids. (optional)
* isSports Boolean Optional filter for sports. (optional)
* includePeople Boolean Optional filter whether to include people. (optional)
* includeMedia Boolean Optional filter whether to include media. (optional)
* includeGenres Boolean Optional filter whether to include genres. (optional)
* includeStudios Boolean Optional filter whether to include studios. (optional)
* includeArtists Boolean Optional filter whether to include artists. (optional)
* returns SearchHintResult
* */
const get = ({ searchTerm, startIndex, limit, userId, includeItemTypes, excludeItemTypes, mediaTypes, parentId, isMovie, isSeries, isNews, isKids, isSports, includePeople, includeMedia, includeGenres, includeStudios, includeArtists }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        searchTerm,
        startIndex,
        limit,
        userId,
        includeItemTypes,
        excludeItemTypes,
        mediaTypes,
        parentId,
        isMovie,
        isSeries,
        isNews,
        isKids,
        isSports,
        includePeople,
        includeMedia,
        includeGenres,
        includeStudios,
        includeArtists,
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
  get,
};
