import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_group_beta_testers_linkages_request import BetaGroupBetaTestersLinkagesRequest  # noqa: E501
from openapi_server.models.beta_group_beta_testers_linkages_response import BetaGroupBetaTestersLinkagesResponse  # noqa: E501
from openapi_server.models.beta_group_builds_linkages_request import BetaGroupBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_group_builds_linkages_response import BetaGroupBuildsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_group_create_request import BetaGroupCreateRequest  # noqa: E501
from openapi_server.models.beta_group_response import BetaGroupResponse  # noqa: E501
from openapi_server.models.beta_group_update_request import BetaGroupUpdateRequest  # noqa: E501
from openapi_server.models.beta_groups_response import BetaGroupsResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_groups_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """beta_groups_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_beta_testers_create_to_many_relationship(id, beta_group_beta_testers_linkages_request):  # noqa: E501
    """beta_groups_beta_testers_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_group_beta_testers_linkages_request: List of related linkages
    :type beta_group_beta_testers_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_beta_testers_linkages_request = BetaGroupBetaTestersLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_groups_beta_testers_delete_to_many_relationship(id, beta_group_beta_testers_linkages_request):  # noqa: E501
    """beta_groups_beta_testers_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_group_beta_testers_linkages_request: List of related linkages
    :type beta_group_beta_testers_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_beta_testers_linkages_request = BetaGroupBetaTestersLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_groups_beta_testers_get_to_many_related(id, fields_beta_testers=None, limit=None):  # noqa: E501
    """beta_groups_beta_testers_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaTestersResponse, Tuple[BetaTestersResponse, int], Tuple[BetaTestersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_beta_testers_get_to_many_relationship(id, limit=None):  # noqa: E501
    """beta_groups_beta_testers_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaGroupBetaTestersLinkagesResponse, Tuple[BetaGroupBetaTestersLinkagesResponse, int], Tuple[BetaGroupBetaTestersLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_builds_create_to_many_relationship(id, beta_group_builds_linkages_request):  # noqa: E501
    """beta_groups_builds_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_group_builds_linkages_request: List of related linkages
    :type beta_group_builds_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_builds_linkages_request = BetaGroupBuildsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_groups_builds_delete_to_many_relationship(id, beta_group_builds_linkages_request):  # noqa: E501
    """beta_groups_builds_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_group_builds_linkages_request: List of related linkages
    :type beta_group_builds_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_builds_linkages_request = BetaGroupBuildsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_groups_builds_get_to_many_related(id, fields_builds=None, limit=None):  # noqa: E501
    """beta_groups_builds_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BuildsResponse, Tuple[BuildsResponse, int], Tuple[BuildsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_builds_get_to_many_relationship(id, limit=None):  # noqa: E501
    """beta_groups_builds_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaGroupBuildsLinkagesResponse, Tuple[BetaGroupBuildsLinkagesResponse, int], Tuple[BetaGroupBuildsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_create_instance(beta_group_create_request):  # noqa: E501
    """beta_groups_create_instance

     # noqa: E501

    :param beta_group_create_request: BetaGroup representation
    :type beta_group_create_request: dict | bytes

    :rtype: Union[BetaGroupResponse, Tuple[BetaGroupResponse, int], Tuple[BetaGroupResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_create_request = BetaGroupCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_groups_delete_instance(id):  # noqa: E501
    """beta_groups_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_get_collection(filter_is_internal_group=None, filter_name=None, filter_public_link=None, filter_public_link_enabled=None, filter_public_link_limit_enabled=None, filter_app=None, filter_builds=None, filter_id=None, sort=None, fields_beta_groups=None, limit=None, include=None, fields_builds=None, fields_beta_testers=None, fields_apps=None, limit_beta_testers=None, limit_builds=None):  # noqa: E501
    """beta_groups_get_collection

     # noqa: E501

    :param filter_is_internal_group: filter by attribute &#39;isInternalGroup&#39;
    :type filter_is_internal_group: List[str]
    :param filter_name: filter by attribute &#39;name&#39;
    :type filter_name: List[str]
    :param filter_public_link: filter by attribute &#39;publicLink&#39;
    :type filter_public_link: List[str]
    :param filter_public_link_enabled: filter by attribute &#39;publicLinkEnabled&#39;
    :type filter_public_link_enabled: List[str]
    :param filter_public_link_limit_enabled: filter by attribute &#39;publicLinkLimitEnabled&#39;
    :type filter_public_link_limit_enabled: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param filter_builds: filter by id(s) of related &#39;builds&#39;
    :type filter_builds: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_beta_groups: the fields to include for returned resources of type betaGroups
    :type fields_beta_groups: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_beta_testers: maximum number of related betaTesters returned (when they are included)
    :type limit_beta_testers: int
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[BetaGroupsResponse, Tuple[BetaGroupsResponse, int], Tuple[BetaGroupsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_get_instance(id, fields_beta_groups=None, include=None, fields_builds=None, fields_beta_testers=None, fields_apps=None, limit_beta_testers=None, limit_builds=None):  # noqa: E501
    """beta_groups_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_groups: the fields to include for returned resources of type betaGroups
    :type fields_beta_groups: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_beta_testers: maximum number of related betaTesters returned (when they are included)
    :type limit_beta_testers: int
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[BetaGroupResponse, Tuple[BetaGroupResponse, int], Tuple[BetaGroupResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_groups_update_instance(id, beta_group_update_request):  # noqa: E501
    """beta_groups_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_group_update_request: BetaGroup representation
    :type beta_group_update_request: dict | bytes

    :rtype: Union[BetaGroupResponse, Tuple[BetaGroupResponse, int], Tuple[BetaGroupResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_group_update_request = BetaGroupUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
