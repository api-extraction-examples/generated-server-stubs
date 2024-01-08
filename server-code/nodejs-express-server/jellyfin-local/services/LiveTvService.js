/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Adds a listings provider.
*
* pw String Password. (optional)
* validateListings Boolean Validate listings. (optional)
* validateLogin Boolean Validate login. (optional)
* listingsProviderInfo ListingsProviderInfo New listings info. (optional)
* returns ListingsProviderInfo
* */
const addListingProvider = ({ pw, validateListings, validateLogin, listingsProviderInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pw,
        validateListings,
        validateLogin,
        listingsProviderInfo,
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
* Adds a tuner host.
*
* tunerHostInfo TunerHostInfo New tuner host. (optional)
* returns TunerHostInfo
* */
const addTunerHost = ({ tunerHostInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tunerHostInfo,
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
* Cancels a live tv series timer.
*
* timerId String Timer id.
* no response value expected for this operation
* */
const cancelSeriesTimer = ({ timerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
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
* Cancels a live tv timer.
*
* timerId String Timer id.
* no response value expected for this operation
* */
const cancelTimer = ({ timerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
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
* Creates a live tv series timer.
*
* seriesTimerInfoDto SeriesTimerInfoDto New series timer info. (optional)
* no response value expected for this operation
* */
const createSeriesTimer = ({ seriesTimerInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seriesTimerInfoDto,
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
* Creates a live tv timer.
*
* timerInfoDto TimerInfoDto New timer info. (optional)
* no response value expected for this operation
* */
const createTimer = ({ timerInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerInfoDto,
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
* Delete listing provider.
*
* id String Listing provider id. (optional)
* no response value expected for this operation
* */
const deleteListingProvider = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Deletes a live tv recording.
*
* recordingId UUID Recording id.
* no response value expected for this operation
* */
const deleteRecording = ({ recordingId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        recordingId,
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
* Deletes a tuner host.
*
* id String Tuner host id. (optional)
* no response value expected for this operation
* */
const deleteTunerHost = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Discover tuners.
*
* newDevicesOnly Boolean Only discover new tuners. (optional)
* returns List
* */
const discoverTuners = ({ newDevicesOnly }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        newDevicesOnly,
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
* Discover tuners.
*
* newDevicesOnly Boolean Only discover new tuners. (optional)
* returns List
* */
const discvoverTuners = ({ newDevicesOnly }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        newDevicesOnly,
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
* Gets a live tv channel.
*
* channelId UUID Channel id.
* userId UUID Optional. Attach user data. (optional)
* returns BaseItemDto
* */
const getChannel = ({ channelId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
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
* Get channel mapping options.
*
* providerId String Provider id. (optional)
* returns ChannelMappingOptionsDto
* */
const getChannelMappingOptions = ({ providerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        providerId,
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
* Gets default listings provider info.
*
* returns ListingsProviderInfo
* */
const getDefaultListingProvider = () => new Promise(
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
* Gets the default values for a new timer.
*
* programId String Optional. To attach default values based on a program. (optional)
* returns SeriesTimerInfoDto
* */
const getDefaultTimer = ({ programId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        programId,
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
* Get guid info.
*
* returns GuideInfo
* */
const getGuideInfo = () => new Promise(
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
* Gets available lineups.
*
* id String Provider id. (optional)
* type String Provider type. (optional)
* location String Location. (optional)
* country String Country. (optional)
* returns List
* */
const getLineups = ({ id, type, location, country }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        type,
        location,
        country,
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
* Gets a live tv recording stream.
*
* recordingId String Recording id.
* returns File
* */
const getLiveRecordingFile = ({ recordingId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        recordingId,
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
* Gets a live tv channel stream.
*
* streamId String Stream id.
* container String Container type.
* returns File
* */
const getLiveStreamFile = ({ streamId, container }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        streamId,
        container,
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
* Gets available live tv channels.
*
* type ChannelType Optional. Filter by channel type. (optional)
* userId UUID Optional. Filter by user and attach user data. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* isMovie Boolean Optional. Filter for movies. (optional)
* isSeries Boolean Optional. Filter for series. (optional)
* isNews Boolean Optional. Filter for news. (optional)
* isKids Boolean Optional. Filter for kids. (optional)
* isSports Boolean Optional. Filter for sports. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* isFavorite Boolean Optional. Filter by channels that are favorites, or not. (optional)
* isLiked Boolean Optional. Filter by channels that are liked, or not. (optional)
* isDisliked Boolean Optional. Filter by channels that are disliked, or not. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List \"Optional. The image types to include in the output. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* sortBy List Optional. Key to sort by. (optional)
* sortOrder SortOrder Optional. Sort order. (optional)
* enableFavoriteSorting Boolean Optional. Incorporate favorite and like status into channel sorting. (optional)
* addCurrentProgram Boolean Optional. Adds current program info to each channel. (optional)
* returns BaseItemDtoQueryResult
* */
const getLiveTvChannels = ({ type, userId, startIndex, isMovie, isSeries, isNews, isKids, isSports, limit, isFavorite, isLiked, isDisliked, enableImages, imageTypeLimit, enableImageTypes, fields, enableUserData, sortBy, sortOrder, enableFavoriteSorting, addCurrentProgram }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        userId,
        startIndex,
        isMovie,
        isSeries,
        isNews,
        isKids,
        isSports,
        limit,
        isFavorite,
        isLiked,
        isDisliked,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        fields,
        enableUserData,
        sortBy,
        sortOrder,
        enableFavoriteSorting,
        addCurrentProgram,
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
* Gets available live tv services.
*
* returns LiveTvInfo
* */
const getLiveTvInfo = () => new Promise(
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
* Gets available live tv epgs.
*
* channelIds List The channels to return guide information for. (optional)
* userId UUID Optional. Filter by user id. (optional)
* minStartDate Date Optional. The minimum premiere start date. (optional)
* hasAired Boolean Optional. Filter by programs that have completed airing, or not. (optional)
* isAiring Boolean Optional. Filter by programs that are currently airing, or not. (optional)
* maxStartDate Date Optional. The maximum premiere start date. (optional)
* minEndDate Date Optional. The minimum premiere end date. (optional)
* maxEndDate Date Optional. The maximum premiere end date. (optional)
* isMovie Boolean Optional. Filter for movies. (optional)
* isSeries Boolean Optional. Filter for series. (optional)
* isNews Boolean Optional. Filter for news. (optional)
* isKids Boolean Optional. Filter for kids. (optional)
* isSports Boolean Optional. Filter for sports. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* sortBy String Optional. Specify one or more sort orders, comma delimited. Options: Name, StartDate. (optional)
* sortOrder String Sort Order - Ascending,Descending. (optional)
* genres List The genres to return guide information for. (optional)
* genreIds List The genre ids to return guide information for. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* seriesTimerId String Optional. Filter by series timer id. (optional)
* librarySeriesId UUID Optional. Filter by library series id. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableTotalRecordCount Boolean Retrieve total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getLiveTvPrograms = ({ channelIds, userId, minStartDate, hasAired, isAiring, maxStartDate, minEndDate, maxEndDate, isMovie, isSeries, isNews, isKids, isSports, startIndex, limit, sortBy, sortOrder, genres, genreIds, enableImages, imageTypeLimit, enableImageTypes, enableUserData, seriesTimerId, librarySeriesId, fields, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelIds,
        userId,
        minStartDate,
        hasAired,
        isAiring,
        maxStartDate,
        minEndDate,
        maxEndDate,
        isMovie,
        isSeries,
        isNews,
        isKids,
        isSports,
        startIndex,
        limit,
        sortBy,
        sortOrder,
        genres,
        genreIds,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
        seriesTimerId,
        librarySeriesId,
        fields,
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
* Gets a live tv program.
*
* programId String Program id.
* userId UUID Optional. Attach user data. (optional)
* returns BaseItemDto
* */
const getProgram = ({ programId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        programId,
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
* Gets available live tv epgs.
*
* getProgramsDto GetProgramsDto Request body. (optional)
* returns BaseItemDtoQueryResult
* */
const getPrograms = ({ getProgramsDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        getProgramsDto,
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
* Gets recommended live tv epgs.
*
* userId UUID Optional. filter by user id. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* isAiring Boolean Optional. Filter by programs that are currently airing, or not. (optional)
* hasAired Boolean Optional. Filter by programs that have completed airing, or not. (optional)
* isSeries Boolean Optional. Filter for series. (optional)
* isMovie Boolean Optional. Filter for movies. (optional)
* isNews Boolean Optional. Filter for news. (optional)
* isKids Boolean Optional. Filter for kids. (optional)
* isSports Boolean Optional. Filter for sports. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* genreIds List The genres to return guide information for. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableUserData Boolean Optional. include user data. (optional)
* enableTotalRecordCount Boolean Retrieve total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getRecommendedPrograms = ({ userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        limit,
        isAiring,
        hasAired,
        isSeries,
        isMovie,
        isNews,
        isKids,
        isSports,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        genreIds,
        fields,
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
* Gets a live tv recording.
*
* recordingId UUID Recording id.
* userId UUID Optional. Attach user data. (optional)
* returns BaseItemDto
* */
const getRecording = ({ recordingId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        recordingId,
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
* Gets recording folders.
*
* userId UUID Optional. Filter by user and attach user data. (optional)
* returns BaseItemDtoQueryResult
* */
const getRecordingFolders = ({ userId }) => new Promise(
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
* Get recording group.
*
* groupId UUID Group id.
* no response value expected for this operation
* */
const getRecordingGroup = ({ groupId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupId,
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
* Gets live tv recording groups.
*
* userId UUID Optional. Filter by user and attach user data. (optional)
* returns BaseItemDtoQueryResult
* */
const getRecordingGroups = ({ userId }) => new Promise(
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
* Gets live tv recordings.
*
* channelId String Optional. Filter by channel id. (optional)
* userId UUID Optional. Filter by user and attach user data. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* status RecordingStatus Optional. Filter by recording status. (optional)
* isInProgress Boolean Optional. Filter by recordings that are in progress, or not. (optional)
* seriesTimerId String Optional. Filter by recordings belonging to a series timer. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* isMovie Boolean Optional. Filter for movies. (optional)
* isSeries Boolean Optional. Filter for series. (optional)
* isKids Boolean Optional. Filter for kids. (optional)
* isSports Boolean Optional. Filter for sports. (optional)
* isNews Boolean Optional. Filter for news. (optional)
* isLibraryItem Boolean Optional. Filter for is library item. (optional)
* enableTotalRecordCount Boolean Optional. Return total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getRecordings = ({ channelId, userId, startIndex, limit, status, isInProgress, seriesTimerId, enableImages, imageTypeLimit, enableImageTypes, fields, enableUserData, isMovie, isSeries, isKids, isSports, isNews, isLibraryItem, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
        userId,
        startIndex,
        limit,
        status,
        isInProgress,
        seriesTimerId,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        fields,
        enableUserData,
        isMovie,
        isSeries,
        isKids,
        isSports,
        isNews,
        isLibraryItem,
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
* Gets live tv recording series.
*
* channelId String Optional. Filter by channel id. (optional)
* userId UUID Optional. Filter by user and attach user data. (optional)
* groupId String Optional. Filter by recording group. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* status RecordingStatus Optional. Filter by recording status. (optional)
* isInProgress Boolean Optional. Filter by recordings that are in progress, or not. (optional)
* seriesTimerId String Optional. Filter by recordings belonging to a series timer. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* enableTotalRecordCount Boolean Optional. Return total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getRecordingsSeries = ({ channelId, userId, groupId, startIndex, limit, status, isInProgress, seriesTimerId, enableImages, imageTypeLimit, enableImageTypes, fields, enableUserData, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
        userId,
        groupId,
        startIndex,
        limit,
        status,
        isInProgress,
        seriesTimerId,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        fields,
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
* Gets available countries.
*
* returns File
* */
const getSchedulesDirectCountries = () => new Promise(
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
* Gets a live tv series timer.
*
* timerId String Timer id.
* returns SeriesTimerInfoDto
* */
const getSeriesTimer = ({ timerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
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
* Gets live tv series timers.
*
* sortBy String Optional. Sort by SortName or Priority. (optional)
* sortOrder SortOrder Optional. Sort in Ascending or Descending order. (optional)
* returns SeriesTimerInfoDtoQueryResult
* */
const getSeriesTimers = ({ sortBy, sortOrder }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sortBy,
        sortOrder,
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
* Gets a timer.
*
* timerId String Timer id.
* returns TimerInfoDto
* */
const getTimer = ({ timerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
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
* Gets the live tv timers.
*
* channelId String Optional. Filter by channel id. (optional)
* seriesTimerId String Optional. Filter by timers belonging to a series timer. (optional)
* isActive Boolean Optional. Filter by timers that are active. (optional)
* isScheduled Boolean Optional. Filter by timers that are scheduled. (optional)
* returns TimerInfoDtoQueryResult
* */
const getTimers = ({ channelId, seriesTimerId, isActive, isScheduled }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        channelId,
        seriesTimerId,
        isActive,
        isScheduled,
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
* Get tuner host types.
*
* returns List
* */
const getTunerHostTypes = () => new Promise(
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
* Resets a tv tuner.
*
* tunerId String Tuner id.
* no response value expected for this operation
* */
const resetTuner = ({ tunerId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tunerId,
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
* Set channel mappings.
*
* setChannelMappingDto SetChannelMappingDto The set channel mapping dto.
* returns TunerChannelMapping
* */
const setChannelMapping = ({ setChannelMappingDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setChannelMappingDto,
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
* Updates a live tv series timer.
*
* timerId String Timer id.
* seriesTimerInfoDto SeriesTimerInfoDto New series timer info. (optional)
* no response value expected for this operation
* */
const updateSeriesTimer = ({ timerId, seriesTimerInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
        seriesTimerInfoDto,
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
* Updates a live tv timer.
*
* timerId String Timer id.
* timerInfoDto TimerInfoDto New timer info. (optional)
* no response value expected for this operation
* */
const updateTimer = ({ timerId, timerInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timerId,
        timerInfoDto,
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
  addListingProvider,
  addTunerHost,
  cancelSeriesTimer,
  cancelTimer,
  createSeriesTimer,
  createTimer,
  deleteListingProvider,
  deleteRecording,
  deleteTunerHost,
  discoverTuners,
  discvoverTuners,
  getChannel,
  getChannelMappingOptions,
  getDefaultListingProvider,
  getDefaultTimer,
  getGuideInfo,
  getLineups,
  getLiveRecordingFile,
  getLiveStreamFile,
  getLiveTvChannels,
  getLiveTvInfo,
  getLiveTvPrograms,
  getProgram,
  getPrograms,
  getRecommendedPrograms,
  getRecording,
  getRecordingFolders,
  getRecordingGroup,
  getRecordingGroups,
  getRecordings,
  getRecordingsSeries,
  getSchedulesDirectCountries,
  getSeriesTimer,
  getSeriesTimers,
  getTimer,
  getTimers,
  getTunerHostTypes,
  resetTuner,
  setChannelMapping,
  updateSeriesTimer,
  updateTimer,
};
