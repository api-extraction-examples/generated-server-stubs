import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.all_theme_media_result import AllThemeMediaResult  # noqa: E501
from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.item_counts import ItemCounts  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.library_options_result_dto import LibraryOptionsResultDto  # noqa: E501
from openapi_server.models.media_update_info_dto import MediaUpdateInfoDto  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.theme_media_result import ThemeMediaResult  # noqa: E501
from openapi_server import util


def delete_item(item_id):  # noqa: E501
    """Deletes an item from the library and filesystem.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_items(ids=None):  # noqa: E501
    """Deletes items from the library and filesystem.

     # noqa: E501

    :param ids: The item ids.
    :type ids: List[str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ancestors(item_id, user_id=None):  # noqa: E501
    """Gets all parents of an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[List[BaseItemDto], Tuple[List[BaseItemDto], int], Tuple[List[BaseItemDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_critic_reviews(item_id):  # noqa: E501
    """Gets critic review for an item.

     # noqa: E501

    :param item_id: 
    :type item_id: str

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_download(item_id):  # noqa: E501
    """Downloads item media.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_file(item_id):  # noqa: E501
    """Get the original file of an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_item_counts(user_id=None, is_favorite=None):  # noqa: E501
    """Get item counts.

     # noqa: E501

    :param user_id: Optional. Get counts from a specific user&#39;s library.
    :type user_id: str
    :type user_id: str
    :param is_favorite: Optional. Get counts of favorite items.
    :type is_favorite: bool

    :rtype: Union[ItemCounts, Tuple[ItemCounts, int], Tuple[ItemCounts, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_library_options_info(library_content_type=None, is_new_library=None):  # noqa: E501
    """Gets the library options info.

     # noqa: E501

    :param library_content_type: Library content type.
    :type library_content_type: str
    :param is_new_library: Whether this is a new library.
    :type is_new_library: bool

    :rtype: Union[LibraryOptionsResultDto, Tuple[LibraryOptionsResultDto, int], Tuple[LibraryOptionsResultDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_media_folders(is_hidden=None):  # noqa: E501
    """Gets all user media folders.

     # noqa: E501

    :param is_hidden: Optional. Filter by folders that are marked hidden, or not.
    :type is_hidden: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_physical_paths():  # noqa: E501
    """Gets a list of physical paths from virtual folders.

     # noqa: E501


    :rtype: Union[List[str], Tuple[List[str], int], Tuple[List[str], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_similar_albums(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_similar_artists(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_similar_items(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_similar_movies(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_similar_shows(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_similar_trailers(item_id, exclude_artist_ids=None, user_id=None, limit=None, fields=None):  # noqa: E501
    """Gets similar items.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param exclude_artist_ids: Exclude artist ids.
    :type exclude_artist_ids: List[str]
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_theme_media(item_id, user_id=None, inherit_from_parent=None):  # noqa: E501
    """Get theme songs and videos for an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param inherit_from_parent: Optional. Determines whether or not parent items should be searched for theme media.
    :type inherit_from_parent: bool

    :rtype: Union[AllThemeMediaResult, Tuple[AllThemeMediaResult, int], Tuple[AllThemeMediaResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_theme_songs(item_id, user_id=None, inherit_from_parent=None):  # noqa: E501
    """Get theme songs for an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param inherit_from_parent: Optional. Determines whether or not parent items should be searched for theme media.
    :type inherit_from_parent: bool

    :rtype: Union[ThemeMediaResult, Tuple[ThemeMediaResult, int], Tuple[ThemeMediaResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_theme_videos(item_id, user_id=None, inherit_from_parent=None):  # noqa: E501
    """Get theme videos for an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param inherit_from_parent: Optional. Determines whether or not parent items should be searched for theme media.
    :type inherit_from_parent: bool

    :rtype: Union[ThemeMediaResult, Tuple[ThemeMediaResult, int], Tuple[ThemeMediaResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_added_movies(tmdb_id=None, imdb_id=None):  # noqa: E501
    """Reports that new movies have been added by an external source.

     # noqa: E501

    :param tmdb_id: The tmdbId.
    :type tmdb_id: str
    :param imdb_id: The imdbId.
    :type imdb_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_added_series(tvdb_id=None):  # noqa: E501
    """Reports that new episodes of a series have been added by an external source.

     # noqa: E501

    :param tvdb_id: The tvdbId.
    :type tvdb_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_updated_media(media_update_info_dto):  # noqa: E501
    """Reports that new movies have been added by an external source.

     # noqa: E501

    :param media_update_info_dto: A list of updated media paths.
    :type media_update_info_dto: list | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        media_update_info_dto = [MediaUpdateInfoDto.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_updated_movies(tmdb_id=None, imdb_id=None):  # noqa: E501
    """Reports that new movies have been added by an external source.

     # noqa: E501

    :param tmdb_id: The tmdbId.
    :type tmdb_id: str
    :param imdb_id: The imdbId.
    :type imdb_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_updated_series(tvdb_id=None):  # noqa: E501
    """Reports that new episodes of a series have been added by an external source.

     # noqa: E501

    :param tvdb_id: The tvdbId.
    :type tvdb_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def refresh_library():  # noqa: E501
    """Starts a library scan.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
