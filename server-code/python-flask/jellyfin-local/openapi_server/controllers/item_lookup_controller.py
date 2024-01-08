import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.album_info_remote_search_query import AlbumInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.artist_info_remote_search_query import ArtistInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.book_info_remote_search_query import BookInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.box_set_info_remote_search_query import BoxSetInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.external_id_info import ExternalIdInfo  # noqa: E501
from openapi_server.models.movie_info_remote_search_query import MovieInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.music_video_info_remote_search_query import MusicVideoInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.person_lookup_info_remote_search_query import PersonLookupInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_search_result import RemoteSearchResult  # noqa: E501
from openapi_server.models.series_info_remote_search_query import SeriesInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.trailer_info_remote_search_query import TrailerInfoRemoteSearchQuery  # noqa: E501
from openapi_server import util


def apply_search_criteria(item_id, remote_search_result, replace_all_images=None):  # noqa: E501
    """Applies search criteria to an item and refreshes metadata.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param remote_search_result: The remote search result.
    :type remote_search_result: dict | bytes
    :param replace_all_images: Optional. Whether or not to replace all images. Default: True.
    :type replace_all_images: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remote_search_result = RemoteSearchResult.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_book_remote_search_results(book_info_remote_search_query):  # noqa: E501
    """Get book remote search.

     # noqa: E501

    :param book_info_remote_search_query: Remote search query.
    :type book_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        book_info_remote_search_query = BookInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_box_set_remote_search_results(box_set_info_remote_search_query):  # noqa: E501
    """Get box set remote search.

     # noqa: E501

    :param box_set_info_remote_search_query: Remote search query.
    :type box_set_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        box_set_info_remote_search_query = BoxSetInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_external_id_infos(item_id):  # noqa: E501
    """Get the item&#39;s external id info.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[List[ExternalIdInfo], Tuple[List[ExternalIdInfo], int], Tuple[List[ExternalIdInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_movie_remote_search_results(movie_info_remote_search_query):  # noqa: E501
    """Get movie remote search.

     # noqa: E501

    :param movie_info_remote_search_query: Remote search query.
    :type movie_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        movie_info_remote_search_query = MovieInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_music_album_remote_search_results(album_info_remote_search_query):  # noqa: E501
    """Get music album remote search.

     # noqa: E501

    :param album_info_remote_search_query: Remote search query.
    :type album_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        album_info_remote_search_query = AlbumInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_music_artist_remote_search_results(artist_info_remote_search_query):  # noqa: E501
    """Get music artist remote search.

     # noqa: E501

    :param artist_info_remote_search_query: Remote search query.
    :type artist_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        artist_info_remote_search_query = ArtistInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_music_video_remote_search_results(music_video_info_remote_search_query):  # noqa: E501
    """Get music video remote search.

     # noqa: E501

    :param music_video_info_remote_search_query: Remote search query.
    :type music_video_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        music_video_info_remote_search_query = MusicVideoInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_person_remote_search_results(person_lookup_info_remote_search_query):  # noqa: E501
    """Get person remote search.

     # noqa: E501

    :param person_lookup_info_remote_search_query: Remote search query.
    :type person_lookup_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        person_lookup_info_remote_search_query = PersonLookupInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_remote_search_image(image_url, provider_name):  # noqa: E501
    """Gets a remote image.

     # noqa: E501

    :param image_url: The image url.
    :type image_url: str
    :param provider_name: The provider name.
    :type provider_name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_series_remote_search_results(series_info_remote_search_query):  # noqa: E501
    """Get series remote search.

     # noqa: E501

    :param series_info_remote_search_query: Remote search query.
    :type series_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        series_info_remote_search_query = SeriesInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_trailer_remote_search_results(trailer_info_remote_search_query):  # noqa: E501
    """Get trailer remote search.

     # noqa: E501

    :param trailer_info_remote_search_query: Remote search query.
    :type trailer_info_remote_search_query: dict | bytes

    :rtype: Union[List[RemoteSearchResult], Tuple[List[RemoteSearchResult], int], Tuple[List[RemoteSearchResult], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        trailer_info_remote_search_query = TrailerInfoRemoteSearchQuery.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
