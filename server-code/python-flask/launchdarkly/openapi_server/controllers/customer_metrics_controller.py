import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.evaluation_usage_error import EvaluationUsageError  # noqa: E501
from openapi_server.models.events import Events  # noqa: E501
from openapi_server.models.mau import MAU  # noqa: E501
from openapi_server.models.ma_uby_category import MAUbyCategory  # noqa: E501
from openapi_server.models.stream import Stream  # noqa: E501
from openapi_server.models.stream_by_sdk import StreamBySDK  # noqa: E501
from openapi_server.models.stream_sdk_version import StreamSDKVersion  # noqa: E501
from openapi_server.models.stream_usage_error import StreamUsageError  # noqa: E501
from openapi_server.models.streams import Streams  # noqa: E501
from openapi_server.models.usage import Usage  # noqa: E501
from openapi_server.models.usage_error import UsageError  # noqa: E501
from openapi_server import util


def get_evaluations(env_id, flag_key):  # noqa: E501
    """Get events usage by event id and the feature flag key.

     # noqa: E501

    :param env_id: The environment id for the flag evaluations in question.
    :type env_id: str
    :param flag_key: The key of the flag we want metrics for.
    :type flag_key: str

    :rtype: Union[StreamSDKVersion, Tuple[StreamSDKVersion, int], Tuple[StreamSDKVersion, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_event(type):  # noqa: E501
    """Get events usage by event type.

     # noqa: E501

    :param type: The type of event we would like to track.
    :type type: str

    :rtype: Union[StreamSDKVersion, Tuple[StreamSDKVersion, int], Tuple[StreamSDKVersion, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_events():  # noqa: E501
    """Get events usage endpoints.

     # noqa: E501


    :rtype: Union[Events, Tuple[Events, int], Tuple[Events, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_mau():  # noqa: E501
    """Get monthly active user data.

     # noqa: E501


    :rtype: Union[MAU, Tuple[MAU, int], Tuple[MAU, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_mauby_category():  # noqa: E501
    """Get monthly active user data by category.

     # noqa: E501


    :rtype: Union[MAUbyCategory, Tuple[MAUbyCategory, int], Tuple[MAUbyCategory, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stream(source):  # noqa: E501
    """Get a stream endpoint and return timeseries data.

     # noqa: E501

    :param source: The source of where the stream comes from.
    :type source: str

    :rtype: Union[Stream, Tuple[Stream, int], Tuple[Stream, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stream_by_sdk(source):  # noqa: E501
    """Get a stream timeseries data by source show sdk version metadata.

     # noqa: E501

    :param source: The source of where the stream comes from.
    :type source: str

    :rtype: Union[StreamBySDK, Tuple[StreamBySDK, int], Tuple[StreamBySDK, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stream_sdk_version(source):  # noqa: E501
    """Get a stream timeseries data by source and show all sdk version associated.

     # noqa: E501

    :param source: The source of where the stream comes from.
    :type source: str

    :rtype: Union[StreamSDKVersion, Tuple[StreamSDKVersion, int], Tuple[StreamSDKVersion, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_streams():  # noqa: E501
    """Returns a list of all streams.

     # noqa: E501


    :rtype: Union[Streams, Tuple[Streams, int], Tuple[Streams, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_usage():  # noqa: E501
    """Returns of the usage endpoints available.

     # noqa: E501


    :rtype: Union[Usage, Tuple[Usage, int], Tuple[Usage, int, Dict[str, str]]
    """
    return 'do some magic!'
