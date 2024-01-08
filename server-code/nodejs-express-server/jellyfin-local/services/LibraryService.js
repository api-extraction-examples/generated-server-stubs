/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes an item from the library and filesystem.
*
* itemId UUID The item id.
* no response value expected for this operation
* */
const deleteItem = ({ itemId }) => new Promise(
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
* Deletes items from the library and filesystem.
*
* ids List The item ids. (optional)
* no response value expected for this operation
* */
const deleteItems = ({ ids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ids,
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
* Gets all parents of an item.
*
* itemId UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns List
* */
const getAncestors = ({ itemId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
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
* Gets critic review for an item.
*
* itemId String 
* returns BaseItemDtoQueryResult
* */
const getCriticReviews = ({ itemId }) => new Promise(
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
* Downloads item media.
*
* itemId UUID The item id.
* returns File
* */
const getDownload = ({ itemId }) => new Promise(
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
* Get the original file of an item.
*
* itemId UUID The item id.
* returns File
* */
const getFile = ({ itemId }) => new Promise(
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
* Get item counts.
*
* userId UUID Optional. Get counts from a specific user's library. (optional)
* isFavorite Boolean Optional. Get counts of favorite items. (optional)
* returns ItemCounts
* */
const getItemCounts = ({ userId, isFavorite }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
* Gets the library options info.
*
* libraryContentType String Library content type. (optional)
* isNewLibrary Boolean Whether this is a new library. (optional)
* returns LibraryOptionsResultDto
* */
const getLibraryOptionsInfo = ({ libraryContentType, isNewLibrary }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        libraryContentType,
        isNewLibrary,
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
* Gets all user media folders.
*
* isHidden Boolean Optional. Filter by folders that are marked hidden, or not. (optional)
* returns BaseItemDtoQueryResult
* */
const getMediaFolders = ({ isHidden }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        isHidden,
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
* Gets a list of physical paths from virtual folders.
*
* returns List
* */
const getPhysicalPaths = () => new Promise(
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarAlbums = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarArtists = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarItems = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarMovies = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarShows = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Gets similar items.
*
* itemId UUID The item id.
* excludeArtistIds List Exclude artist ids. (optional)
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls. (optional)
* returns BaseItemDtoQueryResult
* */
const getSimilarTrailers = ({ itemId, excludeArtistIds, userId, limit, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        excludeArtistIds,
        userId,
        limit,
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
* Get theme songs and videos for an item.
*
* itemId UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* inheritFromParent Boolean Optional. Determines whether or not parent items should be searched for theme media. (optional)
* returns AllThemeMediaResult
* */
const getThemeMedia = ({ itemId, userId, inheritFromParent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        userId,
        inheritFromParent,
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
* Get theme songs for an item.
*
* itemId UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* inheritFromParent Boolean Optional. Determines whether or not parent items should be searched for theme media. (optional)
* returns ThemeMediaResult
* */
const getThemeSongs = ({ itemId, userId, inheritFromParent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        userId,
        inheritFromParent,
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
* Get theme videos for an item.
*
* itemId UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* inheritFromParent Boolean Optional. Determines whether or not parent items should be searched for theme media. (optional)
* returns ThemeMediaResult
* */
const getThemeVideos = ({ itemId, userId, inheritFromParent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        userId,
        inheritFromParent,
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
* Reports that new movies have been added by an external source.
*
* tmdbId String The tmdbId. (optional)
* imdbId String The imdbId. (optional)
* no response value expected for this operation
* */
const postAddedMovies = ({ tmdbId, imdbId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tmdbId,
        imdbId,
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
* Reports that new episodes of a series have been added by an external source.
*
* tvdbId String The tvdbId. (optional)
* no response value expected for this operation
* */
const postAddedSeries = ({ tvdbId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tvdbId,
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
* Reports that new movies have been added by an external source.
*
* mediaUpdateInfoDto List A list of updated media paths.
* no response value expected for this operation
* */
const postUpdatedMedia = ({ mediaUpdateInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaUpdateInfoDto,
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
* Reports that new movies have been added by an external source.
*
* tmdbId String The tmdbId. (optional)
* imdbId String The imdbId. (optional)
* no response value expected for this operation
* */
const postUpdatedMovies = ({ tmdbId, imdbId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tmdbId,
        imdbId,
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
* Reports that new episodes of a series have been added by an external source.
*
* tvdbId String The tvdbId. (optional)
* no response value expected for this operation
* */
const postUpdatedSeries = ({ tvdbId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tvdbId,
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
* Starts a library scan.
*
* no response value expected for this operation
* */
const refreshLibrary = () => new Promise(
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

module.exports = {
  deleteItem,
  deleteItems,
  getAncestors,
  getCriticReviews,
  getDownload,
  getFile,
  getItemCounts,
  getLibraryOptionsInfo,
  getMediaFolders,
  getPhysicalPaths,
  getSimilarAlbums,
  getSimilarArtists,
  getSimilarItems,
  getSimilarMovies,
  getSimilarShows,
  getSimilarTrailers,
  getThemeMedia,
  getThemeSongs,
  getThemeVideos,
  postAddedMovies,
  postAddedSeries,
  postUpdatedMedia,
  postUpdatedMovies,
  postUpdatedSeries,
  refreshLibrary,
};
