import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.beta_groups_response import BetaGroupsResponse  # noqa: E501
from openapi_server.models.beta_tester_apps_linkages_request import BetaTesterAppsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_apps_linkages_response import BetaTesterAppsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_beta_groups_linkages_request import BetaTesterBetaGroupsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_beta_groups_linkages_response import BetaTesterBetaGroupsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_builds_linkages_request import BetaTesterBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_builds_linkages_response import BetaTesterBuildsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_create_request import BetaTesterCreateRequest  # noqa: E501
from openapi_server.models.beta_tester_response import BetaTesterResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_testers_apps_delete_to_many_relationship(id, beta_tester_apps_linkages_request):  # noqa: E501
    """beta_testers_apps_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_tester_apps_linkages_request: List of related linkages
    :type beta_tester_apps_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_apps_linkages_request = BetaTesterAppsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_apps_get_to_many_related(id, fields_apps=None, limit=None):  # noqa: E501
    """beta_testers_apps_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppsResponse, Tuple[AppsResponse, int], Tuple[AppsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_apps_get_to_many_relationship(id, limit=None):  # noqa: E501
    """beta_testers_apps_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaTesterAppsLinkagesResponse, Tuple[BetaTesterAppsLinkagesResponse, int], Tuple[BetaTesterAppsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_beta_groups_create_to_many_relationship(id, beta_tester_beta_groups_linkages_request):  # noqa: E501
    """beta_testers_beta_groups_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_tester_beta_groups_linkages_request: List of related linkages
    :type beta_tester_beta_groups_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_beta_groups_linkages_request = BetaTesterBetaGroupsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_beta_groups_delete_to_many_relationship(id, beta_tester_beta_groups_linkages_request):  # noqa: E501
    """beta_testers_beta_groups_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_tester_beta_groups_linkages_request: List of related linkages
    :type beta_tester_beta_groups_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_beta_groups_linkages_request = BetaTesterBetaGroupsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_beta_groups_get_to_many_related(id, fields_beta_groups=None, limit=None):  # noqa: E501
    """beta_testers_beta_groups_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_groups: the fields to include for returned resources of type betaGroups
    :type fields_beta_groups: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaGroupsResponse, Tuple[BetaGroupsResponse, int], Tuple[BetaGroupsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_beta_groups_get_to_many_relationship(id, limit=None):  # noqa: E501
    """beta_testers_beta_groups_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaTesterBetaGroupsLinkagesResponse, Tuple[BetaTesterBetaGroupsLinkagesResponse, int], Tuple[BetaTesterBetaGroupsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_builds_create_to_many_relationship(id, beta_tester_builds_linkages_request):  # noqa: E501
    """beta_testers_builds_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_tester_builds_linkages_request: List of related linkages
    :type beta_tester_builds_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_builds_linkages_request = BetaTesterBuildsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_builds_delete_to_many_relationship(id, beta_tester_builds_linkages_request):  # noqa: E501
    """beta_testers_builds_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_tester_builds_linkages_request: List of related linkages
    :type beta_tester_builds_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_builds_linkages_request = BetaTesterBuildsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_builds_get_to_many_related(id, fields_builds=None, limit=None):  # noqa: E501
    """beta_testers_builds_get_to_many_related

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


def beta_testers_builds_get_to_many_relationship(id, limit=None):  # noqa: E501
    """beta_testers_builds_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaTesterBuildsLinkagesResponse, Tuple[BetaTesterBuildsLinkagesResponse, int], Tuple[BetaTesterBuildsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_create_instance(beta_tester_create_request):  # noqa: E501
    """beta_testers_create_instance

     # noqa: E501

    :param beta_tester_create_request: BetaTester representation
    :type beta_tester_create_request: dict | bytes

    :rtype: Union[BetaTesterResponse, Tuple[BetaTesterResponse, int], Tuple[BetaTesterResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_create_request = BetaTesterCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_testers_delete_instance(id):  # noqa: E501
    """beta_testers_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_get_collection(filter_email=None, filter_first_name=None, filter_invite_type=None, filter_last_name=None, filter_apps=None, filter_beta_groups=None, filter_builds=None, sort=None, fields_beta_testers=None, limit=None, include=None, fields_beta_groups=None, fields_builds=None, fields_apps=None, limit_apps=None, limit_beta_groups=None, limit_builds=None):  # noqa: E501
    """beta_testers_get_collection

     # noqa: E501

    :param filter_email: filter by attribute &#39;email&#39;
    :type filter_email: List[str]
    :param filter_first_name: filter by attribute &#39;firstName&#39;
    :type filter_first_name: List[str]
    :param filter_invite_type: filter by attribute &#39;inviteType&#39;
    :type filter_invite_type: List[str]
    :param filter_last_name: filter by attribute &#39;lastName&#39;
    :type filter_last_name: List[str]
    :param filter_apps: filter by id(s) of related &#39;apps&#39;
    :type filter_apps: List[str]
    :param filter_beta_groups: filter by id(s) of related &#39;betaGroups&#39;
    :type filter_beta_groups: List[str]
    :param filter_builds: filter by id(s) of related &#39;builds&#39;
    :type filter_builds: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_beta_groups: the fields to include for returned resources of type betaGroups
    :type fields_beta_groups: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_apps: maximum number of related apps returned (when they are included)
    :type limit_apps: int
    :param limit_beta_groups: maximum number of related betaGroups returned (when they are included)
    :type limit_beta_groups: int
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[BetaTestersResponse, Tuple[BetaTestersResponse, int], Tuple[BetaTestersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_testers_get_instance(id, fields_beta_testers=None, include=None, fields_beta_groups=None, fields_builds=None, fields_apps=None, limit_apps=None, limit_beta_groups=None, limit_builds=None):  # noqa: E501
    """beta_testers_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_beta_groups: the fields to include for returned resources of type betaGroups
    :type fields_beta_groups: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_apps: maximum number of related apps returned (when they are included)
    :type limit_apps: int
    :param limit_beta_groups: maximum number of related betaGroups returned (when they are included)
    :type limit_beta_groups: int
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[BetaTesterResponse, Tuple[BetaTesterResponse, int], Tuple[BetaTesterResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
