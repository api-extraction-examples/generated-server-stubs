import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_screenshot_set_app_screenshots_linkages_request import AppScreenshotSetAppScreenshotsLinkagesRequest  # noqa: E501
from openapi_server.models.app_screenshot_set_app_screenshots_linkages_response import AppScreenshotSetAppScreenshotsLinkagesResponse  # noqa: E501
from openapi_server.models.app_screenshot_set_create_request import AppScreenshotSetCreateRequest  # noqa: E501
from openapi_server.models.app_screenshot_set_response import AppScreenshotSetResponse  # noqa: E501
from openapi_server.models.app_screenshots_response import AppScreenshotsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_screenshot_sets_app_screenshots_get_to_many_related(id, fields_app_screenshot_sets=None, fields_app_screenshots=None, limit=None, include=None):  # noqa: E501
    """app_screenshot_sets_app_screenshots_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_screenshot_sets: the fields to include for returned resources of type appScreenshotSets
    :type fields_app_screenshot_sets: List[str]
    :param fields_app_screenshots: the fields to include for returned resources of type appScreenshots
    :type fields_app_screenshots: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppScreenshotsResponse, Tuple[AppScreenshotsResponse, int], Tuple[AppScreenshotsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_screenshot_sets_app_screenshots_get_to_many_relationship(id, limit=None):  # noqa: E501
    """app_screenshot_sets_app_screenshots_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppScreenshotSetAppScreenshotsLinkagesResponse, Tuple[AppScreenshotSetAppScreenshotsLinkagesResponse, int], Tuple[AppScreenshotSetAppScreenshotsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_screenshot_sets_app_screenshots_replace_to_many_relationship(id, app_screenshot_set_app_screenshots_linkages_request):  # noqa: E501
    """app_screenshot_sets_app_screenshots_replace_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_screenshot_set_app_screenshots_linkages_request: List of related linkages
    :type app_screenshot_set_app_screenshots_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_screenshot_set_app_screenshots_linkages_request = AppScreenshotSetAppScreenshotsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_screenshot_sets_create_instance(app_screenshot_set_create_request):  # noqa: E501
    """app_screenshot_sets_create_instance

     # noqa: E501

    :param app_screenshot_set_create_request: AppScreenshotSet representation
    :type app_screenshot_set_create_request: dict | bytes

    :rtype: Union[AppScreenshotSetResponse, Tuple[AppScreenshotSetResponse, int], Tuple[AppScreenshotSetResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_screenshot_set_create_request = AppScreenshotSetCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_screenshot_sets_delete_instance(id):  # noqa: E501
    """app_screenshot_sets_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_screenshot_sets_get_instance(id, fields_app_screenshot_sets=None, include=None, fields_app_screenshots=None, limit_app_screenshots=None):  # noqa: E501
    """app_screenshot_sets_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_screenshot_sets: the fields to include for returned resources of type appScreenshotSets
    :type fields_app_screenshot_sets: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_screenshots: the fields to include for returned resources of type appScreenshots
    :type fields_app_screenshots: List[str]
    :param limit_app_screenshots: maximum number of related appScreenshots returned (when they are included)
    :type limit_app_screenshots: int

    :rtype: Union[AppScreenshotSetResponse, Tuple[AppScreenshotSetResponse, int], Tuple[AppScreenshotSetResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
