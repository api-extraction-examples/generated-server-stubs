import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.broadcasts_response import BroadcastsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def broadcasts_get(x_api_key, offset=None, limit=None, service_id=None, _date=None, sort=None):  # noqa: E501
    """Broadcasts

    All broadcasts  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param service_id: Filter by Service ID. E.g. bbc_radio_fourfm
    :type service_id: str
    :param _date: Filter by date. E.g. 2016-06-17
    :type _date: str
    :param sort: Sort by provided query. E.g. &#39;start_at&#39; sorts in ascending order, and &#39;-start_at&#39; sorts in descending order
    :type sort: str

    :rtype: Union[BroadcastsResponse, Tuple[BroadcastsResponse, int], Tuple[BroadcastsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def broadcasts_latest_get(x_api_key, offset=None, limit=None, service_id=None, on_air=None, next=None, previous=None, sort=None):  # noqa: E501
    """Latest Broadcasts

    Broadcasts for the current day  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param service_id: Filter by Service ID. E.g. bbc_radio_fourfm
    :type service_id: str
    :param on_air: Filter what is on air. E.g. &#39;now&#39; returns current programme being broadcasted.
    :type on_air: str
    :param next: Filter what will be on air next in minutes. E.g. &#39;240&#39; returns programmes broadcasted in the next four hurs
    :type next: str
    :param previous: Filter what was on air previously in minutes. E.g. &#39;240&#39; returns programmes broadcasted in the previous four hurs
    :type previous: str
    :param sort: Sort by provided query. E.g. &#39;start_at&#39; sorts in ascending order, and &#39;-start_at&#39; sorts in descending order
    :type sort: str

    :rtype: Union[BroadcastsResponse, Tuple[BroadcastsResponse, int], Tuple[BroadcastsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_broadcast_by_pid(x_api_key, pid):  # noqa: E501
    """Broadcasts by PID

    Find broadcast by PID  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param pid: pid
    :type pid: str

    :rtype: Union[BroadcastsResponse, Tuple[BroadcastsResponse, int], Tuple[BroadcastsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
