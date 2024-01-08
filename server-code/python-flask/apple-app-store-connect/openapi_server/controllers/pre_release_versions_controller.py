import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.pre_release_versions_response import PreReleaseVersionsResponse  # noqa: E501
from openapi_server.models.prerelease_version_response import PrereleaseVersionResponse  # noqa: E501
from openapi_server import util


def pre_release_versions_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """pre_release_versions_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def pre_release_versions_builds_get_to_many_related(id, fields_builds=None, limit=None):  # noqa: E501
    """pre_release_versions_builds_get_to_many_related

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


def pre_release_versions_get_collection(filter_builds_expired=None, filter_builds_processing_state=None, filter_platform=None, filter_version=None, filter_app=None, filter_builds=None, sort=None, fields_pre_release_versions=None, limit=None, include=None, fields_builds=None, fields_apps=None, limit_builds=None):  # noqa: E501
    """pre_release_versions_get_collection

     # noqa: E501

    :param filter_builds_expired: filter by attribute &#39;builds.expired&#39;
    :type filter_builds_expired: List[str]
    :param filter_builds_processing_state: filter by attribute &#39;builds.processingState&#39;
    :type filter_builds_processing_state: List[str]
    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]
    :param filter_version: filter by attribute &#39;version&#39;
    :type filter_version: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param filter_builds: filter by id(s) of related &#39;builds&#39;
    :type filter_builds: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_pre_release_versions: the fields to include for returned resources of type preReleaseVersions
    :type fields_pre_release_versions: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[PreReleaseVersionsResponse, Tuple[PreReleaseVersionsResponse, int], Tuple[PreReleaseVersionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def pre_release_versions_get_instance(id, fields_pre_release_versions=None, include=None, fields_builds=None, fields_apps=None, limit_builds=None):  # noqa: E501
    """pre_release_versions_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_pre_release_versions: the fields to include for returned resources of type preReleaseVersions
    :type fields_pre_release_versions: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_builds: maximum number of related builds returned (when they are included)
    :type limit_builds: int

    :rtype: Union[PrereleaseVersionResponse, Tuple[PrereleaseVersionResponse, int], Tuple[PrereleaseVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
