import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.podcast_episodes_response import PodcastEpisodesResponse  # noqa: E501
from openapi_server.models.podcast_error_response import PodcastErrorResponse  # noqa: E501
from openapi_server.models.podcasts_featured_response import PodcastsFeaturedResponse  # noqa: E501
from openapi_server.models.podcasts_response import PodcastsResponse  # noqa: E501
from openapi_server import util


def get_podcast_by_pid(x_api_key, pid, offset=None, limit=None):  # noqa: E501
    """Podcast

    Retrieve data about the podcast with the supplied PID  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param pid: pid
    :type pid: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PodcastsResponse, Tuple[PodcastsResponse, int], Tuple[PodcastsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_podcast_episodes(x_api_key, pid, offset=None, limit=None):  # noqa: E501
    """Podcast Episodes

    Retrieve all episodes for a specific podcast  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param pid: pid
    :type pid: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PodcastEpisodesResponse, Tuple[PodcastEpisodesResponse, int], Tuple[PodcastEpisodesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_podcasts(x_api_key, offset=None, limit=None, sort=None, network=None, network_url_key=None, category=None, q=None, coverage=None):  # noqa: E501
    """All Podcasts

    Retrieve all Podcasts  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param sort: Sort order for Podcasts results
    :type sort: str
    :param network: Network Master Brand ID (mid)
    :type network: str
    :param network_url_key: Network URL key
    :type network_url_key: str
    :param category: Category ID
    :type category: str
    :param q: Search query String
    :type q: str
    :param coverage: Local, National or Regional Coverage
    :type coverage: str

    :rtype: Union[PodcastsResponse, Tuple[PodcastsResponse, int], Tuple[PodcastsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_podcasts_featured(x_api_key):  # noqa: E501
    """Featured Podcasts

    Retrieve featured podcasts  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str

    :rtype: Union[PodcastsFeaturedResponse, Tuple[PodcastsFeaturedResponse, int], Tuple[PodcastsFeaturedResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
