import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.game_center_enabled_version_compatible_versions_linkages_request import GameCenterEnabledVersionCompatibleVersionsLinkagesRequest  # noqa: E501
from openapi_server.models.game_center_enabled_version_compatible_versions_linkages_response import GameCenterEnabledVersionCompatibleVersionsLinkagesResponse  # noqa: E501
from openapi_server.models.game_center_enabled_versions_response import GameCenterEnabledVersionsResponse  # noqa: E501
from openapi_server import util


def game_center_enabled_versions_compatible_versions_create_to_many_relationship(id, game_center_enabled_version_compatible_versions_linkages_request):  # noqa: E501
    """game_center_enabled_versions_compatible_versions_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param game_center_enabled_version_compatible_versions_linkages_request: List of related linkages
    :type game_center_enabled_version_compatible_versions_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        game_center_enabled_version_compatible_versions_linkages_request = GameCenterEnabledVersionCompatibleVersionsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def game_center_enabled_versions_compatible_versions_delete_to_many_relationship(id, game_center_enabled_version_compatible_versions_linkages_request):  # noqa: E501
    """game_center_enabled_versions_compatible_versions_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param game_center_enabled_version_compatible_versions_linkages_request: List of related linkages
    :type game_center_enabled_version_compatible_versions_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        game_center_enabled_version_compatible_versions_linkages_request = GameCenterEnabledVersionCompatibleVersionsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def game_center_enabled_versions_compatible_versions_get_to_many_related(id, filter_platform=None, filter_version_string=None, filter_app=None, filter_id=None, sort=None, fields_game_center_enabled_versions=None, fields_apps=None, limit=None, include=None):  # noqa: E501
    """game_center_enabled_versions_compatible_versions_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]
    :param filter_version_string: filter by attribute &#39;versionString&#39;
    :type filter_version_string: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_game_center_enabled_versions: the fields to include for returned resources of type gameCenterEnabledVersions
    :type fields_game_center_enabled_versions: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[GameCenterEnabledVersionsResponse, Tuple[GameCenterEnabledVersionsResponse, int], Tuple[GameCenterEnabledVersionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def game_center_enabled_versions_compatible_versions_get_to_many_relationship(id, limit=None):  # noqa: E501
    """game_center_enabled_versions_compatible_versions_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[GameCenterEnabledVersionCompatibleVersionsLinkagesResponse, Tuple[GameCenterEnabledVersionCompatibleVersionsLinkagesResponse, int], Tuple[GameCenterEnabledVersionCompatibleVersionsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def game_center_enabled_versions_compatible_versions_replace_to_many_relationship(id, game_center_enabled_version_compatible_versions_linkages_request):  # noqa: E501
    """game_center_enabled_versions_compatible_versions_replace_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param game_center_enabled_version_compatible_versions_linkages_request: List of related linkages
    :type game_center_enabled_version_compatible_versions_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        game_center_enabled_version_compatible_versions_linkages_request = GameCenterEnabledVersionCompatibleVersionsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
