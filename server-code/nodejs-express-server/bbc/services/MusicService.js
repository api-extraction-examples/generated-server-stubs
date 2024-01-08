/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Favourite Track or Clip
* Delete track or clip from a BBC Music user favourites. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music favourite types: Clips or Tracks
* id String Clip PID or Track ID
* returns PersonalisedMusicSuccess
* */
const deletePersonalisedMusicFavouritesByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
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
* Followed Network, Category, Artist, Playlist and Genre
* Remove a single network, category, artist, playlist, network, genre or service entity is in a users follows 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music follows types: Playlists, Services, Genres & Artists
* id String Playlists, Services, Networks, Genres, Categories or Artists ID
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicSuccess
* */
const deletePersonalisedMusicFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
* Single Artist Popularity
* Popularity Artist By Id 
*
* xAPIKey String API_KEY
* id String MusicBrainz Id - Used to get single resource score
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* returns MusicPopularityArtists
* */
const getMusicPopularArtistById = ({ xAPIKey, id, since, until, decomposed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        id,
        since,
        until,
        decomposed,
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
* Popular Artists
* List of Most Popular artists from BBC Music. 
*
* xAPIKey String API_KEY
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns MusicPopularityArtists
* */
const getMusicPopularArtists = ({ xAPIKey, since, until, decomposed, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        since,
        until,
        decomposed,
        offset,
        limit,
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
* Single Playlist Popularity
* Popular playlist by Id 
*
* xAPIKey String API_KEY
* id String BBC Music Playlist Id - Used to get single resource score
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* returns MusicPopularityPlaylists
* */
const getMusicPopularPlaylistById = ({ xAPIKey, id, since, until, decomposed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        id,
        since,
        until,
        decomposed,
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
* Popular Playlists
* List of Most Popular playlists from BBC Music. 
*
* xAPIKey String API_KEY
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns MusicPopularityPlaylists
* */
const getMusicPopularPlaylists = ({ xAPIKey, since, until, decomposed, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        since,
        until,
        decomposed,
        offset,
        limit,
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
* Single Track Popularity
* Popular Track for BBC Music 
*
* xAPIKey String API_KEY
* id String BBC Music Track Id - Used to get single resource score
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* network String Return items with given Network ID (optional)
* programme String Items with given Programme Pid (optional)
* artist String MusicBrainz artist ID (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* returns MusicPopularityTracks
* */
const getMusicPopularTrackById = ({ xAPIKey, id, since, until, network, programme, artist, decomposed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        id,
        since,
        until,
        network,
        programme,
        artist,
        decomposed,
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
* Popular Tracks
* List of popular tracks for BBC Music. Filter by time, network, artist, playlist or programme. 
*
* xAPIKey String API_KEY
* since String ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now (optional)
* until String ISO 8601 Date yyyy-mm-dd.  Returns items between given 'since' and 'until' date params (optional)
* network String Return items with given Network ID (optional)
* programme String Items with given Programme Pid (optional)
* artist String MusicBrainz artist ID (optional)
* decomposed Boolean In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is >= 31 days (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns MusicPopularityTracks
* */
const getMusicPopularTracks = ({ xAPIKey, since, until, network, programme, artist, decomposed, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        since,
        until,
        network,
        programme,
        artist,
        decomposed,
        offset,
        limit,
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
* Favourite Tracks or Clips
* List of favourited tracks and clips for a given user for BBC Music. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* action String Filters activities based on the type of action (optional)
* musicData Boolean Omits music data from the response, defaults to true (optional)
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFavourites = ({ authorization, xAuthenticationProvider, xAPIKey, offset, limit, action, musicData }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        offset,
        limit,
        action,
        musicData,
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
* Favourite Tracks or Clips by Type
* List of favourited tracks or clips for a given user for BBC Music. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music favourite types: Clips or Tracks
* action String Filters activities based on the type of action (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFavouritesByType = ({ authorization, xAuthenticationProvider, xAPIKey, type, action, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        action,
        offset,
        limit,
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
* Favourite Track or Clip
* Check to see if a single track or clip entity is in a users favourites - determines UX of add button. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music favourite types: Clips or Tracks
* id String Clip PID or Track ID
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFavouritesByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
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
* Followed Networks, Categories, Artists, Playlists and Genres
* List of followed networks, categories, artists, playlists and genres for a given user for BBC Music. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* action String Filters activities based on the type of action (optional)
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFollows = ({ authorization, xAuthenticationProvider, xAPIKey, action, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        action,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
        offset,
        limit,
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
* Followed Networks, Categories, Artists, Playlists and Genres by Type
* List of followed networks, categories, artists, playlists, networks, genres, categories or services for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music follows types: Playlists, Services, Genres & Artists
* action String Filters activities based on the type of action (optional)
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFollowsByType = ({ authorization, xAuthenticationProvider, xAPIKey, type, action, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        action,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
        offset,
        limit,
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
* Followed Network, Category, Artist, Playlist and Genre
* Check to see if a single network, category, artist, playlist, network, genre or service entity is in a users follows - determines UX of add button. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music follows types: Playlists, Services, Genres & Artists
* id String Playlists, Services, Networks, Genres, Categories or Artists ID
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicResponse
* */
const getPersonalisedMusicFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
* Favourite Tracks or Clips
* Add multiple tracks and/or clips to a BBC Music user's favourites.  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action favourited or unfavourited
* returns PersonalisedMusicResponse
* */
const postPersonalisedMusicFavouritesBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        body,
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
* Favourite Track or Clip
* Add track or clip to a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music favourite types: Clips or Tracks
* id String Clip PID or Track ID
* body PersonalisedMusicRequest Action favourited or unfavourited
* returns PersonalisedMusicResponse
* */
const postPersonalisedMusicFavouritesByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        body,
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
* Followed Networks, Categories, Artists, Playlists and Genres
* Add networks, categories, artists, playlists, networks, genres or services in a users follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action followed or unfollowed
* action String Filters activities based on the type of action (optional)
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicSuccess
* */
const postPersonalisedMusicFollowsBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body, action, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        body,
        action,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
* Followed Network, Category, Artist, Playlist and Genre
* Add a single network, category, artist, playlist, network, genre or service entity is in a users follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music follows types: Playlists, Services, Genres & Artists
* id String Playlists, Services, Networks, Genres, Categories or Artists ID
* body PersonalisedMusicRequest Action followed or unfollowed
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicSuccess
* */
const postPersonalisedMusicFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, body, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        body,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
* Favourite Tracks or Clips
* Update tracks or clips from a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action favourited or unfavourited
* returns PersonalisedMusicSuccess
* */
const putPersonalisedMusicFavouritesBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        body,
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
* Favourite Track or Clip
* Update tracks or clips from a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music favourite types: Clips or Tracks
* id String Clip PID or Track ID
* body PersonalisedMusicRequest Action favourited or unfavourited
* returns PersonalisedMusicSuccess
* */
const putPersonalisedMusicFavouritesByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        body,
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
* Followed Networks, Categories, Artists, Playlists and Genres
* Update networks, categories, artists, playlists, networks, genres or services in a users follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action followed or unfollowed
* action String Filters activities based on the type of action (optional)
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicSuccess
* */
const putPersonalisedMusicFollowsBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body, action, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        body,
        action,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
* Followed Network, Category, Artist, Playlist and Genre
* Update a single network, category, artist, playlist, network, genre or service entity is in a users follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Music follows types: Playlists, Services, Genres & Artists
* id String Playlists, Services, Networks, Genres, Categories or Artists ID
* body PersonalisedMusicRequest Action followed or unfollowed
* musicData Boolean Omits music data from the response, defaults to true (optional)
* musicUnderscorecontext String Specify context to be passed to Music API (optional)
* musicUnderscorewithinUnderscoreuk Boolean Specify location to be passed to Music API (optional)
* returns PersonalisedMusicSuccess
* */
const putPersonalisedMusicFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, id, body, musicData, musicUnderscorecontext, musicUnderscorewithinUnderscoreuk }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        id,
        body,
        musicData,
        musicUnderscorecontext,
        musicUnderscorewithinUnderscoreuk,
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
  deletePersonalisedMusicFavouritesByTypeById,
  deletePersonalisedMusicFollowsByTypeById,
  getMusicPopularArtistById,
  getMusicPopularArtists,
  getMusicPopularPlaylistById,
  getMusicPopularPlaylists,
  getMusicPopularTrackById,
  getMusicPopularTracks,
  getPersonalisedMusicFavourites,
  getPersonalisedMusicFavouritesByType,
  getPersonalisedMusicFavouritesByTypeById,
  getPersonalisedMusicFollows,
  getPersonalisedMusicFollowsByType,
  getPersonalisedMusicFollowsByTypeById,
  postPersonalisedMusicFavouritesBatch,
  postPersonalisedMusicFavouritesByTypeById,
  postPersonalisedMusicFollowsBatch,
  postPersonalisedMusicFollowsByTypeById,
  putPersonalisedMusicFavouritesBatch,
  putPersonalisedMusicFavouritesByTypeById,
  putPersonalisedMusicFollowsBatch,
  putPersonalisedMusicFollowsByTypeById,
};
