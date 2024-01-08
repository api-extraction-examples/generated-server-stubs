import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_screenshot_create_request import AppScreenshotCreateRequest  # noqa: E501
from openapi_server.models.app_screenshot_response import AppScreenshotResponse  # noqa: E501
from openapi_server.models.app_screenshot_update_request import AppScreenshotUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_screenshots_create_instance(app_screenshot_create_request):  # noqa: E501
    """app_screenshots_create_instance

     # noqa: E501

    :param app_screenshot_create_request: AppScreenshot representation
    :type app_screenshot_create_request: dict | bytes

    :rtype: Union[AppScreenshotResponse, Tuple[AppScreenshotResponse, int], Tuple[AppScreenshotResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_screenshot_create_request = AppScreenshotCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_screenshots_delete_instance(id):  # noqa: E501
    """app_screenshots_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_screenshots_get_instance(id, fields_app_screenshots=None, include=None):  # noqa: E501
    """app_screenshots_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_screenshots: the fields to include for returned resources of type appScreenshots
    :type fields_app_screenshots: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppScreenshotResponse, Tuple[AppScreenshotResponse, int], Tuple[AppScreenshotResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_screenshots_update_instance(id, app_screenshot_update_request):  # noqa: E501
    """app_screenshots_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_screenshot_update_request: AppScreenshot representation
    :type app_screenshot_update_request: dict | bytes

    :rtype: Union[AppScreenshotResponse, Tuple[AppScreenshotResponse, int], Tuple[AppScreenshotResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_screenshot_update_request = AppScreenshotUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
