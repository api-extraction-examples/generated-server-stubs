/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Finds movies and trailers similar to a given trailer.
*
* userId UUID The user id. (optional)
* maxOfficialRating String Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
* hasThemeSong Boolean Optional filter by items with theme songs. (optional)
* hasThemeVideo Boolean Optional filter by items with theme videos. (optional)
* hasSubtitles Boolean Optional filter by items with subtitles. (optional)
* hasSpecialFeature Boolean Optional filter by items with special features. (optional)
* hasTrailer Boolean Optional filter by items with trailers. (optional)
* adjacentTo String Optional. Return items that are siblings of a supplied item. (optional)
* parentIndexNumber Integer Optional filter by parent index number. (optional)
* hasParentalRating Boolean Optional filter by items that have or do not have a parental rating. (optional)
* isHd Boolean Optional filter by items that are HD or not. (optional)
* is4K Boolean Optional filter by items that are 4K or not. (optional)
* locationTypes List Optional. If specified, results will be filtered based on LocationType. This allows multiple, comma delimited. (optional)
* excludeLocationTypes List Optional. If specified, results will be filtered based on the LocationType. This allows multiple, comma delimited. (optional)
* isMissing Boolean Optional filter by items that are missing episodes or not. (optional)
* isUnaired Boolean Optional filter by items that are unaired episodes or not. (optional)
* minCommunityRating Double Optional filter by minimum community rating. (optional)
* minCriticRating Double Optional filter by minimum critic rating. (optional)
* minPremiereDate Date Optional. The minimum premiere date. Format = ISO. (optional)
* minDateLastSaved Date Optional. The minimum last saved date. Format = ISO. (optional)
* minDateLastSavedForUser Date Optional. The minimum last saved date for the current user. Format = ISO. (optional)
* maxPremiereDate Date Optional. The maximum premiere date. Format = ISO. (optional)
* hasOverview Boolean Optional filter by items that have an overview or not. (optional)
* hasImdbId Boolean Optional filter by items that have an imdb id or not. (optional)
* hasTmdbId Boolean Optional filter by items that have a tmdb id or not. (optional)
* hasTvdbId Boolean Optional filter by items that have a tvdb id or not. (optional)
* excludeItemIds List Optional. If specified, results will be filtered by excluding item ids. This allows multiple, comma delimited. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* recursive Boolean When searching within folders, this determines whether or not the search will be recursive. true/false. (optional)
* searchTerm String Optional. Filter based on a search term. (optional)
* sortOrder String Sort Order - Ascending,Descending. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines. (optional)
* excludeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* filters List Optional. Specify additional filters to apply. This allows multiple, comma delimited. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes. (optional)
* isFavorite Boolean Optional filter by items that are marked as favorite, or not. (optional)
* mediaTypes List Optional filter by MediaType. Allows multiple, comma delimited. (optional)
* imageTypes List Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
* sortBy String Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime. (optional)
* isPlayed Boolean Optional filter by items that are played, or not. (optional)
* genres List Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimited. (optional)
* officialRatings List Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimited. (optional)
* tags List Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimited. (optional)
* years List Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimited. (optional)
* enableUserData Boolean Optional, include user data. (optional)
* imageTypeLimit Integer Optional, the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* person String Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
* personIds List Optional. If specified, results will be filtered to include only those containing the specified person id. (optional)
* personTypes List Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited. (optional)
* studios List Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimited. (optional)
* artists List Optional. If specified, results will be filtered based on artists. This allows multiple, pipe delimited. (optional)
* excludeArtistIds List Optional. If specified, results will be filtered based on artist id. This allows multiple, pipe delimited. (optional)
* artistIds List Optional. If specified, results will be filtered to include only those containing the specified artist id. (optional)
* albumArtistIds List Optional. If specified, results will be filtered to include only those containing the specified album artist id. (optional)
* contributingArtistIds List Optional. If specified, results will be filtered to include only those containing the specified contributing artist id. (optional)
* albums List Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimited. (optional)
* albumIds List Optional. If specified, results will be filtered based on album id. This allows multiple, pipe delimited. (optional)
* ids List Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited. (optional)
* videoTypes List Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimited. (optional)
* minOfficialRating String Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
* isLocked Boolean Optional filter by items that are locked. (optional)
* isPlaceHolder Boolean Optional filter by items that are placeholders. (optional)
* hasOfficialRating Boolean Optional filter by items that have official ratings. (optional)
* collapseBoxSetItems Boolean Whether or not to hide items behind their boxsets. (optional)
* minWidth Integer Optional. Filter by the minimum width of the item. (optional)
* minHeight Integer Optional. Filter by the minimum height of the item. (optional)
* maxWidth Integer Optional. Filter by the maximum width of the item. (optional)
* maxHeight Integer Optional. Filter by the maximum height of the item. (optional)
* is3D Boolean Optional filter by items that are 3D, or not. (optional)
* seriesStatus List Optional filter by Series Status. Allows multiple, comma delimited. (optional)
* nameStartsWithOrGreater String Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
* nameStartsWith String Optional filter by items whose name is sorted equally than a given input string. (optional)
* nameLessThan String Optional filter by items whose name is equally or lesser than a given input string. (optional)
* studioIds List Optional. If specified, results will be filtered based on studio id. This allows multiple, pipe delimited. (optional)
* genreIds List Optional. If specified, results will be filtered based on genre id. This allows multiple, pipe delimited. (optional)
* enableTotalRecordCount Boolean Optional. Enable the total record count. (optional)
* enableImages Boolean Optional, include image information in output. (optional)
* returns BaseItemDtoQueryResult
* */
const getTrailers = ({ userId, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, parentIndexNumber, hasParentalRating, isHd, is4K, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, filters, isFavorite, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, artists, excludeArtistIds, artistIds, albumArtistIds, contributingArtistIds, albums, albumIds, ids, videoTypes, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, collapseBoxSetItems, minWidth, minHeight, maxWidth, maxHeight, is3D, seriesStatus, nameStartsWithOrGreater, nameStartsWith, nameLessThan, studioIds, genreIds, enableTotalRecordCount, enableImages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        maxOfficialRating,
        hasThemeSong,
        hasThemeVideo,
        hasSubtitles,
        hasSpecialFeature,
        hasTrailer,
        adjacentTo,
        parentIndexNumber,
        hasParentalRating,
        isHd,
        is4K,
        locationTypes,
        excludeLocationTypes,
        isMissing,
        isUnaired,
        minCommunityRating,
        minCriticRating,
        minPremiereDate,
        minDateLastSaved,
        minDateLastSavedForUser,
        maxPremiereDate,
        hasOverview,
        hasImdbId,
        hasTmdbId,
        hasTvdbId,
        excludeItemIds,
        startIndex,
        limit,
        recursive,
        searchTerm,
        sortOrder,
        parentId,
        fields,
        excludeItemTypes,
        filters,
        isFavorite,
        mediaTypes,
        imageTypes,
        sortBy,
        isPlayed,
        genres,
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
        artists,
        excludeArtistIds,
        artistIds,
        albumArtistIds,
        contributingArtistIds,
        albums,
        albumIds,
        ids,
        videoTypes,
        minOfficialRating,
        isLocked,
        isPlaceHolder,
        hasOfficialRating,
        collapseBoxSetItems,
        minWidth,
        minHeight,
        maxWidth,
        maxHeight,
        is3D,
        seriesStatus,
        nameStartsWithOrGreater,
        nameStartsWith,
        nameLessThan,
        studioIds,
        genreIds,
        enableTotalRecordCount,
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
  getTrailers,
};
