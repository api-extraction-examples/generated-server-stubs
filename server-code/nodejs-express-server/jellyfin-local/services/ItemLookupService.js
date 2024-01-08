/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Applies search criteria to an item and refreshes metadata.
*
* itemId UUID Item id.
* remoteSearchResult RemoteSearchResult The remote search result.
* replaceAllImages Boolean Optional. Whether or not to replace all images. Default: True. (optional)
* no response value expected for this operation
* */
const applySearchCriteria = ({ itemId, remoteSearchResult, replaceAllImages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        remoteSearchResult,
        replaceAllImages,
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
* Get book remote search.
*
* bookInfoRemoteSearchQuery BookInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getBookRemoteSearchResults = ({ bookInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookInfoRemoteSearchQuery,
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
* Get box set remote search.
*
* boxSetInfoRemoteSearchQuery BoxSetInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getBoxSetRemoteSearchResults = ({ boxSetInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boxSetInfoRemoteSearchQuery,
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
* Get the item's external id info.
*
* itemId UUID Item id.
* returns List
* */
const getExternalIdInfos = ({ itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
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
* Get movie remote search.
*
* movieInfoRemoteSearchQuery MovieInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getMovieRemoteSearchResults = ({ movieInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        movieInfoRemoteSearchQuery,
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
* Get music album remote search.
*
* albumInfoRemoteSearchQuery AlbumInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getMusicAlbumRemoteSearchResults = ({ albumInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        albumInfoRemoteSearchQuery,
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
* Get music artist remote search.
*
* artistInfoRemoteSearchQuery ArtistInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getMusicArtistRemoteSearchResults = ({ artistInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        artistInfoRemoteSearchQuery,
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
* Get music video remote search.
*
* musicVideoInfoRemoteSearchQuery MusicVideoInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getMusicVideoRemoteSearchResults = ({ musicVideoInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        musicVideoInfoRemoteSearchQuery,
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
* Get person remote search.
*
* personLookupInfoRemoteSearchQuery PersonLookupInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getPersonRemoteSearchResults = ({ personLookupInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        personLookupInfoRemoteSearchQuery,
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
* Gets a remote image.
*
* imageUrl String The image url.
* providerName String The provider name.
* returns File
* */
const getRemoteSearchImage = ({ imageUrl, providerName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        imageUrl,
        providerName,
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
* Get series remote search.
*
* seriesInfoRemoteSearchQuery SeriesInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getSeriesRemoteSearchResults = ({ seriesInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seriesInfoRemoteSearchQuery,
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
* Get trailer remote search.
*
* trailerInfoRemoteSearchQuery TrailerInfoRemoteSearchQuery Remote search query.
* returns List
* */
const getTrailerRemoteSearchResults = ({ trailerInfoRemoteSearchQuery }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        trailerInfoRemoteSearchQuery,
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
  applySearchCriteria,
  getBookRemoteSearchResults,
  getBoxSetRemoteSearchResults,
  getExternalIdInfos,
  getMovieRemoteSearchResults,
  getMusicAlbumRemoteSearchResults,
  getMusicArtistRemoteSearchResults,
  getMusicVideoRemoteSearchResults,
  getPersonRemoteSearchResults,
  getRemoteSearchImage,
  getSeriesRemoteSearchResults,
  getTrailerRemoteSearchResults,
};
